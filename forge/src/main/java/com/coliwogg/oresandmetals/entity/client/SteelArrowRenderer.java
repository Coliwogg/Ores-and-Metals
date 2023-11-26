package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.IronArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.SteelArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class SteelArrowRenderer extends ArrowRenderer<SteelArrowEntity> {
    public SteelArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(SteelArrowEntity pEntity) {
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/steel_arrow.png");
    }
}
