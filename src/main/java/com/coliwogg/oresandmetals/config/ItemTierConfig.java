package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ItemTierConfig {
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_level;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_uses;
    public static ForgeConfigSpec.ConfigValue<Double> bronze_speed;
    public static ForgeConfigSpec.ConfigValue<Double> bronze_damage;
    public static ForgeConfigSpec.ConfigValue<Integer> bronze_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_level;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_uses;
    public static ForgeConfigSpec.ConfigValue<Double> steel_speed;
    public static ForgeConfigSpec.ConfigValue<Double> steel_damage;
    public static ForgeConfigSpec.ConfigValue<Integer> steel_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_level;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_uses;
    public static ForgeConfigSpec.ConfigValue<Double> mithril_speed;
    public static ForgeConfigSpec.ConfigValue<Double> mithril_damage;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_level;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_uses;
    public static ForgeConfigSpec.ConfigValue<Double> adamant_speed;
    public static ForgeConfigSpec.ConfigValue<Double> adamant_damage;
    public static ForgeConfigSpec.ConfigValue<Integer> adamant_enchantment_value;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_level;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_uses;
    public static ForgeConfigSpec.ConfigValue<Double> rune_speed;
    public static ForgeConfigSpec.ConfigValue<Double> rune_damage;
    public static ForgeConfigSpec.ConfigValue<Integer> rune_enchantment_value;

    public static void init(ForgeConfigSpec.Builder builder) {
        builder.comment("Bronze Item Tier");

        bronze_level = builder
                .comment("Harvest Level of Bronze Tools. Default value is 1.")
                .defineInRange("item_tier.bronze.bronze_level", 1, 0, 4);
        bronze_uses = builder
                .comment("Max Uses of Bronze Tools. Default value is 250.")
                .defineInRange("item_tier.bronze.bronze_uses", 250, 0, 10000);
        bronze_speed = builder
                .comment("Mining Speed of Bronze Tools. Default value is 6.0.")
                .defineInRange("item_tier.bronze.bronze_speed", 6.0, 0.0, 1000.0);
        bronze_damage = builder
                .comment("Attack Damage of Bronze Tools. Default value is 2.0.")
                .defineInRange("item_tier.bronze.bronze_damage", 2.0, 0.0, 1000.0);
        bronze_enchantment_value = builder
                .comment("Enchantment Value of Bronze Tools. Default value is 14.")
                .defineInRange("item_tier.bronze.bronze_enchantment_value", 14, 0, 1000);

        builder.comment("Steel Item Tier");

        steel_level = builder
                .comment("Harvest Level of Steel Tools. Default value is 2.")
                .defineInRange("item_tier.steel.steel_level", 2, 0, 4);
        steel_uses = builder
                .comment("Max Uses of Steel Tools. Default value is 521.")
                .defineInRange("item_tier.steel.steel_uses", 521, 0, 10000);
        steel_speed = builder
                .comment("Mining Speed of Steel Tools. Default value is 7.0.")
                .defineInRange("item_tier.steel.steel_speed", 7.0, 0.0, 1000.0);
        steel_damage = builder
                .comment("Attack Damage of Steel Tools. Default value is 2.5.")
                .defineInRange("item_tier.steel.steel_damage", 2.5, 0.0, 1000.0);
        steel_enchantment_value = builder
                .comment("Enchantment Value of Steel Tools. Default value is 13.")
                .defineInRange("item_tier.steel.steel_enchantment_value", 13, 0, 1000);

        builder.comment("Mithril Item Tier");

        mithril_level = builder
                .comment("Harvest Level of Mithril Tools. Default value is 2.")
                .defineInRange("item_tier.mithril.mithril_level", 2, 0, 4);
        mithril_uses = builder
                .comment("Max Uses of Mithril Tools. Default value is 991.")
                .defineInRange("item_tier.mithril.mithril_uses", 991, 0, 10000);
        mithril_speed = builder
                .comment("Mining Speed of Mithril Tools. Default value is 7.5.")
                .defineInRange("item_tier.mithril.mithril_speed", 7.5, 0.0, 1000.0);
        mithril_damage = builder
                .comment("Attack Damage of Mithril Tools. Default value is 2.5.")
                .defineInRange("item_tier.mithril.mithril_damage", 2.5, 0.0, 1000.0);
        mithril_enchantment_value = builder
                .comment("Enchantment Value of Mithril Tools. Default value is 12.")
                .defineInRange("item_tier.mithril.mithril_enchantment_value", 12, 0, 1000);

        builder.comment("Adamant Item Tier");

        adamant_level = builder
                .comment("Harvest Level of Adamant Tools. Default value is 3.")
                .defineInRange("item_tier.adamant.adamant_level", 3, 0, 4);
        adamant_uses = builder
                .comment("Max Uses of Adamant Tools. Default value is 1251.")
                .defineInRange("item_tier.adamant.adamant_uses", 1251, 0, 10000);
        adamant_speed = builder
                .comment("Mining Speed of Adamant Tools. Default value is 8.0.")
                .defineInRange("item_tier.adamant.adamant_speed", 8.0, 0.0, 1000.0);
        adamant_damage = builder
                .comment("Attack Damage of Adamant Tools. Default value is 3.0.")
                .defineInRange("item_tier.adamant.adamant_damage", 3.0, 0.0, 1000.0);
        adamant_enchantment_value = builder
                .comment("Enchantment Value of Adamant Tools. Default value is 11.")
                .defineInRange("item_tier.adamant.adamant_enchantment_value", 11, 0, 1000);

        builder.comment("Rune Item Tier");

        rune_level = builder
                .comment("Harvest Level of Rune Tools. Default value is 4.")
                .defineInRange("item_tier.rune.rune_level", 4, 0, 4);
        rune_uses = builder
                .comment("Max Uses of Rune Tools. Default value is 1901.")
                .defineInRange("item_tier.rune.rune_uses", 1901, 0, 10000);
        rune_speed = builder
                .comment("Mining Speed of Rune Tools. Default value is 8.5.")
                .defineInRange("item_tier.rune.rune_speed", 8.5, 0.0, 1000.0);
        rune_damage = builder
                .comment("Attack Damage of Rune Tools. Default value is 4.0.")
                .defineInRange("item_tier.rune.rune_damage", 4.0, 0.0, 1000.0);
        rune_enchantment_value = builder
                .comment("Enchantment Value of Rune Tools. Default value is 15.")
                .defineInRange("item_tier.rune.rune_enchantment_value", 15, 0, 1000);

    }
}
