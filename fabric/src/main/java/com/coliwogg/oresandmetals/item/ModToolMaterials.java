package com.coliwogg.oresandmetals.item;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    BRONZE(1, 250, 6.0f, 2.0f, 14, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    STEEL(2, 521, 7.0f, 2.5f, 13, () -> Ingredient.ofItems(ModItems.STEEL_INGOT)),
    MITHRIL(2, 991, 7.5f, 2.5f, 12, () -> Ingredient.ofItems(ModItems.MITHRIL_INGOT)),
    ADAMANT(3, 1251, 8.0f, 3.0f, 11, () -> Ingredient.ofItems(ModItems.ADAMANTITE_INGOT)),
    RUNE(4, 1901, 8.5f, 4.0f, 15, () -> Ingredient.ofItems(ModItems.RUNITE_INGOT)),
    ORIKALKUM(5, 2231, 9.5f, 4.5f, 16, () -> Ingredient.ofItems(ModItems.ORIKALKUM_INGOT)),
    NECRONIUM(5, 2561, 10.0f, 5.0f, 17, () -> Ingredient.ofItems(ModItems.NECRONIUM_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
