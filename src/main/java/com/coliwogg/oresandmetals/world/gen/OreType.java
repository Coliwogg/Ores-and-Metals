package com.coliwogg.oresandmetals.world.gen;

import com.coliwogg.oresandmetals.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    TIN(Lazy.of(ModBlocks.TIN_ORE), Lazy.of(ModBlocks.DEEPSLATE_TIN_ORE), 6, 0, 96, true),
    MITHRIL(Lazy.of(ModBlocks.MITHRIL_ORE), Lazy.of(ModBlocks.DEEPSLATE_MITHRIL_ORE), 4, 0, 31, true),
    ADAMANTITE(Lazy.of(ModBlocks.ADAMANTITE_ORE), Lazy.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE), 2, 0, 23, true),
    RUNITE(Lazy.of(ModBlocks.RUNITE_ORE), Lazy.of(ModBlocks.DEEPSLATE_RUNITE_ORE), 2, 0, 15, true);

    private final Lazy<Block> block;
    private final Lazy<Block> deepslateBlock;
    private final int veinSize;
    private final int minHeight;
    private final int maxHeight;
    private final boolean generateOreToggle;

    OreType(Lazy<Block> block, Lazy<Block> deepslateBlock, int veinSize, int minHeight, int maxHeight, boolean generateOreToggle) {
        this.block = block;
        this.deepslateBlock = deepslateBlock;
        this.veinSize = veinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.generateOreToggle = generateOreToggle;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public Lazy<Block> getDeepslateBlock() {
        return deepslateBlock;
    }

    public int getVeinSize() {
        return veinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean getGenerateOreToggle() {
        return generateOreToggle;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
