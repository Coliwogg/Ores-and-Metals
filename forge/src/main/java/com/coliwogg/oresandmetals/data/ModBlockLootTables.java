package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        this.dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.RUNITE_BLOCK.get());
        this.dropSelf(ModBlocks.ORIKALKUM_BLOCK.get());
        this.dropSelf(ModBlocks.NECRONIUM_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_RUNITE_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_DRAKOLITH_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_PHASMATITE_BLOCK.get());
        this.dropSelf(ModBlocks.ORICHALCITE_DEBRIS.get());
        this.dropSelf(ModBlocks.NECRITE_DEBRIS.get());

        this.add(ModBlocks.TIN_ORE.get(), (block) -> createCopperLikeOreDrops(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), (block) -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.MITHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        this.add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        this.add(ModBlocks.ADAMANTITE_ORE.get(), (block) -> createOreDrop(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        this.add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        this.add(ModBlocks.RUNITE_ORE.get(), (block) -> createOreDrop(ModBlocks.RUNITE_ORE.get(), ModItems.RAW_RUNITE.get()));
        this.add(ModBlocks.DEEPSLATE_RUNITE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUNITE_ORE.get(), ModItems.RAW_RUNITE.get()));
        this.add(ModBlocks.NETHER_DRAKOLITH_ORE.get(), (block) -> createOreDrop(ModBlocks.NETHER_DRAKOLITH_ORE.get(), ModItems.RAW_DRAKOLITH.get()));
        this.add(ModBlocks.END_PHASMATITE_ORE.get(), (block) -> createOreDrop(ModBlocks.END_PHASMATITE_ORE.get(), ModItems.RAW_PHASMATITE.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
