package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Battlemage.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // LOGS | PLANKS | WOOD | LEAVES
        logBlockWithItem(ModBlocks.DAPHNE_LOG.get());
        axisBlockWithItem(ModBlocks.DAPHNE_WOOD.get(), ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_LOG.get());
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_DAPHNE_LOG.get(), new ResourceLocation(Battlemage.MOD_ID, "block/stripped_daphne_log"),
                new ResourceLocation(Battlemage.MOD_ID, "block/stripped_daphne_log_top"));
        simpleBlockItem(ModBlocks.STRIPPED_DAPHNE_LOG.get(), models().withExistingParent("battlemage:stripped_daphne_log", "minecraft:block/cube_column"));
        axisBlockWithItemResourceLocation(ModBlocks.STRIPPED_DAPHNE_WOOD.get(), ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.STRIPPED_DAPHNE_LOG.get());
        blockWithItem(ModBlocks.DAPHNE_PLANKS);
        blockWithItem(ModBlocks.DAPHNE_LEAVES);
        saplingBlock(ModBlocks.DAPHNE_SAPLING);
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
    private void logBlockWithItem(Block block) {
        logBlock((RotatedPillarBlock) block);
        simpleBlockItem(block, models().withExistingParent(Battlemage.MOD_ID + ":" + name(block), "minecraft:block/cube_column"));
    }
    private void saplingBlock(RegistryObject<Block> block) {
        simpleBlock(block.get(), models().cross(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), blockTexture(block.get())).renderType("cutout"));
    }
    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }
}
