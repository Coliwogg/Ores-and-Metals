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
                .add(ModItems.RUNE_HELMET, ModItems.RUNE_CHESTPLATE, ModItems.RUNE_LEGGINGS, ModItems.RUNE_BOOTS)
                .add(ModItems.ORIKALKUM_HELMET, ModItems.ORIKALKUM_CHESTPLATE, ModItems.ORIKALKUM_LEGGINGS, ModItems.ORIKALKUM_BOOTS)
                .add(ModItems.NECRONIUM_HELMET, ModItems.NECRONIUM_CHESTPLATE, ModItems.NECRONIUM_LEGGINGS, ModItems.NECRONIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD)
                .add(ModItems.STEEL_SWORD)
                .add(ModItems.MITHRIL_SWORD)
                .add(ModItems.ADAMANT_SWORD)
                .add(ModItems.RUNE_SWORD)
                .add(ModItems.ORIKALKUM_SWORD)
                .add(ModItems.NECRONIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE)
                .add(ModItems.STEEL_PICKAXE)
                .add(ModItems.MITHRIL_PICKAXE)
                .add(ModItems.ADAMANT_PICKAXE)
                .add(ModItems.RUNE_PICKAXE)
                .add(ModItems.ORIKALKUM_PICKAXE)
                .add(ModItems.NECRONIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL)
                .add(ModItems.STEEL_SHOVEL)
                .add(ModItems.MITHRIL_SHOVEL)
                .add(ModItems.ADAMANT_SHOVEL)
                .add(ModItems.RUNE_SHOVEL)
                .add(ModItems.ORIKALKUM_SHOVEL)
                .add(ModItems.NECRONIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE)
                .add(ModItems.STEEL_AXE)
                .add(ModItems.MITHRIL_AXE)
                .add(ModItems.ADAMANT_AXE)
                .add(ModItems.RUNE_AXE)
                .add(ModItems.ORIKALKUM_AXE)
                .add(ModItems.NECRONIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE)
                .add(ModItems.STEEL_HOE)
                .add(ModItems.MITHRIL_HOE)
                .add(ModItems.ADAMANT_HOE)
                .add(ModItems.RUNE_HOE)
                .add(ModItems.ORIKALKUM_HOE)
                .add(ModItems.NECRONIUM_HOE);

        getOrCreateTagBuilder(ItemTags.ARROWS)
                .add(ModItems.BRONZE_ARROW)
                .add(ModItems.IRON_ARROW)
                .add(ModItems.STEEL_ARROW)
                .add(ModItems.MITHRIL_ARROW)
                .add(ModItems.ADAMANT_ARROW)
                .add(ModItems.RUNE_ARROW);
    }
}
