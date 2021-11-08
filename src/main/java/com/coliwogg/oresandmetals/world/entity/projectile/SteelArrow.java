package com.coliwogg.oresandmetals.world.entity.projectile;

import com.coliwogg.oresandmetals.item.ModItems;
import com.coliwogg.oresandmetals.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;


public class SteelArrow extends AbstractArrow {
    private final Item referenceItem;

    public SteelArrow(EntityType<? extends AbstractArrow> type, Level level) {
        super(type, level);
        this.referenceItem = ModItems.STEEL_ARROW.get();
    }

    public SteelArrow(LivingEntity shooter, Level level, Item referenceItem) {
        super(ModEntityType.STEEL_ARROW.get(), shooter, level);
        this.referenceItem = referenceItem;
    }

    @Override
    public ItemStack getPickupItem() {
        return new ItemStack(this.referenceItem);
    }


}
