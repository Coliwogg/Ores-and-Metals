package com.coliwogg.oresandmetals.config;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;


public class Config {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        OreGenConfig.init(BUILDER);
        ItemTierConfig.init(BUILDER);
        ArmorMaterialConfig.init(BUILDER);

        SPEC = BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        OresAndMetals.LOGGER.info("Loading config: " + path);
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        OresAndMetals.LOGGER.info("Built config: " + path);
        file.load();
        OresAndMetals.LOGGER.info("Loaded config: " + path);
        config.setConfig(file);
    }

}
