package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.config.Config;
import com.coliwogg.oresandmetals.item.BronzeArrowItem;
import com.coliwogg.oresandmetals.item.ModItems;
import com.coliwogg.oresandmetals.world.entity.ModEntityType;
import com.coliwogg.oresandmetals.world.entity.projectile.BronzeArrow;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OresAndMetals.MOD_ID)
public class OresAndMetals {
    public static final String MOD_ID = "oresandmetals";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public OresAndMetals() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModEntityType.register(eventBus);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);

        eventBus.addListener(this::setup);

        Config.loadConfig(Config.SPEC, FMLPaths.CONFIGDIR.get().resolve("oresandmetals-common.toml").toString());


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event) {

    }


}
