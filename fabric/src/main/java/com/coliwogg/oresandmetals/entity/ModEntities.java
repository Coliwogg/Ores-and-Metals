package com.coliwogg.oresandmetals.entity;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.BronzeArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.IronArrowEntity;
import com.coliwogg.oresandmetals.entity.custom.SteelArrowEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
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

}
