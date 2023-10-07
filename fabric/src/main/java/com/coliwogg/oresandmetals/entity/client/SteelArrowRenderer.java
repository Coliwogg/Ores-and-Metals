package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.SteelArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(value= EnvType.CLIENT)

public class SteelArrowRenderer extends ProjectileEntityRenderer<SteelArrowEntity> {
    public SteelArrowRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SteelArrowEntity entity) {
        return new Identifier(OresAndMetals.MOD_ID, "textures/entity/projectiles/steel_arrow.png");
    }
}
