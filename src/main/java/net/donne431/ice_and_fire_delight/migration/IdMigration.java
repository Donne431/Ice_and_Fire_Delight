package net.donne431.ice_and_fire_delight.migration;


import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.MissingMappingsEvent;

import java.util.Map;

import static java.util.Map.entry;


@Mod.EventBusSubscriber(modid = IceAndFireDelightMod.MODID)
public class IdMigration { // Automatic changes old id items to new, when enter a world.
// If say honestly, for some reason I really don't though about this until now, but happily my last brain cell still works. :)
    private static final Map<String, String> RENAMES = Map.ofEntries(
            // # 0.2.6 | Ice and Fire Delight
            entry("fried_dragon_egg", "dragon_omelet"),
            entry("myrmex_resin_cookie_jungle", "myrmex_jungle_resin_cookie"),
            entry("myrmex_resin_cookie_desert", "myrmex_desert_resin_cookie"),
            entry("chips_from_shiny_scales", "shiny_chips"),
            entry("spicy_chips_from_shiny_scales", "spicy_shiny_chips"),
            entry("fresh_soup_from_sea_serpent", "sea_serpent_fresh_soup"),
            entry("fire_minced_meat", "minced_fire_flesh"),
            entry("ice_minced_meat", "minced_ice_flesh"),
            entry("lightning_minced_meat", "minced_lightning_flesh"),
            entry("empty_measuring_cylinder", "empty_tube"),
            entry("spices_from_witherbone", "witherbone_spices"),
            entry("spices", "witherbone_spices"), // So, I thought if deleting just spices, then I need to convert them to witherbone spices, so players doesn't lose so many ingredients
            entry("flour_from_dragon_bones", "dragon_bone_flour"),
            entry("dough_from_dragon_bones", "dragon_bone_dough"),
            entry("dragonsteel_fire_knife", "fire_dragonsteel_knife"),
            entry("dragonsteel_ice_knife", "ice_dragonsteel_knife"),
            entry("dragonsteel_lightning_knife", "lightning_dragonsteel_knife")
    );

    @SubscribeEvent
    public static void onMissingMappings(MissingMappingsEvent event) {
        remap(event, ForgeRegistries.Keys.ITEMS, ForgeRegistries.ITEMS);
        remap(event, ForgeRegistries.Keys.BLOCKS, ForgeRegistries.BLOCKS);
    }

    private static <T> void remap(MissingMappingsEvent event,
                                  ResourceKey<? extends Registry<T>> key,
                                  IForgeRegistry<T> registry) {
        for (MissingMappingsEvent.Mapping<T> mapping : event.getMappings(key, IceAndFireDelightMod.MODID)) {
            String newPath = RENAMES.get(mapping.getKey().getPath());
            if (newPath == null) continue;

            ResourceLocation newId = new ResourceLocation(IceAndFireDelightMod.MODID, newPath);
            if (registry.containsKey(newId)) {
                mapping.remap(registry.getValue(newId));
            }
        }
    }
}
