package com.coliwogg.oresandmetals.world;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MITHRIL_ORE_KEY = registerKey("mithril_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ADAMANTITE_ORE_KEY = registerKey("adamantite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUNITE_ORE_KEY = registerKey("runite_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldTinOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.TIN_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_TIN_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldMithrilOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.MITHRIL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_MITHRIL_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldAdamantiteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.ADAMANTITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_ADAMANTITE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldRuniteOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUNITE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUNITE_ORE.getDefaultState()));

        register(context, TIN_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldTinOres, 10));
        register(context, MITHRIL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMithrilOres, 9));
        register(context, ADAMANTITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAdamantiteOres, 8));
        register(context, RUNITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRuniteOres, 4));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(OresAndMetals.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
