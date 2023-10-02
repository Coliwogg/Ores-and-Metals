package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    BRONZE("bronze", 15, new int[]{ 2, 5, 4, 1 }, 14,
            SoundEvents.ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL("steel", 16, new int[]{ 2, 6, 5, 2 }, 13,
            SoundEvents.ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL("mithril", 24, new int[]{ 2, 6, 5, 2 }, 12,
            SoundEvents.ARMOR_EQUIP_IRON, 0, 0, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT("adamant", 32, new int[]{ 3, 8, 6, 3 }, 11,
            SoundEvents.ARMOR_EQUIP_IRON, 0, 0.1f, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE("rune", 36, new int[]{ 3, 8, 6, 3 }, 16,
            SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.1f, () -> Ingredient.of(ModItems.RUNITE_INGOT.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 15, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
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
