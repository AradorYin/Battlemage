package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public static final TagKey<Item> MOD_BLOCKS = create("mod_blocks");
    public static final TagKey<Item> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");
    public static final TagKey<Item> MOD_GEMS = create("mod_gems");
    public static final TagKey<Item> MOD_GEODES = create("mod_geodes");
    public static final TagKey<Item> MOD_ORES = create("mod_ores");

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> lookupBlock, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, lookupBlock, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        tag(ItemTags.LOGS);
        tag(ModItemTagsProvider.MOD_BLOCKS)
                .add(ModBlocks.BLOCK_WIP.get().asItem());
        tag(ModItemTagsProvider.MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get().asItem());
        tag(ModItemTagsProvider.MOD_GEMS)
                .add(ModItems.GEM_WIP.get());
        tag(ModItemTagsProvider.MOD_GEODES)
                .add(ModItems.GEODE_WIP.get());
        tag(ModItemTagsProvider.MOD_ORES)
                .add(ModBlocks.ORE_WIP.get().asItem());
        tag(Tags.Items.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(Tags.Items.STORAGE_BLOCKS)
                .addTags(MOD_BLOCKS);
    }

    private static TagKey<Item> create(String name) {
        return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
