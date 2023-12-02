package net.aradoryin.battlemage.datagen.helper;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class ItemModelHelper extends ItemModelProvider {
    private static final String LAYER_0 = "layer0";

    public ItemModelHelper(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    /*
    <---------------------------------------------------------------->
     The following are test methods to ensure that the texture exists
    <---------------------------------------------------------------->
     */

    protected void blockItem(Block block) {
        withExistingParent(Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath(), new ResourceLocation(Battlemage.MOD_ID,
                "block/" + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath()));
    }

    protected void blockItem(RegistryObject<Block> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "block/" + item.getId().getPath()));
    }

    /**
     * This method is to be a test for the Cluster Blocks
     * @param block ModBlocks.WIP_CLUSTER
     */
    protected void clusterTest(RegistryObject<Block> block) {
        try {
            blockItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(block.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "block/wip_cluster.png"));
        }
    }

    /**
     * This method is to be used for general purpose until better methods come about for the purpose.
     * @param block ModBlocks.LARGE_WIP_BUD
     */
    protected void largeBudTest(RegistryObject<Block> block) {
        try {
            blockItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(block.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "block/large_wip_bud.png"));
        }
    }

    /**
     * This method is to be used for general purpose until better methods come about for the purpose.
     * @param block ModBlocks.MEDIUM_WIP_BUD
     */
    protected void mediumBudTest(RegistryObject<Block> block) {
        try {
            blockItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(block.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "block/medium_wip_bud.png"));
        }
    }

    /**
     * This method is to be used for general purpose until better methods come about for the purpose.
     * @param block ModBlocks.SMALL_WIP_BUD
     */
    protected void smallBudTest(RegistryObject<Block> block) {
        try {
            blockItem(block);
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(block.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "block/small_wip_bud.png"));
        }
    }

    /**
     * This method is to be a test for the Emerald Gems
     * @param item ModItems.WIP_EMERALD
     */
    protected void gemEmeraldTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_emerald_wip.png"));
        }
    }

    /**
     * This method is to be a test for the Faceted Gems
     * @param item ModItems.WIP_FACETED
     */
    protected void gemFacetedTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_faceted_wip.png"));
        }
    }

    /**
     * This method is to be a test for the Geode Gems
     * @param item ModItems.WIP_GEODE
     */
    protected void gemGeodeTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_geode_wip.png"));
        }
    }

    /**
     * This method is to be a test for the Pear Gems
     * @param item ModItems.WIP_PEAR
     */
    protected void gemPearTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_pear_wip.png"));
        }
    }

    /**
     * This method is to be a test for the Shard Gems
     * @param item ModItems.WIP_SHARD
     */
    protected void gemShardTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_shard_wip.png"));
        }
    }

    /**
     * This method is to be a test for the Trillion Gems
     * @param item ModItems.WIP_TRILLION
     */
    protected void gemTrillionTest(RegistryObject<Item> item) {
        try {
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (Exception e) {
            e.printStackTrace();
            withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture(LAYER_0,
                    new ResourceLocation(Battlemage.MOD_ID, "item/gem_trillion_wip.png"));
        }
    }

    /*
    <---------------------------------------------------------------->
                        Extra Helper Methods
    <---------------------------------------------------------------->
     */

    /**
     * This method is to be used for general purpose until better methods come about for the purpose.
     * @param item ModItems.WIP_EXAMPLE
     */
    private void simpleItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }

    /**
     * This method is to be used for any handheld items, such as tools.
     * @param item
     * @return
     */
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }

    @Override
    protected void registerModels() {

    }
}
