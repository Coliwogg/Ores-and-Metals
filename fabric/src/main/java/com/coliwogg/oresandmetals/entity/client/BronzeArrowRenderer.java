package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(value=EnvType.CLIENT)
public class BronzeArrowRenderer extends ProjectileEntityRenderer<BronzeArrowEntity> {
    public BronzeArrowRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(BronzeArrowEntity entity) {
        return new Identifier(OresAndMetals.MOD_ID, "textures/entity/projectiles/bronze_arrow.png");
    }
}
