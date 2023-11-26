package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.RuneArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class RuneArrowItem extends ArrowItem {
    public final float damage;

    public RuneArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        RuneArrowEntity runeArrowEntity = new RuneArrowEntity(shooter, world);
        runeArrowEntity.setDamage(this.damage);
        return runeArrowEntity;
    }
}
