package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.entity.ModEntities;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagsProvider extends EntityTypeTagsProvider {
    public ModEntityTypeTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, completableFuture, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(EntityTypeTags.ARROWS)
                .add(ModEntities.BRONZE_ARROW.get(),
                        ModEntities.IRON_ARROW.get(),
                        ModEntities.STEEL_ARROW.get(),
                        ModEntities.MITHRIL_ARROW.get(),
                        ModEntities.ADAMANT_ARROW.get(),
                        ModEntities.RUNE_ARROW.get());
    }
}
