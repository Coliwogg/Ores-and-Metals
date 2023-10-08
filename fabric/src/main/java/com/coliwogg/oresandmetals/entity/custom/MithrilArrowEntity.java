package com.coliwogg.oresandmetals.entity.custom;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MithrilArrowEntity extends PersistentProjectileEntity {
    public MithrilArrowEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public MithrilArrowEntity(LivingEntity owner, World world) {
        super(ModEntities.MITHRIL_ARROW, owner, world);
    }

    @Override
    public ItemStack asItemStack() {
        return new ItemStack(ModItems.MITHRIL_ARROW);
    }
}
