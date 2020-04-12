package com.coliwogg.oresandmetals.world.gen;

import java.util.Random;

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
	
	private static final CountRangeConfig COPPER = new CountRangeConfig(15, 5, 0, 128);
	private static final CountRangeConfig TIN = new CountRangeConfig(15, 5, 0, 128);
	private static final CountRangeConfig MITHRIL = new CountRangeConfig(4, 5, 0, 28);
	private static final CountRangeConfig ADAMANTITE = new CountRangeConfig(3, 5, 0, 24);
	private static final CountRangeConfig RUNITE = new CountRangeConfig(2, 4, 0, 12);
	
	static ConfiguredPlacement<CountRangeConfig> customConfig = null;
	
	public static void generateOre() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			
			customConfig = Placement.COUNT_RANGE.configure(COPPER);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.COPPER_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 10, 15)))
					.withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(TIN);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
				  	.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.TIN_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 10, 15)))
					.withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(MITHRIL);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
				  	.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MITHRIL_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 5, 6)))
					.withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(ADAMANTITE);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
				  	.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.ADAMANTITE_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 4, 5)))
					.withPlacement(customConfig));
			
			customConfig = Placement.COUNT_RANGE.configure(RUNITE);
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
				  	.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.RUNITE_ORE.getDefaultState(), MathHelper.nextInt(new Random(), 3, 4)))
					.withPlacement(customConfig));
			
		}
	}
}
