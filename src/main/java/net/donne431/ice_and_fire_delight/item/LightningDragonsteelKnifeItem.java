package net.donne431.ice_and_fire_delight.item;

import com.github.alexthe666.iceandfire.event.ServerEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import vectorwing.farmersdelight.common.item.KnifeItem;

import javax.annotation.Nullable;
import java.util.List;


public class LightningDragonsteelKnifeItem extends KnifeItem {

    public LightningDragonsteelKnifeItem(Tier tier, float attackDamage, float attackSpeed, Item.Properties properties) {
        super(tier, attackDamage, attackSpeed, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.hurtEnemy(stack, target, attacker);

        boolean shouldStrike = !(attacker instanceof Player) || attacker.attackAnim <= 0.2;
        if (shouldStrike && !attacker.level().isClientSide()) {
            LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(target.level());
            if (bolt != null) {
                bolt.getTags().add(ServerEvents.BOLT_DONT_DESTROY_LOOT);
                bolt.getTags().add(attacker.getStringUUID());
                bolt.moveTo(target.position());
                target.level().addFreshEntity(bolt);
            }
        }

//        target.knockback(1F, attacker.getX() - target.getX(), attacker.getZ() - target.getZ());

        return result;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(Component.translatable("item.ice_and_fire_delight.tooltip.lightning_dragonsteel_knife.hurt"));
    }
}