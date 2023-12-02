package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("ALL")
public class ModBlockTagsProvider extends BlockTagsProvider {
    // ALL BLOCKS TAG
    public static final TagKey<Block> MOD_BLOCKS = create("mod_blocks");

    // BUDDING BLOCKS
    public static final TagKey<Block> MOD_BUDDING_BLOCKS = create("mod_budding_blocks");

    // <-- GEMS -->
    public static final TagKey<Block> MOD_AMETHYST_BLOCKS = create("mod_amethyst_blocks");
    public static final TagKey<Block> MOD_AQUAMARINE_BLOCKS = create("mod_aquamarine_blocks");
    public static final TagKey<Block> MOD_CITRINE_BLOCKS = create("mod_citrine_blocks");
    public static final TagKey<Block> MOD_GARNET_BLOCKS = create("mod_garnet_blocks");
    public static final TagKey<Block> MOD_OPAL_BLOCKS = create("mod_opal_blocks");
    public static final TagKey<Block> MOD_PERIDOT_BLOCKS = create("mod_peridot_blocks");
    public static final TagKey<Block> MOD_RUBY_BLOCKS = create("mod_ruby_blocks");
    public static final TagKey<Block> MOD_SAPPHIRE_BLOCKS = create("mod_sapphire_blocks");
    public static final TagKey<Block> MOD_TOPAZ_BLOCKS = create("mod_topaz_blocks");
    // <-- END GEMS -->

    // LOGS
    public static final TagKey<Block> MOD_LOGS = create("mod_logs");
    public static final TagKey<Block> MOD_LOGS_THAT_BURN = create("mod_logs");

    // ORES
    public static final TagKey<Block> MOD_ORES = create("mod_ores");
    public static final TagKey<Block> MOD_DEEPSLATE_ORES = create("mod_deepslate_ores");

    // PLANKS
    public static final TagKey<Block> MOD_PLANKS = create("mod_planks");

    // SAPLINGS
    public static final TagKey<Block> MOD_SAPLINGS = create("mod_saplings");

    // STORAGE BLOCKS
    public static final TagKey<Block> MOD_STORAGE_BLOCKS = create("mod_storage_blocks");

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        // ALL BLOCK TAG
        tag(MOD_BLOCKS)
                .addTags(MOD_BUDDING_BLOCKS)
                .addTags(MOD_LOGS)
                .addTags(MOD_ORES)
                .addTags(MOD_DEEPSLATE_ORES)
                .addTags(MOD_PLANKS)
                .addTags(MOD_STORAGE_BLOCKS)
        ;

        /*
        <---------------------------------------------------------------->
                                BUDDING BLOCKS
        <---------------------------------------------------------------->
         */
        tag(MOD_BUDDING_BLOCKS)
                .add(ModBlocks.BUDDING_WIP.get())
                .add(Blocks.BUDDING_AMETHYST)
                .add(ModBlocks.BUDDING_AQUAMARINE.get())
                .add(ModBlocks.BUDDING_CITRINE.get())
                .add(ModBlocks.BUDDING_GARNET.get())
                .add(ModBlocks.BUDDING_OPAL.get())
                .add(ModBlocks.BUDDING_PERIDOT.get())
                .add(ModBlocks.BUDDING_RUBY.get())
                .add(ModBlocks.BUDDING_SAPPHIRE.get())
                .add(ModBlocks.BUDDING_TOPAZ.get());

        /*
        <---------------------------------------------------------------->
                                    GEMS
        <---------------------------------------------------------------->
         */
        tag(MOD_AMETHYST_BLOCKS)
                .add(Blocks.BUDDING_AMETHYST)
                .add(Blocks.AMETHYST_BLOCK)
                .add(ModBlocks.AMETHYST_EMERALD_BLOCK.get())
                .add(ModBlocks.AMETHYST_FACETED_BLOCK.get())
                .add(ModBlocks.AMETHYST_PEAR_BLOCK.get())
                .add(ModBlocks.AMETHYST_TRILLION_BLOCK.get());
        tag(MOD_AQUAMARINE_BLOCKS)
                .add(ModBlocks.BUDDING_AQUAMARINE.get())
                .add(ModBlocks.AQUAMARINE_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_EMERALD_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_FACETED_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_PEAR_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_TRILLION_BLOCK.get());
        tag(MOD_CITRINE_BLOCKS)
                .add(ModBlocks.BUDDING_CITRINE.get())
                .add(ModBlocks.CITRINE_BLOCK.get())
                .add(ModBlocks.CITRINE_EMERALD_BLOCK.get())
                .add(ModBlocks.CITRINE_FACETED_BLOCK.get())
                .add(ModBlocks.CITRINE_PEAR_BLOCK.get())
                .add(ModBlocks.CITRINE_TRILLION_BLOCK.get());
        tag(MOD_GARNET_BLOCKS)
                .add(ModBlocks.BUDDING_GARNET.get())
                .add(ModBlocks.GARNET_BLOCK.get())
                .add(ModBlocks.GARNET_EMERALD_BLOCK.get())
                .add(ModBlocks.GARNET_FACETED_BLOCK.get())
                .add(ModBlocks.GARNET_PEAR_BLOCK.get())
                .add(ModBlocks.GARNET_TRILLION_BLOCK.get());
        tag(MOD_OPAL_BLOCKS)
                .add(ModBlocks.BUDDING_OPAL.get())
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_EMERALD_BLOCK.get())
                .add(ModBlocks.OPAL_FACETED_BLOCK.get())
                .add(ModBlocks.OPAL_PEAR_BLOCK.get())
                .add(ModBlocks.OPAL_TRILLION_BLOCK.get());
        tag(MOD_PERIDOT_BLOCKS)
                .add(ModBlocks.BUDDING_PERIDOT.get())
                .add(ModBlocks.PERIDOT_BLOCK.get())
                .add(ModBlocks.PERIDOT_EMERALD_BLOCK.get())
                .add(ModBlocks.PERIDOT_FACETED_BLOCK.get())
                .add(ModBlocks.PERIDOT_PEAR_BLOCK.get())
                .add(ModBlocks.PERIDOT_TRILLION_BLOCK.get());
        tag(MOD_RUBY_BLOCKS)
                .add(ModBlocks.BUDDING_RUBY.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_EMERALD_BLOCK.get())
                .add(ModBlocks.RUBY_FACETED_BLOCK.get())
                .add(ModBlocks.RUBY_PEAR_BLOCK.get())
                .add(ModBlocks.RUBY_TRILLION_BLOCK.get());
        tag(MOD_SAPPHIRE_BLOCKS)
                .add(ModBlocks.BUDDING_SAPPHIRE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_EMERALD_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_FACETED_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_PEAR_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_TRILLION_BLOCK.get());
        tag(MOD_TOPAZ_BLOCKS)
                .add(ModBlocks.BUDDING_TOPAZ.get())
                .add(ModBlocks.TOPAZ_BLOCK.get())
                .add(ModBlocks.TOPAZ_EMERALD_BLOCK.get())
                .add(ModBlocks.TOPAZ_FACETED_BLOCK.get())
                .add(ModBlocks.TOPAZ_PEAR_BLOCK.get())
                .add(ModBlocks.TOPAZ_TRILLION_BLOCK.get());
        /*
        <---------------------------------------------------------------->
                                    END GEMS
        <---------------------------------------------------------------->
         */

        /*
        <---------------------------------------------------------------->
                                    LOGS
        <---------------------------------------------------------------->
         */
        tag(BlockTags.LOGS)
                .addTags(MOD_LOGS);
        tag(MOD_LOGS)
                .add(ModBlocks.DAPHNE_LOG.get())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get())
                .add(ModBlocks.DAPHNE_WOOD.get())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get());
        tag(BlockTags.LOGS_THAT_BURN)
                .addTags(MOD_LOGS_THAT_BURN);
        tag(MOD_LOGS_THAT_BURN)
                .add(ModBlocks.DAPHNE_LOG.get())
                .add(ModBlocks.STRIPPED_DAPHNE_LOG.get())
                .add(ModBlocks.DAPHNE_WOOD.get())
                .add(ModBlocks.STRIPPED_DAPHNE_WOOD.get());

        /*
        <---------------------------------------------------------------->
                                    ORES
        <---------------------------------------------------------------->
         */
        tag(Tags.Blocks.ORES)
                .addTags(MOD_DEEPSLATE_ORES, MOD_ORES);
        tag(MOD_ORES)
                .add(ModBlocks.ORE_WIP.get());
        tag(MOD_DEEPSLATE_ORES)
                .add(ModBlocks.DEEPSLATE_ORE_WIP.get());

        /*
        <---------------------------------------------------------------->
                                    PLANKS
        <---------------------------------------------------------------->
         */
        tag(BlockTags.PLANKS)
                .addTags(MOD_PLANKS);
        tag(MOD_PLANKS)
                .add(ModBlocks.DAPHNE_PLANKS.get())
        ;

        /*
        <---------------------------------------------------------------->
                                    SAPLINGS
        <---------------------------------------------------------------->
         */
        tag(BlockTags.SAPLINGS)
                .addTags(MOD_SAPLINGS);
        tag(MOD_SAPLINGS)
                .add(ModBlocks.DAPHNE_SAPLING.get())
        ;

        /*
        <---------------------------------------------------------------->
                                STORAGE BLOCKS
        <---------------------------------------------------------------->
         */
        tag(Tags.Blocks.STORAGE_BLOCKS)
                .addTags(MOD_STORAGE_BLOCKS);
        tag(MOD_STORAGE_BLOCKS)
                .add(ModBlocks.WIP_BLOCK.get())
                // AMETHYST
                .add(Blocks.AMETHYST_BLOCK)
                .add(ModBlocks.AMETHYST_EMERALD_BLOCK.get())
                .add(ModBlocks.AMETHYST_FACETED_BLOCK.get())
                .add(ModBlocks.AMETHYST_PEAR_BLOCK.get())
                .add(ModBlocks.AMETHYST_TRILLION_BLOCK.get())
                // AQUAMARINE
                .add(ModBlocks.AQUAMARINE_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_EMERALD_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_FACETED_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_PEAR_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_TRILLION_BLOCK.get())
                // CITRINE
                .add(ModBlocks.CITRINE_BLOCK.get())
                .add(ModBlocks.CITRINE_EMERALD_BLOCK.get())
                .add(ModBlocks.CITRINE_FACETED_BLOCK.get())
                .add(ModBlocks.CITRINE_PEAR_BLOCK.get())
                .add(ModBlocks.CITRINE_TRILLION_BLOCK.get())
                // GARNET
                .add(ModBlocks.GARNET_BLOCK.get())
                .add(ModBlocks.GARNET_EMERALD_BLOCK.get())
                .add(ModBlocks.GARNET_FACETED_BLOCK.get())
                .add(ModBlocks.GARNET_PEAR_BLOCK.get())
                .add(ModBlocks.GARNET_TRILLION_BLOCK.get())
                // OPAL
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_EMERALD_BLOCK.get())
                .add(ModBlocks.OPAL_FACETED_BLOCK.get())
                .add(ModBlocks.OPAL_PEAR_BLOCK.get())
                .add(ModBlocks.OPAL_TRILLION_BLOCK.get())
                // PERIDOT
                .add(ModBlocks.PERIDOT_BLOCK.get())
                .add(ModBlocks.PERIDOT_EMERALD_BLOCK.get())
                .add(ModBlocks.PERIDOT_FACETED_BLOCK.get())
                .add(ModBlocks.PERIDOT_PEAR_BLOCK.get())
                .add(ModBlocks.PERIDOT_TRILLION_BLOCK.get())
                // RUBY
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.RUBY_EMERALD_BLOCK.get())
                .add(ModBlocks.RUBY_FACETED_BLOCK.get())
                .add(ModBlocks.RUBY_PEAR_BLOCK.get())
                .add(ModBlocks.RUBY_TRILLION_BLOCK.get())
                // SAPPHIRE
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_EMERALD_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_FACETED_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_PEAR_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_TRILLION_BLOCK.get())
                // TOPAZ
                .add(ModBlocks.TOPAZ_BLOCK.get())
                .add(ModBlocks.TOPAZ_EMERALD_BLOCK.get())
                .add(ModBlocks.TOPAZ_FACETED_BLOCK.get())
                .add(ModBlocks.TOPAZ_PEAR_BLOCK.get())
                .add(ModBlocks.TOPAZ_TRILLION_BLOCK.get());

        /*
        <---------------------------------------------------------------->
                                MINEABLE WITH
        <---------------------------------------------------------------->
         */
        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTags(MOD_LOGS)
                .addTags(MOD_PLANKS)
        ;
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTags(MOD_BUDDING_BLOCKS)
                .addTags(MOD_ORES, MOD_DEEPSLATE_ORES)
                .addTags(MOD_STORAGE_BLOCKS)
        ;

        // ORE REPLACEABLE TAGS
        tag(BlockTags.STONE_ORE_REPLACEABLES);
        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
    }

    private static TagKey<Block> create(String name) {
        return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, name));
    }
}
