package com.coliwogg.oresandmetals.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OreGenConfig {
    public static ForgeConfigSpec.IntValue copper_chance, tin_chance, mithril_chance, adamantite_chance, runite_chance;
    public static ForgeConfigSpec.BooleanValue generate_copper, generate_tin, generate_mithril, generate_adamantite, generate_runite;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {

        server.comment("Ore Generation Config");

        /* Ore Chance Config */

        copper_chance = server
                .comment("Decide the number of ore veins of Copper Ore that can spawn in one chunk")
                .defineInRange("orechance.copper_chance", 15, 0, 30);

        tin_chance = server
                .comment("Decide the number of ore veins of Tin Ore that can spawn in one chunk")
                .defineInRange("orechance.tin_chance", 15, 0, 30);

        mithril_chance = server
                .comment("Decide the number of ore veins of Mithril Ore that can spawn in one chunk")
                .defineInRange("orechance.mithril_chance", 4, 0, 30);

        adamantite_chance = server
                .comment("Decide the number of ore veins of Adamantite Ore that can spawn in one chunk")
                .defineInRange("orechance.adamantite_chance", 3, 0, 30);

        runite_chance = server
                .comment("Decide the number of ore veins of Runite Ore that can spawn in one chunk")
                .defineInRange("orechance.runite_chance", 2, 0, 30);

        /* Ore Generation Config */

        generate_copper = server
                .comment("Decide if you want Copper Ore to spawn in the world")
                .define("oregen.generate_copper", true);

        generate_tin = server
                .comment("Decide if you want Tin Ore to spawn in the world")
                .define("oregen.generate_tin", true);

        generate_mithril = server
                .comment("Decide if you want Mithril Ore to spawn in the world")
                .define("oregen.generate_mithril", true);

        generate_adamantite = server
                .comment("Decide if you want Adamantite Ore to spawn in the world")
                .define("oregen.generate_adamantite", true);

        generate_runite = server
                .comment("Decide if you want Runite Ore to spawn in the world")
                .define("oregen.generate_runite", true);

    }
}
