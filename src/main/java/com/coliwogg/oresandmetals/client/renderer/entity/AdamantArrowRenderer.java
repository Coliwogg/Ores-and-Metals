package com.coliwogg.oresandmetals.client.renderer.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.world.entity.projectile.AdamantArrow;
import com.coliwogg.oresandmetals.world.entity.projectile.MithrilArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AdamantArrowRenderer extends ArrowRenderer<AdamantArrow> {
    public AdamantArrowRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(AdamantArrow pEntity) {
        Item referenceItem = pEntity.getPickupItem().getItem();
        return new ResourceLocation(OresAndMetals.MOD_ID, "textures/entity/projectiles/" + referenceItem.getRegistryName().getPath() + ".png");
    }
}
