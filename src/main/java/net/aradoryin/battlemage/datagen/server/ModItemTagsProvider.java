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
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    // BLOCKS
    public static final TagKey<Item> MOD_BLOCKS = create("mod_blocks");

    // BLOCKS
    public static final TagKey<Item> MOD_BUDDING_BLOCKS = create("mod_budding_blocks");

    // ORES
    public static final TagKey<Item> MOD_ORES = create("mod_ores");
    public static final TagKey<Item> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");

    // GEMS
    public static final TagKey<Item> MOD_GEMS = create("mod_gems");

    // INDIVIDUAL GEMS
    public static final TagKey<Item> MOD_GEMS_AMETHYST = create("mod_gems_amethyst");
    public static final TagKey<Item> MOD_GEMS_AQUAMARINE = create("mod_gems_aquamarine");
    public static final TagKey<Item> MOD_GEMS_CITRINE = create("mod_gems_citrine");
    public static final TagKey<Item> MOD_GEMS_GARNET = create("mod_gems_garnet");
    public static final TagKey<Item> MOD_GEMS_OPAL = create("mod_gems_opal");
    public static final TagKey<Item> MOD_GEMS_PERIDOT = create("mod_gems_peridot");
    public static final TagKey<Item> MOD_GEMS_RUBY = create("mod_gems_ruby");
    public static final TagKey<Item> MOD_GEMS_SAPPHIRE = create("mod_gems_sapphire");
    public static final TagKey<Item> MOD_GEMS_TOPAZ = create("mod_gems_topaz");

    // EMERALD GEMS
    public static final TagKey<Item> MOD_GEMS_EMERALDS = create("mod_gems_emeralds");

    // FACETED GEMS
    public static final TagKey<Item> MOD_GEMS_FACETED = create("mod_gems_faceted");

    // GEODE GEMS
    public static final TagKey<Item> MOD_GEMS_GEODE = create("mod_gems_geode");

    // PEAR GEMS
    public static final TagKey<Item> MOD_GEMS_PEAR = create("mod_gems_pear");

    // SHARD GEMS
    public static final TagKey<Item> MOD_GEMS_SHARDS = create("mod_gems_shards");

    // TRILLION GEMS
    public static final TagKey<Item> MOD_GEMS_TRILLION = create("mod_gems_trillion");

    // LOGS
    public static final TagKey<Item> MOD_LOGS = create("mod_logs");
    public static final TagKey<Item> MOD_LOGS_THAT_BURN = create("mod_logs");

    // PLANKS
    public static final TagKey<Item> MOD_PLANKS = create("mod_planks");

    // STORAGE BLOCKS
    public static final TagKey<Item> MOD_STORAGE_BLOCK = create("mod_storage_block");

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> lookupBlock, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, lookupBlock, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // BLOCK TAG CALL
        tag(MOD_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get().asItem());

        /*
        <---------------------------------------------------------------->
                                BUDDING BLOCKS
        <---------------------------------------------------------------->
         */
        tag(MOD_BUDDING_BLOCKS)
                .add(Blocks.BUDDING_AMETHYST.asItem())
                .add(ModBlocks.BUDDING_AQUAMARINE.get().asItem())
                .add(ModBlocks.BUDDING_CITRINE.get().asItem())
                .add(ModBlocks.BUDDING_GARNET.get().asItem())
                .add(ModBlocks.BUDDING_OPAL.get().asItem())
                .add(ModBlocks.BUDDING_PERIDOT.get().asItem())
                .add(ModBlocks.BUDDING_RUBY.get().asItem())
                .add(ModBlocks.BUDDING_SAPPHIRE.get().asItem())
                .add(ModBlocks.BUDDING_TOPAZ.get().asItem());

        /*
        <---------------------------------------------------------------->
                                STORAGE BLOCKS
        <---------------------------------------------------------------->
         */
        //noinspection unchecked
        tag(Tags.Items.STORAGE_BLOCKS)
                .addTags(MOD_STORAGE_BLOCK);
        tag(MOD_STORAGE_BLOCK)
                // AMETHYST
                .add(Blocks.AMETHYST_BLOCK.asItem())
                .add(ModBlocks.AMETHYST_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.AMETHYST_FACETED_BLOCK.get().asItem())
                // AQUAMARINE
                .add(ModBlocks.AQUAMARINE_BLOCK.get().asItem())
                .add(ModBlocks.AQUAMARINE_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.AQUAMARINE_FACETED_BLOCK.get().asItem())
                // CITRINE
                .add(ModBlocks.CITRINE_BLOCK.get().asItem())
                .add(ModBlocks.CITRINE_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.CITRINE_FACETED_BLOCK.get().asItem())
                // GARNET
                .add(ModBlocks.GARNET_BLOCK.get().asItem())
                .add(ModBlocks.GARNET_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.GARNET_FACETED_BLOCK.get().asItem())
                // OPAL
                .add(ModBlocks.OPAL_BLOCK.get().asItem())
                .add(ModBlocks.OPAL_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.OPAL_FACETED_BLOCK.get().asItem())
                // PERIDOT
                .add(ModBlocks.PERIDOT_BLOCK.get().asItem())
                .add(ModBlocks.PERIDOT_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.PERIDOT_FACETED_BLOCK.get().asItem())
                // RUBY
                .add(ModBlocks.RUBY_BLOCK.get().asItem())
                .add(ModBlocks.RUBY_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.RUBY_FACETED_BLOCK.get().asItem())
                // SAPPHIRE
                .add(ModBlocks.SAPPHIRE_BLOCK.get().asItem())
                .add(ModBlocks.SAPPHIRE_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.SAPPHIRE_FACETED_BLOCK.get().asItem())
                // TOPAZ
                .add(ModBlocks.TOPAZ_BLOCK.get().asItem())
                .add(ModBlocks.TOPAZ_EMERALD_BLOCK.get().asItem())
                .add(ModBlocks.TOPAZ_FACETED_BLOCK.get().asItem())
        ;

        /*
        <---------------------------------------------------------------->
                                     ORES
        <---------------------------------------------------------------->
         */
        //noinspection unchecked
        tag(Tags.Items.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(MOD_ORES)
                .add(ModBlocks.ORE_WIP.get().asItem());
        tag(MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get().asItem());

        /*
        <---------------------------------------------------------------->
                                GENERAL GEMS
        <---------------------------------------------------------------->
         */
        //noinspection unchecked
        tag(Tags.Items.GEMS)
                .addTags(MOD_GEMS);
        tag(MOD_GEMS)
                // GEM EMERALDS
                .add(ModItems.WIP_EMERALD.get())
                .add(ModItems.AMETHYST_EMERALD.get())
                .add(ModItems.AQUAMARINE_EMERALD.get())
                .add(ModItems.CITRINE_EMERALD.get())
                .add(ModItems.GARNET_EMERALD.get())
                .add(ModItems.OPAL_EMERALD.get())
                .add(ModItems.PERIDOT_EMERALD.get())
                .add(ModItems.RUBY_EMERALD.get())
                .add(ModItems.SAPPHIRE_EMERALD.get())
                .add(ModItems.TOPAZ_EMERALD.get())
                // GEM FACETED
                .add(ModItems.WIP_FACETED.get())
                .add(ModItems.AMETHYST_FACETED.get())
                .add(ModItems.AQUAMARINE_FACETED.get())
                .add(ModItems.CITRINE_FACETED.get())
                .add(ModItems.GARNET_FACETED.get())
                .add(ModItems.OPAL_FACETED.get())
                .add(ModItems.PERIDOT_FACETED.get())
                .add(ModItems.RUBY_FACETED.get())
                .add(ModItems.SAPPHIRE_FACETED.get())
                .add(ModItems.TOPAZ_FACETED.get())
                // GEM GEODE
                .add(ModItems.WIP_GEODE.get())
                .add(ModItems.AMETHYST_GEODE.get())
                .add(ModItems.AQUAMARINE_GEODE.get())
                .add(ModItems.CITRINE_GEODE.get())
                .add(ModItems.GARNET_GEODE.get())
                .add(ModItems.OPAL_GEODE.get())
                .add(ModItems.PERIDOT_GEODE.get())
                .add(ModItems.RUBY_GEODE.get())
                .add(ModItems.SAPPHIRE_GEODE.get())
                .add(ModItems.TOPAZ_GEODE.get())
                // GEM PEAR
                .add(ModItems.WIP_PEAR.get())
                .add(ModItems.AMETHYST_PEAR.get())
                .add(ModItems.AQUAMARINE_PEAR.get())
                .add(ModItems.CITRINE_PEAR.get())
                .add(ModItems.GARNET_PEAR.get())
                .add(ModItems.OPAL_PEAR.get())
                .add(ModItems.PERIDOT_PEAR.get())
                .add(ModItems.RUBY_PEAR.get())
                .add(ModItems.SAPPHIRE_PEAR.get())
                .add(ModItems.TOPAZ_PEAR.get())
                // GEM SHARDS
                .add(ModItems.WIP_SHARD.get())
                .add(ModItems.AQUAMARINE_SHARD.get())
                .add(ModItems.CITRINE_SHARD.get())
                .add(ModItems.GARNET_SHARD.get())
                .add(ModItems.OPAL_SHARD.get())
                .add(ModItems.PERIDOT_SHARD.get())
                .add(ModItems.RUBY_SHARD.get())
                .add(ModItems.SAPPHIRE_SHARD.get())
                .add(ModItems.TOPAZ_SHARD.get())
                // GEM TRILLION
                .add(ModItems.WIP_TRILLION.get())
                .add(ModItems.AMETHYST_TRILLION.get())
                .add(ModItems.AQUAMARINE_TRILLION.get())
                .add(ModItems.CITRINE_TRILLION.get())
                .add(ModItems.GARNET_TRILLION.get())
                .add(ModItems.OPAL_TRILLION.get())
                .add(ModItems.PERIDOT_TRILLION.get())
                .add(ModItems.RUBY_TRILLION.get())
                .add(ModItems.SAPPHIRE_TRILLION.get())
                .add(ModItems.TOPAZ_TRILLION.get());

        /*
        <---------------------------------------------------------------->
                              INDIVIDUAL GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_AMETHYST)
                .add(Items.AMETHYST_SHARD)
                .add(ModItems.AMETHYST_EMERALD.get())
                .add(ModItems.AMETHYST_FACETED.get())
                .add(ModItems.AMETHYST_GEODE.get())
                .add(ModItems.AMETHYST_PEAR.get())
                .add(ModItems.AMETHYST_TRILLION.get());
        tag(MOD_GEMS_AQUAMARINE)
                .add(ModItems.AQUAMARINE_SHARD.get())
                .add(ModItems.AQUAMARINE_EMERALD.get())
                .add(ModItems.AQUAMARINE_FACETED.get())
                .add(ModItems.AQUAMARINE_GEODE.get())
                .add(ModItems.AQUAMARINE_PEAR.get())
                .add(ModItems.AQUAMARINE_TRILLION.get());
        tag(MOD_GEMS_CITRINE)
                .add(ModItems.CITRINE_SHARD.get())
                .add(ModItems.CITRINE_EMERALD.get())
                .add(ModItems.CITRINE_FACETED.get())
                .add(ModItems.CITRINE_GEODE.get())
                .add(ModItems.CITRINE_PEAR.get())
                .add(ModItems.CITRINE_TRILLION.get());
        tag(MOD_GEMS_GARNET)
                .add(ModItems.GARNET_SHARD.get())
                .add(ModItems.GARNET_EMERALD.get())
                .add(ModItems.GARNET_FACETED.get())
                .add(ModItems.GARNET_GEODE.get())
                .add(ModItems.GARNET_PEAR.get())
                .add(ModItems.GARNET_TRILLION.get());
        tag(MOD_GEMS_OPAL)
                .add(ModItems.OPAL_SHARD.get())
                .add(ModItems.OPAL_EMERALD.get())
                .add(ModItems.OPAL_FACETED.get())
                .add(ModItems.OPAL_GEODE.get())
                .add(ModItems.OPAL_PEAR.get())
                .add(ModItems.OPAL_TRILLION.get());
        tag(MOD_GEMS_PERIDOT)
                .add(ModItems.PERIDOT_SHARD.get())
                .add(ModItems.PERIDOT_EMERALD.get())
                .add(ModItems.PERIDOT_FACETED.get())
                .add(ModItems.PERIDOT_GEODE.get())
                .add(ModItems.PERIDOT_PEAR.get())
                .add(ModItems.PERIDOT_TRILLION.get());
        tag(MOD_GEMS_RUBY)
                .add(ModItems.RUBY_SHARD.get())
                .add(ModItems.RUBY_EMERALD.get())
                .add(ModItems.RUBY_FACETED.get())
                .add(ModItems.RUBY_GEODE.get())
                .add(ModItems.RUBY_PEAR.get())
                .add(ModItems.RUBY_TRILLION.get());
        tag(MOD_GEMS_SAPPHIRE)
                .add(ModItems.SAPPHIRE_SHARD.get())
                .add(ModItems.SAPPHIRE_EMERALD.get())
                .add(ModItems.SAPPHIRE_FACETED.get())
                .add(ModItems.SAPPHIRE_GEODE.get())
                .add(ModItems.SAPPHIRE_PEAR.get())
                .add(ModItems.SAPPHIRE_TRILLION.get());
        tag(MOD_GEMS_TOPAZ)
                .add(ModItems.TOPAZ_SHARD.get())
                .add(ModItems.TOPAZ_EMERALD.get())
                .add(ModItems.TOPAZ_FACETED.get())
                .add(ModItems.TOPAZ_GEODE.get())
                .add(ModItems.TOPAZ_PEAR.get())
                .add(ModItems.TOPAZ_TRILLION.get());

        /*
        <---------------------------------------------------------------->
                                EMERALD GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_EMERALDS)
                .add(ModItems.WIP_EMERALD.get())
                .add(ModItems.AMETHYST_EMERALD.get())
                .add(ModItems.AQUAMARINE_EMERALD.get())
                .add(ModItems.CITRINE_EMERALD.get())
                .add(ModItems.GARNET_EMERALD.get())
                .add(ModItems.OPAL_EMERALD.get())
                .add(ModItems.PERIDOT_EMERALD.get())
                .add(ModItems.RUBY_EMERALD.get())
                .add(ModItems.SAPPHIRE_EMERALD.get())
                .add(ModItems.TOPAZ_EMERALD.get());

        /*
        <---------------------------------------------------------------->
                                FACETED GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_FACETED)
                .add(ModItems.WIP_FACETED.get())
                .add(ModItems.AMETHYST_FACETED.get())
                .add(ModItems.AQUAMARINE_FACETED.get())
                .add(ModItems.CITRINE_FACETED.get())
                .add(ModItems.GARNET_FACETED.get())
                .add(ModItems.OPAL_FACETED.get())
                .add(ModItems.PERIDOT_FACETED.get())
                .add(ModItems.RUBY_FACETED.get())
                .add(ModItems.SAPPHIRE_FACETED.get())
                .add(ModItems.TOPAZ_FACETED.get());

        /*
        <---------------------------------------------------------------->
                                GEODE GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_GEODE)
                .add(ModItems.WIP_GEODE.get())
                .add(ModItems.AMETHYST_GEODE.get())
                .add(ModItems.AQUAMARINE_GEODE.get())
                .add(ModItems.CITRINE_GEODE.get())
                .add(ModItems.GARNET_GEODE.get())
                .add(ModItems.OPAL_GEODE.get())
                .add(ModItems.PERIDOT_GEODE.get())
                .add(ModItems.RUBY_GEODE.get())
                .add(ModItems.SAPPHIRE_GEODE.get())
                .add(ModItems.TOPAZ_GEODE.get());

        /*
        <---------------------------------------------------------------->
                                PEAR GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_PEAR)
                .add(ModItems.WIP_PEAR.get())
                .add(ModItems.AMETHYST_PEAR.get())
                .add(ModItems.AQUAMARINE_PEAR.get())
                .add(ModItems.CITRINE_PEAR.get())
                .add(ModItems.GARNET_PEAR.get())
                .add(ModItems.OPAL_PEAR.get())
                .add(ModItems.PERIDOT_PEAR.get())
                .add(ModItems.RUBY_PEAR.get())
                .add(ModItems.SAPPHIRE_PEAR.get())
                .add(ModItems.TOPAZ_PEAR.get());

        /*
        <---------------------------------------------------------------->
                                SHARD GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_SHARDS)
                .add(ModItems.WIP_SHARD.get())
                .add(Items.AMETHYST_SHARD)
                .add(ModItems.AQUAMARINE_SHARD.get())
                .add(ModItems.CITRINE_SHARD.get())
                .add(ModItems.GARNET_SHARD.get())
                .add(ModItems.OPAL_SHARD.get())
                .add(ModItems.PERIDOT_SHARD.get())
                .add(ModItems.RUBY_SHARD.get())
                .add(ModItems.SAPPHIRE_SHARD.get())
                .add(ModItems.TOPAZ_SHARD.get());

        /*
        <---------------------------------------------------------------->
                                TRILLION GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_GEMS_TRILLION)
                .add(ModItems.WIP_TRILLION.get())
                .add(ModItems.AMETHYST_TRILLION.get())
                .add(ModItems.AQUAMARINE_TRILLION.get())
                .add(ModItems.CITRINE_TRILLION.get())
                .add(ModItems.GARNET_TRILLION.get())
                .add(ModItems.OPAL_TRILLION.get())
                .add(ModItems.PERIDOT_TRILLION.get())
                .add(ModItems.RUBY_TRILLION.get())
                .add(ModItems.SAPPHIRE_TRILLION.get())
                .add(ModItems.TOPAZ_TRILLION.get());

        /*
        <---------------------------------------------------------------->
                                LOGS
        <---------------------------------------------------------------->
         */
        //noinspection unchecked
        tag(ItemTags.LOGS)
                .addTags(MOD_LOGS);
        //noinspection unchecked
        tag(ItemTags.LOGS_THAT_BURN)
                .addTags(MOD_LOGS_THAT_BURN);
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

        /*
        <---------------------------------------------------------------->
                                PLANKS
        <---------------------------------------------------------------->
         */
        //noinspection unchecked
        tag(ItemTags.PLANKS)
                .addTags(MOD_PLANKS);
        tag(MOD_PLANKS)
                .add(ModBlocks.DAPHNE_PLANKS.get().asItem());
    }

    private static TagKey<Item> create(String name) {
        return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
