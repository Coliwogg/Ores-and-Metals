package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.blocks.ModBlocks;
import com.coliwogg.oresandmetals.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.BRONZE_BLOCK.get())
                .add(ModBlocks.RAW_BRONZE_BLOCK.get())
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.RAW_STEEL_BLOCK.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get())
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE.get())
                .add(ModBlocks.ORICHALCITE_DEBRIS.get())
                .add(ModBlocks.NETHER_DRAKOLITH_ORE.get())
                .add(ModBlocks.RAW_DRAKOLITH_BLOCK.get())
                .add(ModBlocks.ORIKALKUM_BLOCK.get())
                .add(ModBlocks.END_PHASMATITE_ORE.get())
                .add(ModBlocks.NECRITE_DEBRIS.get())
                .add(ModBlocks.RAW_PHASMATITE_BLOCK.get())
                .add(ModBlocks.NECRONIUM_BLOCK.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE.get())
                .add(ModBlocks.DEEPSLATE_TIN_ORE.get())
                .add(ModBlocks.TIN_BLOCK.get())
                .add(ModBlocks.RAW_TIN_BLOCK.get())
                .add(ModBlocks.BRONZE_BLOCK.get())
                .add(ModBlocks.RAW_BRONZE_BLOCK.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.RAW_STEEL_BLOCK.get())
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get())
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE.get())
                .add(ModBlocks.ORICHALCITE_DEBRIS.get())
                .add(ModBlocks.NETHER_DRAKOLITH_ORE.get())
                .add(ModBlocks.RAW_DRAKOLITH_BLOCK.get())
                .add(ModBlocks.ORIKALKUM_BLOCK.get())
                .add(ModBlocks.END_PHASMATITE_ORE.get())
                .add(ModBlocks.NECRITE_DEBRIS.get())
                .add(ModBlocks.RAW_PHASMATITE_BLOCK.get())
                .add(ModBlocks.NECRONIUM_BLOCK.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BRONZE_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .add(ModBlocks.MITHRIL_BLOCK.get())
                .add(ModBlocks.RAW_MITHRIL_BLOCK.get())
                .add(ModBlocks.MITHRIL_ORE.get())
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .add(ModBlocks.ADAMANTITE_BLOCK.get())
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK.get())
                .add(ModBlocks.ADAMANTITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .add(ModBlocks.RUNITE_BLOCK.get())
                .add(ModBlocks.RAW_RUNITE_BLOCK.get())
                .add(ModBlocks.RUNITE_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .add(ModBlocks.ORICHALCITE_DEBRIS.get())
                .add(ModBlocks.NETHER_DRAKOLITH_ORE.get())
                .add(ModBlocks.RAW_DRAKOLITH_BLOCK.get())
                .add(ModBlocks.ORIKALKUM_BLOCK.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .add(ModBlocks.END_PHASMATITE_ORE.get())
                .add(ModBlocks.NECRITE_DEBRIS.get())
                .add(ModBlocks.RAW_PHASMATITE_BLOCK.get())
                .add(ModBlocks.NECRONIUM_BLOCK.get());

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_STONE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_IRON_TOOL)
                .addTag(ModTags.Blocks.NEEDS_STEEL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_STEEL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MITHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_MITHRIL_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ADAMANT_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_ADAMANT_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(ModTags.Blocks.NEEDS_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_RUNE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_ORIKALKUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NECRONIUM_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.INCORRECT_FOR_NECRONIUM_TOOL);
    }
}
