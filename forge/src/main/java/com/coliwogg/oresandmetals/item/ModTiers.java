package com.coliwogg.oresandmetals.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BRONZE = new ForgeTier(1, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_STONE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier STEEL = new ForgeTier(2, 521, 7.0f, 2.5f, 13, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier MITHRIL = new ForgeTier(2, 991, 7.5f, 2.5f, 12, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier ADAMANT = new ForgeTier(3, 1251, 8.0f, 3.0f, 11, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
    public static final ForgeTier RUNE = new ForgeTier(4, 250, 6.0f, 2.0f, 14, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get()));
}
