package com.coliwogg.oresandmetals.world;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final RegistryKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY = registerKey("mithril_ore_placed");
    public static final RegistryKey<PlacedFeature> ADAMANTITE_ORE_PLACED_KEY = registerKey("adamantite_ore_placed");
    public static final RegistryKey<PlacedFeature> RUNITE_ORE_PLACED_KEY = registerKey("runite_ore_placed");
    public static final RegistryKey<PlacedFeature> NETHER_DRAKOLITH_ORE_PLACED_KEY = registerKey("nether_drakolith_ore_placed");
    public static final RegistryKey<PlacedFeature> ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY = registerKey("orichalcite_debris_large_placed");
    public static final RegistryKey<PlacedFeature> ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY = registerKey("orichalcite_debris_small_placed");
    public static final RegistryKey<PlacedFeature> END_PHASMATITE_ORE_PLACED_KEY = registerKey("end_phasmatite_ore_placed");
    public static final RegistryKey<PlacedFeature> NECRITE_DEBRIS_LARGE_PLACED_KEY = registerKey("necrite_debris_large_placed");
    public static final RegistryKey<PlacedFeature> NECRITE_DEBRIS_SMALL_PLACED_KEY = registerKey("necrite_debris_small_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, TIN_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TIN_ORE_KEY),
                ModOrePlacement.modifiersWithCount(16,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));
        register(context, MITHRIL_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MITHRIL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-24), YOffset.fixed(56))));
        register(context, ADAMANTITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ADAMANTITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(7,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(32))));
        register(context, RUNITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUNITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));
        register(context, NETHER_DRAKOLITH_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NETHER_DRAKOLITH_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));
        register(context, ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORICHALCITE_DEBRIS_LARGE_KEY),
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(8), YOffset.fixed(24)), BiomePlacementModifier.of());
        register(context, ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ORICHALCITE_DEBRIS_SMALL_KEY),
                SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());
        register(context, END_PHASMATITE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.END_PHASMATITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6, PlacedFeatures.TEN_ABOVE_AND_BELOW_RANGE));
        register(context, NECRITE_DEBRIS_LARGE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NECRITE_DEBRIS_LARGE_KEY),
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(20), YOffset.fixed(64)), BiomePlacementModifier.of());
        register(context, NECRITE_DEBRIS_SMALL_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.NECRITE_DEBRIS_SMALL_KEY),
                SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(OresAndMetals.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
