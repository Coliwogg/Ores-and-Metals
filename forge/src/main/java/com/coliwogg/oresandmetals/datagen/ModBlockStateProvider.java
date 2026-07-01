package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.blocks.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Constants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.MITHRIL_BLOCK);
        blockWithItem(ModBlocks.ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.RUNITE_BLOCK);
        blockWithItem(ModBlocks.ORIKALKUM_BLOCK);
        blockWithItem(ModBlocks.NECRONIUM_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_BRONZE_BLOCK);
        blockWithItem(ModBlocks.RAW_STEEL_BLOCK);
        blockWithItem(ModBlocks.RAW_MITHRIL_BLOCK);
        blockWithItem(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockWithItem(ModBlocks.RAW_RUNITE_BLOCK);
        blockWithItem(ModBlocks.RAW_DRAKOLITH_BLOCK);
        blockWithItem(ModBlocks.RAW_PHASMATITE_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.MITHRIL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockWithItem(ModBlocks.ADAMANTITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockWithItem(ModBlocks.RUNITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_RUNITE_ORE);
        blockWithItem(ModBlocks.NETHER_DRAKOLITH_ORE);
        blockWithItem(ModBlocks.END_PHASMATITE_ORE);
        simpleBlock(ModBlocks.ORICHALCITE_DEBRIS.get(),
                models().cubeColumn(
                        "orichalcite_debris",
                        blockTexture(ModBlocks.ORICHALCITE_DEBRIS.get()).withSuffix("_side"),
                        blockTexture(ModBlocks.ORICHALCITE_DEBRIS.get()).withSuffix("_top")
                ));
        simpleBlock(ModBlocks.NECRITE_DEBRIS.get(),
                models().cubeColumn(
                        "necrite_debris",
                        blockTexture(ModBlocks.NECRITE_DEBRIS.get()).withSuffix("_side"),
                        blockTexture(ModBlocks.NECRITE_DEBRIS.get()).withSuffix("_top")
                ));
        blockItem(ModBlocks.ORICHALCITE_DEBRIS);
        blockItem(ModBlocks.NECRITE_DEBRIS);
    }


    private void blockWithItem(Supplier<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(Supplier<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Constants.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
}
