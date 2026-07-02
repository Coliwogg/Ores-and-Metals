package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import com.coliwogg.oresandmetals.platform.Services;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.function.Supplier;

public class ModEntities {

    public static final Supplier<EntityType<ModArrowEntity>> BRONZE_ARROW = registerArrow("bronze_arrow");
    public static final Supplier<EntityType<ModArrowEntity>> IRON_ARROW = registerArrow("iron_arrow");
    public static final Supplier<EntityType<ModArrowEntity>> STEEL_ARROW = registerArrow("steel_arrow");
    public static final Supplier<EntityType<ModArrowEntity>> MITHRIL_ARROW = registerArrow("mithril_arrow");
    public static final Supplier<EntityType<ModArrowEntity>> ADAMANT_ARROW = registerArrow("adamant_arrow");
    public static final Supplier<EntityType<ModArrowEntity>> RUNE_ARROW = registerArrow("rune_arrow");

    private static Supplier<EntityType<ModArrowEntity>> registerArrow(String name) {
        return Services.REGISTRY.registerEntity(name, () -> EntityType.Builder.<ModArrowEntity>of(ModArrowEntity::new, MobCategory.MISC)
                .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(name));
    }

    public static void registerModEntities() {
        Constants.LOG.info("Registering Mod Entities for {}", Constants.MOD_ID);
    }
}
