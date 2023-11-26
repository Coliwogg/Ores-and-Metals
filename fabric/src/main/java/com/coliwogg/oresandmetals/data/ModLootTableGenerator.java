package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.TIN_BLOCK);
        addDrop(ModBlocks.BRONZE_BLOCK);
        addDrop(ModBlocks.STEEL_BLOCK);
        addDrop(ModBlocks.MITHRIL_BLOCK);
        addDrop(ModBlocks.ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RUNITE_BLOCK);
        addDrop(ModBlocks.ORIKALKUM_BLOCK);
        addDrop(ModBlocks.NECRONIUM_BLOCK);
        addDrop(ModBlocks.RAW_TIN_BLOCK);
        addDrop(ModBlocks.RAW_BRONZE_BLOCK);
        addDrop(ModBlocks.RAW_STEEL_BLOCK);
        addDrop(ModBlocks.RAW_MITHRIL_BLOCK);
        addDrop(ModBlocks.RAW_ADAMANTITE_BLOCK);
        addDrop(ModBlocks.RAW_RUNITE_BLOCK);
        addDrop(ModBlocks.RAW_DRAKOLITH_BLOCK);
        addDrop(ModBlocks.RAW_PHASMATITE_BLOCK);
        addDrop(ModBlocks.ORICHALCITE_DEBRIS);
        addDrop(ModBlocks.NECRITE_DEBRIS);

        addDrop(ModBlocks.TIN_ORE, tinOreDrops(ModBlocks.TIN_ORE));
        addDrop(ModBlocks.DEEPSLATE_TIN_ORE, tinOreDrops(ModBlocks.DEEPSLATE_TIN_ORE));
        addDrop(ModBlocks.MITHRIL_ORE, oreDrops(ModBlocks.MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE, oreDrops(ModBlocks.DEEPSLATE_MITHRIL_ORE, ModItems.RAW_MITHRIL));
        addDrop(ModBlocks.ADAMANTITE_ORE, oreDrops(ModBlocks.ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        addDrop(ModBlocks.DEEPSLATE_ADAMANTITE_ORE, oreDrops(ModBlocks.DEEPSLATE_ADAMANTITE_ORE, ModItems.RAW_ADAMANTITE));
        addDrop(ModBlocks.RUNITE_ORE, oreDrops(ModBlocks.RUNITE_ORE, ModItems.RAW_RUNITE));
        addDrop(ModBlocks.DEEPSLATE_RUNITE_ORE, oreDrops(ModBlocks.DEEPSLATE_RUNITE_ORE, ModItems.RAW_RUNITE));
        addDrop(ModBlocks.NETHER_DRAKOLITH_ORE, oreDrops(ModBlocks.NETHER_DRAKOLITH_ORE, ModItems.RAW_DRAKOLITH));
        addDrop(ModBlocks.END_PHASMATITE_ORE, oreDrops(ModBlocks.END_PHASMATITE_ORE, ModItems.RAW_PHASMATITE));
    }

    public LootTable.Builder tinOreDrops(Block drop) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop, ((LeafEntry.Builder) ItemEntry.builder(ModItems.RAW_TIN).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}
