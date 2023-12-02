package net.aradoryin.battlemage.worldgen;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;


public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> DAPHNE_KEY = registerKey("daphne_key");
//    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WIP_ORE_KEY = registerKey("wip_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AQUAMARINE_GEODE_KEY = registerKey("aquamarine_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CITRINE_GEODE_KEY = registerKey("citrine_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GARNET_GEODE_KEY = registerKey("garnet_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OPAL_GEODE_KEY = registerKey("opal_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PERIDOT_GEODE_KEY = registerKey("peridot_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUBY_GEODE_KEY = registerKey("ruby_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_GEODE_KEY = registerKey("sapphire_geode_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TOPAZ_GEODE_KEY = registerKey("topaz_geode_key");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
//        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
//        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
//        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
//        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

//        List<OreConfiguration.TargetBlockState> overworldWIPOres = List.of(
//                OreConfiguration.target(stoneReplaceables, ModBlocks.ORE_WIP.get().defaultBlockState()),
//                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ORE_WIP.get().defaultBlockState()));

        // GEODE
        register(context, AQUAMARINE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.AQUAMARINE_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_AQUAMARINE.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_AQUAMARINE_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_AQUAMARINE_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_AQUAMARINE_BUD.get().defaultBlockState(),
                        ModBlocks.AQUAMARINE_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, CITRINE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.CITRINE_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_CITRINE.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_CITRINE_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_CITRINE_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_CITRINE_BUD.get().defaultBlockState(),
                        ModBlocks.CITRINE_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, GARNET_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.GARNET_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_GARNET.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_GARNET_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_GARNET_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_GARNET_BUD.get().defaultBlockState(),
                        ModBlocks.GARNET_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, OPAL_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.OPAL_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_OPAL.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_OPAL_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_OPAL_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_OPAL_BUD.get().defaultBlockState(),
                        ModBlocks.OPAL_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, PERIDOT_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.PERIDOT_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_PERIDOT.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_PERIDOT_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_PERIDOT_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_PERIDOT_BUD.get().defaultBlockState(),
                        ModBlocks.PERIDOT_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, RUBY_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.RUBY_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_RUBY.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_RUBY_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_RUBY_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_RUBY_BUD.get().defaultBlockState(),
                        ModBlocks.RUBY_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, SAPPHIRE_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.SAPPHIRE_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_SAPPHIRE.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_SAPPHIRE_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_SAPPHIRE_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_SAPPHIRE_BUD.get().defaultBlockState(),
                        ModBlocks.SAPPHIRE_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));
        register(context, TOPAZ_GEODE_KEY, Feature.GEODE, new GeodeConfiguration(new GeodeBlockSettings(
                BlockStateProvider.simple(Blocks.AIR),
                BlockStateProvider.simple(ModBlocks.TOPAZ_BLOCK.get()),
                BlockStateProvider.simple(ModBlocks.BUDDING_TOPAZ.get()),
                BlockStateProvider.simple(Blocks.CALCITE),
                BlockStateProvider.simple(Blocks.SMOOTH_BASALT),
                List.of(ModBlocks.SMALL_TOPAZ_BUD.get().defaultBlockState(),
                        ModBlocks.MEDIUM_TOPAZ_BUD.get().defaultBlockState(),
                        ModBlocks.LARGE_TOPAZ_BUD.get().defaultBlockState(),
                        ModBlocks.TOPAZ_CLUSTER.get().defaultBlockState()),
                BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerSettings(1.7D, 2.2D, 3.2D, 4.2D),
                new GeodeCrackSettings(0.95D, 2.0D, 2), 0.35D, 0.083D, true,
                UniformInt.of(4, 6),
                UniformInt.of(3, 4),
                UniformInt.of(1, 2), -16, 16, 0.05D, 1));

        // TREES | PLANTS
        register(context, DAPHNE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DAPHNE_LOG.get()),
                new StraightTrunkPlacer(1, 0, 0), // Base Height, Rand Height A, Rand Height B
                BlockStateProvider.simple(ModBlocks.DAPHNE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 1), // Radius, Offset, Height
                new TwoLayersFeatureSize(3, 3, 2)).build()); // Limit, LowerSize, UpperSize

//        register(context, OVERWORLD_WIP_ORE_KEY, Feature.ORE, new OreConfiguration(overworldWIPOres, 16)); // VeinSize | Discard chance on air exposure
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Battlemage.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private ModConfiguredFeatures () {}
}
