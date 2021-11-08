package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.world.entity.projectile.AdamantArrow;
import com.coliwogg.oresandmetals.world.entity.projectile.MithrilArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AdamantArrowItem extends ArrowItem {
    public final float damage;

    public AdamantArrowItem(Properties properties, float damage) {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level pLevel, ItemStack pStack, LivingEntity pShooter) {
        AdamantArrow arrow = new AdamantArrow(pShooter, pLevel, ModItems.ADAMANT_ARROW.get());
        arrow.setBaseDamage(this.damage);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player) {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant > 0 && this.getClass() == AdamantArrowItem.class;
    }
}
