package net.donne431.ice_and_fire_delight.registry;

import com.github.alexthe666.iceandfire.item.IafItemRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class IaFDModTiers {
    public static final Tier SILVER = new Tier() {
        public int getUses() {
            return 460;
        }

        public float getSpeed() {
            return 6.0F;
        }

        public float getAttackDamageBonus() {
            return -0.5F;
        }

        public int getLevel() {
            return 2;
        }

        public int getEnchantmentValue() {
            return 14;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.SILVER_INGOT.get()));
        }
    };
    public static final Tier HYDRA_FANG = new Tier() {
        public int getUses() {
            return 700;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 1.0F;
        }

        public int getLevel() {
            return 2;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.HYDRA_FANG.get()));
        }
    };
    public static final Tier SEA_SERPENT_FANG = new Tier() {
        public int getUses() {
            return 600;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 0.0F;
        }

        public int getLevel() {
            return 2;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.SERPENT_FANG.get()));
        }
    };
    public static final Tier FIRE_DRAGONSTEEL = new Tier() {
        public int getUses() {
            return 2000;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 6.0F;
        }

        public int getLevel() {
            return 4;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.DRAGONSTEEL_FIRE_INGOT.get()));
        }
    };
    public static final Tier ICE_DRAGONSTEEL = new Tier() {
        public int getUses() {
            return 2000;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 6.0F;
        }

        public int getLevel() {
            return 4;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.DRAGONSTEEL_ICE_INGOT.get()));
        }
    };
    public static final Tier LIGHTNING_DRAGONSTEEL = new Tier() {
        public int getUses() {
            return 2000;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 6.0F;
        }

        public int getLevel() {
            return 4;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.DRAGONSTEEL_LIGHTNING_INGOT.get()));
        }
    };
    public static final Tier DRAGONBONE = new Tier() {
        public int getUses() {
            return 1660;
        }

        public float getSpeed() {
            return 4.0F;
        }

        public float getAttackDamageBonus() {
            return 2.0F;
        }

        public int getLevel() {
            return 3;
        }

        public int getEnchantmentValue() {
            return 2;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack(IafItemRegistry.DRAGON_BONE.get()));
        }
    };
}
