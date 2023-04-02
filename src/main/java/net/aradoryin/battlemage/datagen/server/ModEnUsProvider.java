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
        add(ModCreativeModeTabs.BATTLEMAGE_TAB.getDisplayName().toString(), "Battlemage");

        // Items
        // BRACER
//        add(ModItems.BRACER_INITIAL.get(), "Patchwork Bracer");
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
        // GEMS UNCUT
//        add(ModItems.GEM_AMETHYST_UNCUT.get(), "Uncut Amethyst");
//        add(ModItems.GEM_OPAL_UNCUT.get(), "Uncut Opal");
//        add(ModItems.GEM_RUBY_UNCUT.get(), "Uncut Ruby");
//        add(ModItems.GEM_SAPPHIRE_UNCUT.get(), "Uncut Sapphire");
        // GEODES
//        add(ModItems.GEODE_OPAL.get(), "Opal Geode");
//        add(ModItems.GEODE_RUBY.get(), "Ruby Geode");
//        add(ModItems.GEODE_SAPPHIRE.get(), "Sapphire Geode");

        // Blocks
        // WIP BLOCKS
        add(ModBlocks.BLOCK_WIP.get(), "WIP Block");
        add(ModBlocks.ORE_WIP.get(), "WIP Ore");
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), "WIP Deepslate Ore");
        // ORES
//        add(ModBlocks.ORE_OPAL.get(), "Opal Ore");
//        add(ModBlocks.ORE_OPAL_DEEPSLATE.get(), "Opal Deepslate Ore");
//        add(ModBlocks.ORE_RUBY.get(), "Ruby Ore");
//        add(ModBlocks.ORE_RUBY_DEEPSLATE.get(), "Ruby Deepslate Ore");
//        add(ModBlocks.ORE_SAPPHIRE.get(), "Sapphire Ore");
//        add(ModBlocks.ORE_SAPPHIRE_DEEPSLATE.get(), "Sapphire Deepslate Ore");
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
