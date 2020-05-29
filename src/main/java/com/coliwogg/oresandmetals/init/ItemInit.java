package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;
import com.coliwogg.oresandmetals.objects.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OresandMetals.MODID);

    /* Ore Drops */
    public static final RegistryObject<Item> COPPER_FRAGMENTS = ITEMS.register("copper_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_FRAGMENTS = ITEMS.register("tin_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_FRAGMENTS = ITEMS.register("mithril_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_FRAGMENTS = ITEMS.register("adamantite_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_FRAGMENTS = ITEMS.register("runite_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> DRAKOLITH = ITEMS.register("drakolith", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> PHASMATITE = ITEMS.register("phasmatite", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> LIGHT_ANIMICA = ITEMS.register("light_animica", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> DARK_ANIMICA = ITEMS.register("dark_animica", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Chunks */
    public static final RegistryObject<Item> BRONZE_CHUNK = ITEMS.register("bronze_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_CHUNK = ITEMS.register("steel_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_CHUNK = ITEMS.register("mithril_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_CHUNK = ITEMS.register("adamantite_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_CHUNK = ITEMS.register("runite_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_CHUNK = ITEMS.register("orikalkum_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_CHUNK = ITEMS.register("necronium_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_CHUNK = ITEMS.register("elder_rune_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));


    /* Nuggets */
    public static final RegistryObject<Item> BRONZE_NUGGET = ITEMS.register("bronze_nugget", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_NUGGET = ITEMS.register("adamantite_nugget", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_NUGGET = ITEMS.register("runite_nugget", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Ingots */
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_INGOT = ITEMS.register("runite_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_INGOT = ITEMS.register("orikalkum_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_INGOT = ITEMS.register("necronium_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_INGOT = ITEMS.register("banite_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_INGOT = ITEMS.register("elder_rune_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Bronze Tools */
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModItemTier.BRONZE, 6.5F, -3.15F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModItemTier.BRONZE, -1.5F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModItemTier.BRONZE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModItemTier.BRONZE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Steel Tools */
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 5.75F, -3.075F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, -0.75F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Mithril Tools */
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModItemTier.MITHRIL, 5.5F, -3.05F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModItemTier.MITHRIL, -0.5F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModItemTier.MITHRIL, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModItemTier.MITHRIL, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModItemTier.MITHRIL, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Adamant Tools */
    public static final RegistryObject<Item> ADAMANT_AXE = ITEMS.register("adamant_axe", () -> new AxeItem(ModItemTier.ADAMANT, 5.25F, -3.025F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_HOE = ITEMS.register("adamant_hoe", () -> new HoeItem(ModItemTier.ADAMANT, -0.25F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe", () -> new PickaxeItem(ModItemTier.ADAMANT, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_SHOVEL = ITEMS.register("adamant_shovel", () -> new ShovelItem(ModItemTier.ADAMANT, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_SWORD = ITEMS.register("adamant_sword", () -> new SwordItem(ModItemTier.ADAMANT, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Rune Tools */
    public static final RegistryObject<Item> RUNE_AXE = ITEMS.register("rune_axe", () -> new AxeItem(ModItemTier.RUNE, 5.0F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_HOE = ITEMS.register("rune_hoe", () -> new HoeItem(ModItemTier.RUNE, 0.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_PICKAXE = ITEMS.register("rune_pickaxe", () -> new PickaxeItem(ModItemTier.RUNE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_SHOVEL = ITEMS.register("rune_shovel", () -> new ShovelItem(ModItemTier.RUNE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_SWORD = ITEMS.register("rune_sword", () -> new SwordItem(ModItemTier.RUNE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Orikalkum Tools */
    public static final RegistryObject<Item> ORIKALKUM_AXE = ITEMS.register("orikalkum_axe", () -> new AxeItem(ModItemTier.ORIKALKUM, 4.75F, -2.9F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_HOE = ITEMS.register("orikalkum_hoe", () -> new HoeItem(ModItemTier.ORIKALKUM, 0.25F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_PICKAXE = ITEMS.register("orikalkum_pickaxe", () -> new PickaxeItem(ModItemTier.ORIKALKUM, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_SHOVEL = ITEMS.register("orikalkum_shovel", () -> new ShovelItem(ModItemTier.ORIKALKUM, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_SWORD = ITEMS.register("orikalkum_sword", () -> new SwordItem(ModItemTier.ORIKALKUM, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Necronium Tools */
    public static final RegistryObject<Item> NECRONIUM_AXE = ITEMS.register("necronium_axe", () -> new AxeItem(ModItemTier.NECRONIUM, 4.5F, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_HOE = ITEMS.register("necronium_hoe", () -> new HoeItem(ModItemTier.NECRONIUM, 0.50F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_PICKAXE = ITEMS.register("necronium_pickaxe", () -> new PickaxeItem(ModItemTier.NECRONIUM, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_SHOVEL = ITEMS.register("necronium_shovel", () -> new ShovelItem(ModItemTier.NECRONIUM, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_SWORD = ITEMS.register("necronium_sword", () -> new SwordItem(ModItemTier.NECRONIUM, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Banite Tools */
    public static final RegistryObject<Item> BANITE_AXE = ITEMS.register("banite_axe", () -> new AxeItem(ModItemTier.BANITE, 4.25F, -2.7F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_HOE = ITEMS.register("banite_hoe", () -> new HoeItem(ModItemTier.BANITE, 0.75F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_PICKAXE = ITEMS.register("banite_pickaxe", () -> new PickaxeItem(ModItemTier.BANITE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_SHOVEL = ITEMS.register("banite_shovel", () -> new ShovelItem(ModItemTier.BANITE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_SWORD = ITEMS.register("banite_sword", () -> new SwordItem(ModItemTier.BANITE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Elder Rune Tools */
    public static final RegistryObject<Item> ELDER_RUNE_AXE = ITEMS.register("elder_rune_axe", () -> new AxeItem(ModItemTier.ELDER_RUNE, 4.0F, -2.6F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_HOE = ITEMS.register("elder_rune_hoe", () -> new HoeItem(ModItemTier.ELDER_RUNE, 1.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_PICKAXE = ITEMS.register("elder_rune_pickaxe", () -> new PickaxeItem(ModItemTier.ELDER_RUNE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_SHOVEL = ITEMS.register("elder_rune_shovel", () -> new ShovelItem(ModItemTier.ELDER_RUNE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_SWORD = ITEMS.register("elder_rune_sword", () -> new SwordItem(ModItemTier.ELDER_RUNE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Bronze Armor */
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Steel Armor */
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Mithril Armor */
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Adamant Armor */
    public static final RegistryObject<Item> ADAMANT_HELMET = ITEMS.register("adamant_helmet", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_CHESTPLATE = ITEMS.register("adamant_chestplate", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_LEGGINGS = ITEMS.register("adamant_leggings", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_BOOTS = ITEMS.register("adamant_boots", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Rune Armor */
    public static final RegistryObject<Item> RUNE_HELMET = ITEMS.register("rune_helmet", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_CHESTPLATE = ITEMS.register("rune_chestplate", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_LEGGINGS = ITEMS.register("rune_leggings", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_BOOTS = ITEMS.register("rune_boots", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Orikalkum Armor */
    public static final RegistryObject<Item> ORIKALKUM_HELMET = ITEMS.register("orikalkum_helmet", () -> new ArmorItem(ModArmorMaterial.ORIKALKUM, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_CHESTPLATE = ITEMS.register("orikalkum_chestplate", () -> new ArmorItem(ModArmorMaterial.ORIKALKUM, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_LEGGINGS = ITEMS.register("orikalkum_leggings", () -> new ArmorItem(ModArmorMaterial.ORIKALKUM, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ORIKALKUM_BOOTS = ITEMS.register("orikalkum_boots", () -> new ArmorItem(ModArmorMaterial.ORIKALKUM, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Necronium Armor */
    public static final RegistryObject<Item> NECRONIUM_HELMET = ITEMS.register("necronium_helmet", () -> new ArmorItem(ModArmorMaterial.NECRONIUM, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_CHESTPLATE = ITEMS.register("necronium_chestplate", () -> new ArmorItem(ModArmorMaterial.NECRONIUM, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_LEGGINGS = ITEMS.register("necronium_leggings", () -> new ArmorItem(ModArmorMaterial.NECRONIUM, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> NECRONIUM_BOOTS = ITEMS.register("necronium_boots", () -> new ArmorItem(ModArmorMaterial.NECRONIUM, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Banite Armor */
    public static final RegistryObject<Item> BANITE_HELMET = ITEMS.register("banite_helmet", () -> new ArmorItem(ModArmorMaterial.BANITE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_CHESTPLATE = ITEMS.register("banite_chestplate", () -> new ArmorItem(ModArmorMaterial.BANITE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_LEGGINGS = ITEMS.register("banite_leggings", () -> new ArmorItem(ModArmorMaterial.BANITE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BANITE_BOOTS = ITEMS.register("banite_boots", () -> new ArmorItem(ModArmorMaterial.BANITE, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Elder Rune Armor */
    public static final RegistryObject<Item> ELDER_RUNE_HELMET = ITEMS.register("elder_rune_helmet", () -> new ArmorItem(ModArmorMaterial.ELDER_RUNE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_CHESTPLATE = ITEMS.register("elder_rune_chestplate", () -> new ArmorItem(ModArmorMaterial.ELDER_RUNE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_LEGGINGS = ITEMS.register("elder_rune_leggings", () -> new ArmorItem(ModArmorMaterial.ELDER_RUNE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ELDER_RUNE_BOOTS = ITEMS.register("elder_rune_boots", () -> new ArmorItem(ModArmorMaterial.ELDER_RUNE, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Arrows */
    public static final RegistryObject<Item> BRONZE_ARROW = ITEMS.register("bronze_arrow", () -> new BronzeArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 1.5F));
    public static final RegistryObject<Item> IRON_ARROW = ITEMS.register("iron_arrow", () -> new IronArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 2.0F));
    public static final RegistryObject<Item> STEEL_ARROW = ITEMS.register("steel_arrow", () -> new SteelArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 2.5F));
    public static final RegistryObject<Item> MITHRIL_ARROW = ITEMS.register("mithril_arrow", () -> new MithrilArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 3.0F));
    public static final RegistryObject<Item> ADAMANT_ARROW = ITEMS.register("adamant_arrow", () -> new AdamantArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 3.5F));
    public static final RegistryObject<Item> RUNE_ARROW = ITEMS.register("rune_arrow", () -> new RuneArrow(new Item.Properties().group(OresandMetalsItemGroup.instance), 4.0F));

    /* Tool Item Tiers */
    public enum ModItemTier implements IItemTier {
        BRONZE(1, 191, 5.0F, 1.5F, 13, () -> {
            return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());
        }),
        STEEL(2, 302, 6.5F, 2.25F, 11, () -> {
            return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
        }),
        MITHRIL(2, 453, 7.0F, 2.5F, 9, () -> {
            return Ingredient.fromItems(ItemInit.MITHRIL_INGOT.get());
        }),
        ADAMANT(2, 708, 7.5F, 2.75F, 8, () -> {
            return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT.get());
        }),
        RUNE(3, 1358, 8.0F, 3.0F, 10, () -> {
            return Ingredient.fromItems(ItemInit.RUNITE_INGOT.get());
        }),
        ORIKALKUM(4, 1698, 9.5F, 3.25F, 9, () -> {
            return Ingredient.fromItems(ItemInit.ORIKALKUM_INGOT.get());
        }),
        NECRONIUM(5, 1989, 11.0F, 3.5F, 8, () -> {
            return Ingredient.fromItems(ItemInit.NECRONIUM_INGOT.get());
        }),
        BANITE(6, 2387, 12.5F, 3.75F, 7, () -> {
            return Ingredient.fromItems(ItemInit.BANITE_INGOT.get());
        }),
        ELDER_RUNE(7, 2716, 14.0F, 4.0F, 6, () -> {
            return Ingredient.fromItems(ItemInit.ELDER_RUNE_INGOT.get());
        });

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
            this.harvestLevel = harvestLevelIn;
            this.maxUses = maxUsesIn;
            this.efficiency = efficiencyIn;
            this.attackDamage = attackDamageIn;
            this.enchantability = enchantabilityIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    /* Armor Materials */
    public enum ModArmorMaterial implements IArmorMaterial {

        BRONZE(OresandMetals.MODID + ":bronze", 10, new int[]{1, 2, 4, 2}, 13, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
            return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get());
        }),
        STEEL(OresandMetals.MODID + ":steel", 15, new int[]{2, 5, 7, 2}, 11, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
            return Ingredient.fromItems(ItemInit.STEEL_INGOT.get());
        }),
        MITHRIL(OresandMetals.MODID + ":mithril", 20, new int[]{2, 6, 7, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, () -> {
            return Ingredient.fromItems(ItemInit.MITHRIL_INGOT.get());
        }),
        ADAMANT(OresandMetals.MODID + ":adamant", 25, new int[]{2, 6, 7, 3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.5F, () -> {
            return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT.get());
        }),
        RUNE(OresandMetals.MODID + ":rune", 30, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, () -> {
            return Ingredient.fromItems(ItemInit.RUNITE_INGOT.get());
        }),
        ORIKALKUM(OresandMetals.MODID + ":orikalkum", 35, new int[]{4, 6, 8, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5F, () -> {
            return Ingredient.fromItems(ItemInit.ORIKALKUM_INGOT.get());
        }),
        NECRONIUM(OresandMetals.MODID + ":necronium", 40, new int[]{4, 6, 8, 4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, () -> {
            return Ingredient.fromItems(ItemInit.NECRONIUM_INGOT.get());
        }),
        BANITE(OresandMetals.MODID + ":banite", 45, new int[]{4, 6, 9, 4}, 7, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5F, () -> {
            return Ingredient.fromItems(ItemInit.BANITE_INGOT.get());
        }),
        ELDER_RUNE(OresandMetals.MODID + ":elder_rune", 50, new int[]{4, 7, 9, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, () -> {
            return Ingredient.fromItems(ItemInit.ELDER_RUNE_INGOT.get());
        });

        private static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        ModArmorMaterial(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountsIn, int enchantabilityIn, SoundEvent equipSoundIn, float toughnessIn, Supplier<Ingredient> repairMaterialSupplier) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountsIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = equipSoundIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialSupplier);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }
}
