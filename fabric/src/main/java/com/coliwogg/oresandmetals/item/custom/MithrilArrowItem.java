package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.custom.MithrilArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class MithrilArrowItem extends ArrowItem {
    public final float damage;

    public MithrilArrowItem(float damage, Settings settings) {
        super(settings);
        this.damage = damage;
    }

    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        MithrilArrowEntity mithrilArrowEntity = new MithrilArrowEntity(shooter, world);
        mithrilArrowEntity.setDamage(this.damage);
        return mithrilArrowEntity;
    }
}
