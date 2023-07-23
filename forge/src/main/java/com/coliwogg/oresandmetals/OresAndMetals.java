package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModCreativeModeTabs;
import com.coliwogg.oresandmetals.item.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OresAndMetals.MOD_ID)
public class OresAndMetals {
    public static final String MOD_ID = "oresandmetals";
    private static final Logger LOGGER = LogUtils.getLogger();

    public OresAndMetals() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.RAW_TIN);
            event.accept(ModItems.RAW_BRONZE);
            event.accept(ModItems.RAW_STEEL);
            event.accept(ModItems.RAW_MITHRIL);
            event.accept(ModItems.RAW_ADAMANTITE);
            event.accept(ModItems.RAW_RUNITE);
            event.accept(ModItems.TIN_INGOT);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.STEEL_INGOT);
            event.accept(ModItems.MITHRIL_SCRAP);
            event.accept(ModItems.MITHRIL_INGOT);
            event.accept(ModItems.ADAMANTITE_SCRAP);
            event.accept(ModItems.ADAMANTITE_INGOT);
            event.accept(ModItems.RUNITE_SCRAP);
            event.accept(ModItems.RUNITE_INGOT);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.STEEL_SWORD);
            event.accept(ModItems.MITHRIL_SWORD);
            event.accept(ModItems.ADAMANT_SWORD);
            event.accept(ModItems.RUNE_SWORD);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.STEEL_AXE);
            event.accept(ModItems.MITHRIL_AXE);
            event.accept(ModItems.ADAMANT_AXE);
            event.accept(ModItems.RUNE_AXE);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_HOE);
            event.accept(ModItems.STEEL_SHOVEL);
            event.accept(ModItems.STEEL_PICKAXE);
            event.accept(ModItems.STEEL_HOE);
            event.accept(ModItems.MITHRIL_SHOVEL);
            event.accept(ModItems.MITHRIL_PICKAXE);
            event.accept(ModItems.MITHRIL_HOE);
            event.accept(ModItems.ADAMANT_SHOVEL);
            event.accept(ModItems.ADAMANT_PICKAXE);
            event.accept(ModItems.ADAMANT_HOE);
            event.accept(ModItems.RUNE_SHOVEL);
            event.accept(ModItems.RUNE_PICKAXE);
            event.accept(ModItems.RUNE_HOE);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.TIN_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
            event.accept(ModBlocks.STEEL_BLOCK);
            event.accept(ModBlocks.MITHRIL_BLOCK);
            event.accept(ModBlocks.ADAMANTITE_BLOCK);
            event.accept(ModBlocks.RUNITE_BLOCK);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.RAW_TIN_BLOCK);
            event.accept(ModBlocks.RAW_BRONZE_BLOCK);
            event.accept(ModBlocks.RAW_STEEL_BLOCK);
            event.accept(ModBlocks.RAW_MITHRIL_BLOCK);
            event.accept(ModBlocks.RAW_ADAMANTITE_BLOCK);
            event.accept(ModBlocks.RAW_RUNITE_BLOCK);
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.MITHRIL_ORE);
            event.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE);
            event.accept(ModBlocks.ADAMANTITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
            event.accept(ModBlocks.RUNITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_RUNITE_ORE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
