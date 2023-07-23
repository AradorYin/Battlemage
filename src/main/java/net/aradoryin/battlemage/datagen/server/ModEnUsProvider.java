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
        // Creative Tab
        add(ModCreativeModeTabs.BATTLEMAGE_TAB.get().getDisplayName().getString(), "Battlemage");

        // Items
        // BRACER
        add(ModItems.BRACER_PATCHWORK.get(), "Patchwork Bracer");
//        add(ModItems.BRACER_UPGRADE.get(), "Bracer");
//        add(ModItems.BRACER_MAX.get(), "Bracer");
        // WIP ITEMS
//        add(ModItems.WIP_INGOT.get(), "WIP Ingot");
//        add(ModItems.WIP_RAW.get(), "WIP Raw");
        add(ModItems.GEM_WIP.get(), "Uncut WIP Gem");
        add(ModItems.GEODE_WIP.get(), "WIP Geode");
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
        // GEM SHARDS
        add(ModItems.AQUAMARINE_SHARD.get(), "Aquamarine Shard");
        add(ModItems.CITRINE_SHARD.get(), "Citrine Shard");
        add(ModItems.GARNET_SHARD.get(), "Garnet Shard");
        add(ModItems.OPAL_SHARD.get(), "Opal Shard");
        add(ModItems.PERIDOT_SHARD.get(), "Peridot Shard");
        add(ModItems.RUBY_SHARD.get(), "Ruby Shard");
        add(ModItems.SAPPHIRE_SHARD.get(), "Sapphire Shard");
        add(ModItems.TOPAZ_SHARD.get(), "Topaz Shard");
        // GEM EMERALDS
        add(ModItems.AMETHYST_EMERALD.get(), "Amethyst Emerald");
        add(ModItems.AQUAMARINE_EMERALD.get(), "Aquamarine Emerald");
        add(ModItems.CITRINE_EMERALD.get(), "Citrine Emerald");
        add(ModItems.GARNET_EMERALD.get(), "Garnet Emerald");
        add(ModItems.OPAL_EMERALD.get(), "Opal Emerald");
        add(ModItems.PERIDOT_EMERALD.get(), "Peridot Emerald");
        add(ModItems.RUBY_EMERALD.get(), "Ruby Emerald");
        add(ModItems.SAPPHIRE_EMERALD.get(), "Sapphire Emerald");
        add(ModItems.TOPAZ_EMERALD.get(), "Topaz Emerald");

        // Blocks
        // WIP BLOCKS
        add(ModBlocks.BLOCK_WIP.get(), "WIP Block");
        add(ModBlocks.ORE_WIP.get(), "WIP Ore");
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), "WIP Deepslate Ore");
        // BLOCKS
        add(ModBlocks.BUDDING_AQUAMARINE.get(), "Budding Aquamarine");
        add(ModBlocks.BUDDING_CITRINE.get(), "Budding Citrine");
        add(ModBlocks.BUDDING_GARNET.get(), "Budding Garnet");
        add(ModBlocks.BUDDING_OPAL.get(), "Budding Opal");
        add(ModBlocks.BUDDING_PERIDOT.get(), "Budding Peridot");
        add(ModBlocks.BUDDING_RUBY.get(), "Budding Ruby");
        add(ModBlocks.BUDDING_SAPPHIRE.get(), "Budding Sapphire");
        add(ModBlocks.BUDDING_TOPAZ.get(), "Budding Topaz");
        add(ModBlocks.AQUAMARINE_BLOCK.get(), "Block of Aquamarine");
        add(ModBlocks.CITRINE_BLOCK.get(), "Block of Citrine");
        add(ModBlocks.GARNET_BLOCK.get(), "Block of Garnet");
        add(ModBlocks.OPAL_BLOCK.get(), "Block of Opal");
        add(ModBlocks.PERIDOT_BLOCK.get(), "Block of Peridot");
        add(ModBlocks.RUBY_BLOCK.get(), "Block of Ruby");
        add(ModBlocks.SAPPHIRE_BLOCK.get(), "Block of Sapphire");
        add(ModBlocks.TOPAZ_BLOCK.get(), "Block of Topaz");
        // CLUSTERS
        add(ModBlocks.AQUAMARINE_CLUSTER.get(), "Aquamarine Cluster");
        add(ModBlocks.CITRINE_CLUSTER.get(), "Citrine Cluster");
        add(ModBlocks.GARNET_CLUSTER.get(), "Garnet Cluster");
        add(ModBlocks.OPAL_CLUSTER.get(), "Opal Cluster");
        add(ModBlocks.PERIDOT_CLUSTER.get(), "Peridot Cluster");
        add(ModBlocks.RUBY_CLUSTER.get(), "Ruby Cluster");
        add(ModBlocks.SAPPHIRE_CLUSTER.get(), "Sapphire Cluster");
        add(ModBlocks.TOPAZ_CLUSTER.get(), "Topaz Cluster");
        add(ModBlocks.LARGE_AQUAMARINE_BUD.get(), "Large Aquamarine Bud");
        add(ModBlocks.LARGE_CITRINE_BUD.get(), "Large Citrine Bud");
        add(ModBlocks.LARGE_GARNET_BUD.get(), "Large Garnet Bud");
        add(ModBlocks.LARGE_OPAL_BUD.get(), "Large Opal Bud");
        add(ModBlocks.LARGE_PERIDOT_BUD.get(), "Large Peridot Bud");
        add(ModBlocks.LARGE_RUBY_BUD.get(), "Large Ruby Bud");
        add(ModBlocks.LARGE_SAPPHIRE_BUD.get(), "Large Sapphire Bud");
        add(ModBlocks.LARGE_TOPAZ_BUD.get(), "Large Topaz Bud");
        add(ModBlocks.MEDIUM_AQUAMARINE_BUD.get(), "Medium Aquamarine Bud");
        add(ModBlocks.MEDIUM_CITRINE_BUD.get(), "Medium Citrine Bud");
        add(ModBlocks.MEDIUM_GARNET_BUD.get(), "Medium Garnet Bud");
        add(ModBlocks.MEDIUM_OPAL_BUD.get(), "Medium Opal Bud");
        add(ModBlocks.MEDIUM_PERIDOT_BUD.get(), "Medium Peridot Bud");
        add(ModBlocks.MEDIUM_RUBY_BUD.get(), "Medium Ruby Bud");
        add(ModBlocks.MEDIUM_SAPPHIRE_BUD.get(), "Medium Sapphire Bud");
        add(ModBlocks.MEDIUM_TOPAZ_BUD.get(), "Medium Topaz Bud");
        add(ModBlocks.SMALL_AQUAMARINE_BUD.get(), "Small Aquamarine Bud");
        add(ModBlocks.SMALL_CITRINE_BUD.get(), "Small Citrine Bud");
        add(ModBlocks.SMALL_GARNET_BUD.get(), "Small Garnet Bud");
        add(ModBlocks.SMALL_OPAL_BUD.get(), "Small Opal Bud");
        add(ModBlocks.SMALL_PERIDOT_BUD.get(), "Small Peridot Bud");
        add(ModBlocks.SMALL_RUBY_BUD.get(), "Small Ruby Bud");
        add(ModBlocks.SMALL_SAPPHIRE_BUD.get(), "Small Sapphire Bud");
        add(ModBlocks.SMALL_TOPAZ_BUD.get(), "Small Topaz Bud");
        // ORES
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
