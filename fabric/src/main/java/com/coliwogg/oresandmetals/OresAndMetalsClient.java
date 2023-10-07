package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.entity.client.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class OresAndMetalsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BRONZE_ARROW, BronzeArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.IRON_ARROW, IronArrowRenderer::new);
        EntityRendererRegistry.register(ModEntities.STEEL_ARROW, SteelArrowRenderer::new);
    }
}
