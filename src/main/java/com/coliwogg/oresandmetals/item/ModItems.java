package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OresAndMetals.MOD_ID);

    public static final RegistryObject<Item> RAW_TIN;
    public static final RegistryObject<Item> RAW_BRONZE;
    public static final RegistryObject<Item> RAW_STEEL;
    public static final RegistryObject<Item> RAW_MITHRIL;
    public static final RegistryObject<Item> RAW_ADAMANTITE;
    public static final RegistryObject<Item> RAW_RUNITE;
    public static final RegistryObject<Item> MITHRIL_SCRAP;
    public static final RegistryObject<Item> ADAMANTITE_SCRAP;
    public static final RegistryObject<Item> RUNITE_SCRAP;
    public static final RegistryObject<Item> TIN_INGOT;
    public static final RegistryObject<Item> BRONZE_INGOT;
    public static final RegistryObject<Item> STEEL_INGOT;
    public static final RegistryObject<Item> MITHRIL_INGOT;
    public static final RegistryObject<Item> ADAMANTITE_INGOT;
    public static final RegistryObject<Item> RUNITE_INGOT;
    public static final RegistryObject<Item> BRONZE_SWORD;
    public static final RegistryObject<Item> BRONZE_SHOVEL;
    public static final RegistryObject<Item> BRONZE_PICKAXE;
    public static final RegistryObject<Item> BRONZE_AXE;
    public static final RegistryObject<Item> BRONZE_HOE;
    public static final RegistryObject<Item> STEEL_SWORD;
    public static final RegistryObject<Item> STEEL_SHOVEL;
    public static final RegistryObject<Item> STEEL_PICKAXE;
    public static final RegistryObject<Item> STEEL_AXE;
    public static final RegistryObject<Item> STEEL_HOE;
    public static final RegistryObject<Item> MITHRIL_SWORD;
    public static final RegistryObject<Item> MITHRIL_SHOVEL;
    public static final RegistryObject<Item> MITHRIL_PICKAXE;
    public static final RegistryObject<Item> MITHRIL_AXE;
    public static final RegistryObject<Item> MITHRIL_HOE;
    public static final RegistryObject<Item> ADAMANT_SWORD;
    public static final RegistryObject<Item> ADAMANT_SHOVEL;
    public static final RegistryObject<Item> ADAMANT_PICKAXE;
    public static final RegistryObject<Item> ADAMANT_AXE;
    public static final RegistryObject<Item> ADAMANT_HOE;
    public static final RegistryObject<Item> RUNE_SWORD;
    public static final RegistryObject<Item> RUNE_SHOVEL;
    public static final RegistryObject<Item> RUNE_PICKAXE;
    public static final RegistryObject<Item> RUNE_AXE;
    public static final RegistryObject<Item> RUNE_HOE;
    public static final RegistryObject<Item> BRONZE_HELMET;
    public static final RegistryObject<Item> BRONZE_CHESTPLATE;
    public static final RegistryObject<Item> BRONZE_LEGGINGS;
    public static final RegistryObject<Item> BRONZE_BOOTS;
    public static final RegistryObject<Item> STEEL_HELMET;
    public static final RegistryObject<Item> STEEL_CHESTPLATE;
    public static final RegistryObject<Item> STEEL_LEGGINGS;
    public static final RegistryObject<Item> STEEL_BOOTS;
    public static final RegistryObject<Item> MITHRIL_HELMET;
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE;
    public static final RegistryObject<Item> MITHRIL_LEGGINGS;
    public static final RegistryObject<Item> MITHRIL_BOOTS;
    public static final RegistryObject<Item> ADAMANT_HELMET;
    public static final RegistryObject<Item> ADAMANT_CHESTPLATE;
    public static final RegistryObject<Item> ADAMANT_LEGGINGS;
    public static final RegistryObject<Item> ADAMANT_BOOTS;
    public static final RegistryObject<Item> RUNE_HELMET;
    public static final RegistryObject<Item> RUNE_CHESTPLATE;
    public static final RegistryObject<Item> RUNE_LEGGINGS;
    public static final RegistryObject<Item> RUNE_BOOTS;

    static {
        RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RAW_BRONZE = ITEMS.register("raw_bronze", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RAW_STEEL = ITEMS.register("raw_steel", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RAW_MITHRIL = ITEMS.register("raw_mithril", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RAW_ADAMANTITE = ITEMS.register("raw_adamantite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RAW_RUNITE = ITEMS.register("raw_runite", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_SCRAP = ITEMS.register("mithril_scrap", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANTITE_SCRAP = ITEMS.register("adamantite_scrap", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNITE_SCRAP = ITEMS.register("runite_scrap", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNITE_INGOT = ITEMS.register("runite_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModItemTier.BRONZE, 2, -2.4F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModItemTier.BRONZE, 0.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModItemTier.BRONZE, 0, -2.8F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModItemTier.BRONZE, 6.0F, -3.2F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModItemTier.BRONZE, -2, -2.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 2, -2.4F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 6.0F, -3.1F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, -2, -1.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModItemTier.MITHRIL, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModItemTier.MITHRIL, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModItemTier.MITHRIL, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModItemTier.MITHRIL, 6.0F, -3.1F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModItemTier.MITHRIL, -2, -1.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_SWORD = ITEMS.register("adamant_sword", () -> new SwordItem(ModItemTier.ADAMANT, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_SHOVEL = ITEMS.register("adamant_shovel", () -> new ShovelItem(ModItemTier.ADAMANT, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe", () -> new PickaxeItem(ModItemTier.ADAMANT, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_AXE = ITEMS.register("adamant_axe", () -> new AxeItem(ModItemTier.ADAMANT, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_HOE = ITEMS.register("adamant_hoe", () -> new HoeItem(ModItemTier.ADAMANT, -3, 0.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_SWORD = ITEMS.register("rune_sword", () -> new SwordItem(ModItemTier.RUNE, 3, -2.4F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_SHOVEL = ITEMS.register("rune_shovel", () -> new ShovelItem(ModItemTier.RUNE, 1.5F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_PICKAXE = ITEMS.register("rune_pickaxe", () -> new PickaxeItem(ModItemTier.RUNE, 1, -2.8F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_AXE = ITEMS.register("rune_axe", () -> new AxeItem(ModItemTier.RUNE, 5.0F, -3.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_HOE = ITEMS.register("rune_hoe", () -> new HoeItem(ModItemTier.RUNE, -4, 0.0F, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_HELMET = ITEMS.register("adamant_helmet", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_CHESTPLATE = ITEMS.register("adamant_chestplate", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_LEGGINGS = ITEMS.register("adamant_leggings", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        ADAMANT_BOOTS = ITEMS.register("adamant_boots", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_HELMET = ITEMS.register("rune_helmet", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_CHESTPLATE = ITEMS.register("rune_chestplate", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_LEGGINGS = ITEMS.register("rune_leggings", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.TAB)));
        RUNE_BOOTS = ITEMS.register("rune_boots", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.TAB)));

    }


    //   public static final Item IRON_HELMET = registerItem("iron_helmet", new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item IRON_CHESTPLATE = registerItem("iron_chestplate", new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item IRON_LEGGINGS = registerItem("iron_leggings", new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item IRON_BOOTS = registerItem("iron_boots", new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //
    //   public static final Item DIAMOND_HELMET = registerItem("diamond_helmet", new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item DIAMOND_CHESTPLATE = registerItem("diamond_chestplate", new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item DIAMOND_LEGGINGS = registerItem("diamond_leggings", new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item DIAMOND_BOOTS = registerItem("diamond_boots", new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //
    //   public static final Item GOLDEN_HELMET = registerItem("golden_helmet", new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item GOLDEN_CHESTPLATE = registerItem("golden_chestplate", new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item GOLDEN_LEGGINGS = registerItem("golden_leggings", new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //   public static final Item GOLDEN_BOOTS = registerItem("golden_boots", new ArmorItem(ArmorMaterials.GOLD, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT)));
    //
    //   public static final Item NETHERITE_HELMET = registerItem("netherite_helmet", new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    //   public static final Item NETHERITE_CHESTPLATE = registerItem("netherite_chestplate", new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    //   public static final Item NETHERITE_LEGGINGS = registerItem("netherite_leggings", new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    //   public static final Item NETHERITE_BOOTS = registerItem("netherite_boots", new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, (new Item.Properties()).tab(CreativeModeTab.TAB_COMBAT).fireResistant()));
    //

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}