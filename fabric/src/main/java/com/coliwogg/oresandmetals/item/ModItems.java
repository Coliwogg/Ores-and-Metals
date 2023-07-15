package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OresAndMetals.MOD_ID, name), item);
    }

    public static void registerModItems() {
        OresAndMetals.LOGGER.info("Registering ModItems for " + OresAndMetals.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
