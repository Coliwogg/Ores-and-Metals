package com.coliwogg.oresandmetals.worldgen;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ADAMANTITE_ORE_KEY = registerKey("adamantite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RUNITE_ORE_KEY = registerKey("runite_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldTinOres =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.TIN_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldMithrilOres =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.MITHRIL_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldAdamantiteOres =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.ADAMANTITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> overworldRuniteOres =
                List.of(OreConfiguration.target(stoneReplaceables, ModBlocks.RUNITE_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUNITE_ORE.get().defaultBlockState()));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(overworldTinOres, 10));
        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMithrilOres, 9));
        register(context, ADAMANTITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAdamantiteOres, 8));
        register(context, RUNITE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRuniteOres, 4));
    }
    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(OresAndMetals.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
