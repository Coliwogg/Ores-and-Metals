package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OresAndMetals.MOD_ID);

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ADAMANTITE = ITEMS.register("raw_adamantite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUNITE = ITEMS.register("raw_runite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNITE_INGOT = ITEMS.register("runite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SCRAP = ITEMS.register("mithril_scrap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ADAMANTITE_SCRAP = ITEMS.register("adamantite_scrap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNITE_SCRAP = ITEMS.register("runite_scrap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModTiers.BRONZE, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModTiers.BRONZE, 0.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModTiers.BRONZE, 0, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModTiers.BRONZE, 6.0f, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModTiers.BRONZE, 0, -2.0f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModTiers.STEEL, 2, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModTiers.STEEL, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModTiers.STEEL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModTiers.STEEL, 6.0f, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModTiers.STEEL, -2, -1.0f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModTiers.MITHRIL, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModTiers.MITHRIL, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModTiers.MITHRIL, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModTiers.MITHRIL, 6.0f, -3.1f, new Item.Properties()));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModTiers.MITHRIL, -2, -1.0f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_SWORD = ITEMS.register("adamant_sword", () -> new SwordItem(ModTiers.ADAMANT, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_SHOVEL = ITEMS.register("adamant_shovel", () -> new ShovelItem(ModTiers.ADAMANT, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe", () -> new PickaxeItem(ModTiers.ADAMANT, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_AXE = ITEMS.register("adamant_axe", () -> new AxeItem(ModTiers.ADAMANT, 5.0f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> ADAMANT_HOE = ITEMS.register("adamant_hoe", () -> new HoeItem(ModTiers.ADAMANT, -3, 0.0f, new Item.Properties()));
    public static final RegistryObject<Item> RUNE_SWORD = ITEMS.register("rune_sword", () -> new SwordItem(ModTiers.RUNE, 3, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> RUNE_SHOVEL = ITEMS.register("rune_shovel", () -> new ShovelItem(ModTiers.RUNE, 1.5f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> RUNE_PICKAXE = ITEMS.register("rune_pickaxe", () -> new PickaxeItem(ModTiers.RUNE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> RUNE_AXE = ITEMS.register("rune_axe", () -> new AxeItem(ModTiers.RUNE, 5.0f, -3.0f, new Item.Properties()));
    public static final RegistryObject<Item> RUNE_HOE = ITEMS.register("rune_hoe", () -> new HoeItem(ModTiers.RUNE, -4, 0.0f, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
