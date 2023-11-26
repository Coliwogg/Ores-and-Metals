package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.AdamantArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.MithrilArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class AdamantArrowRenderer extends ArrowRenderer<AdamantArrowEntity> {
    public AdamantArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(AdamantArrowEntity pEntity) {
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/adamant_arrow.png");
    }
}
