package com.coliwogg.oresandmetals.block;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block TIN_BLOCK = registerBlock("tin_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block MITHRIL_BLOCK = registerBlock("mithril_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block ADAMANTITE_BLOCK = registerBlock("adamantite_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block RUNITE_BLOCK = registerBlock("runite_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block ORIKALKUM_BLOCK = registerBlock("orikalkum_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.RED)));
    public static final Block NECRONIUM_BLOCK = registerBlock("necronium_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.GREEN)));
    public static final Block TIN_ORE = registerBlock("tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block MITHRIL_ORE = registerBlock("mithril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block ADAMANTITE_ORE = registerBlock("adamantite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block RUNITE_ORE = registerBlock("runite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_RUNITE_ORE = registerBlock("deepslate_runite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block NETHER_DRAKOLITH_ORE = registerBlock("nether_drakolith_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block ORICHALCITE_DEBRIS = registerBlock("orichalcite_debris", new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.RED)));
    public static final Block END_PHASMATITE_ORE = registerBlock("end_phasmatite_ore", new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));
    public static final Block NECRITE_DEBRIS = registerBlock("necrite_debris", new Block(FabricBlockSettings.copyOf(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.GREEN)));
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.WHITE)));
    public static final Block RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.BROWN)));
    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.GRAY)));
    public static final Block RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block RAW_RUNITE_BLOCK = registerBlock("raw_runite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Block RAW_DRAKOLITH_BLOCK = registerBlock("raw_drakolith_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.ORANGE)));
    public static final Block RAW_PHASMATITE_BLOCK = registerBlock("raw_phasmatite_block", new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.PALE_GREEN)));

    private static void addItemsToBuildingBlockItemGroup(FabricItemGroupEntries entries) {
        entries.add(TIN_BLOCK);
        entries.add(BRONZE_BLOCK);
        entries.add(STEEL_BLOCK);
        entries.add(MITHRIL_BLOCK);
        entries.add(ADAMANTITE_BLOCK);
        entries.add(RUNITE_BLOCK);
        entries.add(ORIKALKUM_BLOCK);
        entries.add(NECRONIUM_BLOCK);
    }

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_TIN_BLOCK);
        entries.add(RAW_BRONZE_BLOCK);
        entries.add(RAW_STEEL_BLOCK);
        entries.add(RAW_MITHRIL_BLOCK);
        entries.add(RAW_ADAMANTITE_BLOCK);
        entries.add(RAW_RUNITE_BLOCK);
        entries.add(RAW_DRAKOLITH_BLOCK);
        entries.add(RAW_PHASMATITE_BLOCK);
        entries.add(TIN_ORE);
        entries.add(DEEPSLATE_TIN_ORE);
        entries.add(MITHRIL_ORE);
        entries.add(DEEPSLATE_MITHRIL_ORE);
        entries.add(ADAMANTITE_ORE);
        entries.add(DEEPSLATE_ADAMANTITE_ORE);
        entries.add(RUNITE_ORE);
        entries.add(DEEPSLATE_RUNITE_ORE);
        entries.add(NETHER_DRAKOLITH_ORE);
        entries.add(ORICHALCITE_DEBRIS);
        entries.add(END_PHASMATITE_ORE);
        entries.add(NECRITE_DEBRIS);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OresAndMetals.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OresAndMetals.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        OresAndMetals.LOGGER.info("Registering ModBlocks for " + OresAndMetals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBuildingBlockItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModBlocks::addItemsToNaturalItemGroup);

    }
}
