package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, OresAndMetals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.RAW_BRONZE_BLOCK.get(),
                        ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.RAW_STEEL_BLOCK.get(),
                        ModBlocks.MITHRIL_ORE.get(),
                        ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                        ModBlocks.MITHRIL_BLOCK.get(),
                        ModBlocks.RAW_MITHRIL_BLOCK.get(),
                        ModBlocks.ADAMANTITE_ORE.get(),
                        ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(),
                        ModBlocks.ADAMANTITE_BLOCK.get(),
                        ModBlocks.RAW_ADAMANTITE_BLOCK.get(),
                        ModBlocks.RUNITE_ORE.get(),
                        ModBlocks.DEEPSLATE_RUNITE_ORE.get(),
                        ModBlocks.RUNITE_BLOCK.get(),
                        ModBlocks.RAW_RUNITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get(),
                        ModBlocks.DEEPSLATE_TIN_ORE.get(),
                        ModBlocks.TIN_BLOCK.get(),
                        ModBlocks.RAW_TIN_BLOCK.get(),
                        ModBlocks.BRONZE_BLOCK.get(),
                        ModBlocks.RAW_BRONZE_BLOCK.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get(),
                        ModBlocks.RAW_STEEL_BLOCK.get(),
                        ModBlocks.MITHRIL_ORE.get(),
                        ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                        ModBlocks.MITHRIL_BLOCK.get(),
                        ModBlocks.RAW_MITHRIL_BLOCK.get(),
                        ModBlocks.ADAMANTITE_ORE.get(),
                        ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(),
                        ModBlocks.ADAMANTITE_BLOCK.get(),
                        ModBlocks.RAW_ADAMANTITE_BLOCK.get());

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUNITE_ORE.get(),
                        ModBlocks.DEEPSLATE_RUNITE_ORE.get(),
                        ModBlocks.RUNITE_BLOCK.get(),
                        ModBlocks.RAW_RUNITE_BLOCK.get());
    }
}
