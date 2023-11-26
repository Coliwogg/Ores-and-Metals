package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.AdamantArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(value=EnvType.CLIENT)
public class AdamantArrowRenderer extends ProjectileEntityRenderer<AdamantArrowEntity> {
    private static final Identifier TEXTURE = new Identifier(OresAndMetals.MOD_ID, "textures/entity/projectiles/adamant_arrow.png");

    public AdamantArrowRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(AdamantArrowEntity entity) {
        return TEXTURE;
    }
}
