package net.donne431.ice_and_fire_delight.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.item.KnifeItem;

import javax.annotation.Nullable;
import java.util.List;


public class SilverKnifeItem extends KnifeItem {

    public SilverKnifeItem(Tier tier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);

        if (target.getMobType() == MobType.UNDEAD) {
            target.hurt(attacker.level().damageSources().magic(), this.getAttackDamage() + 2.0F);
        }

        return result;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List< Component > tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("item.ice_and_fire_delight.tooltip.silver_knife.hurt"));
    }
}