package com.coliwogg.oresandmetals.world.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.world.entity.projectile.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityType {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, OresAndMetals.MOD_ID);

    public static final RegistryObject<EntityType<BronzeArrow>> BRONZE_ARROW;
    public static final RegistryObject<EntityType<IronArrow>> IRON_ARROW;
    public static final RegistryObject<EntityType<SteelArrow>> STEEL_ARROW;
    public static final RegistryObject<EntityType<MithrilArrow>> MITHRIL_ARROW;
    public static final RegistryObject<EntityType<AdamantArrow>> ADAMANT_ARROW;
    public static final RegistryObject<EntityType<RuneArrow>> RUNE_ARROW;

    static {
        BRONZE_ARROW = ENTITIES.register("bronze_arrow", () -> EntityType.Builder.<BronzeArrow>of(BronzeArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "bronze_arrow").toString()));
        IRON_ARROW = ENTITIES.register("iron_arrow", () -> EntityType.Builder.<IronArrow>of(IronArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "iron_arrow").toString()));
        STEEL_ARROW = ENTITIES.register("steel_arrow", () -> EntityType.Builder.<SteelArrow>of(SteelArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "steel_arrow").toString()));
        MITHRIL_ARROW = ENTITIES.register("mithril_arrow", () -> EntityType.Builder.<MithrilArrow>of(MithrilArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "mithril_arrow").toString()));
        ADAMANT_ARROW = ENTITIES.register("adamant_arrow", () -> EntityType.Builder.<AdamantArrow>of(AdamantArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "adamant_arrow").toString()));
        RUNE_ARROW = ENTITIES.register("rune_arrow", () -> EntityType.Builder.<RuneArrow>of(RuneArrow::new, MobCategory.MISC)
                .sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(OresAndMetals.MOD_ID, "rune_arrow").toString()));
    }

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }

}
