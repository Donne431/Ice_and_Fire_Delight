package net.donne431.ice_and_fire_delight.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import vectorwing.farmersdelight.common.block.PieBlock;

import java.util.function.Supplier;

import net.donne431.ice_and_fire_delight.registry.Configuration;
import net.donne431.ice_and_fire_delight.util.DragonExplosiveFoodHelper;


public class DragonSpecialPieBlock extends PieBlock {

    public DragonSpecialPieBlock(BlockBehaviour.Properties properties, Supplier<Item> pieSlice) {
        super(properties, pieSlice);
    }

    @Override
    protected InteractionResult consumeBite(Level level, BlockPos pos, BlockState state, Player player) {
        InteractionResult result = super.consumeBite(level, pos, state, player);
        if (result == InteractionResult.SUCCESS && !level.isClientSide() && player instanceof ServerPlayer serverPlayer) {
            DragonExplosiveFoodHelper.onEaten(level, pos.getX(), pos.getY(), pos.getZ(), serverPlayer,
                    Configuration.ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE,
                    Configuration.CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE,
                    Configuration.NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE,
                    Level.ExplosionInteraction.BLOCK);
        }

        return result;
    }
}