package com.coliwogg.oresandmetals.client.renderer;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.entity.IronArrowEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class IronArrowRenderer extends ArrowRenderer<IronArrowEntity> {

    public IronArrowRenderer(EntityRendererManager rendererManagerIn) {
        super(rendererManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(IronArrowEntity entity) {
        Item referenceItem = entity.getArrowStack().getItem();
        return new ResourceLocation(OresandMetals.MODID + ":textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
    }

}
