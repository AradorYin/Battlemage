package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public static final TagKey<Item> MOD_BLOCKS = create("mod_blocks");
    public static final TagKey<Item> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");
    public static final TagKey<Item> MOD_GEMS = create("mod_gems");
    public static final TagKey<Item> MOD_GEMS_EMERALDS = create("mod_gems_emeralds");
    public static final TagKey<Item> MOD_GEMS_SHARDS = create("mod_gems_shards");
    public static final TagKey<Item> MOD_LOGS = create("mod_logs");
    public static final TagKey<Item> MOD_LOGS_THAT_BURN = create("mod_logs");
    public static final TagKey<Item> MOD_ORES = create("mod_ores");
    public static final TagKey<Item> MOD_PLANKS = create("mod_planks");

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> lookupBlock, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, lookupBlock, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(MOD_BLOCKS)
                .add(ModBlocks.BLOCK_WIP.get().asItem());
        tag(MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get().asItem());
        tag(MOD_GEMS)
                .add(ModItems.GEM_WIP.get())
                // GEM SHARDS
                .add(ModItems.AQUAMARINE_SHARD.get())
                .add(ModItems.CITRINE_SHARD.get())
                .add(ModItems.GARNET_SHARD.get())
                .add(ModItems.OPAL_SHARD.get())
                .add(ModItems.PERIDOT_SHARD.get())
                .add(ModItems.RUBY_SHARD.get())
                .add(ModItems.SAPPHIRE_SHARD.get())
                .add(ModItems.TOPAZ_SHARD.get())
                // GEM EMERALDS
                .add(ModItems.AMETHYST_EMERALD.get())
                .add(ModItems.AQUAMARINE_EMERALD.get())
                .add(ModItems.CITRINE_EMERALD.get())
                .add(ModItems.GARNET_EMERALD.get())
                .add(ModItems.OPAL_EMERALD.get())
                .add(ModItems.PERIDOT_EMERALD.get())
                .add(ModItems.RUBY_EMERALD.get())
                .add(ModItems.SAPPHIRE_EMERALD.get())
                .add(ModItems.TOPAZ_EMERALD.get())
        ;
        tag(MOD_GEMS_EMERALDS)
                .add(ModItems.AMETHYST_EMERALD.get())
                .add(ModItems.AQUAMARINE_EMERALD.get())
                .add(ModItems.CITRINE_EMERALD.get())
                .add(ModItems.GARNET_EMERALD.get())
                .add(ModItems.OPAL_EMERALD.get())
                .add(ModItems.PERIDOT_EMERALD.get())
                .add(ModItems.RUBY_EMERALD.get())
                .add(ModItems.SAPPHIRE_EMERALD.get())
                .add(ModItems.TOPAZ_EMERALD.get());
        tag(MOD_GEMS_SHARDS)
                .add(Items.AMETHYST_SHARD)
                .add(ModItems.AQUAMARINE_SHARD.get())
                .add(ModItems.CITRINE_SHARD.get())
                .add(ModItems.GARNET_SHARD.get())
                .add(ModItems.OPAL_SHARD.get())
                .add(ModItems.PERIDOT_SHARD.get())
                .add(ModItems.RUBY_SHARD.get())
                .add(ModItems.SAPPHIRE_SHARD.get())
                .add(ModItems.TOPAZ_SHARD.get());
        tag(MOD_LOGS)
                .add(ModBlocks.DAPHNE_LOG.get().asItem())
                .add(ModBlocks.DAPHNE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get().asItem());
        tag(MOD_LOGS_THAT_BURN)
                .add(ModBlocks.DAPHNE_LOG.get().asItem())
                .add(ModBlocks.DAPHNE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get().asItem());
        tag(MOD_ORES)
                .add(ModBlocks.ORE_WIP.get().asItem());
        tag(MOD_PLANKS)
                .add(ModBlocks.DAPHNE_PLANKS.get().asItem());
        tag(ItemTags.LOGS)
                .addTags(MOD_LOGS);
        tag(ItemTags.LOGS_THAT_BURN)
                .addTags(MOD_LOGS_THAT_BURN);
        tag(ItemTags.PLANKS)
                .addTags(MOD_PLANKS);
        tag(Tags.Items.GEMS)
                .addTags(MOD_GEMS);
        tag(Tags.Items.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(Tags.Items.STORAGE_BLOCKS)
                .addTags(MOD_BLOCKS);
    }

    private static TagKey<Item> create(String name) {
        return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
