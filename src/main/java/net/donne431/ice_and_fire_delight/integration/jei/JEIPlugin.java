package net.donne431.ice_and_fire_delight.integration.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.donne431.ice_and_fire_delight.registry.IaFDModItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import vectorwing.farmersdelight.common.utility.TextUtils;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
@JeiPlugin
public class JEIPlugin implements IModPlugin {
    private static final ResourceLocation ID = new ResourceLocation("ice_and_fire_delight", "jei_plugin");
    public void registerRecipes(IRecipeRegistration registration) {
        registration.addIngredientInfo(List.of(new ItemStack(IaFDModItems.TROLL_INTESTINES.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.ice_and_fire_delight.troll_intestines"));

        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.SILVER_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.HYDRA_FANG_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.SEA_SERPENT_FANG_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.FIRE_DRAGONSTEEL_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.ICE_DRAGONSTEEL_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.LIGHTNING_DRAGONSTEEL_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
        registration.addIngredientInfo(new ItemStack((ItemLike) IaFDModItems.DRAGONBONE_KNIFE.get()), VanillaTypes.ITEM_STACK, new Component[]{TextUtils.JEI("info.knife", new Object[0])});
    }
    public ResourceLocation getPluginUid() {
        return ID;
    }
}
