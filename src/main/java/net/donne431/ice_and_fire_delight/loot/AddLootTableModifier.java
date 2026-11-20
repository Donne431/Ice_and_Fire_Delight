package net.donne431.ice_and_fire_delight.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.donne431.ice_and_fire_delight.IceAndFireDelightMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = IceAndFireDelightMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AddLootTableModifier extends LootModifier {
    public static final Supplier<Codec<AddLootTableModifier>> CODEC = Suppliers.memoize(() -> RecordCodecBuilder.create((inst) -> codecStart(inst).and(ResourceLocation.CODEC.fieldOf("lootTable").forGetter((m) -> m.lootTable)).apply(inst, AddLootTableModifier::new)));
    private final ResourceLocation lootTable;

    public AddLootTableModifier(LootItemCondition[] conditions, ResourceLocation lootTable) {
        super(conditions);
        this.lootTable = lootTable;
    }

    @Nonnull
    protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        LootTable extraTable = context.getResolver().getLootTable(this.lootTable);
        ServerLevel var10002 = context.getLevel();
        Objects.requireNonNull(generatedLoot);
        extraTable.getRandomItemsRaw(context, LootTable.createStackSplitter(var10002, generatedLoot::add));

        return generatedLoot;
    }

        public Codec<? extends IGlobalLootModifier> codec() {
            return (Codec)CODEC.get();
        }
	}

