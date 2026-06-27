package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;

public class ModArrowItem extends ArrowItem {
    private final ArrowMaterial material;
    private final float damage;

    public ModArrowItem(ArrowMaterial material, float damage, Properties properties) {
        super(properties);
        this.material = material;
        this.damage = damage;
    }

    @Override
    public AbstractArrow getArrow(Level level, ItemStack stack, LivingEntity shooter) {
        ModArrowEntity arrow = new ModArrowEntity(this.material, shooter, level);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }
}
