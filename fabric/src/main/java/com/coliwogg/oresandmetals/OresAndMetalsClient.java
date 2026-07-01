package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.entity.client.ModArrowRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class OresAndMetalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BRONZE_ARROW, ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.IRON_ARROW, ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.STEEL_ARROW, ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.MITHRIL_ARROW, ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.ADAMANT_ARROW, ModArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.RUNE_ARROW, ModArrowRenderer::new);
    }
}
