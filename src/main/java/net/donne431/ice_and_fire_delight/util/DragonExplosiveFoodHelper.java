package net.donne431.ice_and_fire_delight.util;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.level.Level;

import java.util.function.Supplier;

import net.donne431.ice_and_fire_delight.registry.IaFDModAttributes;


public final class DragonExplosiveFoodHelper {

    private static final ResourceLocation ADVANCEMENT_EATEN = new ResourceLocation("ice_and_fire_delight", "almost_4_elements");
    private static final ResourceLocation ADVANCEMENT_EXPLODED = new ResourceLocation("ice_and_fire_delight", "too_much_power");

    private DragonExplosiveFoodHelper() {
    }

    public static void onEaten(Level level, double x, double y, double z, ServerPlayer player,
                               Supplier<Boolean> explosionsEnabled, Supplier<Double> explosionChance,
                               Supplier<Integer> maxExplosions, Level.ExplosionInteraction explosionInteraction) {
        grantAdvancement(player, ADVANCEMENT_EATEN);
        tryExplode(level, x, y, z, player, explosionsEnabled, explosionChance, maxExplosions, explosionInteraction);
    }

    private static void tryExplode(Level level, double x, double y, double z, ServerPlayer player,
                                   Supplier<Boolean> explosionsEnabled, Supplier<Double> explosionChance,
                                   Supplier<Integer> maxExplosions, Level.ExplosionInteraction explosionInteraction) {
        if (!explosionsEnabled.get()) {
            return;
        }
        if (level.random.nextDouble() >= explosionChance.get()) {
            return;
        }

        AttributeInstance explosionCount = player.getAttribute(IaFDModAttributes.NUMBER_OF_EXPLOSIONS.get());
        if (explosionCount == null) {
            return;
        }
        if (explosionCount.getValue() > maxExplosions.get() - 1) {
            return;
        }

        explosionCount.setBaseValue(explosionCount.getValue() + 1);
        grantAdvancement(player, ADVANCEMENT_EXPLODED);
        level.explode(null, x, y, z, 4, explosionInteraction);
    }

    private static void grantAdvancement(ServerPlayer player, ResourceLocation id) {
        Advancement advancement = player.server.getAdvancements().getAdvancement(id);
        if (advancement == null) {
            return;
        }
        AdvancementProgress progress = player.getAdvancements().getOrStartProgress(advancement);
        if (!progress.isDone()) {
            for (String criterion : progress.getRemainingCriteria()) {
                player.getAdvancements().award(advancement, criterion);
            }
        }
    }
}