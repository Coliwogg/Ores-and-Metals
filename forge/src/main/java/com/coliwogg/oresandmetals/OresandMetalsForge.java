package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.entity.client.ModArrowRenderer;
import com.coliwogg.oresandmetals.item.ModCreativeModeTabs;
import com.coliwogg.oresandmetals.platform.ForgeRegistryHelper;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.MOD_ID)
public class OresandMetalsForge {

    public static IEventBus EVENT_BUS;

    public OresandMetalsForge(FMLJavaModLoadingContext context) {
        EVENT_BUS = context.getModEventBus();

        ForgeRegistryHelper.CREATIVE_MODE_TABS.register(EVENT_BUS);
        ForgeRegistryHelper.ITEMS.register(EVENT_BUS);
        ForgeRegistryHelper.BLOCKS.register(EVENT_BUS);
        ForgeRegistryHelper.ENTITY_TYPES.register(EVENT_BUS);

        EVENT_BUS.addListener(this::addCreative);

        OresAndMetals.init();
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            ModCreativeModeTabs.addItemsToIngredients(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            ModCreativeModeTabs.addBlocksToBuildingBlocks(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            ModCreativeModeTabs.addBlocksToNaturalBlocks(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            ModCreativeModeTabs.addItemsToCombat(event::accept);
        }

        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            ModCreativeModeTabs.addItemsToToolsAndUtilities(event::accept);
        }
    }

    @Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.BRONZE_ARROW.get(), ModArrowRenderer::new);
            EntityRenderers.register(ModEntities.IRON_ARROW.get(), ModArrowRenderer::new);
            EntityRenderers.register(ModEntities.STEEL_ARROW.get(), ModArrowRenderer::new);
            EntityRenderers.register(ModEntities.MITHRIL_ARROW.get(), ModArrowRenderer::new);
            EntityRenderers.register(ModEntities.ADAMANT_ARROW.get(), ModArrowRenderer::new);
            EntityRenderers.register(ModEntities.RUNE_ARROW.get(), ModArrowRenderer::new);
        }
    }
}