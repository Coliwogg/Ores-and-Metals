package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;

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

    public ResourceLocation getTexture() {
        return OresAndMetals.identifier("textures/entity/projectiles/" + this.name + "_arrow.png");
    }

    public ItemStack getItemStack() {
        switch (this) {
            case BRONZE:
                return new ItemStack(ModItems.BRONZE_ARROW.get());
            case IRON:
                return new ItemStack(ModItems.IRON_ARROW.get());
            case STEEL:
                return new ItemStack(ModItems.STEEL_ARROW.get());
            case MITHRIL:
                return new ItemStack(ModItems.MITHRIL_ARROW.get());
            case ADAMANT:
                return new ItemStack(ModItems.ADAMANT_ARROW.get());
            case RUNE:
                return new ItemStack(ModItems.RUNE_ARROW.get());
            default:
                return ItemStack.EMPTY;
        }
    }

    public EntityType<? extends AbstractArrow> getEntityType() {
        switch (this) {
            case BRONZE:
                return ModEntities.BRONZE_ARROW.get();
            case IRON:
                return ModEntities.IRON_ARROW.get();
            case STEEL:
                return ModEntities.STEEL_ARROW.get();
            case MITHRIL:
                return ModEntities.MITHRIL_ARROW.get();
            case ADAMANT:
                return ModEntities.ADAMANT_ARROW.get();
            case RUNE:
                return ModEntities.RUNE_ARROW.get();
            default:
                throw new IllegalStateException("Unsupported arrow material: " + this);
        }
    }

    public static ArrowMaterial fromType(EntityType<?> type) {
        if (type == ModEntities.BRONZE_ARROW.get()) {
            return BRONZE;
        }
        if (type == ModEntities.IRON_ARROW.get()) {
            return IRON;
        }
        if (type == ModEntities.STEEL_ARROW.get()) {
            return STEEL;
        }
        if (type == ModEntities.MITHRIL_ARROW.get()) {
            return MITHRIL;
        }
        if (type == ModEntities.ADAMANT_ARROW.get()) {
            return ADAMANT;
        }
        if (type == ModEntities.RUNE_ARROW.get()) {
            return RUNE;
        }
        throw new IllegalArgumentException("Unknown arrow entity type: " + type);
    }

}
