package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.blocks.ModBlocks;
import com.coliwogg.oresandmetals.platform.Services;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {

    public static CreativeModeTab ORES_AND_METALS_TAB = null;

    public static void register() {
        ORES_AND_METALS_TAB = Services.REGISTRY.tabBuilder()
                .title(Component.translatable("creativetab.oresandmetals_tab"))
                .icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
                .displayItems(((itemDisplayParameters, output) -> {
                    output.accept(ModItems.RAW_TIN.get());
                    output.accept(ModItems.RAW_BRONZE.get());
                    output.accept(ModItems.RAW_STEEL.get());
                    output.accept(ModItems.RAW_MITHRIL.get());
                    output.accept(ModItems.RAW_ADAMANTITE.get());
                    output.accept(ModItems.RAW_RUNITE.get());
                    output.accept(ModItems.RAW_DRAKOLITH.get());
                    output.accept(ModItems.RAW_PHASMATITE.get());
                    output.accept(ModItems.MITHRIL_SCRAP.get());
                    output.accept(ModItems.ADAMANTITE_SCRAP.get());
                    output.accept(ModItems.RUNITE_SCRAP.get());
                    output.accept(ModItems.ORICHALCITE_SCRAP.get());
                    output.accept(ModItems.NECRITE_SCRAP.get());
                    output.accept(ModItems.TIN_INGOT.get());
                    output.accept(ModItems.BRONZE_INGOT.get());
                    output.accept(ModItems.STEEL_INGOT.get());
                    output.accept(ModItems.MITHRIL_INGOT.get());
                    output.accept(ModItems.ADAMANTITE_INGOT.get());
                    output.accept(ModItems.RUNITE_INGOT.get());
                    output.accept(ModItems.ORIKALKUM_INGOT.get());
                    output.accept(ModItems.NECRONIUM_INGOT.get());
                    output.accept(ModItems.BRONZE_SWORD.get());
                    output.accept(ModItems.BRONZE_SHOVEL.get());
                    output.accept(ModItems.BRONZE_PICKAXE.get());
                    output.accept(ModItems.BRONZE_AXE.get());
                    output.accept(ModItems.BRONZE_HOE.get());
                    output.accept(ModItems.STEEL_SWORD.get());
                    output.accept(ModItems.STEEL_SHOVEL.get());
                    output.accept(ModItems.STEEL_PICKAXE.get());
                    output.accept(ModItems.STEEL_AXE.get());
                    output.accept(ModItems.STEEL_HOE.get());
                    output.accept(ModItems.MITHRIL_SWORD.get());
                    output.accept(ModItems.MITHRIL_SHOVEL.get());
                    output.accept(ModItems.MITHRIL_PICKAXE.get());
                    output.accept(ModItems.MITHRIL_AXE.get());
                    output.accept(ModItems.MITHRIL_HOE.get());
                    output.accept(ModItems.ADAMANT_SWORD.get());
                    output.accept(ModItems.ADAMANT_SHOVEL.get());
                    output.accept(ModItems.ADAMANT_PICKAXE.get());
                    output.accept(ModItems.ADAMANT_AXE.get());
                    output.accept(ModItems.ADAMANT_HOE.get());
                    output.accept(ModItems.RUNE_SWORD.get());
                    output.accept(ModItems.RUNE_SHOVEL.get());
                    output.accept(ModItems.RUNE_PICKAXE.get());
                    output.accept(ModItems.RUNE_AXE.get());
                    output.accept(ModItems.RUNE_HOE.get());
                    output.accept(ModItems.ORIKALKUM_SWORD.get());
                    output.accept(ModItems.ORIKALKUM_SHOVEL.get());
                    output.accept(ModItems.ORIKALKUM_PICKAXE.get());
                    output.accept(ModItems.ORIKALKUM_AXE.get());
                    output.accept(ModItems.ORIKALKUM_HOE.get());
                    output.accept(ModItems.NECRONIUM_SWORD.get());
                    output.accept(ModItems.NECRONIUM_SHOVEL.get());
                    output.accept(ModItems.NECRONIUM_PICKAXE.get());
                    output.accept(ModItems.NECRONIUM_AXE.get());
                    output.accept(ModItems.NECRONIUM_HOE.get());
                    output.accept(ModItems.BRONZE_HELMET.get());
                    output.accept(ModItems.BRONZE_CHESTPLATE.get());
                    output.accept(ModItems.BRONZE_LEGGINGS.get());
                    output.accept(ModItems.BRONZE_BOOTS.get());
                    output.accept(ModItems.STEEL_HELMET.get());
                    output.accept(ModItems.STEEL_CHESTPLATE.get());
                    output.accept(ModItems.STEEL_LEGGINGS.get());
                    output.accept(ModItems.STEEL_BOOTS.get());
                    output.accept(ModItems.MITHRIL_HELMET.get());
                    output.accept(ModItems.MITHRIL_CHESTPLATE.get());
                    output.accept(ModItems.MITHRIL_LEGGINGS.get());
                    output.accept(ModItems.MITHRIL_BOOTS.get());
                    output.accept(ModItems.ADAMANT_HELMET.get());
                    output.accept(ModItems.ADAMANT_CHESTPLATE.get());
                    output.accept(ModItems.ADAMANT_LEGGINGS.get());
                    output.accept(ModItems.ADAMANT_BOOTS.get());
                    output.accept(ModItems.RUNE_HELMET.get());
                    output.accept(ModItems.RUNE_CHESTPLATE.get());
                    output.accept(ModItems.RUNE_LEGGINGS.get());
                    output.accept(ModItems.RUNE_BOOTS.get());
                    output.accept(ModItems.ORIKALKUM_HELMET.get());
                    output.accept(ModItems.ORIKALKUM_CHESTPLATE.get());
                    output.accept(ModItems.ORIKALKUM_LEGGINGS.get());
                    output.accept(ModItems.ORIKALKUM_BOOTS.get());
                    output.accept(ModItems.NECRONIUM_HELMET.get());
                    output.accept(ModItems.NECRONIUM_CHESTPLATE.get());
                    output.accept(ModItems.NECRONIUM_LEGGINGS.get());
                    output.accept(ModItems.NECRONIUM_BOOTS.get());
                    output.accept(ModItems.BRONZE_ARROW.get());
                    output.accept(ModItems.IRON_ARROW.get());
                    output.accept(ModItems.STEEL_ARROW.get());
                    output.accept(ModItems.MITHRIL_ARROW.get());
                    output.accept(ModItems.ADAMANT_ARROW.get());
                    output.accept(ModItems.RUNE_ARROW.get());
//                    output.accept(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE.get());
//                    output.accept(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE.get());
                    output.accept(ModBlocks.TIN_BLOCK.get());
                    output.accept(ModBlocks.BRONZE_BLOCK.get());
                    output.accept(ModBlocks.STEEL_BLOCK.get());
                    output.accept(ModBlocks.MITHRIL_BLOCK.get());
                    output.accept(ModBlocks.ADAMANTITE_BLOCK.get());
                    output.accept(ModBlocks.RUNITE_BLOCK.get());
                    output.accept(ModBlocks.ORIKALKUM_BLOCK.get());
                    output.accept(ModBlocks.NECRONIUM_BLOCK.get());
                    output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                    output.accept(ModBlocks.RAW_BRONZE_BLOCK.get());
                    output.accept(ModBlocks.RAW_STEEL_BLOCK.get());
                    output.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                    output.accept(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
                    output.accept(ModBlocks.RAW_RUNITE_BLOCK.get());
                    output.accept(ModBlocks.RAW_DRAKOLITH_BLOCK.get());
                    output.accept(ModBlocks.RAW_PHASMATITE_BLOCK.get());
                    output.accept(ModBlocks.TIN_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                    output.accept(ModBlocks.MITHRIL_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
                    output.accept(ModBlocks.ADAMANTITE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
                    output.accept(ModBlocks.RUNITE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_RUNITE_ORE.get());
                    output.accept(ModBlocks.NETHER_DRAKOLITH_ORE.get());
                    output.accept(ModBlocks.ORICHALCITE_DEBRIS.get());
                    output.accept(ModBlocks.END_PHASMATITE_ORE.get());
                    output.accept(ModBlocks.NECRITE_DEBRIS.get());
                })).build();

        Services.REGISTRY.registerCreativeTab("oresandmetals_tab", () -> ORES_AND_METALS_TAB);

    }

}
