package net.donne431.ice_and_fire_delight.registry;

import net.donne431.ice_and_fire_delight.block.DragonSpecialPieBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.PieBlock;

public class IaFDModBlocks {
    public static final DeferredRegister<Block> BLOCKS;
    public static final RegistryObject<Block> FIERY_HOT_PIE;
    public static final RegistryObject<Block> FROST_PIE;
    public static final RegistryObject<Block> ELECTRIC_PIE;
    public static final RegistryObject<Block> DRAGON_SPECIAL_PIE;

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "ice_and_fire_delight");

        FIERY_HOT_PIE = BLOCKS.register("fiery_hot_pie", () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), IaFDModItems.FIERY_HOT_PIE_SLICE));
        FROST_PIE = BLOCKS.register("frost_pie", () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), IaFDModItems.FROST_PIE_SLICE));
        ELECTRIC_PIE = BLOCKS.register("electric_pie", () -> new PieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), IaFDModItems.ELECTRIC_PIE_SLICE));
        DRAGON_SPECIAL_PIE = BLOCKS.register("dragon_special_pie", () -> new DragonSpecialPieBlock(BlockBehaviour.Properties.copy(Blocks.CAKE), IaFDModItems.DRAGON_SPECIAL_PIE_SLICE));
    }
}
