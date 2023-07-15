package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
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
        dropSelf(ModBlocks.TIN_BLOCK.get());
        dropSelf(ModBlocks.BRONZE_BLOCK.get());
        dropSelf(ModBlocks.STEEL_BLOCK.get());
        dropSelf(ModBlocks.MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.ADAMANTITE_BLOCK.get());
        dropSelf(ModBlocks.RUNITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        dropSelf(ModBlocks.RAW_BRONZE_BLOCK.get());
        dropSelf(ModBlocks.RAW_STEEL_BLOCK.get());
        dropSelf(ModBlocks.RAW_MITHRIL_BLOCK.get());
        dropSelf(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_RUNITE_BLOCK.get());

        add(ModBlocks.TIN_ORE.get(), (block) -> createTinOreDrops(ModBlocks.TIN_ORE.get()));
        add(ModBlocks.DEEPSLATE_TIN_ORE.get(), (block) -> createTinOreDrops(ModBlocks.DEEPSLATE_TIN_ORE.get()));
        add(ModBlocks.MITHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
        add(ModBlocks.ADAMANTITE_ORE.get(), (block) -> createOreDrop(ModBlocks.ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get()));
        add(ModBlocks.RUNITE_ORE.get(), (block) -> createOreDrop(ModBlocks.RUNITE_ORE.get(), ModItems.RAW_RUNITE.get()));
        add(ModBlocks.DEEPSLATE_RUNITE_ORE.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_RUNITE_ORE.get(), ModItems.RAW_RUNITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createTinOreDrops(Block pBlock) {
        return createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock, LootItem.lootTableItem(ModItems.RAW_TIN.get()).apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F))).apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }
}
