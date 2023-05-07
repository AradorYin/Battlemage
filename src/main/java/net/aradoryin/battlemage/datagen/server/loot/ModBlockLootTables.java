package net.aradoryin.battlemage.datagen.server.loot;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // WIP BLOCKS | ORES
        dropSelf(ModBlocks.BLOCK_WIP.get());
        add(ModBlocks.ORE_WIP.get(), block -> createOreDrop(ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get()));
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get()));
        // BLOCKS
        dropSelf(ModBlocks.AQUAMARINE_BLOCK.get());
        add(ModBlocks.BUDDING_AQUAMARINE.get(), noDrop());
        dropSelf(ModBlocks.CITRINE_BLOCK.get());
        add(ModBlocks.BUDDING_CITRINE.get(), noDrop());
        dropSelf(ModBlocks.GARNET_BLOCK.get());
        add(ModBlocks.BUDDING_GARNET.get(), noDrop());
        dropSelf(ModBlocks.OPAL_BLOCK.get());
        add(ModBlocks.BUDDING_OPAL.get(), noDrop());
        dropSelf(ModBlocks.PERIDOT_BLOCK.get());
        add(ModBlocks.BUDDING_PERIDOT.get(), noDrop());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        add(ModBlocks.BUDDING_RUBY.get(), noDrop());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        add(ModBlocks.BUDDING_SAPPHIRE.get(), noDrop());
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());
        add(ModBlocks.BUDDING_TOPAZ.get(), noDrop());
        // CLUSTERS
        add(ModBlocks.AQUAMARINE_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.AQUAMARINE_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.AQUAMARINE_SHARD.get())
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                .otherwise(this.applyExplosionDecay(ModBlocks.AQUAMARINE_CLUSTER.get(), LootItem.lootTableItem(ModItems.AQUAMARINE_SHARD.get()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_AQUAMARINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_AQUAMARINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_AQUAMARINE_BUD.get());
        add(ModBlocks.CITRINE_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.CITRINE_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.CITRINE_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.CITRINE_CLUSTER.get(), LootItem.lootTableItem(ModItems.CITRINE_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_CITRINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_CITRINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_CITRINE_BUD.get());
        add(ModBlocks.GARNET_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.GARNET_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.GARNET_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.GARNET_CLUSTER.get(), LootItem.lootTableItem(ModItems.GARNET_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_GARNET_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_GARNET_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_GARNET_BUD.get());
        add(ModBlocks.OPAL_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.OPAL_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.OPAL_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.OPAL_CLUSTER.get(), LootItem.lootTableItem(ModItems.OPAL_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_OPAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_OPAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_OPAL_BUD.get());
        add(ModBlocks.PERIDOT_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.PERIDOT_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.PERIDOT_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.PERIDOT_CLUSTER.get(), LootItem.lootTableItem(ModItems.PERIDOT_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_PERIDOT_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_PERIDOT_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_PERIDOT_BUD.get());
        add(ModBlocks.RUBY_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.RUBY_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.RUBY_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.RUBY_CLUSTER.get(), LootItem.lootTableItem(ModItems.RUBY_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_RUBY_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_RUBY_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_RUBY_BUD.get());
        add(ModBlocks.SAPPHIRE_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.SAPPHIRE_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.SAPPHIRE_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.SAPPHIRE_CLUSTER.get(), LootItem.lootTableItem(ModItems.SAPPHIRE_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_SAPPHIRE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_SAPPHIRE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_SAPPHIRE_BUD.get());
        add(ModBlocks.TOPAZ_CLUSTER.get(), block -> createSilkTouchDispatchTable(ModBlocks.TOPAZ_CLUSTER.get(),
                LootItem.lootTableItem(ModItems.TOPAZ_SHARD.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0f)))
                        .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES)))
                        .otherwise(this.applyExplosionDecay(ModBlocks.TOPAZ_CLUSTER.get(), LootItem.lootTableItem(ModItems.TOPAZ_SHARD.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0f))))));
        dropWhenSilkTouch(ModBlocks.LARGE_TOPAZ_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_TOPAZ_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_TOPAZ_BUD.get());
        // ORES
        // PLANKS | LOGS | LEAVES| SAPLING
        dropSelf(ModBlocks.DAPHNE_LOG.get());
        dropSelf(ModBlocks.DAPHNE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DAPHNE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DAPHNE_WOOD.get());
        dropSelf(ModBlocks.DAPHNE_PLANKS.get());
        dropSelf(ModBlocks.DAPHNE_SAPLING.get());
        add(ModBlocks.DAPHNE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.DAPHNE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
