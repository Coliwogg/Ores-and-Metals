package com.coliwogg.oresandmetals.world.gen;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OresAndMetals.MOD_ID)
public class ModOreGeneration {
    @SubscribeEvent
    public static void generateOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.BiomeCategory.NETHER) || event.getCategory().equals(Biome.BiomeCategory.THEEND))) {

            ImmutableList<OreConfiguration.TargetBlockState> ORE_TIN_TARGET_LIST = ImmutableList.of(
                    OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, OreType.TIN.getBlock().get().defaultBlockState()),
                    OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, OreType.TIN.getDeepslateBlock().get().defaultBlockState()));
            ImmutableList<OreConfiguration.TargetBlockState> ORE_MITHRIL_TARGET_LIST = ImmutableList.of(
                    OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, OreType.MITHRIL.getBlock().get().defaultBlockState()),
                    OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, OreType.MITHRIL.getDeepslateBlock().get().defaultBlockState()));
            ImmutableList<OreConfiguration.TargetBlockState> ORE_ADAMANTITE_TARGET_LIST = ImmutableList.of(
                    OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, OreType.ADAMANTITE.getBlock().get().defaultBlockState()),
                    OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, OreType.ADAMANTITE.getDeepslateBlock().get().defaultBlockState()));
            ImmutableList<OreConfiguration.TargetBlockState> ORE_RUNITE_TARGET_LIST = ImmutableList.of(
                    OreConfiguration.target(OreConfiguration.Predicates.STONE_ORE_REPLACEABLES, OreType.RUNITE.getBlock().get().defaultBlockState()),
                    OreConfiguration.target(OreConfiguration.Predicates.DEEPSLATE_ORE_REPLACEABLES, OreType.RUNITE.getDeepslateBlock().get().defaultBlockState()));

            ConfiguredFeature<?, ?> ORE_TIN =
                    register(OreType.TIN.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_TIN_TARGET_LIST, 10))
                            .rangeTriangle(VerticalAnchor.absolute(OreType.TIN.getMinHeight()), VerticalAnchor.absolute(OreType.TIN.getMaxHeight()))).squared().count(OreType.TIN.getVeinSize());
            ConfiguredFeature<?, ?> ORE_MITHRIL =
                    register(OreType.MITHRIL.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_MITHRIL_TARGET_LIST, 9))
                            .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(OreType.MITHRIL.getMaxHeight()))).squared().count(OreType.MITHRIL.getVeinSize());
            ConfiguredFeature<?, ?> ORE_ADAMANTITE =
                    register(OreType.ADAMANTITE.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_ADAMANTITE_TARGET_LIST, 8))
                            .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(OreType.ADAMANTITE.getMaxHeight()))).squared().count(OreType.ADAMANTITE.getVeinSize());
            ConfiguredFeature<?, ?> ORE_RUNITE =
                    register(OreType.RUNITE.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_RUNITE_TARGET_LIST, 7))
                            .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(OreType.RUNITE.getMaxHeight()))).squared();

            if (OreType.TIN.getGenerateOreToggle()) {
                generateOre(event.getGeneration(), ORE_TIN);
            }
            if (OreType.MITHRIL.getGenerateOreToggle()) {
                generateOre(event.getGeneration(), ORE_MITHRIL);
            }
            if (OreType.ADAMANTITE.getGenerateOreToggle()) {
                generateOre(event.getGeneration(), ORE_ADAMANTITE);
            }
            if (OreType.RUNITE.getGenerateOreToggle()) {
                generateOre(event.getGeneration(), ORE_RUNITE);
            }
        }

    }

    private static <FC extends FeatureConfiguration> ConfiguredFeature<?, ?> register(Block ore, ConfiguredFeature<FC, ?> pConfiguredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getRegistryName(), pConfiguredFeature);
    }

    public static void generateOre(BiomeGenerationSettings.Builder pBuilder, ConfiguredFeature<?, ?> ore) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ore);
    }
}
