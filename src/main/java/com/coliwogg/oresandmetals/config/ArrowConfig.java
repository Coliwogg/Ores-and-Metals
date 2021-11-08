package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ArrowConfig {

    public static ForgeConfigSpec.ConfigValue<Double> bronze_arrow_damage;
    public static ForgeConfigSpec.ConfigValue<Double> iron_arrow_damage;
    public static ForgeConfigSpec.ConfigValue<Double> steel_arrow_damage;
    public static ForgeConfigSpec.ConfigValue<Double> mithril_arrow_damage;
    public static ForgeConfigSpec.ConfigValue<Double> adamant_arrow_damage;
    public static ForgeConfigSpec.ConfigValue<Double> rune_arrow_damage;

    public static void init(ForgeConfigSpec.Builder builder) {
        builder.comment("Mod Arrow Damage Configuration");

        bronze_arrow_damage = builder
                .comment("The damage multiplier for Bronze Arrows. Default value is 1.1")
                .defineInRange("arrows.bronze.bronze_arrow_damage", 1.1, 0.0, 100.0);
        iron_arrow_damage = builder
                .comment("The damage multiplier for Iron Arrows. Default value is 1.2")
                .defineInRange("arrows.iron.iron_arrow_damage", 1.2, 0.0, 100.0);
        steel_arrow_damage = builder
                .comment("The damage multiplier for Steel Arrows. Default value is 1.3")
                .defineInRange("arrows.steel.steel_arrow_damage", 1.3, 0.0, 100.0);
        mithril_arrow_damage = builder
                .comment("The damage multiplier for Mithril Arrows. Default value is 1.4")
                .defineInRange("arrows.mithril.mithril_arrow_damage", 1.4, 0.0, 100.0);
        adamant_arrow_damage = builder
                .comment("The damage multiplier for Adamant Arrows. Default value is 1.5")
                .defineInRange("arrows.adamant.adamant_arrow_damage", 1.5, 0.0, 100.0);
        rune_arrow_damage = builder
                .comment("The damage multiplier for Rune Arrows. Default value is 1.6")
                .defineInRange("arrows.rune.rune_arrow_damage", 1.6, 0.0, 100.0);
    }
}
