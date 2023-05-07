package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    private static final String LAYER_0 = "layer0";
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // CLUSTERS
        blockItem(ModBlocks.AQUAMARINE_CLUSTER);
        blockItem(ModBlocks.CITRINE_CLUSTER);
        blockItem(ModBlocks.GARNET_CLUSTER);
        blockItem(ModBlocks.OPAL_CLUSTER);
        blockItem(ModBlocks.PERIDOT_CLUSTER);
        blockItem(ModBlocks.RUBY_CLUSTER);
        blockItem(ModBlocks.SAPPHIRE_CLUSTER);
        blockItem(ModBlocks.TOPAZ_CLUSTER);
        blockItem(ModBlocks.LARGE_AQUAMARINE_BUD);
        blockItem(ModBlocks.LARGE_CITRINE_BUD);
        blockItem(ModBlocks.LARGE_GARNET_BUD);
        blockItem(ModBlocks.LARGE_OPAL_BUD);
        blockItem(ModBlocks.LARGE_PERIDOT_BUD);
        blockItem(ModBlocks.LARGE_RUBY_BUD);
        blockItem(ModBlocks.LARGE_SAPPHIRE_BUD);
        blockItem(ModBlocks.LARGE_TOPAZ_BUD);
        blockItem(ModBlocks.MEDIUM_AQUAMARINE_BUD);
        blockItem(ModBlocks.MEDIUM_CITRINE_BUD);
        blockItem(ModBlocks.MEDIUM_GARNET_BUD);
        blockItem(ModBlocks.MEDIUM_OPAL_BUD);
        blockItem(ModBlocks.MEDIUM_PERIDOT_BUD);
        blockItem(ModBlocks.MEDIUM_RUBY_BUD);
        blockItem(ModBlocks.MEDIUM_SAPPHIRE_BUD);
        blockItem(ModBlocks.MEDIUM_TOPAZ_BUD);
        blockItem(ModBlocks.SMALL_AQUAMARINE_BUD);
        blockItem(ModBlocks.SMALL_CITRINE_BUD);
        blockItem(ModBlocks.SMALL_GARNET_BUD);
        blockItem(ModBlocks.SMALL_OPAL_BUD);
        blockItem(ModBlocks.SMALL_PERIDOT_BUD);
        blockItem(ModBlocks.SMALL_RUBY_BUD);
        blockItem(ModBlocks.SMALL_SAPPHIRE_BUD);
        blockItem(ModBlocks.SMALL_TOPAZ_BUD);
        // SAPLING
        blockItem(ModBlocks.DAPHNE_SAPLING);
        // SHARDS
        simpleItem(ModItems.GEODE_WIP);
        simpleItem(ModItems.GEM_WIP);
        simpleItem(ModItems.AQUAMARINE_SHARD);
        simpleItem(ModItems.CITRINE_SHARD);
        simpleItem(ModItems.GARNET_SHARD);
        simpleItem(ModItems.OPAL_SHARD);
        simpleItem(ModItems.PERIDOT_SHARD);
        simpleItem(ModItems.RUBY_SHARD);
        simpleItem(ModItems.SAPPHIRE_SHARD);
        simpleItem(ModItems.TOPAZ_SHARD);
    }

    private ItemModelBuilder blockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "block/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture(LAYER_0,
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }
}
