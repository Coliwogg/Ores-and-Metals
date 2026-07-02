package com.coliwogg.oresandmetals.util;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze_tool");
        public static final TagKey<Block> NEEDS_STEEL_TOOL = createTag("needs_steel_tool");
        public static final TagKey<Block> NEEDS_MITHRIL_TOOL = createTag("needs_mithril_tool");
        public static final TagKey<Block> NEEDS_ADAMANT_TOOL = createTag("needs_adamant_tool");
        public static final TagKey<Block> NEEDS_RUNE_TOOL = createTag("needs_rune_tool");
        public static final TagKey<Block> NEEDS_ORIKALKUM_TOOL = createTag("needs_orikalkum_tool");
        public static final TagKey<Block> NEEDS_NECRONIUM_TOOL = createTag("needs_necronium_tool");
        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");
        public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL = createTag("incorrect_for_steel_tool");
        public static final TagKey<Block> INCORRECT_FOR_MITHRIL_TOOL = createTag("incorrect_for_mithril_tool");
        public static final TagKey<Block> INCORRECT_FOR_ADAMANT_TOOL = createTag("incorrect_for_adamant_tool");
        public static final TagKey<Block> INCORRECT_FOR_RUNE_TOOL = createTag("incorrect_for_rune_tool");
        public static final TagKey<Block> INCORRECT_FOR_ORIKALKUM_TOOL = createTag("incorrect_for_orikalkum_tool");
        public static final TagKey<Block> INCORRECT_FOR_NECRONIUM_TOOL = createTag("incorrect_for_necronium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, OresAndMetals.identifier(name));

        }
    }
}
