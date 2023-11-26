package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.SteelArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SteelArrowItem extends ArrowItem {
    public final float damage;

    public SteelArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        SteelArrowEntity steelArrowEntity = new SteelArrowEntity(shooter, world);
        steelArrowEntity.setDamage(this.damage);
        return steelArrowEntity;
    }
}