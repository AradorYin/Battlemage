package net.aradoryin.battlemage.datagen.helper;

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

public class BlockStateHelper extends BlockStateProvider {
    private static final String CUBE_COLUMN = "minecraft:block/cube_column";
    private static final String BLOCK = "block/";

    public BlockStateHelper(PackOutput output, String modid, ExistingFileHelper exFileHelper) {
        super(output, modid, exFileHelper);
    }
    /*
    <---------------------------------------------------------------->
     The following are test methods to ensure that the texture exists
    <---------------------------------------------------------------->
     */

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_BLOCK
     */
    protected void storageBlockTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.WIP_BLOCK.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_EMERALD_BLOCK
     */
    protected void emeraldStorageBlockTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.WIP_EMERALD_BLOCK.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_FACETED_BLOCK
     */
    protected void facetedStorageBlockTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.WIP_FACETED_BLOCK.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_PEAR_BLOCK
     */
    protected void pearStorageBlockTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.WIP_PEAR_BLOCK.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_TRILLION_BLOCK
     */
    protected void trillionStorageBlockTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.WIP_TRILLION_BLOCK.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.BUDDING_WIP
     */
    protected void buddingTest(RegistryObject<Block> block) {
        try {
            blockWithItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            simpleBlockWithItem(block.get(), cubeAll(ModBlocks.BUDDING_WIP.get()));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.WIP_CLUSTER
     */
    protected void clusterTest(RegistryObject<Block> block) {
        try {
            directionalCrossBlock(block);
        } catch (Exception e) {
            e.printStackTrace();
            directionalBlock(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":wip_cluster.png", "minecraft:block/cross"));
            simpleBlockItem(block.get(), models().cross(blockName(block), new
                    ResourceLocation(Battlemage.MOD_ID, BLOCK + "wip_cluster.png")).renderType("cutout"));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.LARGE_WIP_BUD
     */
    protected void largeBudTest(RegistryObject<Block> block) {
        try {
            directionalCrossBlock(block);
        } catch (Exception e) {
            e.printStackTrace();
            directionalBlock(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":large_wip_bud.png", "minecraft:block/cross"));
            simpleBlockItem(block.get(), models().cross(blockName(block), new
                    ResourceLocation(Battlemage.MOD_ID, BLOCK + "large_wip_bud.png")).renderType("cutout"));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.MEDIUM_WIP_BUD
     */
    protected void mediumBudTest(RegistryObject<Block> block) {
        try {
            directionalCrossBlock(block);
        } catch (Exception e) {
            e.printStackTrace();
            directionalBlock(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":medium_wip_bud.png", "minecraft:block/cross"));
            simpleBlockItem(block.get(), models().cross(blockName(block), new
                    ResourceLocation(Battlemage.MOD_ID, BLOCK + "medium_wip_bud.png")).renderType("cutout"));
        }
    }

    /**
     * This method is to check if the texture exists and if it does not, give it a placeholder. <p>
     * @param block ModBlocks.SMALL_WIP_BUD
     */
    protected void smallBudTest(RegistryObject<Block> block) {
        try {
            directionalCrossBlock(block);
        } catch (Exception e) {
            e.printStackTrace();
            directionalBlock(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":small_wip_bud.png", "minecraft:block/cross"));
            simpleBlockItem(block.get(), models().cross(blockName(block), new
                    ResourceLocation(Battlemage.MOD_ID, BLOCK + "small_wip_bud.png")).renderType("cutout"));
        }
    }


    /*
    <---------------------------------------------------------------->
           The following are helper methods for Data Generation
    <---------------------------------------------------------------->
     */

    /**
     * This method calls the simpleBlockWithItem method passing in the block to register all sides as the same.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     */
    protected void blockWithItem(RegistryObject<Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }

    /**
     * This method takes in a Block, a side texture of the block and applies that texture to the entire block.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     * @param blockSide ModBlocks.EXAMPLE_BLOCK
     */
    protected void axisBlockWithItem(RegistryObject<Block> block, RegistryObject<Block> blockSide) {
        axisBlock((RotatedPillarBlock) block.get(), blockTexture(blockSide.get()), blockTexture(blockSide.get()));
        simpleBlockItem(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":" + blockName(block), CUBE_COLUMN));
    }

    /**
     * This method takes in a Block to register the BlockItem and the BlockModel as a RenderType = Cutout.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     */
    protected void directionalCrossBlock(RegistryObject<Block> block){
        directionalBlock(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":" + blockName(block), "minecraft:block/cross"));
        simpleBlockItem(block.get(), models().cross(blockName(block), new
                ResourceLocation(Battlemage.MOD_ID, BLOCK + blockName(block))).renderType("cutout"));
    }

    /**
     * This method takes in a Block and registers the image as a LogBlock and registering the BlockItem.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     */
    protected void logBlockWithItem(RegistryObject<Block> block) {
        logBlock((RotatedPillarBlock) block.get());
        simpleBlockItem(block.get(), models().withExistingParent(Battlemage.MOD_ID + ":" + blockName(block), CUBE_COLUMN));
    }

    /**
     * This method takes in a Block and registers it as a simple block texture that has a RenderType = Cutout
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     */
    protected void cutoutBlock(RegistryObject<Block> block) {
        simpleBlock(block.get(), models().cross(blockName(block),
                blockTexture(block.get())).renderType("cutout"));
    }

    /**
     * This method returns the Block's registry key, or the registry name.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     * @return ForgeRegistries.BLOCKS.getKey(block.get())
     */
    private ResourceLocation blockKey(RegistryObject<Block> block) {
        return ForgeRegistries.BLOCKS.getKey(block.get());
    }

    /**
     * This method returns the Block's registry path.
     * <p>
     * @param block ModBlocks.EXAMPLE_BLOCK
     * @return ForgeRegistries.BLOCKS.getKey(block.get()).getPath()
     */
    private String blockName(RegistryObject<Block> block) {
        return blockKey(block).getPath();
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
