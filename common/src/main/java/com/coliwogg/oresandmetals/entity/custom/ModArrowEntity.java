package com.coliwogg.oresandmetals.entity.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModArrowEntity extends AbstractArrow {
    private final ArrowMaterial material;

    public ModArrowEntity(EntityType<? extends AbstractArrow> entityType, Level level) {
        super(entityType, level);
        this.material = ArrowMaterial.fromType(entityType);
    }

    public ModArrowEntity(ArrowMaterial material, LivingEntity owner, Level level) {
        super(material.getEntityType(), owner, level, material.getItemStack(), ItemStack.EMPTY);
        this.material = material;
    }

    public ArrowMaterial getMaterial() {
        return material;
    }

    @Override
    protected ItemStack getDefaultPickupItem() {
        return material.getItemStack();
    }
}
