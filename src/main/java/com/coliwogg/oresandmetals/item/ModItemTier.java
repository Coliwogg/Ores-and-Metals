package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.config.ItemTierConfig;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements Tier {

    BRONZE(ItemTierConfig.bronze_level.get(), ItemTierConfig.bronze_uses.get(), ItemTierConfig.bronze_speed.get().floatValue(), ItemTierConfig.bronze_damage.get().floatValue(), ItemTierConfig.bronze_enchantment_value.get(), () ->
            Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL(ItemTierConfig.steel_level.get(), ItemTierConfig.steel_uses.get(), ItemTierConfig.steel_speed.get().floatValue(), ItemTierConfig.steel_damage.get().floatValue(), ItemTierConfig.steel_enchantment_value.get(), () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL(ItemTierConfig.mithril_level.get(), ItemTierConfig.mithril_uses.get(), ItemTierConfig.mithril_speed.get().floatValue(), ItemTierConfig.mithril_damage.get().floatValue(), ItemTierConfig.mithril_enchantment_value.get(), () ->
            Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT(ItemTierConfig.adamant_level.get(), ItemTierConfig.adamant_uses.get(), ItemTierConfig.adamant_speed.get().floatValue(), ItemTierConfig.adamant_damage.get().floatValue(), ItemTierConfig.adamant_enchantment_value.get(), () ->
            Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE(ItemTierConfig.rune_level.get(), ItemTierConfig.rune_uses.get(), ItemTierConfig.rune_speed.get().floatValue(), ItemTierConfig.rune_damage.get().floatValue(), ItemTierConfig.rune_enchantment_value.get(), () ->
            Ingredient.of(ModItems.RUNITE_INGOT.get())),
    ORIKALKUM(ItemTierConfig.orikalkum_level.get(), ItemTierConfig.orikalkum_uses.get(), ItemTierConfig.orikalkum_speed.get().floatValue(), ItemTierConfig.orikalkum_damage.get().floatValue(), ItemTierConfig.orikalkum_enchantment_value.get(), () ->
            Ingredient.of(ModItems.ORIKALKUM_INGOT.get())),
    ;

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
