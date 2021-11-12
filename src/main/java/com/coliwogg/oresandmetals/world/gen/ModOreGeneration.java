package com.coliwogg.oresandmetals.world.gen;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.Features;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OresAndMetals.MOD_ID)
public class ModOreGeneration {

    public static final RuleTest END_TEST = new BlockMatchTest(Blocks.END_STONE);

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
                    register(OreType.TIN.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_TIN_TARGET_LIST, OreType.TIN.getVeinSize()))
                            .rangeTriangle(VerticalAnchor.absolute(OreType.TIN.getMinHeight()), VerticalAnchor.absolute(OreType.TIN.getMaxHeight()))).squared().count(OreType.TIN.getOreCount());
            ConfiguredFeature<?, ?> ORE_MITHRIL =
                    register(OreType.MITHRIL.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_MITHRIL_TARGET_LIST, OreType.MITHRIL.getVeinSize()))
                            .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(OreType.MITHRIL.getMaxHeight()))).squared().count(OreType.MITHRIL.getOreCount());
            ConfiguredFeature<?, ?> ORE_ADAMANTITE =
                    register(OreType.ADAMANTITE.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_ADAMANTITE_TARGET_LIST, OreType.ADAMANTITE.getVeinSize()))
                            .rangeUniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(OreType.ADAMANTITE.getMaxHeight()))).squared().count(OreType.ADAMANTITE.getOreCount());
            ConfiguredFeature<?, ?> ORE_RUNITE =
                    register(OreType.RUNITE.getBlock().get(), Feature.ORE.configured(new OreConfiguration(ORE_RUNITE_TARGET_LIST, OreType.ADAMANTITE.getVeinSize()))
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

        if (event.getCategory().equals(Biome.BiomeCategory.NETHER)) {
            ConfiguredFeature<?, ?> ORE_DRAKOLITH_NETHER =
                    register(ModBlocks.NETHER_DRAKOLITH_ORE.get(), Feature.ORE.configured(
                                    new OreConfiguration(OreConfiguration.Predicates.NETHERRACK, ModBlocks.NETHER_DRAKOLITH_ORE.get().defaultBlockState(), 3))
                            .range(Features.Decorators.RANGE_10_10).squared());
            ConfiguredFeature<?, ?> ORE_DEBRIS_ORICHALCITE_LARGE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "ore_debris_orichalcite_large",
                    Feature.SCATTERED_ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES, ModBlocks.ORICHALCITE_DEBRIS.get().defaultBlockState(),
                            3, 1.0F)).rangeTriangle(VerticalAnchor.absolute(8), VerticalAnchor.absolute(24)).squared());
            ConfiguredFeature<?, ?> ORE_DEBRIS_ORICHALCITE_SMALL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "ore_debris_orichalcite_small",
                    Feature.SCATTERED_ORE.configured(new OreConfiguration(OreConfiguration.Predicates.NETHER_ORE_REPLACEABLES, ModBlocks.ORICHALCITE_DEBRIS.get().defaultBlockState(),
                            2, 1.0F)).range(Features.Decorators.RANGE_8_8).squared());

            generateOre(event.getGeneration(), ORE_DEBRIS_ORICHALCITE_LARGE);
            generateOre(event.getGeneration(), ORE_DEBRIS_ORICHALCITE_SMALL);
            generateOre(event.getGeneration(), ORE_DRAKOLITH_NETHER);
        }

        if (event.getCategory().equals(Biome.BiomeCategory.THEEND)) {
            ConfiguredFeature<?, ?> ORE_PHASMATITE_END =
                    register(ModBlocks.END_PHASMATITE_ORE.get(), Feature.ORE.configured(
                                    new OreConfiguration(END_TEST, ModBlocks.END_PHASMATITE_ORE.get().defaultBlockState(), 3))
                            .rangeUniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(65)).squared().count(5));

            ConfiguredFeature<?, ?> ORE_DEBRIS_NECRITE_LARGE = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "ore_debris_necrite_large",
                    Feature.SCATTERED_ORE.configured(new OreConfiguration(END_TEST, ModBlocks.NECRITE_DEBRIS.get().defaultBlockState(),3, 1.0F))
                            .rangeTriangle(VerticalAnchor.absolute(8), VerticalAnchor.absolute(48)).squared());
            ConfiguredFeature<?, ?> ORE_DEBRIS_NECRITE_SMALL = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, "ore_debris_necrite_small",
                    Feature.SCATTERED_ORE.configured(new OreConfiguration(END_TEST, ModBlocks.NECRITE_DEBRIS.get().defaultBlockState(),2, 1.0F))
                            .range(Features.Decorators.RANGE_8_8).squared());

            generateOre(event.getGeneration(), ORE_DEBRIS_NECRITE_LARGE);
            generateOre(event.getGeneration(), ORE_DEBRIS_NECRITE_SMALL);
            generateOre(event.getGeneration(), ORE_PHASMATITE_END);
        }
    }

    private static <FC extends FeatureConfiguration> ConfiguredFeature<?, ?> register(Block ore, ConfiguredFeature<FC, ?> pConfiguredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, ore.getRegistryName(), pConfiguredFeature);
    }

    public static void generateOre(BiomeGenerationSettings.Builder pBuilder, ConfiguredFeature<?, ?> ore) {
        pBuilder.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ore);
    }

}
