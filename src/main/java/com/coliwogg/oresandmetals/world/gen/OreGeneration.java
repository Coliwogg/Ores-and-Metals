package com.coliwogg.oresandmetals.world.gen;

import java.util.Random;

import com.coliwogg.oresandmetals.config.OreGenConfig;
import com.coliwogg.oresandmetals.init.BlockInit;

import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
	
	private static final CountRangeConfig COPPER = new CountRangeConfig(OreGenConfig.copper_chance.get(), 5, 0, 128);
	private static final CountRangeConfig TIN = new CountRangeConfig(OreGenConfig.tin_chance.get(), 5, 0, 128);
	private static final CountRangeConfig MITHRIL = new CountRangeConfig(OreGenConfig.mithril_chance.get(), 5, 0, 28);
	private static final CountRangeConfig ADAMANTITE = new CountRangeConfig(OreGenConfig.adamantite_chance.get(), 5, 0, 24);
	private static final CountRangeConfig RUNITE = new CountRangeConfig(OreGenConfig.runite_chance.get(), 4, 0, 12);
	
	static ConfiguredPlacement<CountRangeConfig> customConfig = null;
	
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {

			if(OreGenConfig.generate_copper.get()) {
				customConfig = Placement.COUNT_RANGE.configure(COPPER);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.COPPER_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 10, 15)))
						.withPlacement(customConfig));
			}

			if(OreGenConfig.generate_tin.get()) {
				customConfig = Placement.COUNT_RANGE.configure(TIN);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 10, 15)))
						.withPlacement(customConfig));
			}

			if(OreGenConfig.generate_mithril.get()) {
				customConfig = Placement.COUNT_RANGE.configure(MITHRIL);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MITHRIL_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 5, 6)))
						.withPlacement(customConfig));
			}

			if(OreGenConfig.generate_adamantite.get()) {
				customConfig = Placement.COUNT_RANGE.configure(ADAMANTITE);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ADAMANTITE_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 4, 5)))
						.withPlacement(customConfig));
			}

			if(OreGenConfig.generate_runite.get()) {
				customConfig = Placement.COUNT_RANGE.configure(RUNITE);
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
						.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUNITE_ORE.get().getDefaultState(), MathHelper.nextInt(new Random(), 3, 4)))
						.withPlacement(customConfig));
			}
		}
	}
}
