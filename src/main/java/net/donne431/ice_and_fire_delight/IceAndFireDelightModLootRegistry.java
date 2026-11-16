package net.donne431.ice_and_fire_delight.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.Serializer;
import net.minecraft.world.level.storage.loot.functions.LootItemFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.donne431.ice_and_fire_delight.CustomizeToSeaSerpentMeat;

public class IceAndFireDelightModLootRegistry {

    public static LootItemFunctionType CUSTOMIZE_TO_SERPENT_MEAT;

    private static LootItemFunctionType register(String p_237451_0_, Serializer<? extends LootItemFunction> p_237451_1_) {
        return Registry.register(BuiltInRegistries.LOOT_FUNCTION_TYPE, new ResourceLocation(p_237451_0_), new LootItemFunctionType(p_237451_1_));
    }

    public static void init() {
        CUSTOMIZE_TO_SERPENT_MEAT = register("ice_and_fire_delight:customize_to_sea_serpent_meat", new CustomizeToSeaSerpentMeat.Serializer());
    }

}
