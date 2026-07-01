package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public enum ArrowMaterial {
    BRONZE("bronze"),
    IRON("iron"),
    STEEL("steel"),
    MITHRIL("mithril"),
    ADAMANT("adamant"),
    RUNE("rune");

    private final String name;

    ArrowMaterial(String name) {
        this.name = name;
    }

    public Identifier getTexture() {
        return new Identifier(OresAndMetals.MOD_ID, "textures/entity/projectiles/" + this.name + "_arrow.png");
    }

    public ItemStack getItemStack() {
        switch (this) {
            case BRONZE:
                return new ItemStack(ModItems.BRONZE_ARROW);
            case IRON:
                return new ItemStack(ModItems.IRON_ARROW);
            case STEEL:
                return new ItemStack(ModItems.STEEL_ARROW);
            case MITHRIL:
                return new ItemStack(ModItems.MITHRIL_ARROW);
            case ADAMANT:
                return new ItemStack(ModItems.ADAMANT_ARROW);
            case RUNE:
                return new ItemStack(ModItems.RUNE_ARROW);
            default:
                return ItemStack.EMPTY;
        }
    }

    public EntityType<? extends PersistentProjectileEntity> getEntityType() {
        switch (this) {
            case BRONZE:
                return ModEntities.BRONZE_ARROW;
            case IRON:
                return ModEntities.IRON_ARROW;
            case STEEL:
                return ModEntities.STEEL_ARROW;
            case MITHRIL:
                return ModEntities.MITHRIL_ARROW;
            case ADAMANT:
                return ModEntities.ADAMANT_ARROW;
            case RUNE:
                return ModEntities.RUNE_ARROW;
            default:
                throw new IllegalStateException("Unsupported arrow material: " + this);
        }
    }

    public static ArrowMaterial fromType(EntityType<? extends PersistentProjectileEntity> type) {
        if (type == ModEntities.BRONZE_ARROW) {
            return BRONZE;
        }
        if (type == ModEntities.IRON_ARROW) {
            return IRON;
        }
        if (type == ModEntities.STEEL_ARROW) {
            return STEEL;
        }
        if (type == ModEntities.MITHRIL_ARROW) {
            return MITHRIL;
        }
        if (type == ModEntities.ADAMANT_ARROW) {
            return ADAMANT;
        }
        if (type == ModEntities.RUNE_ARROW) {
            return RUNE;
        }
        throw new IllegalArgumentException("Unknown arrow entity type: " + type);
    }
}
