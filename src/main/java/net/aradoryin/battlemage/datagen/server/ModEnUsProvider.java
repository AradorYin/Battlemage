package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.ModCreativeModeTabs;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider {
    public ModEnUsProvider(PackOutput output) {
        super(output, Battlemage.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        /*
        <---------------------------------------------------------------->
                                Creative Tab
        <---------------------------------------------------------------->
         */
        add(ModCreativeModeTabs.BATTLEMAGE_TAB.get().getDisplayName().getString(), "Battlemage");

        /*
        <---------------------------------------------------------------->
                                    Items
        <---------------------------------------------------------------->
         */
        // BRACER
        add(ModItems.BRACER_PATCHWORK.get(), "Patchwork Bracer");
//        add(ModItems.BRACER_UPGRADE.get(), "Bracer");
//        add(ModItems.BRACER_MAX.get(), "Bracer");
        // ELEMENTAL PATTERN
//        add(ModItems.ELEMENTAL_PATTERN_WIP.get(), "Elemental Pattern: WIP");
//        add(ModItems.ELEMENTAL_PATTERN_CORRUPTION.get(), "Elemental Pattern: Corruption");
//        add(ModItems.ELEMENTAL_PATTERN_DELIRIUM.get(), "Elemental Pattern: Delirium");
//        add(ModItems.ELEMENTAL_PATTERN_EARTH.get(), "Elemental Pattern: Earth");
//        add(ModItems.ELEMENTAL_PATTERN_FIRE.get(), "Elemental Pattern: Fire");
//        add(ModItems.ELEMENTAL_PATTERN_ICE.get(), "Elemental Pattern: Ice");
//        add(ModItems.ELEMENTAL_PATTERN_KINESIS.get(), "Elemental Pattern: Kinesis");
//        add(ModItems.ELEMENTAL_PATTERN_LIGHTNING.get(), "Elemental Pattern: Lightning");
//        add(ModItems.ELEMENTAL_PATTERN_NECROMANCY.get(), "Elemental Pattern: Necromancy");
//        add(ModItems.ELEMENTAL_PATTERN_PHASE.get(), "Elemental Pattern: Phase");

        // GEM EMERALDS
        add(ModItems.WIP_EMERALD.get(), "Emerald-Cut WIP");
        add(ModItems.AMETHYST_EMERALD.get(), "Emerald-Cut Amethyst");
        add(ModItems.AQUAMARINE_EMERALD.get(), "Emerald-Cut Aquamarine");
        add(ModItems.CITRINE_EMERALD.get(), "Emerald-Cut Citrine");
        add(ModItems.GARNET_EMERALD.get(), "Emerald-Cut Garnet");
        add(ModItems.OPAL_EMERALD.get(), "Emerald-Cut Opal");
        add(ModItems.PERIDOT_EMERALD.get(), "Emerald-Cut Peridot");
        add(ModItems.RUBY_EMERALD.get(), "Emerald-Cut Ruby");
        add(ModItems.SAPPHIRE_EMERALD.get(), "Emerald-Cut Sapphire");
        add(ModItems.TOPAZ_EMERALD.get(), "Emerald-Cut Topaz");

        // GEM FACETED
        add(ModItems.WIP_FACETED.get(), "Faceted-Cut WIP");
        add(ModItems.AMETHYST_FACETED.get(), "Faceted-Cut Amethyst");
        add(ModItems.AQUAMARINE_FACETED.get(), "Faceted-Cut Aquamarine");
        add(ModItems.CITRINE_FACETED.get(), "Faceted-Cut Citrine");
        add(ModItems.GARNET_FACETED.get(), "Faceted-Cut Garnet");
        add(ModItems.OPAL_FACETED.get(), "Faceted-Cut Opal");
        add(ModItems.PERIDOT_FACETED.get(), "Faceted-Cut Peridot");
        add(ModItems.RUBY_FACETED.get(), "Faceted-Cut Ruby");
        add(ModItems.SAPPHIRE_FACETED.get(), "Faceted-Cut Sapphire");
        add(ModItems.TOPAZ_FACETED.get(), "Faceted-Cut Topaz");

        // GEM GEODE
        add(ModItems.WIP_GEODE.get(), "WIP Geode");
        add(ModItems.AMETHYST_GEODE.get(), "Amethyst Geode");
        add(ModItems.AQUAMARINE_GEODE.get(), "Aquamarine Geode");
        add(ModItems.CITRINE_GEODE.get(), "Citrine Geode");
        add(ModItems.GARNET_GEODE.get(), "Garnet Geode");
        add(ModItems.OPAL_GEODE.get(), "Opal Geode");
        add(ModItems.PERIDOT_GEODE.get(), "Peridot Geode");
        add(ModItems.RUBY_GEODE.get(), "Ruby Geode");
        add(ModItems.SAPPHIRE_GEODE.get(), "Sapphire Geode");
        add(ModItems.TOPAZ_GEODE.get(), "Topaz Geode");

        // GEM PEAR
        add(ModItems.WIP_PEAR.get(), "WIP Tear");
        add(ModItems.AMETHYST_PEAR.get(), "Amethyst Tear");
        add(ModItems.AQUAMARINE_PEAR.get(), "Aquamarine Tear");
        add(ModItems.CITRINE_PEAR.get(), "Citrine Tear");
        add(ModItems.GARNET_PEAR.get(), "Garnet Tear");
        add(ModItems.OPAL_PEAR.get(), "Opal Tear");
        add(ModItems.PERIDOT_PEAR.get(), "Peridot Tear");
        add(ModItems.RUBY_PEAR.get(), "Ruby Tear");
        add(ModItems.SAPPHIRE_PEAR.get(), "Sapphire Tear");
        add(ModItems.TOPAZ_PEAR.get(), "Topaz Tear");

        // GEM SHARDS
        add(ModItems.WIP_SHARD.get(), "WIP Shard");
        add(ModItems.AQUAMARINE_SHARD.get(), "Aquamarine Shard");
        add(ModItems.CITRINE_SHARD.get(), "Citrine Shard");
        add(ModItems.GARNET_SHARD.get(), "Garnet Shard");
        add(ModItems.OPAL_SHARD.get(), "Opal Shard");
        add(ModItems.PERIDOT_SHARD.get(), "Peridot Shard");
        add(ModItems.RUBY_SHARD.get(), "Ruby Shard");
        add(ModItems.SAPPHIRE_SHARD.get(), "Sapphire Shard");
        add(ModItems.TOPAZ_SHARD.get(), "Topaz Shard");

        // GEM TRILLION
        add(ModItems.WIP_TRILLION.get(), "Trillion-Cut WIP");
        add(ModItems.AMETHYST_TRILLION.get(), "Trillion-Cut Amethyst");
        add(ModItems.AQUAMARINE_TRILLION.get(), "Trillion-Cut Aquamarine");
        add(ModItems.CITRINE_TRILLION.get(), "Trillion-Cut Citrine");
        add(ModItems.GARNET_TRILLION.get(), "Trillion-Cut Garnet");
        add(ModItems.OPAL_TRILLION.get(), "Trillion-Cut Opal");
        add(ModItems.PERIDOT_TRILLION.get(), "Trillion-Cut Peridot");
        add(ModItems.RUBY_TRILLION.get(), "Trillion-Cut Ruby");
        add(ModItems.SAPPHIRE_TRILLION.get(), "Trillion-Cut Sapphire");
        add(ModItems.TOPAZ_TRILLION.get(), "Trillion-Cut Topaz");


        /*
        <---------------------------------------------------------------->
                                    Blocks
        <---------------------------------------------------------------->
         */
        add(ModBlocks.ETHERIC_STONE.get(), "Etheric Stone");
        add(ModBlocks.BLASTED_COBBLESTONE_DF.get(), "Blasted Cobblestone Difference");
        add(ModBlocks.BLASTED_COBBLESTONE_HL.get(), "Blasted Cobblestone Hardlight");
        add(ModBlocks.BLASTED_COBBLESTONE_OL.get(), "Blasted Cobblestone Overlay");
        add(ModBlocks.BLASTED_COBBLESTONE_SL.get(), "Blasted Cobblestone Softlight");
        add(ModBlocks.BLASTED_COBBLESTONE_ST.get(), "Blasted Cobblestone Subtract");
        add(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_DF.get(), "Blasted Cracked Stone Bricks Difference");
        add(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_HL.get(), "Blasted Cracked Stone Bricks Hardlight");
        add(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_OL.get(), "Blasted Cracked Stone Bricks Overlay");
        add(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_SL.get(), "Blasted Cracked Stone Bricks Softlight");
        add(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_ST.get(), "Blasted Cracked Stone Bricks Subtract");
        add(ModBlocks.BLASTED_STONE_BRICKS_DF.get(), "Blasted Stone Bricks Difference");
        add(ModBlocks.BLASTED_STONE_BRICKS_HL.get(), "Blasted Stone Bricks Hardlight");
        add(ModBlocks.BLASTED_STONE_BRICKS_OL.get(), "Blasted Stone Bricks Overlay");
        add(ModBlocks.BLASTED_STONE_BRICKS_SL.get(), "Blasted Stone Bricks Softlight");
        add(ModBlocks.BLASTED_STONE_BRICKS_ST.get(), "Blasted Stone Bricks Subtract");
        add(ModBlocks.BLASTED_STONE_DF.get(), "Blasted Stone Difference");
        add(ModBlocks.BLASTED_STONE_HL.get(), "Blasted Stone Hardlight");
        add(ModBlocks.BLASTED_STONE_OL.get(), "Blasted Stone Overlay");
        add(ModBlocks.BLASTED_STONE_SL.get(), "Blasted Stone Softlight");
        add(ModBlocks.BLASTED_STONE_ST.get(), "Blasted Stone Subtract");

        // CRAFTING STATIONS
        add(ModBlocks.JEWEL_CRAFTING_STATION.get(), "Jewel Crafting Station");

        // BUDDING BLOCKS
        add(ModBlocks.BUDDING_AQUAMARINE.get(), "Budding Aquamarine");
        add(ModBlocks.BUDDING_CITRINE.get(), "Budding Citrine");
        add(ModBlocks.BUDDING_GARNET.get(), "Budding Garnet");
        add(ModBlocks.BUDDING_OPAL.get(), "Budding Opal");
        add(ModBlocks.BUDDING_PERIDOT.get(), "Budding Peridot");
        add(ModBlocks.BUDDING_RUBY.get(), "Budding Ruby");
        add(ModBlocks.BUDDING_SAPPHIRE.get(), "Budding Sapphire");
        add(ModBlocks.BUDDING_TOPAZ.get(), "Budding Topaz");

        // STORAGE BLOCKS
        add(ModBlocks.WIP_BLOCK.get(), "WIP Block");
        add(ModBlocks.AQUAMARINE_BLOCK.get(), "Block of Aquamarine");
        add(ModBlocks.CITRINE_BLOCK.get(), "Block of Citrine");
        add(ModBlocks.GARNET_BLOCK.get(), "Block of Garnet");
        add(ModBlocks.OPAL_BLOCK.get(), "Block of Opal");
        add(ModBlocks.PERIDOT_BLOCK.get(), "Block of Peridot");
        add(ModBlocks.RUBY_BLOCK.get(), "Block of Ruby");
        add(ModBlocks.SAPPHIRE_BLOCK.get(), "Block of Sapphire");
        add(ModBlocks.TOPAZ_BLOCK.get(), "Block of Topaz");

        // EMERALD STORAGE BLOCKS
        add(ModBlocks.WIP_EMERALD_BLOCK.get(), "Block of Emerald-Cut WIP");
        add(ModBlocks.AMETHYST_EMERALD_BLOCK.get(), "Block of Emerald-Cut Amethyst");
        add(ModBlocks.AQUAMARINE_EMERALD_BLOCK.get(), "Block of Emerald-Cut Aquamarine");
        add(ModBlocks.CITRINE_EMERALD_BLOCK.get(), "Block of Emerald-Cut Citrine");
        add(ModBlocks.GARNET_EMERALD_BLOCK.get(), "Block of Emerald-Cut Garnet");
        add(ModBlocks.OPAL_EMERALD_BLOCK.get(), "Block of Emerald-Cut Opal");
        add(ModBlocks.PERIDOT_EMERALD_BLOCK.get(), "Block of Emerald-Cut Peridot");
        add(ModBlocks.RUBY_EMERALD_BLOCK.get(), "Block of Emerald-Cut Ruby");
        add(ModBlocks.SAPPHIRE_EMERALD_BLOCK.get(), "Block of Emerald-Cut Sapphire");
        add(ModBlocks.TOPAZ_EMERALD_BLOCK.get(), "Block of Emerald-Cut Topaz");

        // FACETED STORAGE BLOCKS
        add(ModBlocks.WIP_FACETED_BLOCK.get(), "Block of Faceted-Cut WIP Block");
        add(ModBlocks.AMETHYST_FACETED_BLOCK.get(), "Block of Faceted-Cut Amethyst");
        add(ModBlocks.AQUAMARINE_FACETED_BLOCK.get(), "Block of Faceted-Cut Aquamarine");
        add(ModBlocks.CITRINE_FACETED_BLOCK.get(), "Block of Faceted-Cut Citrine");
        add(ModBlocks.GARNET_FACETED_BLOCK.get(), "Block of Faceted-Cut Garnet");
        add(ModBlocks.OPAL_FACETED_BLOCK.get(), "Block of Faceted-Cut Opal");
        add(ModBlocks.PERIDOT_FACETED_BLOCK.get(), "Block of Faceted-Cut Peridot");
        add(ModBlocks.RUBY_FACETED_BLOCK.get(), "Block of Faceted-Cut Ruby");
        add(ModBlocks.SAPPHIRE_FACETED_BLOCK.get(), "Block of Faceted-Cut Sapphire");
        add(ModBlocks.TOPAZ_FACETED_BLOCK.get(), "Block of Faceted-Cut Topaz");

        // PEAR STORAGE BLOCKS
        add(ModBlocks.WIP_PEAR_BLOCK.get(), "Block of Pear-Cut WIP Block");
        add(ModBlocks.AMETHYST_PEAR_BLOCK.get(), "Block of Pear-Cut Amethyst");
        add(ModBlocks.AQUAMARINE_PEAR_BLOCK.get(), "Block of Pear-Cut Aquamarine");
        add(ModBlocks.CITRINE_PEAR_BLOCK.get(), "Block of Pear-Cut Citrine");
        add(ModBlocks.GARNET_PEAR_BLOCK.get(), "Block of Pear-Cut Garnet");
        add(ModBlocks.OPAL_PEAR_BLOCK.get(), "Block of Pear-Cut Opal");
        add(ModBlocks.PERIDOT_PEAR_BLOCK.get(), "Block of Pear-Cut Peridot");
        add(ModBlocks.RUBY_PEAR_BLOCK.get(), "Block of Pear-Cut Ruby");
        add(ModBlocks.SAPPHIRE_PEAR_BLOCK.get(), "Block of Pear-Cut Sapphire");
        add(ModBlocks.TOPAZ_PEAR_BLOCK.get(), "Block of Pear-Cut Topaz");

        // TRILLION STORAGE BLOCKS
        add(ModBlocks.WIP_TRILLION_BLOCK.get(), "Block of Trillion-Cut WIP Block");
        add(ModBlocks.AMETHYST_TRILLION_BLOCK.get(), "Block of Trillion-Cut Amethyst");
        add(ModBlocks.AQUAMARINE_TRILLION_BLOCK.get(), "Block of Trillion-Cut Aquamarine");
        add(ModBlocks.CITRINE_TRILLION_BLOCK.get(), "Block of Trillion-Cut Citrine");
        add(ModBlocks.GARNET_TRILLION_BLOCK.get(), "Block of Trillion-Cut Garnet");
        add(ModBlocks.OPAL_TRILLION_BLOCK.get(), "Block of Trillion-Cut Opal");
        add(ModBlocks.PERIDOT_TRILLION_BLOCK.get(), "Block of Trillion-Cut Peridot");
        add(ModBlocks.RUBY_TRILLION_BLOCK.get(), "Block of Trillion-Cut Ruby");
        add(ModBlocks.SAPPHIRE_TRILLION_BLOCK.get(), "Block of Trillion-Cut Sapphire");
        add(ModBlocks.TOPAZ_TRILLION_BLOCK.get(), "Block of Trillion-Cut Topaz");

        // CLUSTERS
        add(ModBlocks.WIP_CLUSTER.get(), "WIP Cluster");
        add(ModBlocks.AQUAMARINE_CLUSTER.get(), "Aquamarine Cluster");
        add(ModBlocks.CITRINE_CLUSTER.get(), "Citrine Cluster");
        add(ModBlocks.GARNET_CLUSTER.get(), "Garnet Cluster");
        add(ModBlocks.OPAL_CLUSTER.get(), "Opal Cluster");
        add(ModBlocks.PERIDOT_CLUSTER.get(), "Peridot Cluster");
        add(ModBlocks.RUBY_CLUSTER.get(), "Ruby Cluster");
        add(ModBlocks.SAPPHIRE_CLUSTER.get(), "Sapphire Cluster");
        add(ModBlocks.TOPAZ_CLUSTER.get(), "Topaz Cluster");

        // LARGE BUDS
        add(ModBlocks.LARGE_WIP_BUD.get(), "Large WIP Bud");
        add(ModBlocks.LARGE_AQUAMARINE_BUD.get(), "Large Aquamarine Bud");
        add(ModBlocks.LARGE_CITRINE_BUD.get(), "Large Citrine Bud");
        add(ModBlocks.LARGE_GARNET_BUD.get(), "Large Garnet Bud");
        add(ModBlocks.LARGE_OPAL_BUD.get(), "Large Opal Bud");
        add(ModBlocks.LARGE_PERIDOT_BUD.get(), "Large Peridot Bud");
        add(ModBlocks.LARGE_RUBY_BUD.get(), "Large Ruby Bud");
        add(ModBlocks.LARGE_SAPPHIRE_BUD.get(), "Large Sapphire Bud");
        add(ModBlocks.LARGE_TOPAZ_BUD.get(), "Large Topaz Bud");

        // MEDIUM BUDS
        add(ModBlocks.MEDIUM_WIP_BUD.get(), "Medium WIP Bud");
        add(ModBlocks.MEDIUM_AQUAMARINE_BUD.get(), "Medium Aquamarine Bud");
        add(ModBlocks.MEDIUM_CITRINE_BUD.get(), "Medium Citrine Bud");
        add(ModBlocks.MEDIUM_GARNET_BUD.get(), "Medium Garnet Bud");
        add(ModBlocks.MEDIUM_OPAL_BUD.get(), "Medium Opal Bud");
        add(ModBlocks.MEDIUM_PERIDOT_BUD.get(), "Medium Peridot Bud");
        add(ModBlocks.MEDIUM_RUBY_BUD.get(), "Medium Ruby Bud");
        add(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), "Medium Sapphire Bud");
        add(ModBlocks.MEDIUM_TOPAZ_BUD.get(), "Medium Topaz Bud");

        // SMALL BUDS
        add(ModBlocks.SMALL_WIP_BUD.get(), "Small WIP Bud");
        add(ModBlocks.SMALL_AQUAMARINE_BUD.get(), "Small Aquamarine Bud");
        add(ModBlocks.SMALL_CITRINE_BUD.get(), "Small Citrine Bud");
        add(ModBlocks.SMALL_GARNET_BUD.get(), "Small Garnet Bud");
        add(ModBlocks.SMALL_OPAL_BUD.get(), "Small Opal Bud");
        add(ModBlocks.SMALL_PERIDOT_BUD.get(), "Small Peridot Bud");
        add(ModBlocks.SMALL_RUBY_BUD.get(), "Small Ruby Bud");
        add(ModBlocks.SMALL_SAPPHIRE_BUD.get(), "Small Sapphire Bud");
        add(ModBlocks.SMALL_TOPAZ_BUD.get(), "Small Topaz Bud");

        // ORES
        add(ModBlocks.ORE_WIP.get(), "WIP Ore");
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), "WIP Deepslate Ore");

        // WOOD | LEAVES | PLANKS
        add(ModBlocks.DAPHNE_LOG.get(), "Daphne Log");
        add(ModBlocks.DAPHNE_WOOD.get(), "Daphne Wood");
        add(ModBlocks.STRIPPED_DAPHNE_LOG.get(), "Stripped Daphne Log");
        add(ModBlocks.STRIPPED_DAPHNE_WOOD.get(), "Stripped Daphne Wood");
        add(ModBlocks.DAPHNE_PLANKS.get(), "Daphne Planks");
        add(ModBlocks.DAPHNE_LEAVES.get(), "Daphne Leaves");
        add(ModBlocks.DAPHNE_SAPLING.get(), "Daphne Sapling");
    }
}
