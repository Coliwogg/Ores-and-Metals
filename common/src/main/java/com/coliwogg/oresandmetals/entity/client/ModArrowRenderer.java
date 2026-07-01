package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class ModArrowRenderer extends ArrowRenderer<ModArrowEntity> {

    public ModArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(ModArrowEntity entity) {
        return entity.getMaterial().getTexture();
    }

}
