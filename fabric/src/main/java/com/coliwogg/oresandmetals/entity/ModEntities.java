package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
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
                    .dimensions(EntityDimensions.fixed(0.5f, 0.5f)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(20) // necessary for all thrown projectiles (as it prevents it from breaking, lol)
                    .build()
    );
}
