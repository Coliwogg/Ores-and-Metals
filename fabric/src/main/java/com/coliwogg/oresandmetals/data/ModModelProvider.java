package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BRONZE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MITHRIL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BRONZE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_STEEL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MITHRIL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RUNITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUNITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BRONZE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MITHRIL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ADAMANT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUNE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BRONZE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_BOOTS, Models.GENERATED);
    }
}
