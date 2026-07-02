package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET.get(),
                        ModItems.BRONZE_CHESTPLATE.get(),
                        ModItems.BRONZE_LEGGINGS.get(),
                        ModItems.BRONZE_BOOTS.get(),
                        ModItems.STEEL_HELMET.get(),
                        ModItems.STEEL_CHESTPLATE.get(),
                        ModItems.STEEL_LEGGINGS.get(),
                        ModItems.STEEL_BOOTS.get(),
                        ModItems.MITHRIL_HELMET.get(),
                        ModItems.MITHRIL_CHESTPLATE.get(),
                        ModItems.MITHRIL_LEGGINGS.get(),
                        ModItems.MITHRIL_BOOTS.get(),
                        ModItems.ADAMANT_HELMET.get(),
                        ModItems.ADAMANT_CHESTPLATE.get(),
                        ModItems.ADAMANT_LEGGINGS.get(),
                        ModItems.ADAMANT_BOOTS.get(),
                        ModItems.RUNE_HELMET.get(),
                        ModItems.RUNE_CHESTPLATE.get(),
                        ModItems.RUNE_LEGGINGS.get(),
                        ModItems.RUNE_BOOTS.get(),
                        ModItems.ORIKALKUM_HELMET.get(),
                        ModItems.ORIKALKUM_CHESTPLATE.get(),
                        ModItems.ORIKALKUM_LEGGINGS.get(),
                        ModItems.ORIKALKUM_BOOTS.get(),
                        ModItems.NECRONIUM_HELMET.get(),
                        ModItems.NECRONIUM_CHESTPLATE.get(),
                        ModItems.NECRONIUM_LEGGINGS.get(),
                        ModItems.NECRONIUM_BOOTS.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.STEEL_SWORD.get())
                .add(ModItems.MITHRIL_SWORD.get())
                .add(ModItems.ADAMANT_SWORD.get())
                .add(ModItems.RUNE_SWORD.get())
                .add(ModItems.ORIKALKUM_SWORD.get())
                .add(ModItems.NECRONIUM_SWORD.get());

        tag(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.STEEL_PICKAXE.get())
                .add(ModItems.MITHRIL_PICKAXE.get())
                .add(ModItems.ADAMANT_PICKAXE.get())
                .add(ModItems.RUNE_PICKAXE.get())
                .add(ModItems.ORIKALKUM_PICKAXE.get())
                .add(ModItems.NECRONIUM_PICKAXE.get());

        tag(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.STEEL_SHOVEL.get())
                .add(ModItems.MITHRIL_SHOVEL.get())
                .add(ModItems.ADAMANT_SHOVEL.get())
                .add(ModItems.RUNE_SHOVEL.get())
                .add(ModItems.ORIKALKUM_SHOVEL.get())
                .add(ModItems.NECRONIUM_SHOVEL.get());

        tag(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.STEEL_AXE.get())
                .add(ModItems.MITHRIL_AXE.get())
                .add(ModItems.ADAMANT_AXE.get())
                .add(ModItems.RUNE_AXE.get())
                .add(ModItems.ORIKALKUM_AXE.get())
                .add(ModItems.NECRONIUM_AXE.get());

        tag(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.STEEL_HOE.get())
                .add(ModItems.MITHRIL_HOE.get())
                .add(ModItems.ADAMANT_HOE.get())
                .add(ModItems.RUNE_HOE.get())
                .add(ModItems.ORIKALKUM_HOE.get())
                .add(ModItems.NECRONIUM_HOE.get());

        tag(ItemTags.ARROWS)
                .add(ModItems.BRONZE_ARROW.get(),
                        ModItems.IRON_ARROW.get(),
                        ModItems.STEEL_ARROW.get(),
                        ModItems.MITHRIL_ARROW.get(),
                        ModItems.ADAMANT_ARROW.get(),
                        ModItems.RUNE_ARROW.get());

        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.BRONZE_HELMET.get(),
                        ModItems.STEEL_HELMET.get(),
                        ModItems.MITHRIL_HELMET.get(),
                        ModItems.ADAMANT_HELMET.get(),
                        ModItems.RUNE_HELMET.get(),
                        ModItems.ORIKALKUM_HELMET.get(),
                        ModItems.NECRONIUM_HELMET.get());

        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.BRONZE_CHESTPLATE.get(),
                        ModItems.STEEL_CHESTPLATE.get(),
                        ModItems.MITHRIL_CHESTPLATE.get(),
                        ModItems.ADAMANT_CHESTPLATE.get(),
                        ModItems.RUNE_CHESTPLATE.get(),
                        ModItems.ORIKALKUM_CHESTPLATE.get(),
                        ModItems.NECRONIUM_CHESTPLATE.get());

        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.BRONZE_LEGGINGS.get(),
                        ModItems.STEEL_LEGGINGS.get(),
                        ModItems.MITHRIL_LEGGINGS.get(),
                        ModItems.ADAMANT_LEGGINGS.get(),
                        ModItems.RUNE_LEGGINGS.get(),
                        ModItems.ORIKALKUM_LEGGINGS.get(),
                        ModItems.NECRONIUM_LEGGINGS.get());

        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.BRONZE_BOOTS.get(),
                        ModItems.STEEL_BOOTS.get(),
                        ModItems.MITHRIL_BOOTS.get(),
                        ModItems.ADAMANT_BOOTS.get(),
                        ModItems.RUNE_BOOTS.get(),
                        ModItems.ORIKALKUM_BOOTS.get(),
                        ModItems.NECRONIUM_BOOTS.get());

    }
}
