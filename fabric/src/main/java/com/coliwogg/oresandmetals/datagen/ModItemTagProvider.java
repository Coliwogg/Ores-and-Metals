package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get())
                .add(ModItems.STEEL_HELMET.get(), ModItems.STEEL_CHESTPLATE.get(), ModItems.STEEL_LEGGINGS.get(), ModItems.STEEL_BOOTS.get())
                .add(ModItems.MITHRIL_HELMET.get(), ModItems.MITHRIL_CHESTPLATE.get(), ModItems.MITHRIL_LEGGINGS.get(), ModItems.MITHRIL_BOOTS.get())
                .add(ModItems.ADAMANT_HELMET.get(), ModItems.ADAMANT_CHESTPLATE.get(), ModItems.ADAMANT_LEGGINGS.get(), ModItems.ADAMANT_BOOTS.get())
                .add(ModItems.RUNE_HELMET.get(), ModItems.RUNE_CHESTPLATE.get(), ModItems.RUNE_LEGGINGS.get(), ModItems.RUNE_BOOTS.get())
                .add(ModItems.ORIKALKUM_HELMET.get(), ModItems.ORIKALKUM_CHESTPLATE.get(), ModItems.ORIKALKUM_LEGGINGS.get(), ModItems.ORIKALKUM_BOOTS.get())
                .add(ModItems.NECRONIUM_HELMET.get(), ModItems.NECRONIUM_CHESTPLATE.get(), ModItems.NECRONIUM_LEGGINGS.get(), ModItems.NECRONIUM_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.STEEL_SWORD.get())
                .add(ModItems.MITHRIL_SWORD.get())
                .add(ModItems.ADAMANT_SWORD.get())
                .add(ModItems.RUNE_SWORD.get())
                .add(ModItems.ORIKALKUM_SWORD.get())
                .add(ModItems.NECRONIUM_SWORD.get());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.STEEL_PICKAXE.get())
                .add(ModItems.MITHRIL_PICKAXE.get())
                .add(ModItems.ADAMANT_PICKAXE.get())
                .add(ModItems.RUNE_PICKAXE.get())
                .add(ModItems.ORIKALKUM_PICKAXE.get())
                .add(ModItems.NECRONIUM_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.STEEL_SHOVEL.get())
                .add(ModItems.MITHRIL_SHOVEL.get())
                .add(ModItems.ADAMANT_SHOVEL.get())
                .add(ModItems.RUNE_SHOVEL.get())
                .add(ModItems.ORIKALKUM_SHOVEL.get())
                .add(ModItems.NECRONIUM_SHOVEL.get());

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.STEEL_AXE.get())
                .add(ModItems.MITHRIL_AXE.get())
                .add(ModItems.ADAMANT_AXE.get())
                .add(ModItems.RUNE_AXE.get())
                .add(ModItems.ORIKALKUM_AXE.get())
                .add(ModItems.NECRONIUM_AXE.get());

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.STEEL_HOE.get())
                .add(ModItems.MITHRIL_HOE.get())
                .add(ModItems.ADAMANT_HOE.get())
                .add(ModItems.RUNE_HOE.get())
                .add(ModItems.ORIKALKUM_HOE.get())
                .add(ModItems.NECRONIUM_HOE.get());

        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(ModItems.BRONZE_ARROW.get())
                .add(ModItems.IRON_ARROW.get())
                .add(ModItems.STEEL_ARROW.get())
                .add(ModItems.MITHRIL_ARROW.get())
                .add(ModItems.ADAMANT_ARROW.get())
                .add(ModItems.RUNE_ARROW.get());
    }

}
