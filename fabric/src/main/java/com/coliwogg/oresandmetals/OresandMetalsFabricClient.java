package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.entity.client.ModArrowRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class OresandMetalsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BRONZE_ARROW.get(), ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.IRON_ARROW.get(), ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.STEEL_ARROW.get(), ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.MITHRIL_ARROW.get(), ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.ADAMANT_ARROW.get(), ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.RUNE_ARROW.get(), ModArrowRenderer::new);
    }
}
