package com.coliwogg.oresandmetals.world.gen;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.config.OreGenConfig;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    TIN(Lazy.of(ModBlocks.TIN_ORE), Lazy.of(ModBlocks.DEEPSLATE_TIN_ORE), OreGenConfig.tin_vein_size.get(), OreGenConfig.tin_min_height.get(), OreGenConfig.tin_max_height.get(), OreGenConfig.tin_count.get(), OreGenConfig.generate_tin.get()),
    MITHRIL(Lazy.of(ModBlocks.MITHRIL_ORE), Lazy.of(ModBlocks.DEEPSLATE_MITHRIL_ORE), OreGenConfig.mithril_vein_size.get(), OreGenConfig.mithril_min_height.get(), OreGenConfig.mithril_max_height.get(), OreGenConfig.mithril_count.get(), OreGenConfig.generate_mithril.get()),
    ADAMANTITE(Lazy.of(ModBlocks.ADAMANTITE_ORE), Lazy.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE), OreGenConfig.adamantite_vein_size.get(), OreGenConfig.adamantite_min_height.get(), OreGenConfig.adamantite_max_height.get(), OreGenConfig.adamantite_count.get(), OreGenConfig.generate_adamantite.get()),
    RUNITE(Lazy.of(ModBlocks.RUNITE_ORE), Lazy.of(ModBlocks.DEEPSLATE_RUNITE_ORE), OreGenConfig.runite_vein_size.get(), OreGenConfig.runite_min_height.get(), OreGenConfig.runite_max_height.get(), OreGenConfig.runite_count.get(), OreGenConfig.generate_runite.get());

    private final Lazy<Block> block;
    private final Lazy<Block> deepslateBlock;
    private final int veinSize;
    private final int minHeight;
    private final int maxHeight;
    private final int oreCount;
    private final boolean generateOreToggle;

    OreType(Lazy<Block> block, Lazy<Block> deepslateBlock, int veinSize, int minHeight, int maxHeight, int oreCount, boolean generateOreToggle) {
        this.block = block;
        this.deepslateBlock = deepslateBlock;
        this.veinSize = veinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.oreCount = oreCount;
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

    public int getOreCount() {
        return oreCount;
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
