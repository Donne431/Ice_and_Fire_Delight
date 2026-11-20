package net.donne431.ice_and_fire_delight.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class IaFDModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS;
    public static final RegistryObject<CreativeModeTab> TAB_ICE_AND_FIRE_DELIGHT;

    static {
        CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "ice_and_fire_delight");
        TAB_ICE_AND_FIRE_DELIGHT = CREATIVE_TABS.register("ice_and_fire_delight", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.ice_and_fire_delight")).icon(() -> new ItemStack((ItemLike) IaFDModItems.SEA_SERPENT_FRESH_SOUP.get())).displayItems((parameters, output) -> IaFDModItems.CREATIVE_TAB_ITEMS.forEach((item) -> output.accept((ItemLike)item.get()))).build());
    }
}
