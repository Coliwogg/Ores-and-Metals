package com.coliwogg.oresandmetals.entity.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModArrowEntity extends AbstractArrow {

    public ModArrowEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
    }

    public ModArrowEntity(ArrowMaterial material, LivingEntity owner, Level level) {
        super(material.getEntityType(), owner, level, material.getItemStack(), owner.getUseItem());
    }

    public ArrowMaterial getMaterial() {
        return ArrowMaterial.fromType(getType());
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        ArrowMaterial material = ArrowMaterial.fromType(getType());
        return material.getItemStack();
    }
}
