package com.coliwogg.oresandmetals.client;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.client.renderer.*;
import com.coliwogg.oresandmetals.init.EntityInit;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = OresandMetals.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void onClientSetup(final FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.BRONZE_ARROW.get(), BronzeArrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.IRON_ARROW.get(), IronArrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.STEEL_ARROW.get(), SteelArrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.MITHRIL_ARROW.get(), MithrilArrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.ADAMANT_ARROW.get(), AdamantArrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(EntityInit.RUNE_ARROW.get(), RuneArrowRenderer::new);
    }
}