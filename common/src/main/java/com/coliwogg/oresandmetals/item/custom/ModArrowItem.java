package com.coliwogg.oresandmetals.item.custom;

import com.coliwogg.oresandmetals.entity.ArrowMaterial;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class ModArrowItem extends ArrowItem {

    private final ArrowMaterial material;
    private final float damage;

    public ModArrowItem(ArrowMaterial material, float damage, Properties properties) {
        super(properties);
        this.material = material;
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack ammo, LivingEntity shooter, @Nullable ItemStack weapon) {
        ModArrowEntity arrow = new ModArrowEntity(this.material, shooter, level);
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

}
