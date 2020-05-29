package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {

    public static ForgeConfigSpec.BooleanValue generate_copper;
    public static ForgeConfigSpec.IntValue copper_size;
    public static ForgeConfigSpec.IntValue copper_chance;
    public static ForgeConfigSpec.IntValue copper_min_height;
    public static ForgeConfigSpec.IntValue copper_max_height;

    public static ForgeConfigSpec.BooleanValue generate_tin;
    public static ForgeConfigSpec.IntValue tin_size;
    public static ForgeConfigSpec.IntValue tin_chance;
    public static ForgeConfigSpec.IntValue tin_min_height;
    public static ForgeConfigSpec.IntValue tin_max_height;

    public static ForgeConfigSpec.BooleanValue generate_mithril;
    public static ForgeConfigSpec.IntValue mithril_size;
    public static ForgeConfigSpec.IntValue mithril_chance;
    public static ForgeConfigSpec.IntValue mithril_min_height;
    public static ForgeConfigSpec.IntValue mithril_max_height;

    public static ForgeConfigSpec.BooleanValue generate_adamantite;
    public static ForgeConfigSpec.IntValue adamantite_size;
    public static ForgeConfigSpec.IntValue adamantite_chance;
    public static ForgeConfigSpec.IntValue adamantite_min_height;
    public static ForgeConfigSpec.IntValue adamantite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_runite;
    public static ForgeConfigSpec.IntValue runite_size;
    public static ForgeConfigSpec.IntValue runite_chance;
    public static ForgeConfigSpec.IntValue runite_min_height;
    public static ForgeConfigSpec.IntValue runite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_orichalcite;
    public static ForgeConfigSpec.IntValue orichalcite_size;
    public static ForgeConfigSpec.IntValue orichalcite_chance;
    public static ForgeConfigSpec.IntValue orichalcite_min_height;
    public static ForgeConfigSpec.IntValue orichalcite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_drakolith;
    public static ForgeConfigSpec.IntValue drakolith_size;
    public static ForgeConfigSpec.IntValue drakolith_chance;
    public static ForgeConfigSpec.IntValue drakolith_min_height;
    public static ForgeConfigSpec.IntValue drakolith_max_height;

    public static ForgeConfigSpec.BooleanValue generate_necrite;
    public static ForgeConfigSpec.IntValue necrite_size;
    public static ForgeConfigSpec.IntValue necrite_chance;
    public static ForgeConfigSpec.IntValue necrite_min_height;
    public static ForgeConfigSpec.IntValue necrite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_phasmatite;
    public static ForgeConfigSpec.IntValue phasmatite_size;
    public static ForgeConfigSpec.IntValue phasmatite_chance;
    public static ForgeConfigSpec.IntValue phasmatite_min_height;
    public static ForgeConfigSpec.IntValue phasmatite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_banite;
    public static ForgeConfigSpec.IntValue banite_size;
    public static ForgeConfigSpec.IntValue banite_chance;
    public static ForgeConfigSpec.IntValue banite_min_height;
    public static ForgeConfigSpec.IntValue banite_max_height;

    public static ForgeConfigSpec.BooleanValue generate_light_animica;
    public static ForgeConfigSpec.IntValue light_animica_size;
    public static ForgeConfigSpec.IntValue light_animica_chance;
    public static ForgeConfigSpec.IntValue light_animica_min_height;
    public static ForgeConfigSpec.IntValue light_animica_max_height;

    public static ForgeConfigSpec.BooleanValue generate_dark_animica;
    public static ForgeConfigSpec.IntValue dark_animica_size;
    public static ForgeConfigSpec.IntValue dark_animica_chance;
    public static ForgeConfigSpec.IntValue dark_animica_min_height;
    public static ForgeConfigSpec.IntValue dark_animica_max_height;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {

        server.comment("Copper Ore Generation");

        generate_copper = server
                .comment("Generate Copper Ore in the overworld - [true/false]")
                .define("oregen.copper_ore.generate_copper", true);

        copper_size = server
                .comment("Size of Copper Ore veins - default = 8")
                .defineInRange("oregen.copper_ore.copper_size", 8, 0, 100);

        copper_chance = server
                .comment("Number of Copper Ore veins generated in a chunk - default = 15")
                .defineInRange("oregen.copper_ore.copper_chance", 15, 0, 100);

        copper_min_height = server
                .comment("Minimum height for Copper Ore generation - default = 4")
                .defineInRange("oregen.copper_ore.copper_min_height", 4, 0, 255);

        copper_max_height = server
                .comment("Maximum height for Copper Ore generation - default = 128")
                .defineInRange("oregen.copper_ore.copper_max_height", 128, 0, 255);

        server.comment("Tin Ore Generation");

        generate_tin = server
                .comment("Generate Tin Ore in the overworld - [true/false]")
                .define("oregen.tin_ore.generate_tin", true);

        tin_size = server
                .comment("Size of Tin Ore veins - default = 8")
                .defineInRange("oregen.tin_ore.tin_size", 8, 0, 100);

        tin_chance = server
                .comment("Number of Tin Ore veins generated in a chunk - default = 15")
                .defineInRange("oregen.tin_ore.tin_chance", 15, 0, 100);

        tin_min_height = server
                .comment("Minimum height for Tin Ore generation - default = 4")
                .defineInRange("oregen.tin_ore.tin_min_height", 4, 0, 255);

        tin_max_height = server
                .comment("Maximum height for Tin Ore generation - default = 128")
                .defineInRange("oregen.tin_ore.tin_max_height", 128, 0, 255);

        server.comment("Mithril Ore Generation");

        generate_mithril = server
                .comment("Generate Mithril Ore in the overworld - [true/false]")
                .define("oregen.mithril_ore.generate_mithril", true);

        mithril_size = server
                .comment("Size of Mithril Ore veins - default = 6")
                .defineInRange("oregen.mithril_ore.mithril_size", 6, 0, 100);

        mithril_chance = server
                .comment("Number of Mithril Ore veins generated in a chunk - default = 4")
                .defineInRange("oregen.mithril_ore.mithril_chance", 4, 0, 100);

        mithril_min_height = server
                .comment("Minimum height for Mithril Ore generation - default = 4")
                .defineInRange("oregen.mithril_ore.mithril_min_height", 4, 0, 255);

        mithril_max_height = server
                .comment("Maximum height for Mithril Ore generation - default = 28")
                .defineInRange("oregen.mithril_ore.mithril_max_height", 28, 0, 255);

        server.comment("Adamantite Ore Generation");

        generate_adamantite = server
                .comment("Generate Tin Ore in the overworld - [true/false]")
                .define("oregen.adamantite_ore.generate_adamantite", true);

        adamantite_size = server
                .comment("Size of Adamantite Ore veins - default = 4")
                .defineInRange("oregen.adamantite_ore.adamantite_size", 4, 0, 100);

        adamantite_chance = server
                .comment("Number of Adamantite Ore veins generated in a chunk - default = 3")
                .defineInRange("oregen.adamantite_ore.adamantite_chance", 3, 0, 100);

        adamantite_min_height = server
                .comment("Minimum height for Adamantite Ore generation - default = 4")
                .defineInRange("oregen.adamantite_ore.adamantite_min_height", 4, 0, 255);

        adamantite_max_height = server
                .comment("Maximum height for Adamantite Ore generation - default = 24")
                .defineInRange("oregen.adamantite_ore.adamantite_max_height", 24, 0, 255);

        server.comment("Runite Ore Generation");

        generate_runite = server
                .comment("Generate Runite Ore in the overworld - [true/false]")
                .define("oregen.runite_ore.generate_runite", true);

        runite_size = server
                .comment("Size of Runite Ore veins - default = 4")
                .defineInRange("oregen.runite_ore.runite_size", 4, 0, 100);

        runite_chance = server
                .comment("Number of Runite Ore veins generated in a chunk - default = 6")
                .defineInRange("oregen.runite_ore.runite_chance", 6, 0, 100);

        runite_min_height = server
                .comment("Minimum height for Runite Ore generation - default = 4")
                .defineInRange("oregen.runite_ore.runite_min_height", 4, 0, 255);

        runite_max_height = server
                .comment("Maximum height for Runite Ore generation - default = 12")
                .defineInRange("oregen.runite_ore.runite_max_height", 12, 0, 255);

        server.comment("Orichalcite Ore Generation");

        generate_orichalcite = server
                .comment("Generate Orichalcite Ore in the overworld - [true/false]")
                .define("oregen.orichalcite_ore.generate_orichalcite", true);

        orichalcite_size = server
                .comment("Size of Orichalcite Ore veins - default = 4")
                .defineInRange("oregen.orichalcite_ore.orichalcite_size", 4, 0, 100);

        orichalcite_chance = server
                .comment("Number of Orichalcite Ore veins generated in a chunk - default = 8")
                .defineInRange("oregen.orichalcite_ore.orichalcite_chance", 8, 0, 100);

        orichalcite_min_height = server
                .comment("Minimum height for Orichalcite Ore generation - default = 4")
                .defineInRange("oregen.orichalcite_ore.orichalcite_min_height", 4, 0, 255);

        orichalcite_max_height = server
                .comment("Maximum height for Orichalcite Ore generation - default = 24")
                .defineInRange("oregen.orichalcite_ore.orichalcite_max_height", 24, 0, 255);

        server.comment("Drakolith Ore Generation");

        generate_drakolith = server
                .comment("Generate Drakolith Ore in the overworld - [true/false]")
                .define("oregen.drakolith_ore.generate_drakolith", true);

        drakolith_size = server
                .comment("Size of Drakolith Ore veins - default = 6")
                .defineInRange("oregen.drakolith_ore.drakolith_size", 6, 0, 100);

        drakolith_chance = server
                .comment("Number of Drakolith Ore veins generated in a chunk - default = 8")
                .defineInRange("oregen.drakolith_ore.drakolith_chance", 8, 0, 100);

        drakolith_min_height = server
                .comment("Minimum height for Drakolith Ore generation - default = 4")
                .defineInRange("oregen.drakolith_ore.drakolith_min_height", 4, 0, 255);

        drakolith_max_height = server
                .comment("Maximum height for Drakolith Ore generation - default = 24")
                .defineInRange("oregen.drakolith_ore.drakolith_max_height", 24, 0, 255);

        server.comment("Necrite Ore Generation");

        generate_necrite = server
                .comment("Generate Necrite Ore in the overworld - [true/false]")
                .define("oregen.necrite_ore.generate_necrite", true);

        necrite_size = server
                .comment("Size of Necrite Ore veins - default = 6")
                .defineInRange("oregen.necrite_ore.necrite_size", 6, 0, 100);

        necrite_chance = server
                .comment("Number of Necrite Ore veins generated in a chunk - default = 8")
                .defineInRange("oregen.necrite_ore.necrite_chance", 8, 0, 100);

        necrite_min_height = server
                .comment("Minimum height for Necrite Ore generation - default = 4")
                .defineInRange("oregen.necrite_ore.necrite_min_height", 4, 0, 255);

        necrite_max_height = server
                .comment("Maximum height for Necrite Ore generation - default = 24")
                .defineInRange("oregen.necrite_ore.necrite_max_height", 25, 0, 255);

        server.comment("Phasmatite Ore Generation");

        generate_phasmatite = server
                .comment("Generate Phasmatite Ore in the overworld - [true/false]")
                .define("oregen.phasmatite_ore.generate_phasmatite", true);

        phasmatite_size = server
                .comment("Size of Phasmatite Ore veins - default = 6")
                .defineInRange("oregen.phasmatite_ore.phasmatite_size", 6, 0, 100);

        phasmatite_chance = server
                .comment("Number of Phasmatite Ore veins generated in a chunk - default = 8")
                .defineInRange("oregen.phasmatite_ore.phasmatite_chance", 8, 0, 100);

        phasmatite_min_height = server
                .comment("Minimum height for Phasmatite Ore generation - default = 4")
                .defineInRange("oregen.phasmatite_ore.phasmatite_min_height", 4, 0, 255);

        phasmatite_max_height = server
                .comment("Maximum height for Phasmatite Ore generation - default = 24")
                .defineInRange("oregen.phasmatite_ore.phasmatite_max_height", 24, 0, 255);

        server.comment("Banite Ore Generation");

        generate_banite = server
                .comment("Generate Banite Ore in the overworld - [true/false]")
                .define("oregen.banite_ore.generate_banite", true);

        banite_size = server
                .comment("Size of Banite Ore veins - default = 6")
                .defineInRange("oregen.banite_ore.banite_size", 6, 0, 100);

        banite_chance = server
                .comment("Number of Banite Ore veins generated in a chunk - default = 8")
                .defineInRange("oregen.banite_ore.banite_chance", 8, 0, 100);

        banite_min_height = server
                .comment("Minimum height for Banite Ore generation - default = 4")
                .defineInRange("oregen.banite_ore.banite_min_height", 4, 0, 255);

        banite_max_height = server
                .comment("Maximum height for Banite Ore generation - default = 24")
                .defineInRange("oregen.banite_ore.banite_max_height", 24, 0, 255);

        server.comment("Light Animica Ore Generation");

        generate_light_animica = server
                .comment("Generate Light Animica Ore in The End - [true/false]")
                .define("oregen.light_animica_ore.generate_light_animica", true);

        light_animica_size = server
                .comment("Size of Light Animica Ore veins - default = 6")
                .defineInRange("oregen.light_animica_ore.light_animica_size", 6, 0, 100);

        light_animica_chance = server
                .comment("Number of Light Animica Ore veins generated in a chunk - default = 16")
                .defineInRange("oregen.light_animica_ore.light_animica_chance", 16, 0, 100);

        light_animica_min_height = server
                .comment("Minimum height for Light Animica Ore generation - default = 0")
                .defineInRange("oregen.light_animica_ore.light_animica_min_height", 0, 0, 255);

        light_animica_max_height = server
                .comment("Maximum height for Light Animica Ore generation - default = 70")
                .defineInRange("oregen.light_animica_ore.light_animica_max_height", 70, 0, 255);

        server.comment("Dark Animica Ore Generation");

        generate_dark_animica = server
                .comment("Generate Dark Animica Ore in The Nether - [true/false]")
                .define("oregen.dark_animica_ore.generate_dark_animica", true);

        dark_animica_size = server
                .comment("Size of Dark Animica Ore veins - default = 6")
                .defineInRange("oregen.dark_animica_ore.light_animica_size", 6, 0, 100);

        dark_animica_chance = server
                .comment("Number of Dark Animica Ore veins generated in a chunk - default = 16")
                .defineInRange("oregen.dark_animica_ore.dark_animica_size", 16, 0, 100);

        dark_animica_min_height = server
                .comment("Minimum height for Dark Animica Ore generation - default = 20")
                .defineInRange("oregen.dark_animica_ore.dark_animica_min_height", 20, 0, 255);

        dark_animica_max_height = server
                .comment("Maximum height for Dark Animica Ore generation - default = 255")
                .defineInRange("oregen.dark_animica_ore.dark_animica_max_height", 255, 0, 255);

    }
}
