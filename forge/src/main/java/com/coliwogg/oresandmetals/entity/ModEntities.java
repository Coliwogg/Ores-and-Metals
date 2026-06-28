package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OresAndMetals.MOD_ID);

    public static final RegistryObject<EntityType<ModArrowEntity>> BRONZE_ARROW = registerArrow("bronze_arrow");
    public static final RegistryObject<EntityType<ModArrowEntity>> IRON_ARROW = registerArrow("iron_arrow");
    public static final RegistryObject<EntityType<ModArrowEntity>> STEEL_ARROW = registerArrow("steel_arrow");
    public static final RegistryObject<EntityType<ModArrowEntity>> MITHRIL_ARROW = registerArrow("mithril_arrow");
    public static final RegistryObject<EntityType<ModArrowEntity>> ADAMANT_ARROW = registerArrow("adamant_arrow");
    public static final RegistryObject<EntityType<ModArrowEntity>> RUNE_ARROW = registerArrow("rune_arrow");

    private static RegistryObject<EntityType<ModArrowEntity>> registerArrow(String name) {
        return ENTITY_TYPES.register(name, () -> EntityType.Builder.<ModArrowEntity>of(ModArrowEntity::new, MobCategory.MISC)
                .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build(name));
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
