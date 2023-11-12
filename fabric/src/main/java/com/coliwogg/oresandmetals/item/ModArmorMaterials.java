package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BRONZE("bronze", 15, new int[] { 2, 5, 4, 1 }, 14,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    STEEL("steel", 16, new int[] { 2, 6, 5, 2 }, 13,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    MITHRIL("mithril", 24,  new int[] { 2, 6, 5, 2 }, 12,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.0f, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    ADAMANT("adamant", 32,  new int[] { 3, 8, 6, 3 }, 11,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f, 0.1f, () -> Ingredient.ofItems(ModItems.ADAMANTITE_INGOT)),
    RUNE("rune", 36, new int[] { 3, 8, 6, 3 }, 16,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5f, 0.1f, () -> Ingredient.ofItems(ModItems.RUNITE_INGOT)),
    ORIKALKUM("orikalkum", 38,  new int[] { 4, 9, 7, 4 }, 17,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.5f, 0.1f, () -> Ingredient.ofItems(ModItems.ORIKALKUM_INGOT)),
    NECRONIUM("necronium", 39, new int[] { 4, 9, 7, 4 },18,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.1f, () -> Ingredient.ofItems(ModItems.NECRONIUM_INGOT));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return OresAndMetals.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
