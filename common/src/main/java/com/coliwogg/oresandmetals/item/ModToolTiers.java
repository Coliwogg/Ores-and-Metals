package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.util.ModTags;
import com.google.common.base.Suppliers;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum ModToolTiers implements Tier {

    BRONZE(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL, 250, 6.0f, 4.0f, 16, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL, 521, 7.0f, 4.0f, 16, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL, 991, 7.5f, 3.0f, 14, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT(ModTags.Blocks.INCORRECT_FOR_ADAMANT_TOOL, 1251, 8.0f, 2.0f, 14, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE(ModTags.Blocks.INCORRECT_FOR_RUNE_TOOL, 1901, 8.5f, 2.0f, 14, () -> Ingredient.of(ModItems.RUNITE_INGOT.get())),
    ORIKALKUM(ModTags.Blocks.INCORRECT_FOR_ORIKALKUM_TOOL, 2231, 9.5f, 2.0f, 14, () -> Ingredient.of(ModItems.ORIKALKUM_INGOT.get())),
    NECRONIUM(ModTags.Blocks.INCORRECT_FOR_NECRONIUM_TOOL, 2561, 10.0f, 2.0f, 14, () -> Ingredient.of(ModItems.NECRONIUM_INGOT.get()));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

}
