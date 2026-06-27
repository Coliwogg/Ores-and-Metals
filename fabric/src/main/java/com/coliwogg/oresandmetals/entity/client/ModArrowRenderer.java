package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(value = EnvType.CLIENT)
public class ModArrowRenderer extends ProjectileEntityRenderer<ModArrowEntity> {
    public ModArrowRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(ModArrowEntity entity) {
        return entity.getMaterial().getTexture();
    }
}
