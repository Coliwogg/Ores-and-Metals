package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<BronzeArrowEntity> BRONZE_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "bronze_arrow"),
            FabricEntityTypeBuilder.<BronzeArrowEntity>create(SpawnGroup.MISC, BronzeArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<IronArrowEntity> IRON_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "iron_arrow"),
            FabricEntityTypeBuilder.<IronArrowEntity>create(SpawnGroup.MISC, IronArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<SteelArrowEntity> STEEL_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "steel_arrow"),
            FabricEntityTypeBuilder.<SteelArrowEntity>create(SpawnGroup.MISC, SteelArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<MithrilArrowEntity> MITHRIL_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "mithril_arrow"),
            FabricEntityTypeBuilder.<MithrilArrowEntity>create(SpawnGroup.MISC, MithrilArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<AdamantArrowEntity> ADAMANT_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "adamant_arrow"),
            FabricEntityTypeBuilder.<AdamantArrowEntity>create(SpawnGroup.MISC, AdamantArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<RuneArrowEntity> RUNE_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "rune_arrow"),
            FabricEntityTypeBuilder.<RuneArrowEntity>create(SpawnGroup.MISC, RuneArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
}
