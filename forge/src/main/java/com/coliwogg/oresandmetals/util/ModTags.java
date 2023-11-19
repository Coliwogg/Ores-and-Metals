package com.coliwogg.oresandmetals.util;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = tag("needs_bronze_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = tag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = tag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_ADAMANT_TOOL = tag("needs_adamant_tool");
        public static final TagKey<Block> NEEDS_RUNE_TOOL = tag("needs_rune_tool");
        public static final TagKey<Block> NEEDS_ORIKALKUM_TOOL = tag("needs_orikalkum_tool");
        public static final TagKey<Block> NEEDS_NECRONIUM_TOOL = tag("needs_necronium_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(OresAndMetals.MOD_ID, name));
        }
    }
}
