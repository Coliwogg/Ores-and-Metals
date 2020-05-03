package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.entity.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class EntityInit {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, OresandMetals.MODID);

    public static final RegistryObject<EntityType<BronzeArrowEntity>> BRONZE_ARROW = ENTITY_TYPES.register("bronze_arrow",
            () -> EntityType.Builder.<BronzeArrowEntity>create(BronzeArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "bronze_arrow").toString()));
    public static final RegistryObject<EntityType<IronArrowEntity>> IRON_ARROW = ENTITY_TYPES.register("iron_arrow",
            () -> EntityType.Builder.<IronArrowEntity>create(IronArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "iron_arrow").toString()));
    public static final RegistryObject<EntityType<SteelArrowEntity>> STEEL_ARROW = ENTITY_TYPES.register("steel_arrow",
            () -> EntityType.Builder.<SteelArrowEntity>create(SteelArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "steel_arrow").toString()));
    public static final RegistryObject<EntityType<MithrilArrowEntity>> MITHRIL_ARROW = ENTITY_TYPES.register("mithril_arrow",
            () -> EntityType.Builder.<MithrilArrowEntity>create(MithrilArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "mithril_arrow").toString()));
    public static final RegistryObject<EntityType<AdamantArrowEntity>> ADAMANT_ARROW = ENTITY_TYPES.register("adamant_arrow",
            () -> EntityType.Builder.<AdamantArrowEntity>create(AdamantArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "adamant_arrow").toString()));
    public static final RegistryObject<EntityType<RuneArrowEntity>> RUNE_ARROW = ENTITY_TYPES.register("rune_arrow",
            () -> EntityType.Builder.<RuneArrowEntity>create(RuneArrowEntity::new, EntityClassification.MISC).build(new ResourceLocation(OresandMetals.MODID, "rune_arrow").toString()));

}
