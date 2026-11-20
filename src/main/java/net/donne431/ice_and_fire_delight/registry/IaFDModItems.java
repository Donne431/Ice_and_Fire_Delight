package net.donne431.ice_and_fire_delight.registry;

import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import net.donne431.iafel.registry.IafelModMobEffects;
import net.donne431.ice_and_fire_delight.item.*;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Supplier;

import vectorwing.farmersdelight.common.item.KnifeItem;
import vectorwing.farmersdelight.common.item.PlaceableItem;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.item.DrinkableItem;
import net.donne431.ice_and_fire_delight.registry.FoodValues;


@ParametersAreNonnullByDefault
public class IaFDModItems { // Btw, I'm used Farmer's Delight ModItems (decompiled version, so that's way it's looks different from source version) as a reference, when created this, sooo thank them, haha
    public static final DeferredRegister<Item> ITEMS;
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS;

    // Yep, a bunch of items was renamed, It will be hard to change id everywhere...
    public static final RegistryObject<Item> ECTOPLASM_JELLY;
    public static final RegistryObject<Item> DRAGON_OMELET; // Originally was FRIED_DRAGON_EGG
    public static final RegistryObject<Item> MYRMEX_JUNGLE_RESIN_COOKIE; // Originally was MYRMEX_RESIN_COOKIE_JUNGLE
    public static final RegistryObject<Item> MYRMEX_DESERT_RESIN_COOKIE; // Originally was MYRMEX_RESIN_COOKIE_DESERT
    public static final RegistryObject<Item> MYRMEX_JUNGLE_RESIN_JELLY;
    public static final RegistryObject<Item> MYRMEX_DESERT_RESIN_JELLY;
    public static final RegistryObject<Item> SHINY_CHIPS; // Originally was CHIPS_FROM_SHINY_SCALES
    public static final RegistryObject<Item> SPICY_SHINY_CHIPS; // Originally was SPICY_CHIPS_FROM_SHINY_SCALES
    public static final RegistryObject<Item> SEA_SERPENT_MEAT;
    public static final RegistryObject<Item> COOKED_SEA_SERPENT_MEAT;
    public static final RegistryObject<Item> TROLL_MEAT;
    public static final RegistryObject<Item> COOKED_TROLL_MEAT;
    public static final RegistryObject<Item> CYCLOPS_MEAT;
    public static final RegistryObject<Item> CYCLOPS_STEAK; // Don't ask me why I made it steak and not cooked cyclops meat, I'm by myself doesn't remember... Btw, I just doesn't want to change it now, because in game it also called Cyclops Steak
    public static final RegistryObject<Item> HYDRA_MEAT;
    public static final RegistryObject<Item> COOKED_HYDRA_MEAT;
    public static final RegistryObject<Item> SEA_SERPENT_FRESH_SOUP; // Originally was FRESH_SOUP_FROM_SEA_SERPENT
    public static final RegistryObject<Item> HONEY_GLAZED_TROLL_MEAT;
    public static final RegistryObject<Item> FIRE_DRAGON_RAMEN;
    public static final RegistryObject<Item> EYE_CHOWDER;
    public static final RegistryObject<Item> HYDRA_VENOM_SOUP;
    public static final RegistryObject<Item> HONEY_GLAZED_CYCLOPS_EYE;
    public static final RegistryObject<Item> FIRE_DRAGON_TACO;
    public static final RegistryObject<Item> COOL_SANDWICH;
    public static final RegistryObject<Item> LIGHTNING_DRAGON_HOTDOG;
    public static final RegistryObject<Item> TROLL_INTESTINES;
    public static final RegistryObject<Item> MINCED_FIRE_FLESH; // Originally was FIRE_MINCED_MEAT
    public static final RegistryObject<Item> RAW_FIRE_SAUSAGE;
    public static final RegistryObject<Item> FIRE_SAUSAGE;
    public static final RegistryObject<Item> MINCED_ICE_FLESH; // Originally was ICE_MINCED_MEAT;
    public static final RegistryObject<Item> RAW_ICE_SAUSAGE;
    public static final RegistryObject<Item> ICE_SAUSAGE;
    public static final RegistryObject<Item> MINCED_LIGHTNING_FLESH; // Originally was LIGHTNING_MINCED_MEAT
    public static final RegistryObject<Item> RAW_LIGHTNING_SAUSAGE;
    public static final RegistryObject<Item> LIGHTNING_SAUSAGE;
    public static final RegistryObject<Item> RAW_DRAGON_SPECIAL_SAUSAGE;
    public static final RegistryObject<Item> DRAGON_SPECIAL_SAUSAGE;
    public static final RegistryObject<Item> FIRE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE; // Originally was planning to rename to FIRE_HEART_STIR_FRY, but then realize this will be stupid as hell
    public static final RegistryObject<Item> ICE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE; // Originally was planning to rename to ICE_HEART_STIR_FRY, but then realize this will be stupid as hell
    public static final RegistryObject<Item> LIGHTNING_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE; // Originally was planning to rename to LIGHTNING_HEART_STIR_FRY, but then realize this will be stupid as hell
    public static final RegistryObject<Item> EMPTY_TUBE; // Originally was EMPTY_MEASURING_CYLINDER
    public static final RegistryObject<Item> FIRE_LILY_EXTRACT;
    public static final RegistryObject<Item> FROST_LILY_EXTRACT;
    public static final RegistryObject<Item> LIGHTNING_LILY_EXTRACT;
    public static final RegistryObject<Item> EMPTY_GLASS;
    public static final RegistryObject<Item> FIERY_HOT_COCKTAIL;
    public static final RegistryObject<Item> FROST_COCKTAIL;
    public static final RegistryObject<Item> ELECTRIC_COCKTAIL;
    public static final RegistryObject<Item> SPECIAL_COCKTAIL;
    public static final RegistryObject<Item> DRAGON_PIE_CRUST;
    public static final RegistryObject<Item> FIERY_HOT_PIE;
    public static final RegistryObject<Item> FIERY_HOT_PIE_SLICE;
    public static final RegistryObject<Item> FROST_PIE;
    public static final RegistryObject<Item> FROST_PIE_SLICE;
    public static final RegistryObject<Item> ELECTRIC_PIE;
    public static final RegistryObject<Item> ELECTRIC_PIE_SLICE;
    public static final RegistryObject<Item> DRAGON_SPECIAL_PIE;
    public static final RegistryObject<Item> DRAGON_SPECIAL_PIE_SLICE;
    public static final RegistryObject<Item> WITHERBONE_SPICES; // Originally was SPICES_FROM_WITHERBONE
    // For now, I'm deleting just SPICES. Reason: because of recipe (I thought about new recipe, but I just doesn't have ideas for now), Diet count them as sweets and because of this food, where one of ingredients were SPICES counted as food with sugar
    public static final RegistryObject<Item> DRAGON_BONE_FLOUR; // Originally was FLOUR_FROM_DRAGON_BONES
    public static final RegistryObject<Item> DRAGON_BONE_DOUGH; // Originally was DOUGH_FROM_DRAGON_BONES
    public static final RegistryObject<Item> DRAGON_BONE_BUN;
    // Well, I think recipe of mini pizza is overly complicated, so I'm deleting RAW_MINI_PIZZA_BLANK, at least for now.
    // Sooo, above was I from past, that thought just about deleting RAW_MINI_PIZZA_BLANK, but now I think MINI_PIZZA and MINI_PIZZA_BLANK need to delete too. Idk why I add these items in first place
    public static final RegistryObject<Item> SEA_SERPENT_SLICE;
    public static final RegistryObject<Item> SEA_SERPENT_ROLL;
    public static final RegistryObject<Item> COOKED_SEA_SERPENT_SLICE;
    public static final RegistryObject<Item> SILVER_KNIFE;
    public static final RegistryObject<Item> HYDRA_FANG_KNIFE;
    public static final RegistryObject<Item> SEA_SERPENT_FANG_KNIFE;
    public static final RegistryObject<Item> FIRE_DRAGONSTEEL_KNIFE; // Originally was DRAGONSTEEL_FIRE_KNIFE
    public static final RegistryObject<Item> ICE_DRAGONSTEEL_KNIFE; // Originally was DRAGONSTEEL_ICE_KNIFE
    public static final RegistryObject<Item> LIGHTNING_DRAGONSTEEL_KNIFE; // Originally was DRAGONSTEEL_LIGHTNING_KNIFE
    public static final RegistryObject<Item> DRAGONBONE_KNIFE;
    // PHANTOM_KNIFE, BLACK_DRAGON_CUTTING_BOARD, SHINY_SCALES_BLOCK were deleted for now, maybe later I'm will return them ¯\_(ツ)_/¯
    // All items below added after or at the moment of Great Recoding (heh) of Ice and Fire Delight (which is 0.2.6 update)

    // # 0.2.6 | Ice and Fire: Recoded
    public static final RegistryObject<Item> DRAGON_OMELET_SLICE;


    // Things to speed up recoding and just for easier coding later
    public static RegistryObject<Item> registerWithTab(String name, Supplier<Item> supplier) {
        RegistryObject<Item> newItem = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(newItem);
        return newItem;
    }

    public static RegistryObject<Item> registerHidden(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static Item.Properties foodItem(FoodProperties food) {
        return (new Item.Properties()).food(food);
    }

    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return (new Item.Properties()).food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }

    public static Item.Properties drinkItem() {
        return (new Item.Properties()).craftRemainder(Items.GLASS_BOTTLE);
    }

    public static Item.Properties lilyExtractItem(FoodProperties food) {
        return (new Item.Properties()).food(food).rarity(Rarity.RARE).craftRemainder(IaFDModItems.EMPTY_TUBE.get());
    }

    public static Item.Properties cocktailItem(FoodProperties food) {
        return (new Item.Properties()).food(food).rarity(Rarity.RARE).stacksTo(16).craftRemainder(IaFDModItems.EMPTY_GLASS.get());
    }

    // Instead of vanilla Item class need use classes from Farmer's Delight:
    // ConsumableItem - food, which when eat gives you effect(s); (default - hasPotionEffectTooltip - true);
    // DrinkableItem - food or drinks, that you, em, drinks; (default - hasPotionEffectTooltip - false; so you need don't forget to write "true");
    // PlaceableItem - pies or another food, that you can place;
    // Well, I'm only now see, that my comments looks like AI comments... fuck :/
    // But I will not change them, anyway nobody will look up the code.

    /**
     * Я ИЗ БУДУЩЕГО, НЕ ЗАБУДЬ СЛЕДУЮЩИЕ ЗАДАЧИ:ъ
     * <p>
     * ЗАМЕНИТЬ Item КЛАСС НА Farmer's Delight ВАРИАНТЫ / Ну либо тупо дублировать те классы для большей независимости кода +
     * ДОБАВИТЬ ЭФФЕКТЫ ПРИ УПОТРЕБЛЕНИИ ЕДЫ/НАПИТКОВ +
     * НЕ ЗАБУДЬ ПРО НОЖИ! +
     * НЕ ЗАБУДЬ ПРО ПИРОГИ! ? Хз шо я имел ввиду, поэтому допустим +
     * НЕ ЗАБУДЬ ПРО ОСОБЕННЫЕ ПРЕДМЕТЫ! +
     * НЕ ЗАБУДЬ ДОБАВИТЬ TOOLTIPS ПРОДУКЦИИ ИЗ МИРМИКСОВ +, ЯДОВИТОМУ СУПУ +, МЯСУ ГИДРЫ +, ВОЗМОЖНО COOL SANDWICH +, НОЖАМ +
     * НЕ ЗАБУДЬ СДЕЛАТЬ РЕБАЛАНС В {@link net.donne431.ice_and_fire_delight.registry.FoodValues} +
     * НЕ ЗАБУДЬ ПРО LANG ФАЙЛЫ!
     */

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "ice_and_fire_delight");
        CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();

        ECTOPLASM_JELLY = registerWithTab("ectoplasm_jelly", () -> new Item(foodItem(FoodValues.ECTOPLASM_JELLY)));
        DRAGON_OMELET = registerWithTab("dragon_omelet", () -> new ConsumableItem(foodItem(FoodValues.DRAGON_OMELET).stacksTo(8).rarity(Rarity.RARE)));
        DRAGON_OMELET_SLICE = registerWithTab("dragon_omelet_slice", () -> new ConsumableItem(foodItem(FoodValues.DRAGON_OMELET_SLICE)));
        MYRMEX_JUNGLE_RESIN_COOKIE = registerWithTab("myrmex_jungle_resin_cookie", () -> new Item(foodItem(FoodValues.MYRMEX_JUNGLE_RESIN_COOKIE))
            {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(1, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.myrmex_type_jungle").getString())));
                }
            });
        MYRMEX_DESERT_RESIN_COOKIE = registerWithTab("myrmex_desert_resin_cookie", () -> new Item(foodItem(FoodValues.MYRMEX_DESERT_RESIN_COOKIE))
            {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(1, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.myrmex_type_desert").getString())));
                }
            });
        MYRMEX_JUNGLE_RESIN_JELLY = registerWithTab("myrmex_jungle_resin_jelly", () -> new Item(foodItem(FoodValues.MYRMEX_JUNGLE_RESIN_JELLY))
            {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(1, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.myrmex_type_jungle").getString())));
                }
            });
        MYRMEX_DESERT_RESIN_JELLY = registerWithTab("myrmex_desert_resin_jelly", () -> new Item(foodItem(FoodValues.MYRMEX_DESERT_RESIN_JELLY))
            {
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                    tooltip.add(1, Component.literal((Component.translatable("item.ice_and_fire_delight.tooltip.myrmex_type_desert").getString())));
                }
            });
        SHINY_CHIPS = registerWithTab("shiny_chips", () -> new Item(foodItem(FoodValues.SHINY_CHIPS)));
        SPICY_SHINY_CHIPS = registerWithTab("spicy_shiny_chips", () -> new ConsumableItem(foodItem(FoodValues.SPICY_SHINY_CHIPS).rarity(Rarity.UNCOMMON)));

        // Meat
        SEA_SERPENT_MEAT = registerWithTab("sea_serpent_meat", () -> new Item(foodItem(FoodValues.SEA_SERPENT_MEAT)));
        COOKED_SEA_SERPENT_MEAT = registerWithTab("cooked_sea_serpent_meat", () -> new Item(foodItem(FoodValues.COOKED_SEA_SERPENT_MEAT)));
        TROLL_MEAT = registerWithTab("troll_meat", () -> new Item(foodItem(FoodValues.TROLL_MEAT))            );
        COOKED_TROLL_MEAT = registerWithTab("cooked_troll_meat", () -> new Item(foodItem(FoodValues.COOKED_TROLL_MEAT)));
        CYCLOPS_MEAT = registerWithTab("cyclops_meat", () -> new Item(foodItem(FoodValues.CYCLOPS_MEAT)));
        CYCLOPS_STEAK = registerWithTab("cyclops_steak", () -> new Item(foodItem(FoodValues.CYCLOPS_STEAK)));
        HYDRA_MEAT = registerWithTab("hydra_meat", () -> new ConsumableItem(foodItem(FoodValues.HYDRA_MEAT), false)
                { // I will be honest, AI made this for me aaand I 100% sure he overengineered this shit, buut idk how made it better
                    @Override
                    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                        FoodProperties food = stack.getFoodProperties(null);

                        if (food == null || food.getEffects().isEmpty()) return;

                        for (Pair<MobEffectInstance, Float> pair : food.getEffects()) {
                            MobEffectInstance instance = pair.getFirst();
                            MobEffect effect = instance.getEffect();

                            Component effectName = Component.translatable(effect.getDescriptionId());
                            Component duration = MobEffectUtil.formatDuration(instance, 1.0F);
                            String extraText = getExtraTextForEffect(effect);

                            tooltip.add(Component.translatable(
                                    "item.ice_and_fire_delight.tooltip.effect",
                                    effectName,
                                    duration,
                                    extraText
                            ).withStyle(ChatFormatting.BLUE));
                        }
                    }

                    private String getExtraTextForEffect(MobEffect effect) {
                        if (effect == MobEffects.POISON) {
                            return "[90%]";
                        }
                        if (effect == IafelModMobEffects.POISON_RESISTANCE.get()) {
                            return "[10%]";
                        }
                        return "";
                    }
                }
            );
        COOKED_HYDRA_MEAT = registerWithTab("cooked_hydra_meat", () -> new Item(foodItem(FoodValues.COOKED_HYDRA_MEAT)));

        SEA_SERPENT_FRESH_SOUP = registerWithTab("sea_serpent_fresh_soup", () -> new Item(bowlFoodItem(FoodValues.SEA_SERPENT_FRESH_SOUP)));
        HONEY_GLAZED_TROLL_MEAT = registerWithTab("honey_glazed_troll_meat", () -> new Item(bowlFoodItem(FoodValues.HONEY_GLAZED_TROLL_MEAT)));
        FIRE_DRAGON_RAMEN = registerWithTab("fire_dragon_ramen", () -> new ConsumableItem(bowlFoodItem(FoodValues.FIRE_DRAGON_RAMEN).rarity(Rarity.UNCOMMON)));
        EYE_CHOWDER = registerWithTab("eye_chowder", () -> new ConsumableItem(bowlFoodItem(FoodValues.EYE_CHOWDER).rarity(Rarity.RARE)));
        HYDRA_VENOM_SOUP = registerWithTab("hydra_venom_soup", () -> new DrinkableItem(bowlFoodItem(FoodValues.HYDRA_VENOM_SOUP).rarity(Rarity.UNCOMMON), false)
                {
                    @Override
                    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                        FoodProperties food = stack.getFoodProperties(null);

                        if (food == null || food.getEffects().isEmpty()) return;

                        for (Pair<MobEffectInstance, Float> pair : food.getEffects()) {
                            MobEffectInstance instance = pair.getFirst();
                            MobEffect effect = instance.getEffect();

                            Component effectName = Component.translatable(effect.getDescriptionId());
                            Component duration = MobEffectUtil.formatDuration(instance, 1.0F);
                            String extraText = getExtraTextForEffect(effect);

                            tooltip.add(Component.translatable(
                                    "item.ice_and_fire_delight.tooltip.effect",
                                    effectName,
                                    duration,
                                    extraText
                            ).withStyle(ChatFormatting.BLUE));
                        }
                    }

                    private String getExtraTextForEffect(MobEffect effect) {
                        if (effect == MobEffects.POISON) {
                            return "[10%]";
                        }
                        if (effect == IafelModMobEffects.POISON_RESISTANCE.get()) {
                            return "[90%]";
                        }
                        return "";
                    }
                }
            );
        HONEY_GLAZED_CYCLOPS_EYE = registerWithTab("honey_glazed_cyclops_eye", () -> new ConsumableItem(foodItem(FoodValues.HONEY_GLAZED_CYCLOPS_EYE).rarity(Rarity.RARE)));
        FIRE_DRAGON_TACO = registerWithTab("fire_dragon_taco", () -> new ConsumableItem(foodItem(FoodValues.FIRE_DRAGON_TACO).rarity(Rarity.UNCOMMON)));
        COOL_SANDWICH = registerWithTab("cool_sandwich", () -> new ConsumableItem(foodItem(FoodValues.COOL_SANDWICH).rarity(Rarity.UNCOMMON), false)
                { // I will be honest, AI made this for me aaand I 100% sure he overengineered this shit, buut idk how made it better
                    @Override
                    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
                        FoodProperties food = stack.getFoodProperties(null);

                        if (food == null || food.getEffects().isEmpty()) return;

                        for (Pair<MobEffectInstance, Float> pair : food.getEffects()) {
                            MobEffectInstance instance = pair.getFirst();
                            MobEffect effect = instance.getEffect();

                            Component effectName = Component.translatable(effect.getDescriptionId());
                            Component extraText = Component.literal("00:35 - 01:00");
                            String noise = "";

                            tooltip.add(Component.translatable(
                                    "item.ice_and_fire_delight.tooltip.effect",
                                    effectName,
                                    extraText,
                                    noise
                            ).withStyle(ChatFormatting.BLUE));
                        }
                    }
                }
            );
        LIGHTNING_DRAGON_HOTDOG = registerWithTab("lightning_dragon_hotdog", () -> new ConsumableItem(foodItem(FoodValues.LIGHTNING_DRAGON_HOTDOG).rarity(Rarity.RARE)));

        // Sausages, minced meat
        TROLL_INTESTINES = registerWithTab("troll_intestines", () -> new Item(basicItem()));
        MINCED_FIRE_FLESH = registerWithTab("minced_fire_flesh", () -> new Item(basicItem()));
        RAW_FIRE_SAUSAGE = registerWithTab("raw_fire_sausage", () -> new Item(basicItem().stacksTo(16)));
        FIRE_SAUSAGE = registerWithTab("fire_sausage", () -> new ConsumableItem(foodItem(FoodValues.FIRE_SAUSAGE).rarity(Rarity.RARE).stacksTo(16)));
        MINCED_ICE_FLESH = registerWithTab("minced_ice_flesh", () -> new Item(basicItem()));
        RAW_ICE_SAUSAGE = registerWithTab("raw_ice_sausage", () -> new Item(basicItem().stacksTo(16)));
        ICE_SAUSAGE = registerWithTab("ice_sausage", () -> new ConsumableItem(foodItem(FoodValues.ICE_SAUSAGE).rarity(Rarity.RARE).stacksTo(16)));
        MINCED_LIGHTNING_FLESH = registerWithTab("minced_lightning_flesh", () -> new Item(basicItem()));
        RAW_LIGHTNING_SAUSAGE = registerWithTab("raw_lightning_sausage", () -> new Item(basicItem().stacksTo(16)));
        LIGHTNING_SAUSAGE = registerWithTab("lightning_sausage", () -> new ConsumableItem(foodItem(FoodValues.LIGHTNING_SAUSAGE).rarity(Rarity.RARE).stacksTo(16)));
        RAW_DRAGON_SPECIAL_SAUSAGE = registerWithTab("raw_dragon_special_sausage", () -> new Item(basicItem().stacksTo(16)));
        DRAGON_SPECIAL_SAUSAGE = registerWithTab("dragon_special_sausage", () -> new DragonSpecialSausageItem(foodItem(FoodValues.DRAGON_SPECIAL_SAUSAGE).rarity(Rarity.EPIC).stacksTo(16)));

        // Hearts with potatoes in mushroom sauce
        FIRE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = registerWithTab("fire_heart_with_potatoes_in_mushroom_sauce", () -> new ConsumableItem(bowlFoodItem(FoodValues.FIRE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE).rarity(Rarity.RARE)));
        ICE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = registerWithTab("ice_heart_with_potatoes_in_mushroom_sauce", () -> new ConsumableItem(bowlFoodItem(FoodValues.ICE_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE).rarity(Rarity.RARE)));
        LIGHTNING_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE = registerWithTab("lightning_heart_with_potatoes_in_mushroom_sauce", () -> new ConsumableItem(bowlFoodItem(FoodValues.LIGHTNING_HEART_WITH_POTATOES_IN_MUSHROOM_SAUCE).rarity(Rarity.RARE)));

        // Extracts, Cocktails
        EMPTY_TUBE = registerWithTab("empty_tube", () -> new Item(basicItem()));
        FIRE_LILY_EXTRACT = registerWithTab("fire_lily_extract", () -> new DrinkableItem(lilyExtractItem(FoodValues.FIRE_LILY_EXTRACT)));
        FROST_LILY_EXTRACT = registerWithTab("frost_lily_extract", () -> new DrinkableItem(lilyExtractItem(FoodValues.FROST_LILY_EXTRACT)));
        LIGHTNING_LILY_EXTRACT = registerWithTab("lightning_lily_extract", () -> new DrinkableItem(lilyExtractItem(FoodValues.LIGHTNING_LILY_EXTRACT)));
        EMPTY_GLASS = registerWithTab("empty_glass", () -> new Item(basicItem()));
        FIERY_HOT_COCKTAIL = registerWithTab("fiery_hot_cocktail", () -> new DrinkableItem(cocktailItem(FoodValues.FIERY_HOT_COCKTAIL)));
        FROST_COCKTAIL = registerWithTab("frost_cocktail", () -> new DrinkableItem(cocktailItem(FoodValues.FROST_COCKTAIL)));
        ELECTRIC_COCKTAIL = registerWithTab("electric_cocktail", () -> new DrinkableItem(cocktailItem(FoodValues.ELECTRIC_COCKTAIL)));
        SPECIAL_COCKTAIL = registerWithTab("special_cocktail", () -> new DrinkableItem(cocktailItem(FoodValues.SPECIAL_COCKTAIL)));

        // Pies
        DRAGON_PIE_CRUST = registerWithTab("dragon_pie_crust", () -> new Item(basicItem()));
        FIERY_HOT_PIE = registerWithTab("fiery_hot_pie", () -> new PlaceableItem((Block) IaFDModBlocks.FIERY_HOT_PIE.get(), basicItem()));
        FIERY_HOT_PIE_SLICE = registerWithTab("fiery_hot_pie_slice", () -> new ConsumableItem(foodItem(FoodValues.FIERY_HOT_PIE_SLICE).rarity(Rarity.RARE)));
        FROST_PIE = registerWithTab("frost_pie", () -> new PlaceableItem((Block) IaFDModBlocks.FROST_PIE.get(), basicItem()));
        FROST_PIE_SLICE = registerWithTab("frost_pie_slice", () -> new ConsumableItem(foodItem(FoodValues.FROST_PIE_SLICE).rarity(Rarity.RARE)));
        ELECTRIC_PIE = registerWithTab("electric_pie", () -> new PlaceableItem((Block) IaFDModBlocks.ELECTRIC_PIE.get(), basicItem()));
        ELECTRIC_PIE_SLICE = registerWithTab("electric_pie_slice", () -> new ConsumableItem(foodItem(FoodValues.ELECTRIC_PIE_SLICE).rarity(Rarity.RARE)));
        DRAGON_SPECIAL_PIE = registerWithTab("dragon_special_pie", () -> new PlaceableItem((Block) IaFDModBlocks.DRAGON_SPECIAL_PIE.get(), basicItem()));
        DRAGON_SPECIAL_PIE_SLICE = registerWithTab("dragon_special_pie_slice", () -> new DragonSpecialPieSliceItem(foodItem(FoodValues.DRAGON_SPECIAL_PIE_SLICE).rarity(Rarity.EPIC)));

        WITHERBONE_SPICES = registerWithTab("witherbone_spices", () -> new Item(basicItem()));
        DRAGON_BONE_FLOUR = registerWithTab("dragon_bone_flour", () -> new Item(basicItem()));
        DRAGON_BONE_DOUGH = registerWithTab("dragon_bone_dough", () -> new Item(basicItem()));
        DRAGON_BONE_BUN = registerWithTab("dragon_bone_bun", () -> new Item(foodItem(FoodValues.DRAGON_BONE_BUN)));
        SEA_SERPENT_SLICE = registerWithTab("sea_serpent_slice", () -> new Item(foodItem(FoodValues.SEA_SERPENT_SLICE)));
        SEA_SERPENT_ROLL = registerWithTab("sea_serpent_roll", () -> new Item(foodItem(FoodValues.SEA_SERPENT_ROLL)));
        COOKED_SEA_SERPENT_SLICE = registerWithTab("cooked_sea_serpent_slice", () -> new Item(foodItem(FoodValues.COOKED_SEA_SERPENT_SLICE)));

        // Knives
        SILVER_KNIFE = registerWithTab("silver_knife", () -> new SilverKnifeItem(IaFDModTiers.SILVER, 3, -2.0F, basicItem()));
        HYDRA_FANG_KNIFE = registerWithTab("hydra_fang_knife", () -> new HydraFangKnifeItem(IaFDModTiers.HYDRA_FANG, 3, -2.0F, basicItem()));
        SEA_SERPENT_FANG_KNIFE = registerWithTab("sea_serpent_fang_knife", () -> new KnifeItem(IaFDModTiers.SEA_SERPENT_FANG, 3, -2.0F, basicItem()));
        FIRE_DRAGONSTEEL_KNIFE = registerWithTab("fire_dragonsteel_knife", () -> new FireDragonsteelKnifeItem(IaFDModTiers.FIRE_DRAGONSTEEL, 3, -2.0F, basicItem()));
        ICE_DRAGONSTEEL_KNIFE = registerWithTab("ice_dragonsteel_knife", () -> new IceDragonsteelKnifeItem(IaFDModTiers.ICE_DRAGONSTEEL, 3, -2.0F, basicItem()));
        LIGHTNING_DRAGONSTEEL_KNIFE = registerWithTab("lightning_dragonsteel_knife", () -> new LightningDragonsteelKnifeItem(IaFDModTiers.LIGHTNING_DRAGONSTEEL, 3, -2.0F, basicItem()));
        DRAGONBONE_KNIFE = registerWithTab("dragonbone_knife", () -> new KnifeItem(IaFDModTiers.DRAGONBONE, 3, -2.0F, basicItem()));
    }
}
