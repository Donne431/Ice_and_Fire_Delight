package net.donne431.ice_and_fire_delight.item;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.item.ConsumableItem;

import net.donne431.ice_and_fire_delight.registry.Configuration;
import net.donne431.ice_and_fire_delight.util.DragonExplosiveFoodHelper;


public class DragonSpecialPieSliceItem extends ConsumableItem {

    public DragonSpecialPieSliceItem(Properties properties) {
        super(properties);
    }

    @Override
    public void affectConsumer(ItemStack stack, Level level, LivingEntity consumer) {
        if (consumer instanceof ServerPlayer player) {
            DragonExplosiveFoodHelper.onEaten(level, consumer.getX(), consumer.getY(), consumer.getZ(), player,
                    Configuration.ENABLE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE,
                    Configuration.CHANCE_EXPLOSIONS_WHEN_EAT_SPECIAL_PIE_SLICE,
                    Configuration.NUMBER_DEATH_BEFORE_EXPLOSIONS_STOP_WHEN_EATING_SPECIAL_PIE_SLICE,
                    Level.ExplosionInteraction.MOB);
        }
    }
}