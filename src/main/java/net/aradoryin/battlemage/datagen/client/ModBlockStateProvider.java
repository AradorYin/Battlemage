package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Battlemage.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLOCK_WIP);
        oreBlockWithItem(ModBlocks.ORE_WIP);
        deepslateOreBlockWithItem(ModBlocks.DEEPSLATE_ORE_WIP);
    }

    private void blockWithItem(RegistryObject<Block> block) {
        try {
            simpleBlockWithItem(block.get(), cubeAll(block.get()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            simpleBlockWithItem(ModBlocks.BLOCK_WIP.get(), cubeAll(ModBlocks.BLOCK_WIP.get()));
        }
    }
    private void oreBlockWithItem(RegistryObject<Block> block) {
        try {
            simpleBlockWithItem(block.get(), cubeAll(block.get()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            simpleBlockWithItem(ModBlocks.ORE_WIP.get(), cubeAll(ModBlocks.ORE_WIP.get()));
        }
    }
    private void deepslateOreBlockWithItem(RegistryObject<Block> block) {
        try {
            simpleBlockWithItem(block.get(), cubeAll(block.get()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            simpleBlockWithItem(ModBlocks.DEEPSLATE_ORE_WIP.get(), cubeAll(ModBlocks.DEEPSLATE_ORE_WIP.get()));
        }
    }
}
