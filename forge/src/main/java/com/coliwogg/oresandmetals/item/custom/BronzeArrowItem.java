package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class BronzeArrowItem extends ArrowItem {
    public final float damage;

    public BronzeArrowItem(float damage, Properties pProperties) {
        super(pProperties);
        this.damage = damage;
    }

    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        BronzeArrowEntity arrow = new BronzeArrowEntity(pShooter, pLevel);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }
}
