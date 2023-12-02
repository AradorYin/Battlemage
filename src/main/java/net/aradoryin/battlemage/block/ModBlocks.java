package net.aradoryin.battlemage.block;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.custom.JewelCraftingStationBlock;
import net.aradoryin.battlemage.block.custom.ModFlammableRotatedPillarBlock;
import net.aradoryin.battlemage.block.custom.geodes.buddingblock.*;
import net.aradoryin.battlemage.block.custom.geodes.cluster.*;
import net.aradoryin.battlemage.block.custom.geodes.geodeclusterblock.*;
import net.aradoryin.battlemage.item.ModItems;
import net.aradoryin.battlemage.worldgen.tree.DaphneTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/*
TODO: The Overlay variants will be the initial block variant 
 */
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Battlemage.MOD_ID);

    // CRAFTING STATIONS
    public static final RegistryObject<Block> JEWEL_CRAFTING_STATION = registerBlock("jewel_crafting_station",
            ()-> new JewelCraftingStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));

    /*
    The below Blocks(s) are to be used as examples or placeholders in the event of Image Load Failure.
     */
    public static final RegistryObject<Block> WIP_BLOCK = registerBlock("block_wip",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WIP_EMERALD_BLOCK = registerBlock("emerald_wip_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WIP_FACETED_BLOCK = registerBlock("faceted_wip_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WIP_PEAR_BLOCK = registerBlock("pear_wip_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WIP_TRILLION_BLOCK = registerBlock("trillion_wip_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_WIP = registerBlock("budding_wip",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WIP_CLUSTER = registerBlock("wip_cluster",
            () -> new AquamarineClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> LARGE_WIP_BUD = registerBlock("large_wip_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> MEDIUM_WIP_BUD = registerBlock("medium_wip_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> SMALL_WIP_BUD = registerBlock("small_wip_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> ORE_WIP = registerBlock("ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(4f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_WIP = registerBlock("deepslate_ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    /*
    TODO: Add in custom Sounds for the various gem clusters
     */
    // CLUSTERS
    public static final RegistryObject<Block> AQUAMARINE_CLUSTER = registerBlock("aquamarine_cluster",
            () -> new AquamarineClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> CITRINE_CLUSTER = registerBlock("citrine_cluster",
            () -> new CitrineClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> GARNET_CLUSTER = registerBlock("garnet_cluster",
            () -> new GarnetClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> OPAL_CLUSTER = registerBlock("opal_cluster",
            () -> new OpalClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> PERIDOT_CLUSTER = registerBlock("peridot_cluster",
            () -> new PeridotClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("ruby_cluster",
            () -> new RubyClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster",
            () -> new SapphireClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));
    public static final RegistryObject<Block> TOPAZ_CLUSTER = registerBlock("topaz_cluster",
            () -> new TopazClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_CLUSTER).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel(lightEmission -> 5)));

    // LARGE BUDS
    public static final RegistryObject<Block> LARGE_AQUAMARINE_BUD = registerBlock("large_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_CITRINE_BUD = registerBlock("large_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_GARNET_BUD = registerBlock("large_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_OPAL_BUD = registerBlock("large_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_PERIDOT_BUD = registerBlock("large_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));
    public static final RegistryObject<Block> LARGE_TOPAZ_BUD = registerBlock("large_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(lightEmission -> 4)));

    // MEDIUM BUDS
    public static final RegistryObject<Block> MEDIUM_AQUAMARINE_BUD = registerBlock("medium_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_CITRINE_BUD = registerBlock("medium_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_GARNET_BUD = registerBlock("medium_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_OPAL_BUD = registerBlock("medium_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_PERIDOT_BUD = registerBlock("medium_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));
    public static final RegistryObject<Block> MEDIUM_TOPAZ_BUD = registerBlock("medium_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(lightEmission -> 2)));

    // SMALL BUDS
    public static final RegistryObject<Block> SMALL_AQUAMARINE_BUD = registerBlock("small_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_CITRINE_BUD = registerBlock("small_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_GARNET_BUD = registerBlock("small_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_OPAL_BUD = registerBlock("small_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_PERIDOT_BUD = registerBlock("small_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));
    public static final RegistryObject<Block> SMALL_TOPAZ_BUD = registerBlock("small_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(lightEmission -> 1)));

    // BUDDING BLOCKS
    public static final RegistryObject<Block> BUDDING_AQUAMARINE = registerBlock("budding_aquamarine",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_CITRINE = registerBlock("budding_citrine",
            () -> new BuddingCitrineBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_GARNET = registerBlock("budding_garnet",
            () -> new BuddingGarnetBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_OPAL = registerBlock("budding_opal",
            () -> new BuddingOpalBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_PERIDOT = registerBlock("budding_peridot",
            () -> new BuddingPeridotBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_RUBY = registerBlock("budding_ruby",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE = registerBlock("budding_sapphire",
            () -> new BuddingSapphireBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_TOPAZ = registerBlock("budding_topaz",
            () -> new BuddingTopazBlock(BlockBehaviour.Properties.copy(Blocks.BUDDING_AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));


    // STORAGE BLOCK
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new CitrineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.ORANGE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
            () -> new GarnetBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.MAGENTA)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new OpalBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.LIGHT_BLUE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new PeridotBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.GREEN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new RubyBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.RED)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new SapphireBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.BLUE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new TopazBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.YELLOW)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    // EMERALD STORAGE BLOCKS
    public static final RegistryObject<Block> AMETHYST_EMERALD_BLOCK = registerBlock("emerald_amethyst_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_EMERALD_BLOCK = registerBlock("emerald_aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_EMERALD_BLOCK = registerBlock("emerald_citrine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_EMERALD_BLOCK = registerBlock("emerald_garnet_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_EMERALD_BLOCK = registerBlock("emerald_opal_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_EMERALD_BLOCK = registerBlock("emerald_peridot_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_EMERALD_BLOCK = registerBlock("emerald_ruby_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_EMERALD_BLOCK = registerBlock("emerald_sapphire_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_EMERALD_BLOCK = registerBlock("emerald_topaz_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    // FACETED STORAGE BLOCK
    public static final RegistryObject<Block> AMETHYST_FACETED_BLOCK = registerBlock("faceted_amethyst_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_FACETED_BLOCK = registerBlock("faceted_aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_FACETED_BLOCK = registerBlock("faceted_citrine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_FACETED_BLOCK = registerBlock("faceted_garnet_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_FACETED_BLOCK = registerBlock("faceted_opal_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_FACETED_BLOCK = registerBlock("faceted_peridot_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_FACETED_BLOCK = registerBlock("faceted_ruby_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_FACETED_BLOCK = registerBlock("faceted_sapphire_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_FACETED_BLOCK = registerBlock("faceted_topaz_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    // PEAR STORAGE BLOCK
    public static final RegistryObject<Block> AMETHYST_PEAR_BLOCK = registerBlock("pear_amethyst_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_PEAR_BLOCK = registerBlock("pear_aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_PEAR_BLOCK = registerBlock("pear_citrine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_PEAR_BLOCK = registerBlock("pear_garnet_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_PEAR_BLOCK = registerBlock("pear_opal_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_PEAR_BLOCK = registerBlock("pear_peridot_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_PEAR_BLOCK = registerBlock("pear_ruby_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_PEAR_BLOCK = registerBlock("pear_sapphire_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_PEAR_BLOCK = registerBlock("pear_topaz_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    // TRILLION STORAGE BLOCK
    public static final RegistryObject<Block> AMETHYST_TRILLION_BLOCK = registerBlock("trillion_amethyst_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_TRILLION_BLOCK = registerBlock("trillion_aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_TRILLION_BLOCK = registerBlock("trillion_citrine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_TRILLION_BLOCK = registerBlock("trillion_garnet_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_TRILLION_BLOCK = registerBlock("trillion_opal_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_TRILLION_BLOCK = registerBlock("trillion_peridot_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_TRILLION_BLOCK = registerBlock("trillion_ruby_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_TRILLION_BLOCK = registerBlock("trillion_sapphire_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_TRILLION_BLOCK = registerBlock("trillion_topaz_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).mapColor(DyeColor.CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    // STONES
    public static final RegistryObject<Block> ETHERIC_STONE = registerBlock("etheric_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_COBBLESTONE_DF = registerBlock("blasted_cobblestone_difference",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_COBBLESTONE_HL = registerBlock("blasted_cobblestone_hardlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_COBBLESTONE_OL = registerBlock("blasted_cobblestone_overlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_COBBLESTONE_SL = registerBlock("blasted_cobblestone_softlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_COBBLESTONE_ST = registerBlock("blasted_cobblestone_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_CRACKED_STONE_BRICKS_DF = registerBlock("blasted_cracked_stone_bricks_difference",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_CRACKED_STONE_BRICKS_HL = registerBlock("blasted_cracked_stone_bricks_hardlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_CRACKED_STONE_BRICKS_OL = registerBlock("blasted_cracked_stone_bricks_overlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_CRACKED_STONE_BRICKS_SL = registerBlock("blasted_cracked_stone_bricks_softlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_CRACKED_STONE_BRICKS_ST = registerBlock("blasted_cracked_stone_bricks_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_BRICKS_DF = registerBlock("blasted_stone_bricks_difference",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_BRICKS_HL = registerBlock("blasted_stone_bricks_hardlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_BRICKS_OL = registerBlock("blasted_stone_bricks_overlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_BRICKS_SL = registerBlock("blasted_stone_bricks_softlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_BRICKS_ST = registerBlock("blasted_stone_bricks_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_DF = registerBlock("blasted_stone_difference",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_HL = registerBlock("blasted_stone_hardlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_OL = registerBlock("blasted_stone_overlay",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_SL = registerBlock("blasted_stone_softlight",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLASTED_STONE_ST = registerBlock("blasted_stone_subtract",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.GRAY)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));

    /*
    TODO: Add in the original ore implementation for options on gem generation
    The original ore block textures are still existing. Either follow the above or delete them.
     */
    // ORES

    /*
    TODO: Add in Daphne Bush berries/fruit for use in crafting/alchemy
    The original idea behind the Daphne Bush was to add in some berries/fruit (maybe leaves as well) to be used in any
    Crafting or Alchemical processes. No additional implementation has been implemented yet.
     */
    // PLANTS -> LOG | WOOD | PLANKS | LEAVES | SAPLING
    public static final RegistryObject<Block> DAPHNE_LOG = registerBlock("daphne_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(5f)));
    public static final RegistryObject<Block> DAPHNE_WOOD = registerBlock("daphne_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(5f)));
    public static final RegistryObject<Block> STRIPPED_DAPHNE_LOG = registerBlock("stripped_daphne_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(5f)));
    public static final RegistryObject<Block> STRIPPED_DAPHNE_WOOD = registerBlock("stripped_daphne_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(5f)));

    public static final RegistryObject<Block> DAPHNE_PLANKS = registerBlock("daphne_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(5f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }
            });
    public static final RegistryObject<Block> DAPHNE_LEAVES = registerBlock("daphne_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .strength(5f)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> DAPHNE_SAPLING = registerBlock("daphne_sapling",
            () -> new SaplingBlock(new DaphneTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                    .strength(5f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private ModBlocks () {}
}
