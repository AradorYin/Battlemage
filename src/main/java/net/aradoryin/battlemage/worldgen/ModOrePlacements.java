package net.aradoryin.battlemage.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModOrePlacements {
    public static List<PlacementModifier> orePlacement(PlacementModifier modifierA, PlacementModifier modifierB) {
        return List.of(modifierA, InSquarePlacement.spread(), modifierB, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int countPlacement, PlacementModifier modifier) {
        return orePlacement(CountPlacement.of(countPlacement), modifier);
    }

    public static List<PlacementModifier> rareOrePlacement(int countPlacement, PlacementModifier modifier) {
        return orePlacement(RarityFilter.onAverageOnceEvery(countPlacement), modifier);
    }
}
