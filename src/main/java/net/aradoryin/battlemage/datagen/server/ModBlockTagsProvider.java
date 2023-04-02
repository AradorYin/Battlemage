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
    public static final TagKey<Block> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");
    public static final TagKey<Block> MOD_LOGS = create("mod_logs");
    public static final TagKey<Block> MOD_LOGS_THAT_BURN = create("mod_logs");
    public static final TagKey<Block> MOD_ORES = create("mod_ores");
    public static final TagKey<Block> MOD_PLANKS = create("mod_planks");
    public static final TagKey<Block> MOD_SAPLINGS = create("mod_saplings");

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(MOD_BLOCKS)
                .add(ModBlocks.BLOCK_WIP.get());
        tag(MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get());
        tag(MOD_LOGS)
                .add(ModBlocks.DAPHNE_LOG.get())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get())
                .add(ModBlocks.DAPHNE_WOOD.get())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get());
        tag(MOD_LOGS_THAT_BURN)
                .add(ModBlocks.DAPHNE_LOG.get())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get())
                .add(ModBlocks.DAPHNE_WOOD.get())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get());
        tag(MOD_ORES)
                .add(ModBlocks.ORE_WIP.get());
        tag(MOD_PLANKS)
                .add(ModBlocks.DAPHNE_PLANKS.get());
        tag(MOD_SAPLINGS)
                .add(ModBlocks.DAPHNE_SAPLING.get());
        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .addTags(MOD_DEEPSLATE_ORES);
        tag(BlockTags.LOGS)
                .addTags(MOD_LOGS);
        tag(BlockTags.LOGS_THAT_BURN)
                .addTags(MOD_LOGS_THAT_BURN);
        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTags(MOD_LOGS);
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTags(MOD_BLOCKS, MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(BlockTags.PLANKS)
                .addTags(MOD_PLANKS);
        tag(BlockTags.SAPLINGS)
                .addTags(MOD_SAPLINGS);
        tag(BlockTags.STONE_ORE_REPLACEABLES)
                .addTags(MOD_ORES);
        tag(Tags.Blocks.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(MOD_BLOCKS);
    }

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
