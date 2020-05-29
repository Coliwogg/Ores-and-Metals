package com.coliwogg.oresandmetals.world.gen;

import java.util.Random;

import com.coliwogg.oresandmetals.config.OreGenConfig;
import com.coliwogg.oresandmetals.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.ReplaceBlockConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.ModDimension;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {

    private static final CountRangeConfig COPPER = new CountRangeConfig(OreGenConfig.copper_chance.get(), OreGenConfig.copper_min_height.get(), 0, OreGenConfig.copper_max_height.get());
    private static final CountRangeConfig TIN = new CountRangeConfig(OreGenConfig.tin_chance.get(), OreGenConfig.tin_min_height.get(), 0, OreGenConfig.tin_max_height.get());
    private static final CountRangeConfig MITHRIL = new CountRangeConfig(OreGenConfig.mithril_chance.get(), OreGenConfig.mithril_min_height.get(), 0, OreGenConfig.mithril_max_height.get());
    private static final CountRangeConfig ADAMANTITE = new CountRangeConfig(OreGenConfig.adamantite_chance.get(), OreGenConfig.adamantite_min_height.get(), 0, OreGenConfig.adamantite_max_height.get());
    private static final CountRangeConfig RUNITE = new CountRangeConfig(OreGenConfig.runite_chance.get(), OreGenConfig.runite_min_height.get(), 0, OreGenConfig.runite_max_height.get());


    private static final CountRangeConfig ORICHALCITE = new CountRangeConfig(OreGenConfig.orichalcite_chance.get(), OreGenConfig.orichalcite_min_height.get(), 0,  OreGenConfig.orichalcite_max_height.get());
    private static final CountRangeConfig DRAKOLITH = new CountRangeConfig(OreGenConfig.drakolith_chance.get(), OreGenConfig.drakolith_min_height.get(), 0, OreGenConfig.drakolith_max_height.get());
    private static final CountRangeConfig NECRITE = new CountRangeConfig(OreGenConfig.necrite_chance.get(), OreGenConfig.necrite_min_height.get(), 0, OreGenConfig.necrite_min_height.get());
    private static final CountRangeConfig PHASMATITE = new CountRangeConfig(OreGenConfig.phasmatite_chance.get(), OreGenConfig.phasmatite_min_height.get(), 0, OreGenConfig.phasmatite_max_height.get());
    private static final CountRangeConfig BANITE = new CountRangeConfig(OreGenConfig.banite_chance.get(), OreGenConfig.banite_min_height.get(), 0, OreGenConfig.banite_max_height.get());
    private static final CountRangeConfig LIGHT_ANIMICA = new CountRangeConfig(OreGenConfig.light_animica_chance.get(), OreGenConfig.light_animica_min_height.get(), 0, OreGenConfig.light_animica_max_height.get());
    private static final CountRangeConfig DARK_ANIMICA = new CountRangeConfig(OreGenConfig.dark_animica_chance.get(), OreGenConfig.dark_animica_min_height.get(), 0, OreGenConfig.dark_animica_max_height.get());


    static ConfiguredPlacement<CountRangeConfig> customConfig = null;

    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {

            if (OreGenConfig.generate_copper.get()) {
                customConfig = Placement.COUNT_RANGE.configure(COPPER);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.COPPER_ORE.get().getDefaultState(), OreGenConfig.copper_size.get()))
                        .withPlacement(customConfig));
            }

            if (OreGenConfig.generate_tin.get()) {
                customConfig = Placement.COUNT_RANGE.configure(TIN);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.get().getDefaultState(), OreGenConfig.tin_size.get()))
                        .withPlacement(customConfig));
            }

            if (OreGenConfig.generate_mithril.get()) {
                customConfig = Placement.COUNT_RANGE.configure(MITHRIL);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MITHRIL_ORE.get().getDefaultState(), OreGenConfig.mithril_size.get()))
                        .withPlacement(customConfig));
            }

            if (OreGenConfig.generate_adamantite.get()) {
                customConfig = Placement.COUNT_RANGE.configure(ADAMANTITE);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ADAMANTITE_ORE.get().getDefaultState(), OreGenConfig.adamantite_size.get()))
                        .withPlacement(customConfig));
            }

            if (OreGenConfig.generate_runite.get()) {
                customConfig = Placement.COUNT_RANGE.configure(RUNITE);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                        .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUNITE_ORE.get().getDefaultState(), OreGenConfig.runite_size.get()))
                        .withPlacement(customConfig));
            }

            if (OreGenConfig.generate_orichalcite.get()) {
                if (biome == Biomes.BADLANDS ||
                        biome == Biomes.BADLANDS_PLATEAU ||
                        biome == Biomes.ERODED_BADLANDS ||
                        biome == Biomes.MODIFIED_BADLANDS_PLATEAU ||
                        biome == Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU ||
                        biome == Biomes.WOODED_BADLANDS_PLATEAU) {
                    customConfig = Placement.COUNT_RANGE.configure(ORICHALCITE);
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ORICHALCITE_ORE.get().getDefaultState(), OreGenConfig.orichalcite_size.get()))
                            .withPlacement(customConfig));
                }
            }

            if (OreGenConfig.generate_drakolith.get()) {
                if (biome == Biomes.JUNGLE ||
                        biome == Biomes.JUNGLE_EDGE ||
                        biome == Biomes.JUNGLE_HILLS ||
                        biome == Biomes.BAMBOO_JUNGLE ||
                        biome == Biomes.MODIFIED_JUNGLE ||
                        biome == Biomes.BAMBOO_JUNGLE_HILLS ||
                        biome == Biomes.MODIFIED_JUNGLE_EDGE) {
                    customConfig = Placement.COUNT_RANGE.configure(DRAKOLITH);
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.DRAKOLITH_ORE.get().getDefaultState(), OreGenConfig.drakolith_size.get()))
                            .withPlacement(customConfig));
                }
            }

            if (OreGenConfig.generate_necrite.get()) {
                if (biome == Biomes.DESERT ||
                        biome == Biomes.DESERT_HILLS ||
                        biome == Biomes.DESERT_LAKES) {
                    customConfig = Placement.COUNT_RANGE.configure(NECRITE);
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.NECRITE_ORE.get().getDefaultState(), OreGenConfig.necrite_size.get()))
                            .withPlacement(customConfig));
                }
            }

            if (OreGenConfig.generate_phasmatite.get()) {
                if (biome == Biomes.SWAMP || biome == Biomes.SWAMP_HILLS) {
                    customConfig = Placement.COUNT_RANGE.configure(PHASMATITE);
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PHASMATITE_ORE.get().getDefaultState(), OreGenConfig.phasmatite_size.get()))
                            .withPlacement(customConfig));
                }
            }

            if (OreGenConfig.generate_banite.get()) {
                if (biome == Biomes.SNOWY_BEACH ||
                        biome == Biomes.SNOWY_MOUNTAINS ||
                        biome == Biomes.SNOWY_TAIGA ||
                        biome == Biomes.SNOWY_TAIGA_HILLS ||
                        biome == Biomes.SNOWY_TAIGA_MOUNTAINS ||
                        biome == Biomes.SNOWY_TUNDRA) {
                    customConfig = Placement.COUNT_RANGE.configure(BANITE);
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BANITE_ORE.get().getDefaultState(), OreGenConfig.banite_size.get()))
                            .withPlacement(customConfig));
                }
            }
        }
    }

    public static void generateNetherOre() {
        if (OreGenConfig.generate_dark_animica.get()) {
            customConfig = Placement.COUNT_RANGE.configure(DARK_ANIMICA);
            Biomes.NETHER.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.DARK_ANIMICA_ORE.get().getDefaultState(), OreGenConfig.dark_animica_size.get()))
                    .withPlacement(customConfig));
        }
    }

    public static void generateEndOre() {
        if (OreGenConfig.generate_light_animica.get()) {
            customConfig = Placement.COUNT_RANGE.configure(LIGHT_ANIMICA);
            Biomes.END_BARRENS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                    .withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlockInit.LIGHT_ANIMICA_ORE.get().getDefaultState()))
                    .withPlacement(customConfig));
            Biomes.END_HIGHLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                    .withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlockInit.LIGHT_ANIMICA_ORE.get().getDefaultState()))
                    .withPlacement(customConfig));
            Biomes.END_MIDLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                    .withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlockInit.LIGHT_ANIMICA_ORE.get().getDefaultState()))
                    .withPlacement(customConfig));
            Biomes.THE_END.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                    .withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlockInit.LIGHT_ANIMICA_ORE.get().getDefaultState()))
                    .withPlacement(customConfig));
            Biomes.SMALL_END_ISLANDS.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, Feature.EMERALD_ORE
                    .withConfiguration(new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), BlockInit.LIGHT_ANIMICA_ORE.get().getDefaultState()))
                    .withPlacement(customConfig));
        }
    }
}
