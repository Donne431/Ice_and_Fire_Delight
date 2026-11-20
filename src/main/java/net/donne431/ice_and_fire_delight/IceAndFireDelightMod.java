package net.donne431.ice_and_fire_delight;

import net.donne431.ice_and_fire_delight.registry.*;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;

//import net.donne431.ice_and_fire_delight.init.IceAndFireDelightModMobEffects; // Now It doesn't need


import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(IceAndFireDelightMod.MODID)
public class IceAndFireDelightMod
{
    public static final String MODID = "ice_and_fire_delight";

    public IceAndFireDelightMod() {
        MinecraftForge.EVENT_BUS.register(this);
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        IaFDModBlocks.BLOCKS.register(modEventBus);

        IaFDModItems.ITEMS.register(modEventBus);

        IaFDModCreativeTabs.CREATIVE_TABS.register(modEventBus);

//        IaFDModMobEffects.EFFECTS.register(modEventBus); // Transferred effects to separate mod library IaF EffectsLib, buut I still leave this here in case if it will be needed (most likely not, at least I hope)

        IaFDModLootModifiers.LOOT_MODIFIERS.register(modEventBus);

        IaFDModAttributes.ATTRIBUTES.register(modEventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Configuration.COMMON_CONFIG);

        modEventBus.addListener(IceAndFireDelightMod::setup);

    }

    private static void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(IaFDModLootRegistry::init);
    }
}
