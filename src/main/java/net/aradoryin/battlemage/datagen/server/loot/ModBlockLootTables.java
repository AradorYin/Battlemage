package net.aradoryin.battlemage.datagen.server.loot;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.datagen.server.ModItemTagsProvider;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
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
        // CRAFTING STATIONS
        this.dropSelf(ModBlocks.JEWEL_CRAFTING_STATION.get());

        // WIP BLOCKS | ORES
        add(ModBlocks.ORE_WIP.get(), block -> createOreDrop(ModBlocks.ORE_WIP.get(), ModItems.WIP_GEODE.get()));
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.WIP_GEODE.get()));

        // BLOCKS
        dropSelf(ModBlocks.ETHERIC_STONE.get());
        dropSelf(ModBlocks.BLASTED_COBBLESTONE_DF.get());
        dropSelf(ModBlocks.BLASTED_COBBLESTONE_HL.get());
        dropSelf(ModBlocks.BLASTED_COBBLESTONE_OL.get());
        dropSelf(ModBlocks.BLASTED_COBBLESTONE_SL.get());
        dropSelf(ModBlocks.BLASTED_COBBLESTONE_ST.get());
        dropSelf(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_DF.get());
        dropSelf(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_HL.get());
        dropSelf(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_OL.get());
        dropSelf(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_SL.get());
        dropSelf(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_ST.get());
        dropSelf(ModBlocks.BLASTED_STONE_BRICKS_DF.get());
        dropSelf(ModBlocks.BLASTED_STONE_BRICKS_HL.get());
        dropSelf(ModBlocks.BLASTED_STONE_BRICKS_OL.get());
        dropSelf(ModBlocks.BLASTED_STONE_BRICKS_SL.get());
        dropSelf(ModBlocks.BLASTED_STONE_BRICKS_ST.get());
        dropSelf(ModBlocks.BLASTED_STONE_DF.get());
        dropSelf(ModBlocks.BLASTED_STONE_HL.get());
        dropSelf(ModBlocks.BLASTED_STONE_OL.get());
        dropSelf(ModBlocks.BLASTED_STONE_SL.get());
        dropSelf(ModBlocks.BLASTED_STONE_ST.get());

        // STORAGE BLOCKS
        dropSelf(ModBlocks.WIP_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_BLOCK.get());
        dropSelf(ModBlocks.GARNET_BLOCK.get());
        dropSelf(ModBlocks.OPAL_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_BLOCK.get());

        // EMERALD STORAGE BLOCKS
        dropSelf(ModBlocks.WIP_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.AMETHYST_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.GARNET_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.OPAL_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.RUBY_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_EMERALD_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_EMERALD_BLOCK.get());

        // FACETED STORAGE BLOCKS
        dropSelf(ModBlocks.WIP_FACETED_BLOCK.get());
        dropSelf(ModBlocks.AMETHYST_FACETED_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_FACETED_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_FACETED_BLOCK.get());
        dropSelf(ModBlocks.GARNET_FACETED_BLOCK.get());
        dropSelf(ModBlocks.OPAL_FACETED_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_FACETED_BLOCK.get());
        dropSelf(ModBlocks.RUBY_FACETED_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_FACETED_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_FACETED_BLOCK.get());

        // PEAR STORAGE BLOCKS
        dropSelf(ModBlocks.WIP_PEAR_BLOCK.get());
        dropSelf(ModBlocks.AMETHYST_PEAR_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_PEAR_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_PEAR_BLOCK.get());
        dropSelf(ModBlocks.GARNET_PEAR_BLOCK.get());
        dropSelf(ModBlocks.OPAL_PEAR_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_PEAR_BLOCK.get());
        dropSelf(ModBlocks.RUBY_PEAR_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_PEAR_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_PEAR_BLOCK.get());

        // TRILLION STORAGE BLOCKS
        dropSelf(ModBlocks.WIP_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.AMETHYST_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.AQUAMARINE_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.GARNET_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.OPAL_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.PERIDOT_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.RUBY_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_TRILLION_BLOCK.get());
        dropSelf(ModBlocks.TOPAZ_TRILLION_BLOCK.get());

        // BUDDING BLOCKS
        // WIP
        silkTouchDispatchTable(ModBlocks.BUDDING_WIP, ModBlocks.WIP_BLOCK, ModItems.WIP_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // AQUAMARINE
        silkTouchDispatchTable(ModBlocks.BUDDING_AQUAMARINE, ModBlocks.AQUAMARINE_BLOCK, ModItems.AQUAMARINE_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // CITRINE
        silkTouchDispatchTable(ModBlocks.BUDDING_CITRINE, ModBlocks.CITRINE_BLOCK, ModItems.CITRINE_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // GARNET
        silkTouchDispatchTable(ModBlocks.BUDDING_GARNET, ModBlocks.GARNET_BLOCK, ModItems.GARNET_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // OPAL
        silkTouchDispatchTable(ModBlocks.BUDDING_OPAL, ModBlocks.OPAL_BLOCK, ModItems.OPAL_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // PERIDOT
        silkTouchDispatchTable(ModBlocks.BUDDING_PERIDOT, ModBlocks.PERIDOT_BLOCK, ModItems.PERIDOT_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // RUBY
        silkTouchDispatchTable(ModBlocks.BUDDING_RUBY, ModBlocks.RUBY_BLOCK, ModItems.RUBY_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // SAPPHIRE
        silkTouchDispatchTable(ModBlocks.BUDDING_SAPPHIRE, ModBlocks.SAPPHIRE_BLOCK, ModItems.SAPPHIRE_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);
        // TOPAZ
        silkTouchDispatchTable(ModBlocks.BUDDING_TOPAZ, ModBlocks.TOPAZ_BLOCK, ModItems.TOPAZ_GEODE,
                Enchantments.BLOCK_FORTUNE, 2.0f, 1.0f, ModItemTagsProvider.MOD_BUDDING_BLOCKS);

        // CLUSTERS
        // AQUAMARINE
        silkTouchDispatchTable(ModBlocks.WIP_CLUSTER, ModItems.WIP_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // AQUAMARINE
        silkTouchDispatchTable(ModBlocks.AQUAMARINE_CLUSTER, ModItems.AQUAMARINE_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // CITRINE
        silkTouchDispatchTable(ModBlocks.CITRINE_CLUSTER, ModItems.CITRINE_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // GARNET
        silkTouchDispatchTable(ModBlocks.GARNET_CLUSTER, ModItems.GARNET_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // OPAL
        silkTouchDispatchTable(ModBlocks.OPAL_CLUSTER, ModItems.OPAL_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // PERIDOT
        silkTouchDispatchTable(ModBlocks.PERIDOT_CLUSTER, ModItems.PERIDOT_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // RUBY
        silkTouchDispatchTable(ModBlocks.RUBY_CLUSTER, ModItems.RUBY_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // SAPPHIRE
        silkTouchDispatchTable(ModBlocks.SAPPHIRE_CLUSTER, ModItems.SAPPHIRE_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);
        // TOPAZ
        silkTouchDispatchTable(ModBlocks.TOPAZ_CLUSTER, ModItems.TOPAZ_SHARD,
                Enchantments.BLOCK_FORTUNE, 4.0f, 2.0f, ItemTags.CLUSTER_MAX_HARVESTABLES);

        // LARGE BUDS
        dropWhenSilkTouch(ModBlocks.LARGE_WIP_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_AQUAMARINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_CITRINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_GARNET_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_OPAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_PERIDOT_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_RUBY_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_SAPPHIRE_BUD.get());
        dropWhenSilkTouch(ModBlocks.LARGE_TOPAZ_BUD.get());

        // MEDIUM BUDS
        dropWhenSilkTouch(ModBlocks.MEDIUM_WIP_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_AQUAMARINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_CITRINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_GARNET_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_OPAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_PERIDOT_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_RUBY_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_SAPPHIRE_BUD.get());
        dropWhenSilkTouch(ModBlocks.MEDIUM_TOPAZ_BUD.get());

        // SMALL BUDS
        dropWhenSilkTouch(ModBlocks.SMALL_WIP_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_AQUAMARINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_CITRINE_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_GARNET_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_OPAL_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_PERIDOT_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_RUBY_BUD.get());
        dropWhenSilkTouch(ModBlocks.SMALL_SAPPHIRE_BUD.get());
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

    /**
     * This is a helper method for creating Silk Touch Drop Tables.
     * @param minedBlock ModBlocks.EXAMPLE_BLOCK
     * @param item ModItems.EXAMPLE_ITEM
     * @param enchantment Enchantments.BLOCK_FORTUNE
     * @param initialDropChance 4.0f
     * @param dropChance 2.0f
     * @param tag ItemTags.CLUSTER_MAX_HARVESTABLES
     */
    private void silkTouchDispatchTable(RegistryObject<Block> minedBlock, RegistryObject<Item> item,
                                        Enchantment enchantment, float initialDropChance, float dropChance, TagKey<Item> tag) {
        add(minedBlock.get(), returnBlock -> createSilkTouchDispatchTable(minedBlock.get(),
                LootItem.lootTableItem(item.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(initialDropChance)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantment))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(tag)))
                        .otherwise(this.applyExplosionDecay(minedBlock.get(), LootItem.lootTableItem(item.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(dropChance))))));
    }

    /**
     * This is a helper method for creating Silk Touch Drop Tables.
     * @param minedBlock ModBlocks.EXAMPLE_BLOCK
     * @param droppedBlock ModBlocks.EXAMPLE_BLOCK
     * @param item ModItems.EXAMPLE_ITEM
     * @param enchantment Enchantments.BLOCK_FORTUNE
     * @param initialDropChance 4.0f
     * @param dropChance 2.0f
     * @param tag ItemTags.CLUSTER_MAX_HARVESTABLES
     */
    private void silkTouchDispatchTable(RegistryObject<Block> minedBlock, RegistryObject<Block> droppedBlock, RegistryObject<Item> item,
                                        Enchantment enchantment, float initialDropChance, float dropChance, TagKey<Item> tag) {
        add(minedBlock.get(), returnBlock -> createSilkTouchDispatchTable(droppedBlock.get(),
                LootItem.lootTableItem(item.get())
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(initialDropChance)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantment))
                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(tag)))
                        .otherwise(this.applyExplosionDecay(minedBlock.get(), LootItem.lootTableItem(item.get()))
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(dropChance))))));
    }
}
