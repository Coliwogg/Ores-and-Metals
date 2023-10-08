package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORES_AND_METALS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresAndMetals.MOD_ID, "oresandmetals"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.oresandmetals"))
                    .icon(() -> new ItemStack(ModItems.BRONZE_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TIN);
                        entries.add(ModItems.RAW_BRONZE);
                        entries.add(ModItems.RAW_STEEL);
                        entries.add(ModItems.RAW_MITHRIL);
                        entries.add(ModItems.RAW_ADAMANTITE);
                        entries.add(ModItems.RAW_RUNITE);
                        entries.add(ModItems.TIN_INGOT);
                        entries.add(ModItems.BRONZE_INGOT);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.MITHRIL_SCRAP);
                        entries.add(ModItems.MITHRIL_INGOT);
                        entries.add(ModItems.ADAMANTITE_SCRAP);
                        entries.add(ModItems.ADAMANTITE_INGOT);
                        entries.add(ModItems.RUNITE_SCRAP);
                        entries.add(ModItems.RUNITE_INGOT);

                        entries.add(ModItems.BRONZE_AXE);
                        entries.add(ModItems.BRONZE_SWORD);
                        entries.add(ModItems.BRONZE_SHOVEL);
                        entries.add(ModItems.BRONZE_HOE);
                        entries.add(ModItems.BRONZE_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.MITHRIL_AXE);
                        entries.add(ModItems.MITHRIL_SWORD);
                        entries.add(ModItems.MITHRIL_SHOVEL);
                        entries.add(ModItems.MITHRIL_HOE);
                        entries.add(ModItems.MITHRIL_PICKAXE);
                        entries.add(ModItems.ADAMANT_AXE);
                        entries.add(ModItems.ADAMANT_SWORD);
                        entries.add(ModItems.ADAMANT_SHOVEL);
                        entries.add(ModItems.ADAMANT_HOE);
                        entries.add(ModItems.ADAMANT_PICKAXE);
                        entries.add(ModItems.RUNE_AXE);
                        entries.add(ModItems.RUNE_SWORD);
                        entries.add(ModItems.RUNE_SHOVEL);
                        entries.add(ModItems.RUNE_HOE);
                        entries.add(ModItems.RUNE_PICKAXE);

                        entries.add(ModItems.BRONZE_HELMET);
                        entries.add(ModItems.BRONZE_CHESTPLATE);
                        entries.add(ModItems.BRONZE_LEGGINGS);
                        entries.add(ModItems.BRONZE_BOOTS);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModItems.MITHRIL_HELMET);
                        entries.add(ModItems.MITHRIL_CHESTPLATE);
                        entries.add(ModItems.MITHRIL_LEGGINGS);
                        entries.add(ModItems.MITHRIL_BOOTS);
                        entries.add(ModItems.ADAMANT_HELMET);
                        entries.add(ModItems.ADAMANT_CHESTPLATE);
                        entries.add(ModItems.ADAMANT_LEGGINGS);
                        entries.add(ModItems.ADAMANT_BOOTS);
                        entries.add(ModItems.RUNE_HELMET);
                        entries.add(ModItems.RUNE_CHESTPLATE);
                        entries.add(ModItems.RUNE_LEGGINGS);
                        entries.add(ModItems.RUNE_BOOTS);

                        entries.add(ModBlocks.TIN_BLOCK);
                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.MITHRIL_BLOCK);
                        entries.add(ModBlocks.ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RUNITE_BLOCK);
                        entries.add(ModBlocks.RAW_TIN_BLOCK);
                        entries.add(ModBlocks.RAW_BRONZE_BLOCK);
                        entries.add(ModBlocks.RAW_STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_MITHRIL_BLOCK);
                        entries.add(ModBlocks.RAW_ADAMANTITE_BLOCK);
                        entries.add(ModBlocks.RAW_RUNITE_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TIN_ORE);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MITHRIL_ORE);
                        entries.add(ModBlocks.ADAMANTITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ADAMANTITE_ORE);
                        entries.add(ModBlocks.RUNITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUNITE_ORE);

                        entries.add(ModItems.BRONZE_ARROW);
                        entries.add(ModItems.IRON_ARROW);
                        entries.add(ModItems.STEEL_ARROW);
                        entries.add(ModItems.MITHRIL_ARROW);
                        entries.add(ModItems.ADAMANT_ARROW);
                        entries.add(ModItems.RUNE_ARROW);
                    }).build());

    public static void registerItemGroups() {
        OresAndMetals.LOGGER.info("Registering ModItemGroups for " + OresAndMetals.MOD_ID);
    }
}
