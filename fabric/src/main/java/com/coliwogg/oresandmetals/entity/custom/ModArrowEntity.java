package com.coliwogg.oresandmetals.entity.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModArrowEntity extends PersistentProjectileEntity {
    private final ArrowMaterial material;

    public ModArrowEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
        this.material = ArrowMaterial.fromType(entityType);
    }

    public ModArrowEntity(ArrowMaterial material, LivingEntity owner, World world) {
        super(material.getEntityType(), owner, world);
        this.material = material;
    }

    public ArrowMaterial getMaterial() {
        return this.material;
    }

    @Override
    public ItemStack asItemStack() {
        return this.material.getItemStack();
    }
}
