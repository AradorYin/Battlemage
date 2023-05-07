package net.aradoryin.battlemage.worldgen;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> DAPHNE_PLACED_KEY = createKey("daphne_placed");
    public static final ResourceKey<PlacedFeature> WIP_PLACED_KEY = createKey("wip_placed");
    public static final ResourceKey<PlacedFeature> AQUAMARINE_GEODE_PLACED_KEY = createKey("aquamarine_geode_placed");
    public static final ResourceKey<PlacedFeature> CITRINE_GEODE_PLACED_KEY = createKey("citrine_geode_placed");
    public static final ResourceKey<PlacedFeature> GARNET_GEODE_PLACED_KEY = createKey("garnet_geode_placed");
    public static final ResourceKey<PlacedFeature> OPAL_GEODE_PLACED_KEY = createKey("opal_geode_placed");
    public static final ResourceKey<PlacedFeature> PERIDOT_GEODE_PLACED_KEY = createKey("peridot_geode_placed");
    public static final ResourceKey<PlacedFeature> RUBY_GEODE_PLACED_KEY = createKey("ruby_geode_placed");
    public static final ResourceKey<PlacedFeature> SAPPHIRE_GEODE_PLACED_KEY = createKey("sapphire_geode_placed");
    public static final ResourceKey<PlacedFeature> TOPAZ_GEODE_PLACED_KEY = createKey("topaz_geode_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // GEODE
        register(context, AQUAMARINE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AQUAMARINE_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, CITRINE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CITRINE_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, GARNET_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GARNET_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, OPAL_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OPAL_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, PERIDOT_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOT_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, RUBY_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, SAPPHIRE_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        register(context, TOPAZ_GEODE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TOPAZ_GEODE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(50), InSquarePlacement.spread(),
                        HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(50)),
                        BiomeFilter.biome()));
        // TREES | PLANTS
        register(context, DAPHNE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DAPHNE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2), ModBlocks.DAPHNE_SAPLING.get()));

//        register(context, WIP_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_WIP_ORE_KEY),
//                ModOrePlacements.commonOrePlacement(16, // Veins per chunk
//                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80))));
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(Battlemage.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private ModPlacedFeatures () {}
}
