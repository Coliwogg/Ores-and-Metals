package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.AdamantArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.RuneArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class RuneArrowRenderer extends ArrowRenderer<RuneArrowEntity> {
    public RuneArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(RuneArrowEntity pEntity) {
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/rune_arrow.png");
    }
}
