package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, OresAndMetals.MOD_ID);

    public static final RegistryObject<EntityType<BronzeArrowEntity>> BRONZE_ARROW =
            ENTITY_TYPES.register("bronze_arrow", () -> EntityType.Builder.<BronzeArrowEntity>of(BronzeArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("bronze_arrow"));
    public static final RegistryObject<EntityType<IronArrowEntity>> IRON_ARROW =
                ENTITY_TYPES.register("iron_arrow", () -> EntityType.Builder.<IronArrowEntity>of(IronArrowEntity::new, MobCategory.MISC)
                        .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("iron_arrow"));
    public static final RegistryObject<EntityType<SteelArrowEntity>> STEEL_ARROW =
            ENTITY_TYPES.register("steel_arrow", () -> EntityType.Builder.<SteelArrowEntity>of(SteelArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("steel_arrow"));
    public static final RegistryObject<EntityType<MithrilArrowEntity>> MITHRIL_ARROW =
            ENTITY_TYPES.register("mithril_arrow", () -> EntityType.Builder.<MithrilArrowEntity>of(MithrilArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("mithril_arrow"));
    public static final RegistryObject<EntityType<AdamantArrowEntity>> ADAMANT_ARROW =
            ENTITY_TYPES.register("adamant_arrow", () -> EntityType.Builder.<AdamantArrowEntity>of(AdamantArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("adamant_arrow"));
    public static final RegistryObject<EntityType<RuneArrowEntity>> RUNE_ARROW =
            ENTITY_TYPES.register("rune_arrow", () -> EntityType.Builder.<RuneArrowEntity>of(RuneArrowEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).clientTrackingRange(4).updateInterval(20).build("rune_arrow"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
