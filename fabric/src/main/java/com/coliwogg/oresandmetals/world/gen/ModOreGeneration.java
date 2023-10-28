package com.coliwogg.oresandmetals.world.gen;

import com.coliwogg.oresandmetals.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MITHRIL_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ADAMANTITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RUNITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.NETHER_DRAKOLITH_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.END_PHASMATITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.NECRITE_DEBRIS_LARGE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.NECRITE_DEBRIS_SMALL_PLACED_KEY);
    }
}
