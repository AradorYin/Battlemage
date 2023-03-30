package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public static final TagKey<Block> MOD_BLOCKS = create("mod_blocks");
    public static final TagKey<Block> MOD_ORES = create("mod_ores");
    public static final TagKey<Block> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .addTags(MOD_DEEPSLATE_ORES);
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTags(MOD_BLOCKS, MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                .addTags(MOD_ORES);
        tag(ModBlockTagsProvider.MOD_BLOCKS)
                .add(ModBlocks.BLOCK_WIP.get());
        tag(ModBlockTagsProvider.MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get());
        tag(ModBlockTagsProvider.MOD_ORES)
                .add(ModBlocks.ORE_WIP.get());
        tag(Tags.Blocks.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(MOD_BLOCKS);
    }

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
