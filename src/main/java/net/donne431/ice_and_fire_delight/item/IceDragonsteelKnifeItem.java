package net.donne431.ice_and_fire_delight.item;

import com.github.alexthe666.iceandfire.entity.props.EntityDataProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.item.KnifeItem;

import javax.annotation.Nullable;
import java.util.List;


public class IceDragonsteelKnifeItem extends KnifeItem {
    public IceDragonsteelKnifeItem(Tier tier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        EntityDataProvider.getCapability(entity).ifPresent(data -> data.frozenData.setFrozen(entity, 300)); // Заморозка жертвы
        entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2)); // Замедление жертвы
//        entity.knockback(1F, sourceentity.getX() - entity.getX(), sourceentity.getZ() - entity.getZ()); // Откидывание на 1 блок жертвы
        return retval;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("item.ice_and_fire_delight.tooltip.ice_dragonsteel_knife.hurt"));
    }

}
