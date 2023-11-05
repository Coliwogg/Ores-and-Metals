package com.coliwogg.oresandmetals.worldgen;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_TIN_ORE = registerKey("tin_ore");
    public static final ResourceKey<BiomeModifier> ADD_MITHRIL_ORE = registerKey("mithril_ore");
    public static final ResourceKey<BiomeModifier> ADD_ADAMANTITE_ORE = registerKey("adamantite_ore");
    public static final ResourceKey<BiomeModifier> ADD_RUNITE_ORE = registerKey("runite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NETHER_DRAKOLITH_ORE = registerKey("nether_drakolith_ore");
    public static final ResourceKey<BiomeModifier> ADD_ORICHALCITE_DEBRIS_LARGE = registerKey("orichalcite_debris_large");
    public static final ResourceKey<BiomeModifier> ADD_ORICHALCITE_DEBRIS_SMALL = registerKey("orichalcite_debris_small");
    public static final ResourceKey<BiomeModifier> ADD_END_PHASMATITE_ORE = registerKey("end_phasmatite_ore");
    public static final ResourceKey<BiomeModifier> ADD_NECRITE_DEBRIS_LARGE = registerKey("necrite_debris_large");
    public static final ResourceKey<BiomeModifier> ADD_NECRITE_DEBRIS_SMALL = registerKey("necrite_debris_small");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_TIN_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.TIN_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_MITHRIL_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.MITHRIL_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ADAMANTITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ADAMANTITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_RUNITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.RUNITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NETHER_DRAKOLITH_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NETHER_DRAKOLITH_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_ORICHALCITE_DEBRIS_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_ORICHALCITE_DEBRIS_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_END_PHASMATITE_ORE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.END_PHASMATITE_ORE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_NECRITE_DEBRIS_LARGE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NECRITE_DEBRIS_LARGE_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));

        context.register(ADD_NECRITE_DEBRIS_SMALL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.NECRITE_DEBRIS_SMALL_PLACED_KEY)),
                GenerationStep.Decoration.UNDERGROUND_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(OresAndMetals.MOD_ID, name));
    }
}
