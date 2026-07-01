package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.blocks.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;
import net.minecraft.world.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.TIN_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.BRONZE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.STEEL_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.MITHRIL_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.ADAMANTITE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RUNITE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.ORIKALKUM_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.NECRONIUM_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_TIN_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_BRONZE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_STEEL_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_MITHRIL_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_RUNITE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_DRAKOLITH_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RAW_PHASMATITE_BLOCK.get());
        blockModelGenerators.createTrivialCube(ModBlocks.TIN_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_TIN_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.MITHRIL_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.ADAMANTITE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.RUNITE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.DEEPSLATE_RUNITE_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.NETHER_DRAKOLITH_ORE.get());
        blockModelGenerators.createTrivialCube(ModBlocks.END_PHASMATITE_ORE.get());
        blockModelGenerators.createTrivialBlock(ModBlocks.ORICHALCITE_DEBRIS.get(), TexturedModel.COLUMN);
        blockModelGenerators.createTrivialBlock(ModBlocks.NECRITE_DEBRIS.get(), TexturedModel.COLUMN);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.RAW_TIN.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_BRONZE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_STEEL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_MITHRIL.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_ADAMANTITE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_RUNITE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_DRAKOLITH.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RAW_PHASMATITE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.TIN_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANTITE_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANTITE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNITE_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNITE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORICHALCITE_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRITE_SCRAP.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.BRONZE_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.BRONZE_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.BRONZE_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.BRONZE_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.STEEL_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.STEEL_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.STEEL_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.STEEL_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.MITHRIL_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.MITHRIL_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.MITHRIL_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.MITHRIL_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ADAMANT_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ADAMANT_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ADAMANT_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ADAMANT_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUNE_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUNE_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUNE_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.RUNE_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ORIKALKUM_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ORIKALKUM_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ORIKALKUM_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.ORIKALKUM_BOOTS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.NECRONIUM_HELMET.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.NECRONIUM_CHESTPLATE.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.NECRONIUM_LEGGINGS.get());
        itemModelGenerators.generateArmorTrims((ArmorItem) ModItems.NECRONIUM_BOOTS.get());
        itemModelGenerators.generateFlatItem(ModItems.BRONZE_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.IRON_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.STEEL_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.MITHRIL_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ADAMANT_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.RUNE_ARROW.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);
    }
}
