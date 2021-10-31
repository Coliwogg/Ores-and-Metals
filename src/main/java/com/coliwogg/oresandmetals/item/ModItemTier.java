package com.coliwogg.oresandmetals.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    BRONZE(1, 250, 6.0F, 2.0F, 14, () ->
            Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL(2, 521, 7.0F, 2.5F, 13, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL(2, 991, 7.5F, 2.5F, 12, () ->
            Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT(3, 1251, 8.0F, 3.0F, 11, () ->
            Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE(4, 1901, 8.5F, 4.0F, 15, () ->
            Ingredient.of(ModItems.RUNITE_INGOT.get()));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModItemTier(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    @Override
    public int getUses() {
        return uses;
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return damage;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
