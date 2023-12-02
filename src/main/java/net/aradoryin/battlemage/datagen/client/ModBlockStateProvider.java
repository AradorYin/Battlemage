package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.datagen.helper.BlockStateHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateHelper {
    private static final String CUBE_COLUMN = "minecraft:block/cube_column";
    private static final String BLOCK = "block/";
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Battlemage.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // CRAFTING STATIONS
        horizontalBlock(ModBlocks.JEWEL_CRAFTING_STATION.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK + "jewel_crafting_station")));

        // BLOCKS
        blockWithItem(ModBlocks.ETHERIC_STONE);
        blockWithItem(ModBlocks.BLASTED_COBBLESTONE_DF);
        blockWithItem(ModBlocks.BLASTED_COBBLESTONE_HL);
        blockWithItem(ModBlocks.BLASTED_COBBLESTONE_OL);
        blockWithItem(ModBlocks.BLASTED_COBBLESTONE_SL);
        blockWithItem(ModBlocks.BLASTED_COBBLESTONE_ST);
        blockWithItem(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_DF);
        blockWithItem(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_HL);
        blockWithItem(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_OL);
        blockWithItem(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_SL);
        blockWithItem(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_ST);
        blockWithItem(ModBlocks.BLASTED_STONE_BRICKS_DF);
        blockWithItem(ModBlocks.BLASTED_STONE_BRICKS_HL);
        blockWithItem(ModBlocks.BLASTED_STONE_BRICKS_OL);
        blockWithItem(ModBlocks.BLASTED_STONE_BRICKS_SL);
        blockWithItem(ModBlocks.BLASTED_STONE_BRICKS_ST);
        blockWithItem(ModBlocks.BLASTED_STONE_DF);
        blockWithItem(ModBlocks.BLASTED_STONE_HL);
        blockWithItem(ModBlocks.BLASTED_STONE_OL);
        blockWithItem(ModBlocks.BLASTED_STONE_SL);
        blockWithItem(ModBlocks.BLASTED_STONE_ST);

        // BUDDING BLOCKS
        buddingTest(ModBlocks.BUDDING_WIP);
        buddingTest(ModBlocks.BUDDING_AQUAMARINE);
        buddingTest(ModBlocks.BUDDING_CITRINE);
        buddingTest(ModBlocks.BUDDING_GARNET);
        buddingTest(ModBlocks.BUDDING_OPAL);
        buddingTest(ModBlocks.BUDDING_PERIDOT);
        buddingTest(ModBlocks.BUDDING_RUBY);
        buddingTest(ModBlocks.BUDDING_SAPPHIRE);
        buddingTest(ModBlocks.BUDDING_TOPAZ);

        // CLUSTERS
        clusterTest(ModBlocks.WIP_CLUSTER);
        clusterTest(ModBlocks.AQUAMARINE_CLUSTER);
        clusterTest(ModBlocks.CITRINE_CLUSTER);
        clusterTest(ModBlocks.GARNET_CLUSTER);
        clusterTest(ModBlocks.OPAL_CLUSTER);
        clusterTest(ModBlocks.PERIDOT_CLUSTER);
        clusterTest(ModBlocks.RUBY_CLUSTER);
        clusterTest(ModBlocks.SAPPHIRE_CLUSTER);
        clusterTest(ModBlocks.TOPAZ_CLUSTER);

        // LARGE BUDS
        largeBudTest(ModBlocks.LARGE_WIP_BUD);
        largeBudTest(ModBlocks.LARGE_AQUAMARINE_BUD);
        largeBudTest(ModBlocks.LARGE_CITRINE_BUD);
        largeBudTest(ModBlocks.LARGE_GARNET_BUD);
        largeBudTest(ModBlocks.LARGE_OPAL_BUD);
        largeBudTest(ModBlocks.LARGE_PERIDOT_BUD);
        largeBudTest(ModBlocks.LARGE_RUBY_BUD);
        largeBudTest(ModBlocks.LARGE_SAPPHIRE_BUD);
        largeBudTest(ModBlocks.LARGE_TOPAZ_BUD);

        // MEDIUM BUDS
        mediumBudTest(ModBlocks.MEDIUM_WIP_BUD);
        mediumBudTest(ModBlocks.MEDIUM_AQUAMARINE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_CITRINE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_GARNET_BUD);
        mediumBudTest(ModBlocks.MEDIUM_OPAL_BUD);
        mediumBudTest(ModBlocks.MEDIUM_PERIDOT_BUD);
        mediumBudTest(ModBlocks.MEDIUM_RUBY_BUD);
        mediumBudTest(ModBlocks.MEDIUM_SAPPHIRE_BUD);
        mediumBudTest(ModBlocks.MEDIUM_TOPAZ_BUD);

        // SMALL BUDS
        smallBudTest(ModBlocks.SMALL_WIP_BUD);
        smallBudTest(ModBlocks.SMALL_AQUAMARINE_BUD);
        smallBudTest(ModBlocks.SMALL_CITRINE_BUD);
        smallBudTest(ModBlocks.SMALL_GARNET_BUD);
        smallBudTest(ModBlocks.SMALL_OPAL_BUD);
        smallBudTest(ModBlocks.SMALL_PERIDOT_BUD);
        smallBudTest(ModBlocks.SMALL_RUBY_BUD);
        smallBudTest(ModBlocks.SMALL_SAPPHIRE_BUD);
        smallBudTest(ModBlocks.SMALL_TOPAZ_BUD);

        // LOGS | PLANKS | WOOD | LEAVES
        logBlockWithItem(ModBlocks.DAPHNE_LOG);
        axisBlockWithItem(ModBlocks.DAPHNE_WOOD, ModBlocks.DAPHNE_LOG);
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DAPHNE_LOG.get(), new ResourceLocation(Battlemage.MOD_ID, BLOCK + "stripped_daphne_log"),
                new ResourceLocation(Battlemage.MOD_ID, BLOCK + "stripped_daphne_log_top"));
        simpleBlockItem(ModBlocks.STRIPPED_DAPHNE_LOG.get(), models().withExistingParent("battlemage:stripped_daphne_log", CUBE_COLUMN));
        axisBlockWithItem(ModBlocks.STRIPPED_DAPHNE_WOOD, ModBlocks.STRIPPED_DAPHNE_LOG);
        blockWithItem(ModBlocks.DAPHNE_PLANKS);
        blockWithItem(ModBlocks.DAPHNE_LEAVES);
        cutoutBlock(ModBlocks.DAPHNE_SAPLING);

        // ORES
        blockWithItem(ModBlocks.ORE_WIP);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_WIP);

        // STORAGE BLOCKS
        storageBlockTest(ModBlocks.WIP_BLOCK);
        storageBlockTest(ModBlocks.AQUAMARINE_BLOCK);
        storageBlockTest(ModBlocks.CITRINE_BLOCK);
        storageBlockTest(ModBlocks.GARNET_BLOCK);
        storageBlockTest(ModBlocks.OPAL_BLOCK);
        storageBlockTest(ModBlocks.PERIDOT_BLOCK);
        storageBlockTest(ModBlocks.RUBY_BLOCK);
        storageBlockTest(ModBlocks.SAPPHIRE_BLOCK);
        storageBlockTest(ModBlocks.TOPAZ_BLOCK);

        // EMERALD STORAGE BLOCKS
        emeraldStorageBlockTest(ModBlocks.WIP_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.AMETHYST_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.AQUAMARINE_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.CITRINE_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.GARNET_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.OPAL_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.PERIDOT_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.RUBY_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.SAPPHIRE_EMERALD_BLOCK);
        emeraldStorageBlockTest(ModBlocks.TOPAZ_EMERALD_BLOCK);

        // FACETED STORAGE BLOCKS
        facetedStorageBlockTest(ModBlocks.WIP_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.AMETHYST_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.AQUAMARINE_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.CITRINE_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.GARNET_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.OPAL_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.PERIDOT_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.RUBY_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.SAPPHIRE_FACETED_BLOCK);
        facetedStorageBlockTest(ModBlocks.TOPAZ_FACETED_BLOCK);

        // PEAR STORAGE BLOCKS
        pearStorageBlockTest(ModBlocks.WIP_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.AMETHYST_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.AQUAMARINE_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.CITRINE_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.GARNET_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.OPAL_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.PERIDOT_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.RUBY_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.SAPPHIRE_PEAR_BLOCK);
        pearStorageBlockTest(ModBlocks.TOPAZ_PEAR_BLOCK);

        // TRILLION STORAGE BLOCKS
        trillionStorageBlockTest(ModBlocks.WIP_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.AMETHYST_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.AQUAMARINE_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.CITRINE_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.GARNET_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.OPAL_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.PERIDOT_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.RUBY_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.SAPPHIRE_TRILLION_BLOCK);
        trillionStorageBlockTest(ModBlocks.TOPAZ_TRILLION_BLOCK);
    }
}
