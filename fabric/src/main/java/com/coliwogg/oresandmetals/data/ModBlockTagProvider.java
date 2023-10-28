package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.RAW_BRONZE_BLOCK)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE)
                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE)
                .add(ModBlocks.RUNITE_BLOCK)
                .add(ModBlocks.RAW_RUNITE_BLOCK)
                .add(ModBlocks.RUNITE_ORE)
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE)
                .add(ModBlocks.ORICHALCITE_DEBRIS)
                .add(ModBlocks.NETHER_DRAKOLITH_ORE)
                .add(ModBlocks.RAW_DRAKOLITH_BLOCK)
                .add(ModBlocks.ORIKALKUM_BLOCK)
                .add(ModBlocks.END_PHASMATITE_ORE)
                .add(ModBlocks.NECRITE_DEBRIS)
                .add(ModBlocks.RAW_PHASMATITE_BLOCK)
                .add(ModBlocks.NECRONIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.TIN_ORE)
                .add(ModBlocks.DEEPSLATE_TIN_ORE)
                .add(ModBlocks.TIN_BLOCK)
                .add(ModBlocks.RAW_TIN_BLOCK)
                .add(ModBlocks.BRONZE_BLOCK)
                .add(ModBlocks.RAW_BRONZE_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.MITHRIL_BLOCK)
                .add(ModBlocks.RAW_MITHRIL_BLOCK)
                .add(ModBlocks.MITHRIL_ORE)
                .add(ModBlocks.DEEPSLATE_MITHRIL_ORE)
                .add(ModBlocks.ADAMANTITE_BLOCK)
                .add(ModBlocks.RAW_ADAMANTITE_BLOCK)
                .add(ModBlocks.ADAMANTITE_ORE)
                .add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUNITE_BLOCK)
                .add(ModBlocks.RAW_RUNITE_BLOCK)
                .add(ModBlocks.RUNITE_ORE)
                .add(ModBlocks.DEEPSLATE_RUNITE_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.ORICHALCITE_DEBRIS)
                .add(ModBlocks.NETHER_DRAKOLITH_ORE)
                .add(ModBlocks.RAW_DRAKOLITH_BLOCK)
                .add(ModBlocks.ORIKALKUM_BLOCK)
                .add(ModBlocks.END_PHASMATITE_ORE)
                .add(ModBlocks.NECRITE_DEBRIS)
                .add(ModBlocks.RAW_PHASMATITE_BLOCK)
                .add(ModBlocks.NECRONIUM_BLOCK);
    }
}
