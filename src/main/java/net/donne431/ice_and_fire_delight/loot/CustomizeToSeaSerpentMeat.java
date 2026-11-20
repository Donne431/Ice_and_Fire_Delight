package net.donne431.ice_and_fire_delight.loot;

import com.github.alexthe666.iceandfire.entity.EntitySeaSerpent;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.donne431.ice_and_fire_delight.registry.IaFDModItems;
import net.donne431.ice_and_fire_delight.registry.IaFDModLootRegistry;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.functions.LootItemConditionalFunction;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctionType;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import org.jetbrains.annotations.NotNull;

public class CustomizeToSeaSerpentMeat extends LootItemConditionalFunction {

    public CustomizeToSeaSerpentMeat(LootItemCondition[] conditionsIn) {
        super(conditionsIn);
    }

    @Override
    public @NotNull ItemStack run(ItemStack stack, @NotNull LootContext context) {
        if (!stack.isEmpty() && context.getParamOrNull(LootContextParams.THIS_ENTITY) instanceof EntitySeaSerpent seaSerpent) {
            final int ancientModifier = seaSerpent.isAncient() ? 2 : 1;
            if (stack.getItem() == IaFDModItems.SEA_SERPENT_MEAT.get()) {
                stack.setCount(1 + seaSerpent.getRandom().nextInt(1 + (int) Math.ceil(seaSerpent.getSeaSerpentScale() * 3 * ancientModifier)));
                return stack;
            }
            if (stack.getItem() == IaFDModItems.COOKED_SEA_SERPENT_MEAT.get()) {
                stack.setCount(1 + seaSerpent.getRandom().nextInt(1 + (int) Math.ceil(seaSerpent.getSeaSerpentScale() * 3 * ancientModifier)));
                return stack;
            }
        }
        return stack;
    }

    @Override
    public @NotNull LootItemFunctionType getType() {
        return IaFDModLootRegistry.CUSTOMIZE_TO_SERPENT_MEAT;
    }

    public static class Serializer extends LootItemConditionalFunction.Serializer<CustomizeToSeaSerpentMeat> {
        public Serializer() {
            super();
        }

        @Override
		public void serialize(@NotNull JsonObject object, @NotNull CustomizeToSeaSerpentMeat function, @NotNull JsonSerializationContext ctx) {
   	 		super.serialize(object, function, ctx);
		}

        @Override
        public @NotNull CustomizeToSeaSerpentMeat deserialize(@NotNull JsonObject object, @NotNull JsonDeserializationContext deserializationContext, LootItemCondition @NotNull [] conditionsIn) {
            return new CustomizeToSeaSerpentMeat(conditionsIn);
        }
    }
}