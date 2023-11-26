package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

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
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORIKALKUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NECRONIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_TIN_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_BRONZE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_STEEL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_MITHRIL_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_ADAMANTITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_RUNITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_DRAKOLITH_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RAW_PHASMATITE_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TIN_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MITHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MITHRIL_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ADAMANTITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_RUNITE_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.NETHER_DRAKOLITH_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.END_PHASMATITE_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.ORICHALCITE_DEBRIS, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.NECRITE_DEBRIS, TexturedModel.CUBE_COLUMN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_TIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_BRONZE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MITHRIL, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ADAMANTITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUNITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_DRAKOLITH, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PHASMATITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TIN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRONZE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANTITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORICHALCITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIKALKUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NECRITE_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.NECRONIUM_INGOT, Models.GENERATED);
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
        itemModelGenerator.register(ModItems.ORIKALKUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORIKALKUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NECRONIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NECRONIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NECRONIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NECRONIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NECRONIUM_HOE, Models.HANDHELD);
        itemModelGenerator.registerArmor((ArmorItem)  ModItems.BRONZE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.BRONZE_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.STEEL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MITHRIL_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MITHRIL_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MITHRIL_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.MITHRIL_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANT_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANT_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANT_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ADAMANT_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUNE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUNE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUNE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.RUNE_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ORIKALKUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ORIKALKUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ORIKALKUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.ORIKALKUM_BOOTS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NECRONIUM_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NECRONIUM_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NECRONIUM_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.NECRONIUM_BOOTS);
        itemModelGenerator.register(ModItems.BRONZE_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITHRIL_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.ADAMANT_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUNE_ARROW, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
    }
}
