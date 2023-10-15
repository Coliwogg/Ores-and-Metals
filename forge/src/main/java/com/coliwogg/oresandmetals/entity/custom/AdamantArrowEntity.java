package com.coliwogg.oresandmetals.entity.custom;

import com.coliwogg.oresandmetals.entity.ModEntities;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AdamantArrowEntity extends AbstractArrow {
    public AdamantArrowEntity(EntityType<? extends AbstractArrow> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public AdamantArrowEntity(LivingEntity pShooter, Level pLevel) {
        super(ModEntities.ADAMANT_ARROW.get(), pShooter, pLevel);
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(ModItems.ADAMANT_ARROW.get());
    }
}
