package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModArrowItem extends ArrowItem {
    private final ArrowMaterial material;
    private final float damage;

    public ModArrowItem(ArrowMaterial material, float damage, Settings settings) {
        super(settings);
        this.material = material;
        this.damage = damage;
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        ModArrowEntity arrow = new ModArrowEntity(this.material, shooter, world);
        arrow.setDamage(this.damage);
        return arrow;
    }
}
