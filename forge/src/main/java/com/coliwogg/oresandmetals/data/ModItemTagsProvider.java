package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, OresAndMetals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
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
                        ModItems.RUNE_BOOTS.get());

        this.tag(ItemTags.ARROWS)
                .add(ModItems.BRONZE_ARROW.get(),
                        ModItems.IRON_ARROW.get(),
                        ModItems.STEEL_ARROW.get(),
                        ModItems.MITHRIL_ARROW.get(),
                        ModItems.ADAMANT_ARROW.get(),
                        ModItems.RUNE_ARROW.get());
    }
}
