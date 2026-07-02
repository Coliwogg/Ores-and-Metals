package com.coliwogg.oresandmetals;


import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.entity.client.ModArrowRenderer;
import com.coliwogg.oresandmetals.item.ModCreativeModeTabs;
import com.coliwogg.oresandmetals.platform.NeoForgeRegistryHelper;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

@Mod(Constants.MOD_ID)
public class OresandMetalsNeoForge {

    public static IEventBus EVENT_BUS;

    public OresandMetalsNeoForge(IEventBus modEventBus) {
        EVENT_BUS = modEventBus;

        NeoForgeRegistryHelper.CREATIVE_MODE_TABS.register(EVENT_BUS);
        NeoForgeRegistryHelper.ITEMS.register(EVENT_BUS);
        NeoForgeRegistryHelper.BLOCKS.register(EVENT_BUS);
        NeoForgeRegistryHelper.ENTITY_TYPES.register(EVENT_BUS);

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

    @EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
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