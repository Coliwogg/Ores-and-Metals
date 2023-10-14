package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class BronzeArrowRenderer extends ArrowRenderer<BronzeArrowEntity> {
    public BronzeArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(BronzeArrowEntity pEntity) {
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/bronze_arrow.png");
    }
}
