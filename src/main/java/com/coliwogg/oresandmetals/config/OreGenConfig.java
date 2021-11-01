package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {

    public static ForgeConfigSpec.ConfigValue<Boolean> generate_tin;
    public static ForgeConfigSpec.ConfigValue<Integer> tin_vein_size;
    public static ForgeConfigSpec.ConfigValue<Integer> tin_min_height;
    public static ForgeConfigSpec.ConfigValue<Integer> tin_max_height;
    public static ForgeConfigSpec.ConfigValue<Integer> tin_count;
    public static ForgeConfigSpec.ConfigValue<Boolean> generate_mithril;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_vein_size;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_min_height;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_max_height;
    public static ForgeConfigSpec.ConfigValue<Integer> mithril_count;
    public static ForgeConfigSpec.ConfigValue<Boolean> generate_adamantite;
    public static ForgeConfigSpec.ConfigValue<Integer> adamantite_vein_size;
    public static ForgeConfigSpec.ConfigValue<Integer> adamantite_min_height;
    public static ForgeConfigSpec.ConfigValue<Integer> adamantite_max_height;
    public static ForgeConfigSpec.ConfigValue<Integer> adamantite_count;
    public static ForgeConfigSpec.ConfigValue<Boolean> generate_runite;
    public static ForgeConfigSpec.ConfigValue<Integer> runite_vein_size;
    public static ForgeConfigSpec.ConfigValue<Integer> runite_min_height;
    public static ForgeConfigSpec.ConfigValue<Integer> runite_max_height;
    public static ForgeConfigSpec.ConfigValue<Integer> runite_count;

    public static void init(ForgeConfigSpec.Builder builder) {
        builder.comment("Tin Ore Generation");

        generate_tin = builder
                .comment("Generate Tin Ore in the overworld - [true/false]")
                .define("ore_gen.tin_ore.generate_tin", true);
        tin_vein_size = builder
                .comment("Vein size of Tin Ore. Default value is 10.")
                .defineInRange("ore_gen.tin_ore.tin_vein_size", 10, 0, 1000);
        tin_min_height = builder
                .comment("The minimum height Tin Ore will generate. Default value is 0.")
                .defineInRange("ore_gen.tin_ore.tin_min_height", 0, 0, 1000);
        tin_max_height = builder
                .comment("The maximum height Tin Ore will generate. Default value is 96.")
                .defineInRange("ore_gen.tin_ore.tin_max_height", 96, 0, 1000);
        tin_count = builder
                .comment("Number of Tin Ore veins generated in a chunk. Default value is 6.")
                .defineInRange("ore_gen.tin_ore.tin_count", 6, 0, 1000);

        builder.comment("Mithril Ore Generation");

        generate_mithril = builder
                .comment("Generate Mithril Ore in the overworld - [true/false]")
                .define("ore_gen.mithril_ore.generate_mithril", true);
        mithril_vein_size = builder
                .comment("Vein size of Mithril Ore. Default value is 9.")
                .defineInRange("ore_gen.mithril_ore.mithril_vein_size", 9, 0, 1000);
        mithril_min_height = builder
                .comment("The minimum height Mithril Ore will generate. Default value is 0.")
                .defineInRange("ore_gen.mithril_ore.mithril_min_height", 0, 0, 1000);
        mithril_max_height = builder
                .comment("The maximum height Mithril Ore will generate. Default value is 31.")
                .defineInRange("ore_gen.mithril_ore.mithril_max_height", 31, 0, 1000);
        mithril_count = builder
                .comment("Number of Mithril Ore veins generated in a chunk. Default value is 4")
                .defineInRange("ore_gen.mithril_ore.mithril_count", 4, 0, 1000);

        builder.comment("Adamantite Ore Generation");

        generate_adamantite = builder
                .comment("Generate Adamantite Ore in the overworld - [true/false]")
                .define("ore_gen.adamantite_ore.generate_adamantite", true);
        adamantite_vein_size = builder
                .comment("Vein size of Adamantite Ore. Default value is 8.")
                .defineInRange("ore_gen.adamantite_ore.adamantite_vein_size", 8, 0, 1000);
        adamantite_min_height = builder
                .comment("The minimum height Adamantite Ore will generate. Default value is 0.")
                .defineInRange("ore_gen.adamantite_ore.adamantite_min_height", 0, 0, 1000);
        adamantite_max_height = builder
                .comment("The maximum height Adamantite Ore will generate. Default value is 23.")
                .defineInRange("ore_gen.adamantite_ore.adamantite_max_height", 23, 0, 1000);
        adamantite_count = builder
                .comment("Number of Adamantite Ore veins generated in a chunk. Default value is 2")
                .defineInRange("ore_gen.adamantite_ore.adamantite_count", 2, 0, 1000);

        builder.comment("Runite Ore Generation");

        generate_runite = builder
                .comment("Generate Runite Ore in the overworld - [true/false]")
                .define("ore_gen.runite_ore.generate_runite", true);
        runite_vein_size = builder
                .comment("Vein size of Runite Ore. Default value is 8.")
                .defineInRange("ore_gen.runite_ore.runite_vein_size", 7, 0, 1000);
        runite_min_height = builder
                .comment("The minimum height Runite Ore will generate. Default value is 0.")
                .defineInRange("ore_gen.runite_ore.runite_min_height", 0, 0, 1000);
        runite_max_height = builder
                .comment("The maximum height Runite Ore will generate. Default value is 23.")
                .defineInRange("ore_gen.runite_ore.runite_max_height", 15, 0, 1000);
        runite_count = builder
                .comment("Number of Runite Ore veins generated in a chunk. Default value is 2")
                .defineInRange("ore_gen.runite_ore.runite_count", 2, 0, 1000);
    }
}
