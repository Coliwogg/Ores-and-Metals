package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.AdamantArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class AdamantArrowItem extends ArrowItem {
    public final float damage;

    public AdamantArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        AdamantArrowEntity adamantArrowEntity = new AdamantArrowEntity(shooter, world);
        adamantArrowEntity.setDamage(this.damage);
        return adamantArrowEntity;
    }
}
