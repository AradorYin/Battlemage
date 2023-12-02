package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.datagen.helper.ItemModelHelper;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelHelper {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // CRAFTING STATIONS
        blockItem(ModBlocks.JEWEL_CRAFTING_STATION.get());

        // CLUSTERS
        clusterTest(ModBlocks.AQUAMARINE_CLUSTER);
        clusterTest(ModBlocks.CITRINE_CLUSTER);
        clusterTest(ModBlocks.GARNET_CLUSTER);
        clusterTest(ModBlocks.OPAL_CLUSTER);
        clusterTest(ModBlocks.PERIDOT_CLUSTER);
        clusterTest(ModBlocks.RUBY_CLUSTER);
        clusterTest(ModBlocks.SAPPHIRE_CLUSTER);
        clusterTest(ModBlocks.TOPAZ_CLUSTER);
        // Large BUDS
        largeBudTest(ModBlocks.LARGE_AQUAMARINE_BUD);
        largeBudTest(ModBlocks.LARGE_CITRINE_BUD);
        largeBudTest(ModBlocks.LARGE_GARNET_BUD);
        largeBudTest(ModBlocks.LARGE_OPAL_BUD);
        largeBudTest(ModBlocks.LARGE_PERIDOT_BUD);
        largeBudTest(ModBlocks.LARGE_RUBY_BUD);
        largeBudTest(ModBlocks.LARGE_SAPPHIRE_BUD);
        largeBudTest(ModBlocks.LARGE_TOPAZ_BUD);
        // MEDIUM BUDS
        mediumBudTest(ModBlocks.MEDIUM_AQUAMARINE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_CITRINE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_GARNET_BUD);
        mediumBudTest(ModBlocks.MEDIUM_OPAL_BUD);
        mediumBudTest(ModBlocks.MEDIUM_PERIDOT_BUD);
        mediumBudTest(ModBlocks.MEDIUM_RUBY_BUD);
        mediumBudTest(ModBlocks.MEDIUM_SAPPHIRE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_TOPAZ_BUD);
        // SMALL BUDS
        smallBudTest(ModBlocks.SMALL_AQUAMARINE_BUD);
        smallBudTest(ModBlocks.SMALL_CITRINE_BUD);
        smallBudTest(ModBlocks.SMALL_GARNET_BUD);
        smallBudTest(ModBlocks.SMALL_OPAL_BUD);
        smallBudTest(ModBlocks.SMALL_PERIDOT_BUD);
        smallBudTest(ModBlocks.SMALL_RUBY_BUD);
        smallBudTest(ModBlocks.SMALL_SAPPHIRE_BUD);
        smallBudTest(ModBlocks.SMALL_TOPAZ_BUD);

        // SAPLING
        blockItem(ModBlocks.DAPHNE_SAPLING);

        // GEM EMERALDS
        gemEmeraldTest(ModItems.WIP_EMERALD);
        gemEmeraldTest(ModItems.AMETHYST_EMERALD);
        gemEmeraldTest(ModItems.AQUAMARINE_EMERALD);
        gemEmeraldTest(ModItems.CITRINE_EMERALD);
        gemEmeraldTest(ModItems.GARNET_EMERALD);
        gemEmeraldTest(ModItems.OPAL_EMERALD);
        gemEmeraldTest(ModItems.PERIDOT_EMERALD);
        gemEmeraldTest(ModItems.RUBY_EMERALD);
        gemEmeraldTest(ModItems.SAPPHIRE_EMERALD);
        gemEmeraldTest(ModItems.TOPAZ_EMERALD);

        // GEM FACETED
        gemFacetedTest(ModItems.WIP_FACETED);
        gemFacetedTest(ModItems.AMETHYST_FACETED);
        gemFacetedTest(ModItems.AQUAMARINE_FACETED);
        gemFacetedTest(ModItems.CITRINE_FACETED);
        gemFacetedTest(ModItems.GARNET_FACETED);
        gemFacetedTest(ModItems.OPAL_FACETED);
        gemFacetedTest(ModItems.PERIDOT_FACETED);
        gemFacetedTest(ModItems.RUBY_FACETED);
        gemFacetedTest(ModItems.SAPPHIRE_FACETED);
        gemFacetedTest(ModItems.TOPAZ_FACETED);

        // GEM GEODE
        gemGeodeTest(ModItems.WIP_GEODE);
        gemGeodeTest(ModItems.AMETHYST_GEODE);
        gemGeodeTest(ModItems.AQUAMARINE_GEODE);
        gemGeodeTest(ModItems.CITRINE_GEODE);
        gemGeodeTest(ModItems.GARNET_GEODE);
        gemGeodeTest(ModItems.OPAL_GEODE);
        gemGeodeTest(ModItems.PERIDOT_GEODE);
        gemGeodeTest(ModItems.RUBY_GEODE);
        gemGeodeTest(ModItems.SAPPHIRE_GEODE);
        gemGeodeTest(ModItems.TOPAZ_GEODE);

        // GEM PEAR
        gemPearTest(ModItems.WIP_PEAR);
        gemPearTest(ModItems.AMETHYST_PEAR);
        gemPearTest(ModItems.AQUAMARINE_PEAR);
        gemPearTest(ModItems.CITRINE_PEAR);
        gemPearTest(ModItems.GARNET_PEAR);
        gemPearTest(ModItems.OPAL_PEAR);
        gemPearTest(ModItems.PERIDOT_PEAR);
        gemPearTest(ModItems.RUBY_PEAR);
        gemPearTest(ModItems.SAPPHIRE_PEAR);
        gemPearTest(ModItems.TOPAZ_PEAR);

        // GEM SHARDS
        gemShardTest(ModItems.WIP_SHARD);
        gemShardTest(ModItems.AQUAMARINE_SHARD);
        gemShardTest(ModItems.CITRINE_SHARD);
        gemShardTest(ModItems.GARNET_SHARD);
        gemShardTest(ModItems.OPAL_SHARD);
        gemShardTest(ModItems.PERIDOT_SHARD);
        gemShardTest(ModItems.RUBY_SHARD);
        gemShardTest(ModItems.SAPPHIRE_SHARD);
        gemShardTest(ModItems.TOPAZ_SHARD);

        // GEM TRILLION
        gemTrillionTest(ModItems.WIP_TRILLION);
        gemTrillionTest(ModItems.AMETHYST_TRILLION);
        gemTrillionTest(ModItems.AQUAMARINE_TRILLION);
        gemTrillionTest(ModItems.CITRINE_TRILLION);
        gemTrillionTest(ModItems.GARNET_TRILLION);
        gemTrillionTest(ModItems.OPAL_TRILLION);
        gemTrillionTest(ModItems.PERIDOT_TRILLION);
        gemTrillionTest(ModItems.RUBY_TRILLION);
        gemTrillionTest(ModItems.SAPPHIRE_TRILLION);
        gemTrillionTest(ModItems.TOPAZ_TRILLION);
    }
}
