package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import com.coliwogg.oresandmetals.item.custom.ModArrowItem;
import com.coliwogg.oresandmetals.item.custom.ModSmithingTemplateItem;
import com.coliwogg.oresandmetals.platform.Services;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

public class ModItems {

    public static final Supplier<Item> RAW_TIN = Services.REGISTRY.registerItem("raw_tin", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_BRONZE = Services.REGISTRY.registerItem("raw_bronze", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_STEEL = Services.REGISTRY.registerItem("raw_steel", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_MITHRIL = Services.REGISTRY.registerItem("raw_mithril", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_ADAMANTITE = Services.REGISTRY.registerItem("raw_adamantite", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_RUNITE = Services.REGISTRY.registerItem("raw_runite", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_DRAKOLITH = Services.REGISTRY.registerItem("raw_drakolith", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RAW_PHASMATITE = Services.REGISTRY.registerItem("raw_phasmatite", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> TIN_INGOT = Services.REGISTRY.registerItem("tin_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> BRONZE_INGOT = Services.REGISTRY.registerItem("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> STEEL_INGOT = Services.REGISTRY.registerItem("steel_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> MITHRIL_INGOT = Services.REGISTRY.registerItem("mithril_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ADAMANTITE_INGOT = Services.REGISTRY.registerItem("adamantite_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUNITE_INGOT = Services.REGISTRY.registerItem("runite_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ORIKALKUM_INGOT = Services.REGISTRY.registerItem("orikalkum_ingot", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NECRONIUM_INGOT = Services.REGISTRY.registerItem("necronium_ingot", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> MITHRIL_SCRAP = Services.REGISTRY.registerItem("mithril_scrap", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ADAMANTITE_SCRAP = Services.REGISTRY.registerItem("adamantite_scrap", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> RUNITE_SCRAP = Services.REGISTRY.registerItem("runite_scrap", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> ORICHALCITE_SCRAP = Services.REGISTRY.registerItem("orichalcite_scrap", () -> new Item(new Item.Properties()));
    public static final Supplier<Item> NECRITE_SCRAP = Services.REGISTRY.registerItem("necrite_scrap", () -> new Item(new Item.Properties()));

    public static final Supplier<Item> BRONZE_SWORD = Services.REGISTRY.registerItem("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 2, -2.4F))));
    public static final Supplier<Item> BRONZE_SHOVEL = Services.REGISTRY.registerItem("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 0.5F, -3.0F))));
    public static final Supplier<Item> BRONZE_PICKAXE = Services.REGISTRY.registerItem("bronze_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 0, -2.8F))));
    public static final Supplier<Item> BRONZE_AXE = Services.REGISTRY.registerItem("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6.0F, -3.2F))));
    public static final Supplier<Item> BRONZE_HOE = Services.REGISTRY.registerItem("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, -2, -2.0F))));

    public static final Supplier<Item> STEEL_SWORD = Services.REGISTRY.registerItem("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4F))));
    public static final Supplier<Item> STEEL_SHOVEL = Services.REGISTRY.registerItem("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5F, -3.0F))));
    public static final Supplier<Item> STEEL_PICKAXE = Services.REGISTRY.registerItem("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1, -2.8F))));
    public static final Supplier<Item> STEEL_AXE = Services.REGISTRY.registerItem("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 5.5F, -3.1F))));
    public static final Supplier<Item> STEEL_HOE = Services.REGISTRY.registerItem("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STEEL, -2, -1.0F))));

    public static final Supplier<Item> MITHRIL_SWORD = Services.REGISTRY.registerItem("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.MITHRIL, 3, -2.4F))));
    public static final Supplier<Item> MITHRIL_SHOVEL = Services.REGISTRY.registerItem("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.MITHRIL, 1.5F, -3.0F))));
    public static final Supplier<Item> MITHRIL_PICKAXE = Services.REGISTRY.registerItem("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.MITHRIL, 1, -2.8F))));
    public static final Supplier<Item> MITHRIL_AXE = Services.REGISTRY.registerItem("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.MITHRIL, 5.5F, -3.1F))));
    public static final Supplier<Item> MITHRIL_HOE = Services.REGISTRY.registerItem("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.MITHRIL, -2, -1.0F))));

    public static final Supplier<Item> ADAMANT_SWORD = Services.REGISTRY.registerItem("adamant_sword",
            () -> new SwordItem(ModToolTiers.ADAMANT,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ADAMANT, 3, -2.4F))));
    public static final Supplier<Item> ADAMANT_SHOVEL = Services.REGISTRY.registerItem("adamant_shovel",
            () -> new ShovelItem(ModToolTiers.ADAMANT,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ADAMANT, 1.5F, -3.0F))));
    public static final Supplier<Item> ADAMANT_PICKAXE = Services.REGISTRY.registerItem("adamant_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ADAMANT,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ADAMANT, 1, -2.8F))));
    public static final Supplier<Item> ADAMANT_AXE = Services.REGISTRY.registerItem("adamant_axe",
            () -> new AxeItem(ModToolTiers.ADAMANT,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ADAMANT, 5.0F, -3.0F))));
    public static final Supplier<Item> ADAMANT_HOE = Services.REGISTRY.registerItem("adamant_hoe",
            () -> new HoeItem(ModToolTiers.ADAMANT,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ADAMANT, -3, 0.0F))));

    public static final Supplier<Item> RUNE_SWORD = Services.REGISTRY.registerItem("rune_sword",
            () -> new SwordItem(ModToolTiers.RUNE,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.RUNE, 5, -2.4F))));
    public static final Supplier<Item> RUNE_SHOVEL = Services.REGISTRY.registerItem("rune_shovel",
            () -> new ShovelItem(ModToolTiers.RUNE,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.RUNE, 3.5F, -3.0F))));
    public static final Supplier<Item> RUNE_PICKAXE = Services.REGISTRY.registerItem("rune_pickaxe",
            () -> new PickaxeItem(ModToolTiers.RUNE,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.RUNE, 3, -2.8F))));
    public static final Supplier<Item> RUNE_AXE = Services.REGISTRY.registerItem("rune_axe",
            () -> new AxeItem(ModToolTiers.RUNE,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.RUNE, 6.0F, -3.0F))));
    public static final Supplier<Item> RUNE_HOE = Services.REGISTRY.registerItem("rune_hoe",
            () -> new HoeItem(ModToolTiers.RUNE,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.RUNE, -2, 0.0F))));

    public static final Supplier<Item> ORIKALKUM_SWORD = Services.REGISTRY.registerItem("orikalkum_sword",
            () -> new SwordItem(ModToolTiers.ORIKALKUM,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ORIKALKUM, 5, -2.4F))));
    public static final Supplier<Item> ORIKALKUM_SHOVEL = Services.REGISTRY.registerItem("orikalkum_shovel",
            () -> new ShovelItem(ModToolTiers.ORIKALKUM,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.ORIKALKUM, 3.5F, -3.0F))));
    public static final Supplier<Item> ORIKALKUM_PICKAXE = Services.REGISTRY.registerItem("orikalkum_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ORIKALKUM,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ORIKALKUM, 3, -2.8F))));
    public static final Supplier<Item> ORIKALKUM_AXE = Services.REGISTRY.registerItem("orikalkum_axe",
            () -> new AxeItem(ModToolTiers.ORIKALKUM,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.ORIKALKUM, 6.0F, -3.0F))));
    public static final Supplier<Item> ORIKALKUM_HOE = Services.REGISTRY.registerItem("orikalkum_hoe",
            () -> new HoeItem(ModToolTiers.ORIKALKUM,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.ORIKALKUM, -2, 0.0F))));

    public static final Supplier<Item> NECRONIUM_SWORD = Services.REGISTRY.registerItem("necronium_sword",
            () -> new SwordItem(ModToolTiers.NECRONIUM,
                    new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.NECRONIUM, 5, -2.4F))));
    public static final Supplier<Item> NECRONIUM_SHOVEL = Services.REGISTRY.registerItem("necronium_shovel",
            () -> new ShovelItem(ModToolTiers.NECRONIUM,
                    new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.NECRONIUM, 3.5F, -3.0F))));
    public static final Supplier<Item> NECRONIUM_PICKAXE = Services.REGISTRY.registerItem("necronium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NECRONIUM,
                    new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.NECRONIUM, 3, -2.8F))));
    public static final Supplier<Item> NECRONIUM_AXE = Services.REGISTRY.registerItem("necronium_axe",
            () -> new AxeItem(ModToolTiers.NECRONIUM,
                    new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.NECRONIUM, 6.0F, -3.0F))));
    public static final Supplier<Item> NECRONIUM_HOE = Services.REGISTRY.registerItem("necronium_hoe",
            () -> new HoeItem(ModToolTiers.NECRONIUM,
                    new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.NECRONIUM, -2, 0.0F))));

    public static final Supplier<Item> BRONZE_HELMET = Services.REGISTRY.registerItem("bronze_helmet", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> BRONZE_CHESTPLATE = Services.REGISTRY.registerItem("bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> BRONZE_LEGGINGS = Services.REGISTRY.registerItem("bronze_leggings", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> BRONZE_BOOTS = Services.REGISTRY.registerItem("bronze_boots", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> STEEL_HELMET = Services.REGISTRY.registerItem("steel_helmet", () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> STEEL_CHESTPLATE = Services.REGISTRY.registerItem("steel_chestplate", () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> STEEL_LEGGINGS = Services.REGISTRY.registerItem("steel_leggings", () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> STEEL_BOOTS = Services.REGISTRY.registerItem("steel_boots", () -> new ArmorItem(ModArmorMaterials.STEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> MITHRIL_HELMET = Services.REGISTRY.registerItem("mithril_helmet", () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> MITHRIL_CHESTPLATE = Services.REGISTRY.registerItem("mithril_chestplate", () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> MITHRIL_LEGGINGS = Services.REGISTRY.registerItem("mithril_leggings", () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> MITHRIL_BOOTS = Services.REGISTRY.registerItem("mithril_boots", () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> ADAMANT_HELMET = Services.REGISTRY.registerItem("adamant_helmet", () -> new ArmorItem(ModArmorMaterials.ADAMANT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> ADAMANT_CHESTPLATE = Services.REGISTRY.registerItem("adamant_chestplate", () -> new ArmorItem(ModArmorMaterials.ADAMANT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> ADAMANT_LEGGINGS = Services.REGISTRY.registerItem("adamant_leggings", () -> new ArmorItem(ModArmorMaterials.ADAMANT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> ADAMANT_BOOTS = Services.REGISTRY.registerItem("adamant_boots", () -> new ArmorItem(ModArmorMaterials.ADAMANT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> RUNE_HELMET = Services.REGISTRY.registerItem("rune_helmet", () -> new ArmorItem(ModArmorMaterials.RUNE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> RUNE_CHESTPLATE = Services.REGISTRY.registerItem("rune_chestplate", () -> new ArmorItem(ModArmorMaterials.RUNE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> RUNE_LEGGINGS = Services.REGISTRY.registerItem("rune_leggings", () -> new ArmorItem(ModArmorMaterials.RUNE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> RUNE_BOOTS = Services.REGISTRY.registerItem("rune_boots", () -> new ArmorItem(ModArmorMaterials.RUNE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> ORIKALKUM_HELMET = Services.REGISTRY.registerItem("orikalkum_helmet", () -> new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> ORIKALKUM_CHESTPLATE = Services.REGISTRY.registerItem("orikalkum_chestplate", () -> new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> ORIKALKUM_LEGGINGS = Services.REGISTRY.registerItem("orikalkum_leggings", () -> new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> ORIKALKUM_BOOTS = Services.REGISTRY.registerItem("orikalkum_boots", () -> new ArmorItem(ModArmorMaterials.ORIKALKUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> NECRONIUM_HELMET = Services.REGISTRY.registerItem("necronium_helmet", () -> new ArmorItem(ModArmorMaterials.NECRONIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final Supplier<Item> NECRONIUM_CHESTPLATE = Services.REGISTRY.registerItem("necronium_chestplate", () -> new ArmorItem(ModArmorMaterials.NECRONIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final Supplier<Item> NECRONIUM_LEGGINGS = Services.REGISTRY.registerItem("necronium_leggings", () -> new ArmorItem(ModArmorMaterials.NECRONIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final Supplier<Item> NECRONIUM_BOOTS = Services.REGISTRY.registerItem("necronium_boots", () -> new ArmorItem(ModArmorMaterials.NECRONIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final Supplier<Item> BRONZE_ARROW = Services.REGISTRY.registerItem("bronze_arrow", () -> new ModArrowItem(ArrowMaterial.BRONZE, 1.5f, new Item.Properties()));
    public static final Supplier<Item> IRON_ARROW = Services.REGISTRY.registerItem("iron_arrow", () -> new ModArrowItem(ArrowMaterial.IRON, 2.0f, new Item.Properties()));
    public static final Supplier<Item> STEEL_ARROW = Services.REGISTRY.registerItem("steel_arrow", () -> new ModArrowItem(ArrowMaterial.STEEL, 2.5f, new Item.Properties()));
    public static final Supplier<Item> MITHRIL_ARROW = Services.REGISTRY.registerItem("mithril_arrow", () -> new ModArrowItem(ArrowMaterial.MITHRIL, 3.0f, new Item.Properties()));
    public static final Supplier<Item> ADAMANT_ARROW = Services.REGISTRY.registerItem("adamant_arrow", () -> new ModArrowItem(ArrowMaterial.ADAMANT, 3.5f, new Item.Properties()));
    public static final Supplier<Item> RUNE_ARROW = Services.REGISTRY.registerItem("rune_arrow", () -> new ModArrowItem(ArrowMaterial.RUNE, 4.0f, new Item.Properties()));

    public static final Supplier<Item> ORIKALKUM_UPGRADE_SMITHING_TEMPLATE = Services.REGISTRY.registerItem("orikalkum_upgrade_smithing_template", ModSmithingTemplateItem::createOrikalkumUpgrade);
    public static final Supplier<Item> NECRONIUM_UPGRADE_SMITHING_TEMPLATE = Services.REGISTRY.registerItem("necronium_upgrade_smithing_template", ModSmithingTemplateItem::createNecroniumUpgrade);

    public static void registerModItems() {
        Constants.LOG.info("Registering Mod Items for {}", Constants.MOD_ID);
    }
}
