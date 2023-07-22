package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.custom.ModAxeItem;
import com.coliwogg.oresandmetals.item.custom.ModHoeItem;
import com.coliwogg.oresandmetals.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()));
    public static final Item RAW_BRONZE = registerItem("raw_bronze", new Item(new FabricItemSettings()));
    public static final Item RAW_STEEL = registerItem("raw_steel", new Item(new FabricItemSettings()));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril", new Item(new FabricItemSettings()));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite", new Item(new FabricItemSettings()));
    public static final Item RAW_RUNITE = registerItem("raw_runite", new Item(new FabricItemSettings()));
    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_SCRAP = registerItem("mithril_scrap", new Item(new FabricItemSettings()));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot", new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_SCRAP = registerItem("adamantite_scrap", new Item(new FabricItemSettings()));
    public static final Item ADAMANTITE_INGOT = registerItem("adamantite_ingot", new Item(new FabricItemSettings()));
    public static final Item RUNITE_SCRAP = registerItem("runite_scrap", new Item(new FabricItemSettings()));
    public static final Item RUNITE_INGOT = registerItem("runite_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_SWORD = registerItem("bronze_sword", new SwordItem(ModToolMaterials.BRONZE, 2, -2.4f, new FabricItemSettings()));
    public static final Item BRONZE_SHOVEL = registerItem("bronze_shovel", new ShovelItem(ModToolMaterials.BRONZE, 0.5f, -3.0f, new FabricItemSettings()));
    public static final Item BRONZE_PICKAXE = registerItem("bronze_pickaxe", new ModPickaxeItem(ModToolMaterials.BRONZE, 0, -2.8f, new FabricItemSettings()));
    public static final Item BRONZE_AXE = registerItem("bronze_axe", new ModAxeItem(ModToolMaterials.BRONZE, 6.0f, -3.2f, new FabricItemSettings()));
    public static final Item BRONZE_HOE = registerItem("bronze_hoe", new ModHoeItem(ModToolMaterials.BRONZE, -2, -2.0f, new FabricItemSettings()));
    public static final Item STEEL_SWORD = registerItem("steel_sword", new SwordItem(ModToolMaterials.STEEL, 2, -2.4f, new FabricItemSettings()));
    public static final Item STEEL_SHOVEL = registerItem("steel_shovel", new ShovelItem(ModToolMaterials.STEEL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item STEEL_PICKAXE = registerItem("steel_pickaxe", new ModPickaxeItem(ModToolMaterials.STEEL, 1, -2.8f, new FabricItemSettings()));
    public static final Item STEEL_AXE = registerItem("steel_axe", new ModAxeItem(ModToolMaterials.STEEL, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item STEEL_HOE = registerItem("steel_hoe", new ModHoeItem(ModToolMaterials.STEEL, -2, -1.0f, new FabricItemSettings()));
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword", new SwordItem(ModToolMaterials.MITHRIL, 3, -2.4f, new FabricItemSettings()));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel", new ShovelItem(ModToolMaterials.MITHRIL, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe", new ModPickaxeItem(ModToolMaterials.MITHRIL, 1, -2.8f, new FabricItemSettings()));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe", new ModAxeItem(ModToolMaterials.MITHRIL, 6.0f, -3.1f, new FabricItemSettings()));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe", new ModHoeItem(ModToolMaterials.MITHRIL, -2, -1.0f, new FabricItemSettings()));
    public static final Item ADAMANT_SWORD = registerItem("adamant_sword", new SwordItem(ModToolMaterials.ADAMANT, 3, -2.4f, new FabricItemSettings()));
    public static final Item ADAMANT_SHOVEL = registerItem("adamant_shovel", new ShovelItem(ModToolMaterials.ADAMANT, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item ADAMANT_PICKAXE = registerItem("adamant_pickaxe", new ModPickaxeItem(ModToolMaterials.ADAMANT, 1, -2.8f, new FabricItemSettings()));
    public static final Item ADAMANT_AXE = registerItem("adamant_axe", new ModAxeItem(ModToolMaterials.ADAMANT, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item ADAMANT_HOE = registerItem("adamant_hoe", new ModHoeItem(ModToolMaterials.ADAMANT, -3, 0.0f, new FabricItemSettings()));
    public static final Item RUNE_SWORD = registerItem("rune_sword", new SwordItem(ModToolMaterials.RUNE, 3, -2.4f, new FabricItemSettings()));
    public static final Item RUNE_SHOVEL = registerItem("rune_shovel", new ShovelItem(ModToolMaterials.RUNE, 1.5f, -3.0f, new FabricItemSettings()));
    public static final Item RUNE_PICKAXE = registerItem("rune_pickaxe", new ModPickaxeItem(ModToolMaterials.RUNE, 1, -2.8f, new FabricItemSettings()));
    public static final Item RUNE_AXE = registerItem("rune_axe", new ModAxeItem(ModToolMaterials.RUNE, 5.0f, -3.0f, new FabricItemSettings()));
    public static final Item RUNE_HOE = registerItem("rune_hoe", new ModHoeItem(ModToolMaterials.RUNE, -4, -0.0f, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RAW_TIN);
        entries.add(RAW_BRONZE);
        entries.add(RAW_STEEL);
        entries.add(RAW_MITHRIL);
        entries.add(RAW_ADAMANTITE);
        entries.add(RAW_RUNITE);
        entries.add(TIN_INGOT);
        entries.add(BRONZE_INGOT);
        entries.add(STEEL_INGOT);
        entries.add(MITHRIL_INGOT);
        entries.add(ADAMANTITE_INGOT);
        entries.add(RUNITE_INGOT);
        entries.add(MITHRIL_SCRAP);
        entries.add(ADAMANTITE_SCRAP);
        entries.add(RUNITE_SCRAP);
    }

    private static void addItemsToToolTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BRONZE_SHOVEL);
        entries.add(BRONZE_HOE);
        entries.add(BRONZE_PICKAXE);
        entries.add(STEEL_SHOVEL);
        entries.add(STEEL_HOE);
        entries.add(STEEL_PICKAXE);
        entries.add(MITHRIL_SHOVEL);
        entries.add(MITHRIL_HOE);
        entries.add(MITHRIL_PICKAXE);
        entries.add(ADAMANT_SHOVEL);
        entries.add(ADAMANT_HOE);
        entries.add(ADAMANT_PICKAXE);
        entries.add(RUNE_SHOVEL);
        entries.add(RUNE_HOE);
        entries.add(RUNE_PICKAXE);
    }

    private static void addItemsToCombatTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(BRONZE_AXE);
        entries.add(BRONZE_SWORD);
        entries.add(STEEL_AXE);
        entries.add(STEEL_SWORD);
        entries.add(MITHRIL_AXE);
        entries.add(MITHRIL_SWORD);
        entries.add(ADAMANT_AXE);
        entries.add(ADAMANT_SWORD);
        entries.add(RUNE_AXE);
        entries.add(RUNE_SWORD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OresAndMetals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OresAndMetals.LOGGER.info("Registering ModItems for " + OresAndMetals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToCombatTabItemGroup);
    }
}
