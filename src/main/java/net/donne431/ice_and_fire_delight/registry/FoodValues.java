package net.donne431.ice_and_fire_delight.registry;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.donne431.iafel.registry.IafelModMobEffects; // Yooho, finally!
import vectorwing.farmersdelight.common.registry.ModEffects;


public class FoodValues {
    public static final FoodProperties ECTOPLASM_JELLY = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(1f).build();
    public static final FoodProperties DRAGON_OMELET = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.5f).alwaysEat()
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 9000, 0), 1.0F).build();
    public static final FoodProperties MYRMEX_JUNGLE_RESIN_COOKIE = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.35f).build();
    public static final FoodProperties MYRMEX_DESERT_RESIN_COOKIE = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.35f).build();
    public static final FoodProperties MYRMEX_JUNGLE_RESIN_JELLY = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.35f).build();
    public static final FoodProperties MYRMEX_DESERT_RESIN_JELLY = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.35f).build();
    public static final FoodProperties SHINY_CHIPS = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.1f).build(); // I thinking about add .fast()
    public static final FoodProperties SPICY_SHINY_CHIPS = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.2f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 1.0F).build(); // I thinking about add .fast()
    public static final FoodProperties SEA_SERPENT_MEAT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.35f).meat().build();
    public static final FoodProperties COOKED_SEA_SERPENT_MEAT = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.9f).meat().build();
    public static final FoodProperties TROLL_MEAT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties COOKED_TROLL_MEAT = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.9f).meat().build();
    public static final FoodProperties CYCLOPS_MEAT = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(0.3f).meat().build();
    public static final FoodProperties CYCLOPS_STEAK = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.8f).meat().build();
    public static final FoodProperties HYDRA_MEAT = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.3f).meat()
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.POISON_RESISTANCE.get(), 700, 0), 0.1F).build();
    public static final FoodProperties COOKED_HYDRA_MEAT = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.9f).meat().build();
    public static final FoodProperties SEA_SERPENT_FRESH_SOUP = (new FoodProperties.Builder())
            .nutrition(14).saturationMod(0.7f).build();
    public static final FoodProperties HONEY_GLAZED_TROLL_MEAT = (new FoodProperties.Builder())
            .nutrition(13).saturationMod(0.7f).build();
    public static final FoodProperties FIRE_DRAGON_RAMEN = (new FoodProperties.Builder())
            .nutrition(11).saturationMod(0.8f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 0), 1.0F).build();
    public static final FoodProperties EYE_CHOWDER = (new FoodProperties.Builder())
            .nutrition(15).saturationMod(0.55f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.CENTER_OF_WEAKNESS.get(), 21000, 0), 1.0F).build();
    public static final FoodProperties HYDRA_VENOM_SOUP = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(1.1f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.POISON_RESISTANCE.get(), 18000, 0), 0.9F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 1800, 0), 1.0F).build();
    public static final FoodProperties HONEY_GLAZED_CYCLOPS_EYE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.9f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.CENTER_OF_WEAKNESS.get(), 18000, 0), 1.0F).build();
    public static final FoodProperties FIRE_DRAGON_TACO = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 1000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1000, 0), 1.0F).build();
    public static final FoodProperties COOL_SANDWICH = (new FoodProperties.Builder())
            .nutrition(8).saturationMod(0.8f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, (int) (Math.random() * 500 + 700), 0), 1.0F).build();
    public static final FoodProperties LIGHTNING_DRAGON_HOTDOG = (new FoodProperties.Builder())
            .nutrition(10).saturationMod(0.95f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.LIGHTNING_STRIKE.get(), 16000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 8000, 0), 1.0F).build();
    public static final FoodProperties FIRE_SAUSAGE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.9f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 12000, 0), 1.0F).build();
    public static final FoodProperties ICE_SAUSAGE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.9f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.ICE_ASPECT.get(), 12000, 1), 1.0F).build();
    public static final FoodProperties LIGHTNING_SAUSAGE = (new FoodProperties.Builder())
            .nutrition(9).saturationMod(0.9f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.LIGHTNING_STRIKE.get(), 12000, 1), 1.0F).build();
    public static final FoodProperties DRAGON_SPECIAL_SAUSAGE = (new FoodProperties.Builder())
            .nutrition(11).saturationMod(1.0f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGON_FLIGHT.get(), 24000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGONS_MIGHT.get(), 18000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3000, 0), 1.0F).build();
    public static final FoodProperties FIRE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.75f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGON_FLIGHT.get(), 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 18000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 6000, 0), 1.0F).build();
    public static final FoodProperties ICE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.75f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGON_FLIGHT.get(), 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.COLD_RESISTANCE.get(), 18000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.ICE_ASPECT.get(), 6000, 1), 1.0F).build();
    public static final FoodProperties LIGHTNING_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = (new FoodProperties.Builder())
            .nutrition(16).saturationMod(0.75f).meat().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGON_FLIGHT.get(), 6000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 18000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.LIGHTNING_STRIKE.get(), 6000, 2), 1.0F).build();
    public static final FoodProperties FIRE_LILY_EXTRACT = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 750, 0), 1.0F).build();
    public static final FoodProperties FROST_LILY_EXTRACT = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.COLD_RESISTANCE.get(), 750, 0), 1.0F).build();
    public static final FoodProperties LIGHTNING_LILY_EXTRACT = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 750, 0), 1.0F).build();
    public static final FoodProperties FIERY_HOT_COCKTAIL = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 10000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 8000, 0), 1.0F).build();
    public static final FoodProperties FROST_COCKTAIL = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.ICE_ASPECT.get(), 10000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.COLD_RESISTANCE.get(), 8000, 0), 1.0F).build();
    public static final FoodProperties ELECTRIC_COCKTAIL = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.LIGHTNING_STRIKE.get(), 10000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 8000, 0), 1.0F).build();
    public static final FoodProperties SPECIAL_COCKTAIL = (new FoodProperties.Builder())
            .nutrition(0).saturationMod(0.0f).alwaysEat()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 21000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 9000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.COLD_RESISTANCE.get(), 9000, 0), 1.0F).build();
    public static final FoodProperties FIERY_HOT_PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.4f).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.FIRE_ASPECT.get(), 4800, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1.0F).build();
    public static final FoodProperties FROST_PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.4f).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.ICE_ASPECT.get(), 4800, 1), 1.0F)
            .effect(() -> new MobEffectInstance(IafelModMobEffects.COLD_RESISTANCE.get(), 2400, 0), 1.0F).build();
    public static final FoodProperties ELECTRIC_PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.4f).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.LIGHTNING_STRIKE.get(), 4800, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 2400, 0), 1.0F).build();
    public static final FoodProperties DRAGON_SPECIAL_PIE_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.4f).fast().alwaysEat()
            .effect(() -> new MobEffectInstance(IafelModMobEffects.DRAGONS_MIGHT.get(), 7200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 2400, 0), 1.0F).build();
    public static final FoodProperties DRAGON_BONE_BUN = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.6f).build();
    public static final FoodProperties SEA_SERPENT_SLICE = (new FoodProperties.Builder())
            .nutrition(1).saturationMod(0.4f).meat().fast().build();
    public static final FoodProperties SEA_SERPENT_ROLL = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(0.3f).meat().fast().build();
    public static final FoodProperties COOKED_SEA_SERPENT_SLICE = (new FoodProperties.Builder())
            .nutrition(4).saturationMod(0.9f).meat().fast().build();
    public static final FoodProperties DRAGON_OMELET_SLICE = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(0.5f).alwaysEat()
            .effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), 3000, 0), 1.0F).build();
}
