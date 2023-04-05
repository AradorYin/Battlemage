package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Battlemage.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // BLOCKS
        blockWithItem(ModBlocks.BUDDING_AQUAMARINE);
        blockWithItem(ModBlocks.BUDDING_CITRINE);
        blockWithItem(ModBlocks.BUDDING_GARNET);
        blockWithItem(ModBlocks.BUDDING_OPAL);
        blockWithItem(ModBlocks.BUDDING_PERIDOT);
        blockWithItem(ModBlocks.BUDDING_RUBY);
        blockWithItem(ModBlocks.BUDDING_SAPPHIRE);
        blockWithItem(ModBlocks.BUDDING_TOPAZ);
        blockWithItem(ModBlocks.AQUAMARINE_BLOCK);
        blockWithItem(ModBlocks.CITRINE_BLOCK);
        blockWithItem(ModBlocks.GARNET_BLOCK);
        blockWithItem(ModBlocks.OPAL_BLOCK);
        blockWithItem(ModBlocks.PERIDOT_BLOCK);
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);
        blockWithItem(ModBlocks.TOPAZ_BLOCK);
        // CLUSTERS
        directionalCrossBlock(ModBlocks.AQUAMARINE_CLUSTER.get());
        directionalCrossBlock(ModBlocks.CITRINE_CLUSTER.get());
        directionalCrossBlock(ModBlocks.GARNET_CLUSTER.get());
        directionalCrossBlock(ModBlocks.OPAL_CLUSTER.get());
        directionalCrossBlock(ModBlocks.PERIDOT_CLUSTER.get());
        directionalCrossBlock(ModBlocks.RUBY_CLUSTER.get());
        directionalCrossBlock(ModBlocks.SAPPHIRE_CLUSTER.get());
        directionalCrossBlock(ModBlocks.TOPAZ_CLUSTER.get());
        directionalCrossBlock(ModBlocks.LARGE_AQUAMARINE_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_CITRINE_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_GARNET_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_OPAL_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_PERIDOT_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_RUBY_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_SAPPHIRE_BUD.get());
        directionalCrossBlock(ModBlocks.LARGE_TOPAZ_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_AQUAMARINE_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_CITRINE_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_GARNET_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_OPAL_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_PERIDOT_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_RUBY_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_SAPPHIRE_BUD.get());
        directionalCrossBlock(ModBlocks.MEDIUM_TOPAZ_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_AQUAMARINE_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_CITRINE_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_GARNET_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_OPAL_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_PERIDOT_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_RUBY_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_SAPPHIRE_BUD.get());
        directionalCrossBlock(ModBlocks.SMALL_TOPAZ_BUD.get());
        // LOGS | PLANKS | WOOD | LEAVES
        logBlockWithItem(ModBlocks.DAPHNE_LOG.get());
        axisBlockWithItem(ModBlocks.DAPHNE_WOOD.get(), ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DAPHNE_LOG.get(), new ResourceLocation(Battlemage.MOD_ID, "block/stripped_daphne_log"),
                new ResourceLocation(Battlemage.MOD_ID, "block/stripped_daphne_log_top"));
        simpleBlockItem(ModBlocks.STRIPPED_DAPHNE_LOG.get(), models().withExistingParent("battlemage:stripped_daphne_log", "minecraft:block/cube_column"));
        axisBlockWithItemResourceLocation(ModBlocks.STRIPPED_DAPHNE_WOOD.get(), ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.STRIPPED_DAPHNE_LOG.get());
        blockWithItem(ModBlocks.DAPHNE_PLANKS);
        blockWithItem(ModBlocks.DAPHNE_LEAVES);
        cutoutBlock(ModBlocks.DAPHNE_SAPLING);
        // ORES
        blockWithItem(ModBlocks.ORE_WIP);
        blockWithItem(ModBlocks.DEEPSLATE_ORE_WIP);
        // STORAGE BLOCKS
        blockWithItem(ModBlocks.BLOCK_WIP);
    }
    private void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    private void axisBlockWithItem(Block block, Block blockSide, Block blockEnd) {
        axisBlock((RotatedPillarBlock) block, blockTexture(blockSide), blockTexture(blockEnd));
        simpleBlockItem(block, models().withExistingParent(Battlemage.MOD_ID + ":" + name(block), "minecraft:block/cube_column"));
    }
    private void axisBlockWithItemResourceLocation(Block block, Block blockSide, Block blockEnd) {
        axisBlock((RotatedPillarBlock) block, new ResourceLocation(Battlemage.MOD_ID,"block/" + name(blockSide)),
                new ResourceLocation(Battlemage.MOD_ID, "block/" + name(blockEnd)));
        simpleBlockItem(block, models().withExistingParent(Battlemage.MOD_ID + ":" + name(block), "minecraft:block/cube_column"));
    }
    private void directionalCrossBlock(Block block){
        directionalBlock(block, models().withExistingParent(Battlemage.MOD_ID + ":" + name(block), "minecraft:block/cross"));
        simpleBlockItem(block, models().cross(name(block), new ResourceLocation(Battlemage.MOD_ID, "block/" + name(block))).renderType("cutout"));
    }
    private void logBlockWithItem(Block block) {
        logBlock((RotatedPillarBlock) block);
        simpleBlockItem(block, models().withExistingParent(Battlemage.MOD_ID + ":" + name(block), "minecraft:block/cube_column"));
    }
    private void cutoutBlock(RegistryObject<Block> block) {
        simpleBlock(block.get(), models().cross(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), blockTexture(block.get())).renderType("cutout"));
    }
    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }
}
