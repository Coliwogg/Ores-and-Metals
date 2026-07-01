package com.coliwogg.oresandmetals.worldgen;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
    public static final ResourceKey<PlacedFeature> MITHRIL_ORE_PLACED_KEY = registerKey("mithril_ore_placed");
    public static final ResourceKey<PlacedFeature> ADAMANTITE_ORE_PLACED_KEY = registerKey("adamantite_ore_placed");
    public static final ResourceKey<PlacedFeature> RUNITE_ORE_PLACED_KEY = registerKey("runite_ore_placed");
    public static final ResourceKey<PlacedFeature> NETHER_DRAKOLITH_ORE_PLACED_KEY = registerKey("nether_drakolith_ore_placed");
    public static final ResourceKey<PlacedFeature> ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY = registerKey("orichalcite_debris_large_placed");
    public static final ResourceKey<PlacedFeature> ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY = registerKey("orichalcite_debris_small_placed");
    public static final ResourceKey<PlacedFeature> END_PHASMATITE_ORE_PLACED_KEY = registerKey("end_phasmatite_ore_placed");
    public static final ResourceKey<PlacedFeature> NECRITE_DEBRIS_LARGE_PLACED_KEY = registerKey("necrite_debris_large_placed");
    public static final ResourceKey<PlacedFeature> NECRITE_DEBRIS_SMALL_PLACED_KEY = registerKey("necrite_debris_small_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_TIN_ORE_KEY),
                ModOrePlacements.commonOrePlacement(16,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(112))));
        register(context, MITHRIL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_MITHRIL_ORE_KEY),
                ModOrePlacements.commonOrePlacement(10,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-24), VerticalAnchor.absolute(56))));
        register(context, ADAMANTITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_ADAMANTITE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(7,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(32))));
        register(context, RUNITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_RUNITE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(6,
                        HeightRangePlacement.triangle(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(0))));
        register(context, NETHER_DRAKOLITH_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_DRAKOLITH_ORE_KEY),
                ModOrePlacements.commonOrePlacement(4, PlacementUtils.RANGE_10_10));
        register(context, ORICHALCHITE_DEBRIS_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ORICHALCITE_DEBRIS_LARGE_KEY),
                ModOrePlacements.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, ORICHALCHITE_DEBRIS_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NETHER_ORICHALCITE_DEBRIS_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, END_PHASMATITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_PHASMATITE_ORE_KEY),
                ModOrePlacements.commonOrePlacement(6, PlacementUtils.RANGE_10_10));
        register(context, NECRITE_DEBRIS_LARGE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_NECRITE_DEBRIS_LARGE_KEY),
                ModOrePlacements.commonOrePlacement(2,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, NECRITE_DEBRIS_SMALL_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.END_NECRITE_DEBRIS_SMALL_KEY),
                ModOrePlacements.commonOrePlacement(3,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, OresAndMetals.identifier(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
