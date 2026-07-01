package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.entity.ModEntities;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.EntityTypeTags;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagProvider extends FabricTagProvider.EntityTypeTagProvider {
    public ModEntityTypeTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(EntityTypeTags.ARROWS)
                .add(ModEntities.BRONZE_ARROW.get())
                .add(ModEntities.IRON_ARROW.get())
                .add(ModEntities.STEEL_ARROW.get())
                .add(ModEntities.MITHRIL_ARROW.get())
                .add(ModEntities.ADAMANT_ARROW.get())
                .add(ModEntities.RUNE_ARROW.get());
    }
}
