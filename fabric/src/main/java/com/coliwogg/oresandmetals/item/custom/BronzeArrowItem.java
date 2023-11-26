package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BronzeArrowItem extends ArrowItem {
    public final float damage;

    public BronzeArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        BronzeArrowEntity bronzeArrowEntity = new BronzeArrowEntity(shooter, world);
        bronzeArrowEntity.setDamage(this.damage);
        return bronzeArrowEntity;
    }
}
