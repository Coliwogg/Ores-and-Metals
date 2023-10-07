package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.IronArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IronArrowItem extends ArrowItem {
    public final float damage;

    public IronArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        IronArrowEntity ironArrowEntity = new IronArrowEntity(shooter, world);
        ironArrowEntity.setDamage(this.damage);
        return ironArrowEntity;
    }
}
