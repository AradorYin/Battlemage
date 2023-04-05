package net.aradoryin.battlemage.block;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.custom.block.*;
import net.aradoryin.battlemage.block.custom.buddingblock.*;
import net.aradoryin.battlemage.block.custom.ModFlammableRotatedPillarBlock;
import net.aradoryin.battlemage.block.custom.cluster.*;
import net.aradoryin.battlemage.item.ModItems;
import net.aradoryin.battlemage.worldgen.tree.DaphneTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Battlemage.MOD_ID);

    // WIP BLOCKS | ORES
    public static final RegistryObject<Block> BLOCK_WIP = registerBlock("block_wip",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_WIP = registerBlock("ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_WIP = registerBlock("deepslate_ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    // TODO Update the Geodes into Clusters and convert the Ores into Geode Nodes for the Clusters
    // TODO BLOCK_x -> Crafted from SHARD_xX4 -> Mining full-grown Clusters -> Cluster | Small Bud | Medium Bud | Large Bud
    // CLUSTERS
    public static final RegistryObject<Block> AQUAMARINE_CLUSTER = registerBlock("aquamarine_cluster",
            () -> new AquamarineClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> CITRINE_CLUSTER = registerBlock("citrine_cluster",
            () -> new CitrineClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> GARNET_CLUSTER = registerBlock("garnet_cluster",
            () -> new GarnetClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> OPAL_CLUSTER = registerBlock("opal_cluster",
            () -> new OpalClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> PERIDOT_CLUSTER = registerBlock("peridot_cluster",
            () -> new PeridotClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> RUBY_CLUSTER = registerBlock("ruby_cluster",
            () -> new RubyClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> SAPPHIRE_CLUSTER = registerBlock("sapphire_cluster",
            () -> new SapphireClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> TOPAZ_CLUSTER = registerBlock("topaz_cluster",
            () -> new TopazClusterBlock(7, 3, BlockBehaviour.Properties.of(Material.AMETHYST).noOcclusion().randomTicks()
                    .sound(SoundType.AMETHYST_CLUSTER).lightLevel((LightLevel) -> { return 5; })));
    public static final RegistryObject<Block> LARGE_AQUAMARINE_BUD = registerBlock("large_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_CITRINE_BUD = registerBlock("large_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_GARNET_BUD = registerBlock("large_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_OPAL_BUD = registerBlock("large_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_PERIDOT_BUD = registerBlock("large_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_RUBY_BUD = registerBlock("large_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_SAPPHIRE_BUD = registerBlock("large_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> LARGE_TOPAZ_BUD = registerBlock("large_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.LARGE_AMETHYST_BUD)
                    .sound(SoundType.LARGE_AMETHYST_BUD).lightLevel((LightLevel) -> { return 4; })));
    public static final RegistryObject<Block> MEDIUM_AQUAMARINE_BUD = registerBlock("medium_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_CITRINE_BUD = registerBlock("medium_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_GARNET_BUD = registerBlock("medium_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_OPAL_BUD = registerBlock("medium_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_PERIDOT_BUD = registerBlock("medium_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_RUBY_BUD = registerBlock("medium_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_SAPPHIRE_BUD = registerBlock("medium_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> MEDIUM_TOPAZ_BUD = registerBlock("medium_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.MEDIUM_AMETHYST_BUD)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((LightLevel) -> { return 2; })));
    public static final RegistryObject<Block> SMALL_AQUAMARINE_BUD = registerBlock("small_aquamarine_bud",
            () -> new AquamarineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_CITRINE_BUD = registerBlock("small_citrine_bud",
            () -> new CitrineClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_GARNET_BUD = registerBlock("small_garnet_bud",
            () -> new GarnetClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_OPAL_BUD = registerBlock("small_opal_bud",
            () -> new OpalClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_PERIDOT_BUD = registerBlock("small_peridot_bud",
            () -> new PeridotClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_RUBY_BUD = registerBlock("small_ruby_bud",
            () -> new RubyClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_SAPPHIRE_BUD = registerBlock("small_sapphire_bud",
            () -> new SapphireClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    public static final RegistryObject<Block> SMALL_TOPAZ_BUD = registerBlock("small_topaz_bud",
            () -> new TopazClusterBlock(3, 4, BlockBehaviour.Properties.copy(Blocks.SMALL_AMETHYST_BUD)
                    .sound(SoundType.SMALL_AMETHYST_BUD).lightLevel((LightLevel) -> { return 1; })));
    // BLOCKS
    public static final RegistryObject<Block> BUDDING_AQUAMARINE = registerBlock("budding_aquamarine",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_CITRINE = registerBlock("budding_citrine",
            () -> new BuddingCitrineBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_GARNET = registerBlock("budding_garnet",
            () -> new BuddingGarnetBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_OPAL = registerBlock("budding_opal",
            () -> new BuddingOpalBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_PERIDOT = registerBlock("budding_peridot",
            () -> new BuddingPeridotBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_RUBY = registerBlock("budding_ruby",
            () -> new BuddingRubyBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_SAPPHIRE = registerBlock("budding_sapphire",
            () -> new BuddingSapphireBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUDDING_TOPAZ = registerBlock("budding_topaz",
            () -> new BuddingTopazBlock(BlockBehaviour.Properties.of(Material.AMETHYST)
                    .randomTicks()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> AQUAMARINE_BLOCK = registerBlock("aquamarine_block",
            () -> new AquamarineBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_CYAN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CITRINE_BLOCK = registerBlock("citrine_block",
            () -> new CitrineBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_ORANGE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GARNET_BLOCK = registerBlock("garnet_block",
            () -> new GarnetBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_MAGENTA)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OPAL_BLOCK = registerBlock("opal_block",
            () -> new OpalBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_BLUE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
            () -> new PeridotBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_LIGHT_GREEN)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new RubyBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_RED)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new SapphireBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_BLUE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new TopazBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_YELLOW)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()));
    // ORES

    // LOG | WOOD | PLANKS | LEAVES | SAPLING
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
}
