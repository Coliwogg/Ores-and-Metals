package com.coliwogg.oresandmetals.entity.client;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.MithrilArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.SteelArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class MithrilArrowRenderer extends ArrowRenderer<MithrilArrowEntity> {
    public MithrilArrowRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(MithrilArrowEntity pEntity) {
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/mithril_arrow.png");
    }
}
