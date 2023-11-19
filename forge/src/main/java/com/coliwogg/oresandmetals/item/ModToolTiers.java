package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier BRONZE = TierSortingRegistry.registerTier(
            new ForgeTier(1, 250, 6.0f, 2.0f, 14,
                    ModTags.Blocks.NEEDS_BRONZE_TOOL, () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "bronze"), List.of(Tiers.STONE), List.of(Tiers.IRON));
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 521, 7.0f, 2.5f, 13,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(2, 991, 7.5f, 2.5f, 12,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "mithril"), List.of(STEEL), List.of(Tiers.DIAMOND));
    public static final Tier ADAMANT = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1251, 8.0f, 3.0f, 11,
                    ModTags.Blocks.NEEDS_ADAMANT_TOOL, () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "adamant"), List.of(MITHRIL), List.of(Tiers.DIAMOND));
    public static final Tier RUNE = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1901, 8.5f, 4.0f, 15,
                    ModTags.Blocks.NEEDS_RUNE_TOOL, () -> Ingredient.of(ModItems.RUNITE_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "rune"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));
    public static final Tier NECRONIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2561, 10.0f, 5.0f, 17,
                    ModTags.Blocks.NEEDS_NECRONIUM_TOOL, () -> Ingredient.of(ModItems.NECRONIUM_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "necronium"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier ORIKALKUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2231, 9.5f, 4.5f, 16,
                    ModTags.Blocks.NEEDS_ORIKALKUM_TOOL, () -> Ingredient.of(ModItems.ORIKALKUM_INGOT.get())),
            new ResourceLocation(OresAndMetals.MOD_ID, "orikalkum"), List.of(Tiers.NETHERITE), List.of(NECRONIUM));

}
