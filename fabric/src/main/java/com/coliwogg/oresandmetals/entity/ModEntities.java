package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ModArrowEntity> BRONZE_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "bronze_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<ModArrowEntity> IRON_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "iron_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<ModArrowEntity> STEEL_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "steel_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<ModArrowEntity> MITHRIL_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "mithril_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<ModArrowEntity> ADAMANT_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "adamant_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
    public static final EntityType<ModArrowEntity> RUNE_ARROW = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresAndMetals.MOD_ID, "rune_arrow"),
            FabricEntityTypeBuilder.<ModArrowEntity>create(SpawnGroup.MISC, ModArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f))
                    .trackRangeBlocks(4).trackedUpdateRate(20).build());
}
