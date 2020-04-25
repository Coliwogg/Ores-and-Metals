package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, OresandMetals.MODID);

    /* Fragments */
    public static final RegistryObject<Item> COPPER_FRAGMENTS = ITEMS.register("copper_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> TIN_FRAGMENTS = ITEMS.register("tin_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_FRAGMENTS = ITEMS.register("mithril_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_FRAGMENTS = ITEMS.register("adamantite_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_FRAGMENTS = ITEMS.register("runite_fragments", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Chunks */
    public static final RegistryObject<Item> BRONZE_CHUNK = ITEMS.register("bronze_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_CHUNK = ITEMS.register("steel_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_CHUNK = ITEMS.register("mithril_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_CHUNK = ITEMS.register("adamantite_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_CHUNK = ITEMS.register("runite_chunk", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Ingots */
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANTITE_INGOT = ITEMS.register("adamantite_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNITE_INGOT = ITEMS.register("runite_ingot", () -> new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Bronze Tools */
    public static final RegistryObject<Item> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModItemTier.BRONZE, 6.5F, -3.15F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModItemTier.BRONZE, -1.5F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModItemTier.BRONZE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModItemTier.BRONZE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Steel Tools */
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", () -> new AxeItem(ModItemTier.STEEL, 6.75F, -3.075F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", () -> new HoeItem(ModItemTier.STEEL, -0.75F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItemTier.STEEL, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItemTier.STEEL, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", () -> new SwordItem(ModItemTier.STEEL, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Mithril Tools */
    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe", () -> new AxeItem(ModItemTier.MITHRIL, 6.5F, -3.050F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe", () -> new HoeItem(ModItemTier.MITHRIL, -0.50F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe", () -> new PickaxeItem(ModItemTier.MITHRIL, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel", () -> new ShovelItem(ModItemTier.MITHRIL, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword", () -> new SwordItem(ModItemTier.MITHRIL, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Adamant Tools */
    public static final RegistryObject<Item> ADAMANT_AXE = ITEMS.register("adamant_axe", () -> new AxeItem(ModItemTier.ADAMANT, 6.25F, -3.025F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_HOE = ITEMS.register("adamant_hoe", () -> new HoeItem(ModItemTier.ADAMANT, -0.25F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_PICKAXE = ITEMS.register("adamant_pickaxe", () -> new PickaxeItem(ModItemTier.ADAMANT, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_SHOVEL = ITEMS.register("adamant_shovel", () -> new ShovelItem(ModItemTier.ADAMANT, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_SWORD = ITEMS.register("adamant_sword", () -> new SwordItem(ModItemTier.ADAMANT, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Rune Tools */
    public static final RegistryObject<Item> RUNE_AXE = ITEMS.register("rune_axe", () -> new AxeItem(ModItemTier.RUNE, 7.0F, -2.9F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_HOE = ITEMS.register("rune_hoe", () -> new HoeItem(ModItemTier.RUNE, 1.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_PICKAXE = ITEMS.register("rune_pickaxe", () -> new PickaxeItem(ModItemTier.RUNE, 3, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_SHOVEL = ITEMS.register("rune_shovel", () -> new ShovelItem(ModItemTier.RUNE, 3.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_SWORD = ITEMS.register("rune_sword", () -> new SwordItem(ModItemTier.RUNE, 5, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Bronze Armor */
    public static final RegistryObject<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Steel Armor */
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", () -> new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Mithril Armor */
    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots", () -> new ArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Adamant Armor */
    public static final RegistryObject<Item> ADAMANT_HELMET = ITEMS.register("adamant_helmet", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_CHESTPLATE = ITEMS.register("adamant_chestplate", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_LEGGINGS = ITEMS.register("adamant_leggings", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> ADAMANT_BOOTS = ITEMS.register("adamant_boots", () -> new ArmorItem(ModArmorMaterial.ADAMANT, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Rune Armor */
    public static final RegistryObject<Item> RUNE_HELMET = ITEMS.register("rune_helmet", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_CHESTPLATE = ITEMS.register("rune_chestplate", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_LEGGINGS = ITEMS.register("rune_leggings", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));
    public static final RegistryObject<Item> RUNE_BOOTS = ITEMS.register("rune_boots", () -> new ArmorItem(ModArmorMaterial.RUNE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)));

    /* Tool Item Tiers */
    public enum ModItemTier implements IItemTier {
        BRONZE(200, 5.0F, 1.5F, 1, 15, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get()); }),
        STEEL(375, 6.5F, 1.25F, 2, 14, () -> { return Ingredient.fromItems(ItemInit.STEEL_INGOT.get()); }),
        MITHRIL(525, 7.0F, 1.5F, 2, 12, () -> { return Ingredient.fromItems(ItemInit.MITHRIL_INGOT.get()); }),
        ADAMANT(600, 7.5F, 1.75F, 2, 11, () -> { return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT.get()); }),
        RUNE(1750, 10.0F, 2.0F, 3, 10, () -> { return Ingredient.fromItems(ItemInit.RUNITE_INGOT.get()); });

        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int harvestLevel;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        private ModItemTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.harvestLevel = harvestLevel;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
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
        BRONZE(10, new int[] { 1, 4, 5, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":bronze", 0.0F, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT.get()); }),
        STEEL(20, new int[] { 2, 6, 7, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":steel", 0.0F, () -> { return Ingredient.fromItems(ItemInit.STEEL_INGOT.get()); }),
        MITHRIL(25, new int[] { 3, 6, 8, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":mithril", 1.0F, () -> { return Ingredient.fromItems(ItemInit.MITHRIL_INGOT.get()); }),
        ADAMANT(30, new int[] { 2, 7, 8, 3 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":adamant", 1.5F, () -> { return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT.get()); }),
        RUNE(40, new int[] { 4, 7, 9, 4 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":rune", 3.0F, () -> { return Ingredient.fromItems(ItemInit.RUNITE_INGOT.get()); });

        private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
        private final int durability;
        private final int[] damageReductionAmount;
        private final int enchantability;
        private final String soundEvent;
        private final LazyValue<Ingredient> repairMaterial;
        private final String name;
        private final float toughness;

        private ModArmorMaterial(int durability, int[] damageReductionAmount, int enchantability, String soundEvent, String name, float toughness, Supplier<Ingredient> repairMaterial) {
            this.durability = durability;
            this.damageReductionAmount = damageReductionAmount;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.name = name;
            this.toughness = toughness;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.durability;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmount[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return new SoundEvent(new ResourceLocation(this.soundEvent));
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

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

    }
}
