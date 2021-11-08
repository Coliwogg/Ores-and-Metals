package com.coliwogg.oresandmetals.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.client.renderer.entity.*;
import com.coliwogg.oresandmetals.world.entity.ModEntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OresAndMetals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {
    @SubscribeEvent
    public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityType.BRONZE_ARROW.get(), BronzeArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.IRON_ARROW.get(), IronArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.STEEL_ARROW.get(), SteelArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.MITHRIL_ARROW.get(), MithrilArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.ADAMANT_ARROW.get(), AdamantArrowRenderer::new);
        event.registerEntityRenderer(ModEntityType.RUNE_ARROW.get(), RuneArrowRenderer::new);
    }
}
