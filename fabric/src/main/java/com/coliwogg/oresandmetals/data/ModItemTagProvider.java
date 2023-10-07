package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS)
                .add(ModItems.STEEL_HELMET, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_LEGGINGS, ModItems.STEEL_BOOTS)
                .add(ModItems.MITHRIL_HELMET, ModItems.MITHRIL_CHESTPLATE, ModItems.MITHRIL_LEGGINGS, ModItems.MITHRIL_BOOTS)
                .add(ModItems.ADAMANT_HELMET, ModItems.ADAMANT_CHESTPLATE, ModItems.ADAMANT_LEGGINGS, ModItems.ADAMANT_BOOTS)
                .add(ModItems.RUNE_HELMET, ModItems.RUNE_CHESTPLATE, ModItems.RUNE_LEGGINGS, ModItems.RUNE_BOOTS);

        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(ModItems.BRONZE_ARROW)
                .add(ModItems.IRON_ARROW)
                .add(ModItems.STEEL_ARROW);
    }
}
