package com.coliwogg.oresandmetals.blocks;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.platform.Services;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class ModBlocks {

    public static final Supplier<Block> TIN_BLOCK = Services.REGISTRY.registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.SNOW)));
    public static final Supplier<Block> BRONZE_BLOCK = Services.REGISTRY.registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> STEEL_BLOCK = Services.REGISTRY.registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_GRAY)));
    public static final Supplier<Block> MITHRIL_BLOCK = Services.REGISTRY.registerBlock("mithril_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Supplier<Block> ADAMANTITE_BLOCK = Services.REGISTRY.registerBlock("adamantite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Supplier<Block> RUNITE_BLOCK = Services.REGISTRY.registerBlock("runite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Supplier<Block> ORIKALKUM_BLOCK = Services.REGISTRY.registerBlock("orikalkum_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_RED)));
    public static final Supplier<Block> NECRONIUM_BLOCK = Services.REGISTRY.registerBlock("necronium_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK).mapColor(MapColor.COLOR_GREEN)));
    public static final Supplier<Block> TIN_ORE = Services.REGISTRY.registerBlock("tin_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final Supplier<Block> DEEPSLATE_TIN_ORE = Services.REGISTRY.registerBlock("deepslate_tin_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Supplier<Block> MITHRIL_ORE = Services.REGISTRY.registerBlock("mithril_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final Supplier<Block> DEEPSLATE_MITHRIL_ORE = Services.REGISTRY.registerBlock("deepslate_mithril_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Supplier<Block> ADAMANTITE_ORE = Services.REGISTRY.registerBlock("adamantite_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final Supplier<Block> DEEPSLATE_ADAMANTITE_ORE = Services.REGISTRY.registerBlock("deepslate_adamantite_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Supplier<Block> RUNITE_ORE = Services.REGISTRY.registerBlock("runite_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)));
    public static final Supplier<Block> DEEPSLATE_RUNITE_ORE = Services.REGISTRY.registerBlock("deepslate_runite_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Supplier<Block> NETHER_DRAKOLITH_ORE = Services.REGISTRY.registerBlock("nether_drakolith_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE)));
    public static final Supplier<Block> END_PHASMATITE_ORE = Services.REGISTRY.registerBlock("end_phasmatite_ore", () -> new DropExperienceBlock(ConstantInt.of(0), BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_GOLD_ORE).mapColor(MapColor.SAND)));
    public static final Supplier<Block> ORICHALCITE_DEBRIS = Services.REGISTRY.registerBlock("orichalcite_debris", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_RED)));
    public static final Supplier<Block> NECRITE_DEBRIS = Services.REGISTRY.registerBlock("necrite_debris", () -> new RotatedPillarBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ANCIENT_DEBRIS).mapColor(MapColor.COLOR_GREEN)));
    public static final Supplier<Block> RAW_TIN_BLOCK = Services.REGISTRY.registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.SNOW)));
    public static final Supplier<Block> RAW_BRONZE_BLOCK = Services.REGISTRY.registerBlock("raw_bronze_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_BROWN)));
    public static final Supplier<Block> RAW_STEEL_BLOCK = Services.REGISTRY.registerBlock("raw_steel_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.COLOR_GRAY)));
    public static final Supplier<Block> RAW_MITHRIL_BLOCK = Services.REGISTRY.registerBlock("raw_mithril_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Supplier<Block> RAW_ADAMANTITE_BLOCK = Services.REGISTRY.registerBlock("raw_adamantite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Supplier<Block> RAW_RUNITE_BLOCK = Services.REGISTRY.registerBlock("raw_runite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));
    public static final Supplier<Block> RAW_DRAKOLITH_BLOCK = Services.REGISTRY.registerBlock("raw_drakolith_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_ORANGE)));
    public static final Supplier<Block> RAW_PHASMATITE_BLOCK = Services.REGISTRY.registerBlock("raw_phasmatite_block", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK).mapColor(MapColor.TERRACOTTA_LIGHT_GREEN)));

    public static void registerModBlocks() {
        Constants.LOG.info("Registering Mod Blocks for " + Constants.MOD_ID);
    }

}
