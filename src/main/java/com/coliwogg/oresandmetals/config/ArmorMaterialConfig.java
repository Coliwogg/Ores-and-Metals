package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.function.Predicate;

public class ArmorMaterialConfig {
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> bronze_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> bronze_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> steel_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> steel_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> steel_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> mithril_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> mithril_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> mithril_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> adamant_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> adamant_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> adamant_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> rune_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> rune_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> rune_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> orikalkum_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> orikalkum_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> orikalkum_boots;

    public static ForgeConfigSpec.ConfigValue<Integer> necronium_durability_multiplier;
    public static ForgeConfigSpec.ConfigValue<Integer> necronium_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Double> necronium_toughness;
    public static ForgeConfigSpec.ConfigValue<Double> necronium_knockback_resistance;
    public static ForgeConfigSpec.ConfigValue<Integer> necronium_helmet;
    public static ForgeConfigSpec.ConfigValue<Integer> necronium_chestplate;
    public static ForgeConfigSpec.ConfigValue<Integer> necronium_leggings;
    public static ForgeConfigSpec.ConfigValue<Integer> necronium_boots;

    public static void init(ForgeConfigSpec.Builder builder) {
        builder.comment("Bronze Armor Material");

        bronze_durability_multiplier = builder
                .comment("Durability Multiplier of Bronze Armor. Default value is 15.")
                .defineInRange("armor_material.bronze.bronze_durability_multiplier", 15, 0, 1000);
        bronze_enchantment_value = builder
                .comment("Enchantment Value of Bronze Armor. Default value is 14.")
                .defineInRange("armor_material.bronze.bronze_enchantment_value", 14, 0, 1000);
        bronze_toughness = builder
                .comment("Toughness Value of Bronze Armor. Default value is 0.0.")
                .defineInRange("armor_material.bronze.bronze_toughness", 0.0, 0.0, 100.0);
        bronze_knockback_resistance = builder
                .comment("Knockback Resistance Value of Bronze Armor. Default value is 0.0.")
                .defineInRange("armor_material.bronze.bronze_knockback_resistance", 0.0, 0.0, 10.0);
        bronze_helmet = builder
                .comment("Slot Protection for Bronze Helmet. Default value is 2.")
                .defineInRange("armor_material.bronze.slot_protections.bronze_helmet", 2, 0, 11);
        bronze_chestplate = builder
                .comment("Slot Protection for Bronze Chestplate. Default value is 5.")
                .defineInRange("armor_material.bronze.slot_protections.bronze_chestplate", 5, 0, 16);
        bronze_leggings = builder
                .comment("Slot Protection for Bronze Leggings. Default value is 4.")
                .defineInRange("armor_material.bronze.slot_protections.bronze_leggings", 4, 0, 15);
        bronze_boots = builder
                .comment("Slot Protection for Bronze Boots. Default value is 1.")
                .defineInRange("armor_material.bronze.slot_protections.bronze_boots", 1, 0, 13);

        builder.comment("Steel Armor Material");

        steel_durability_multiplier = builder
                .comment("Durability Multiplier of Steel Armor. Default value is 16.")
                .defineInRange("armor_material.steel.steel_durability_multiplier", 16, 0, 1000);
        steel_enchantment_value = builder
                .comment("Enchantment Value of Steel Armor. Default value is 13.")
                .defineInRange("armor_material.steel.steel_enchantment_value", 13, 0, 1000);
        steel_toughness = builder
                .comment("Toughness Value of Steel Armor. Default value is 0.0.")
                .defineInRange("armor_material.steel.steel_toughness", 0.0, 0.0, 100.0);
        steel_knockback_resistance = builder
                .comment("Knockback Resistance Value of Steel Armor. Default value is 0.0.")
                .defineInRange("armor_material.steel.steel_knockback_resistance", 0.0, 0.0, 10.0);
        steel_helmet = builder
                .comment("Slot Protection for Steel Helmet. Default value is 2.")
                .defineInRange("armor_material.steel.slot_protections.steel_helmet", 2, 0, 11);
        steel_chestplate = builder
                .comment("Slot Protection for Steel Chestplate. Default value is 6.")
                .defineInRange("armor_material.steel.slot_protections.steel_chestplate", 6, 0, 16);
        steel_leggings = builder
                .comment("Slot Protection for Steel Leggings. Default value is 5.")
                .defineInRange("armor_material.steel.slot_protections.steel_leggings", 5, 0, 15);
        steel_boots = builder
                .comment("Slot Protection for Steel Boots. Default value is 2.")
                .defineInRange("armor_material.steel.slot_protections.steel_boots", 2, 0, 13);

        builder.comment("Mithril Armor Material");

        mithril_durability_multiplier = builder
                .comment("Durability Multiplier of Mithril Armor. Default value is 15.")
                .defineInRange("armor_material.mithril.mithril_durability_multiplier", 15, 0, 1000);
        mithril_enchantment_value = builder
                .comment("Enchantment Value of Mithril Armor. Default value is 12.")
                .defineInRange("armor_material.mithril.mithril_enchantment_value", 12, 0, 1000);
        mithril_toughness = builder
                .comment("Toughness Value of Mithril Armor. Default value is 0.0.")
                .defineInRange("armor_material.mithril.mithril_toughness", 0.0, 0.0, 100.0);
        mithril_knockback_resistance = builder
                .comment("Knockback Resistance Value of Mithril Armor. Default value is 0.0.")
                .defineInRange("armor_material.mithril.mithril_knockback_resistance", 0.0, 0.0, 10.0);
        mithril_helmet = builder
                .comment("Slot Protection for Mithril Helmet. Default value is 2.")
                .defineInRange("armor_material.mithril.slot_protections.mithril_helmet", 2, 0, 11);
        mithril_chestplate = builder
                .comment("Slot Protection for Mithril Chestplate. Default value is 6.")
                .defineInRange("armor_material.mithril.slot_protections.mithril_chestplate", 6, 0, 16);
        mithril_leggings = builder
                .comment("Slot Protection for Mithril Leggings. Default value is 5.")
                .defineInRange("armor_material.mithril.slot_protections.mithril_leggings", 5, 0, 15);
        mithril_boots = builder
                .comment("Slot Protection for Mithril Boots. Default value is 2.")
                .defineInRange("armor_material.mithril.slot_protections.mithril_boots", 2, 0, 13);

        builder.comment("Adamant Armor Material");

        adamant_durability_multiplier = builder
                .comment("Durability Multiplier of Adamant Armor. Default value is 32.")
                .defineInRange("armor_material.adamant.adamant_durability_multiplier", 32, 0, 1000);
        adamant_enchantment_value = builder
                .comment("Enchantment Value of Adamant Armor. Default value is 11.")
                .defineInRange("armor_material.adamant.adamant_enchantment_value", 11, 0, 1000);
        adamant_toughness = builder
                .comment("Toughness Value of Adamant Armor. Default value is 0.0.")
                .defineInRange("armor_material.adamant.adamant_toughness", 0.0, 0.0, 100.0);
        adamant_knockback_resistance = builder
                .comment("Knockback Resistance Value of Adamant Armor. Default value is 0.0.")
                .defineInRange("armor_material.adamant.adamant_knockback_resistance", 0.0, 0.0, 10.0);
        adamant_helmet = builder
                .comment("Slot Protection for Adamant Helmet. Default value is 3.")
                .defineInRange("armor_material.adamant.slot_protections.adamant_helmet", 3, 0, 11);
        adamant_chestplate = builder
                .comment("Slot Protection for Adamant Chestplate. Default value is 8.")
                .defineInRange("armor_material.adamant.slot_protections.adamant_chestplate", 8, 0, 16);
        adamant_leggings = builder
                .comment("Slot Protection for Adamant Leggings. Default value is 6.")
                .defineInRange("armor_material.adamant.slot_protections.adamant_leggings", 6, 0, 15);
        adamant_boots = builder
                .comment("Slot Protection for Adamant Boots. Default value is 3.")
                .defineInRange("armor_material.adamant.slot_protections.adamant_boots", 3, 0, 13);

        builder.comment("Rune Armor Material");

        rune_durability_multiplier = builder
                .comment("Durability Multiplier of Rune Armor. Default value is 36.")
                .defineInRange("armor_material.rune.rune_durability_multiplier", 36, 0, 1000);
        rune_enchantment_value = builder
                .comment("Enchantment Value of Rune Armor. Default value is 16.")
                .defineInRange("armor_material.rune.rune_enchantment_value", 16, 0, 1000);
        rune_toughness = builder
                .comment("Toughness Value of Rune Armor. Default value is 2.5.")
                .defineInRange("armor_material.rune.rune_toughness", 2.5, 0.0, 100.0);
        rune_knockback_resistance = builder
                .comment("Knockback Resistance Value of Rune Armor. Default value is 0.1")
                .defineInRange("armor_material.rune.rune_knockback_resistance", 0.1, 0.0, 10.0);
        rune_helmet = builder
                .comment("Slot Protection for Rune Helmet. Default value is 3.")
                .defineInRange("armor_material.rune.slot_protections.rune_helmet", 3, 0, 11);
        rune_chestplate = builder
                .comment("Slot Protection for Rune Chestplate. Default value is 8.")
                .defineInRange("armor_material.rune.slot_protections.rune_chestplate", 8, 0, 16);
        rune_leggings = builder
                .comment("Slot Protection for Rune Leggings. Default value is 6.")
                .defineInRange("armor_material.rune.slot_protections.rune_leggings", 6, 0, 15);
        rune_boots = builder
                .comment("Slot Protection for Rune Boots. Default value is 3.")
                .defineInRange("armor_material.rune.slot_protections.rune_boots", 3, 0, 13);

        builder.comment("Orikalkum Armor Material");

        orikalkum_durability_multiplier = builder
                .comment("Durability Multiplier of Orikalkum Armor. Default value is 38.")
                .defineInRange("armor_material.orikalkum.orikalkum_durability_multiplier", 38, 0, 1000);
        orikalkum_enchantment_value = builder
                .comment("Enchantment Value of Orikalkum Armor. Default value is 17.")
                .defineInRange("armor_material.orikalkum.orikalkum_enchantment_value", 17, 0, 1000);
        orikalkum_toughness = builder
                .comment("Toughness Value of Orikalkum Armor. Default value is 3.5F.")
                .defineInRange("armor_material.orikalkum.orikalkum_toughness", 3.5F, 0.0, 100.0);
        orikalkum_knockback_resistance = builder
                .comment("Knockback Resistance Value of Orikalkum Armor. Default value is 0.2")
                .defineInRange("armor_material.orikalkum.orikalkum_knockback_resistance", 0.2, 0.0, 10.0);
        orikalkum_helmet = builder
                .comment("Slot Protection for Orikalkum Helmet. Default value is 4.")
                .defineInRange("armor_material.orikalkum.slot_protections.orikalkum_helmet", 4, 0, 11);
        orikalkum_chestplate = builder
                .comment("Slot Protection for Orikalkum Chestplate. Default value is 9.")
                .defineInRange("armor_material.orikalkum.slot_protections.orikalkum_chestplate", 9, 0, 16);
        orikalkum_leggings = builder
                .comment("Slot Protection for Orikalkum Leggings. Default value is 7.")
                .defineInRange("armor_material.orikalkum.slot_protections.orikalkum_leggings", 7, 0, 15);
        orikalkum_boots = builder
                .comment("Slot Protection for Orikalkum Boots. Default value is 4.")
                .defineInRange("armor_material.orikalkum.slot_protections.orikalkum_boots", 4, 0, 13);


        builder.comment("Necronium Armor Material");

        necronium_durability_multiplier = builder
                .comment("Durability Multiplier of Necronium Armor. Default value is 39.")
                .defineInRange("armor_material.necronium.necronium_durability_multiplier", 39, 0, 1000);
        necronium_enchantment_value = builder
                .comment("Enchantment Value of Necronium Armor. Default value is 18.")
                .defineInRange("armor_material.necronium.necronium_enchantment_value", 18, 0, 1000);
        necronium_toughness = builder
                .comment("Toughness Value of Necronium Armor. Default value is 4.0.")
                .defineInRange("armor_material.necronium.necronium_toughness", 4.0, 0.0, 100.0);
        necronium_knockback_resistance = builder
                .comment("Knockback Resistance Value of Necronium Armor. Default value is 0.3")
                .defineInRange("armor_material.necronium.necronium_knockback_resistance", 0.3, 0.0, 10.0);
        necronium_helmet = builder
                .comment("Slot Protection for Necronium Helmet. Default value is 4.")
                .defineInRange("armor_material.necronium.slot_protections.necronium_helmet", 4, 0, 11);
        necronium_chestplate = builder
                .comment("Slot Protection for Necronium Chestplate. Default value is 9.")
                .defineInRange("armor_material.necronium.slot_protections.necronium_chestplate", 9, 0, 16);
        necronium_leggings = builder
                .comment("Slot Protection for Necronium Leggings. Default value is 7.")
                .defineInRange("armor_material.necronium.slot_protections.necronium_leggings", 7, 0, 15);
        necronium_boots = builder
                .comment("Slot Protection for Necronium Boots. Default value is 4.")
                .defineInRange("armor_material.necronium.slot_protections.necronium_boots", 4, 0, 13);

    }
}
