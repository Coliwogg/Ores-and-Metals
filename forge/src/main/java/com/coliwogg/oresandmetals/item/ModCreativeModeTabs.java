package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OresAndMetals.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ORES_AND_METALS_TAB = CREATIVE_MODE_TABS.register("oresandmetals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
                    .title(Component.translatable("creativetab.oresandmetals_tab"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.RAW_TIN.get());
                        pOutput.accept(ModItems.RAW_BRONZE.get());
                        pOutput.accept(ModItems.RAW_STEEL.get());
                        pOutput.accept(ModItems.RAW_MITHRIL.get());
                        pOutput.accept(ModItems.RAW_ADAMANTITE.get());
                        pOutput.accept(ModItems.RAW_RUNITE.get());
                        pOutput.accept(ModItems.TIN_INGOT.get());
                        pOutput.accept(ModItems.BRONZE_INGOT.get());
                        pOutput.accept(ModItems.STEEL_INGOT.get());
                        pOutput.accept(ModItems.MITHRIL_INGOT.get());
                        pOutput.accept(ModItems.ADAMANTITE_INGOT.get());
                        pOutput.accept(ModItems.RUNITE_INGOT.get());
                        pOutput.accept(ModItems.MITHRIL_SCRAP.get());
                        pOutput.accept(ModItems.ADAMANTITE_SCRAP.get());
                        pOutput.accept(ModItems.RUNITE_SCRAP.get());

                        pOutput.accept(ModItems.BRONZE_SWORD.get());
                        pOutput.accept(ModItems.BRONZE_SHOVEL.get());
                        pOutput.accept(ModItems.BRONZE_PICKAXE.get());
                        pOutput.accept(ModItems.BRONZE_AXE.get());
                        pOutput.accept(ModItems.BRONZE_HOE.get());
                        pOutput.accept(ModItems.STEEL_SWORD.get());
                        pOutput.accept(ModItems.STEEL_SHOVEL.get());
                        pOutput.accept(ModItems.STEEL_PICKAXE.get());
                        pOutput.accept(ModItems.STEEL_AXE.get());
                        pOutput.accept(ModItems.STEEL_HOE.get());
                        pOutput.accept(ModItems.MITHRIL_SWORD.get());
                        pOutput.accept(ModItems.MITHRIL_SHOVEL.get());
                        pOutput.accept(ModItems.MITHRIL_PICKAXE.get());
                        pOutput.accept(ModItems.MITHRIL_AXE.get());
                        pOutput.accept(ModItems.MITHRIL_HOE.get());
                        pOutput.accept(ModItems.ADAMANT_SWORD.get());
                        pOutput.accept(ModItems.ADAMANT_SHOVEL.get());
                        pOutput.accept(ModItems.ADAMANT_PICKAXE.get());
                        pOutput.accept(ModItems.ADAMANT_AXE.get());
                        pOutput.accept(ModItems.ADAMANT_HOE.get());
                        pOutput.accept(ModItems.RUNE_SWORD.get());
                        pOutput.accept(ModItems.RUNE_SHOVEL.get());
                        pOutput.accept(ModItems.RUNE_PICKAXE.get());
                        pOutput.accept(ModItems.RUNE_AXE.get());
                        pOutput.accept(ModItems.RUNE_HOE.get());

                        pOutput.accept(ModItems.BRONZE_HELMET.get());
                        pOutput.accept(ModItems.BRONZE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BRONZE_LEGGINGS.get());
                        pOutput.accept(ModItems.BRONZE_BOOTS.get());
                        pOutput.accept(ModItems.STEEL_HELMET.get());
                        pOutput.accept(ModItems.STEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.STEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.STEEL_BOOTS.get());
                        pOutput.accept(ModItems.MITHRIL_HELMET.get());
                        pOutput.accept(ModItems.MITHRIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.MITHRIL_LEGGINGS.get());
                        pOutput.accept(ModItems.MITHRIL_BOOTS.get());
                        pOutput.accept(ModItems.ADAMANT_HELMET.get());
                        pOutput.accept(ModItems.ADAMANT_CHESTPLATE.get());
                        pOutput.accept(ModItems.ADAMANT_LEGGINGS.get());
                        pOutput.accept(ModItems.ADAMANT_BOOTS.get());
                        pOutput.accept(ModItems.RUNE_HELMET.get());
                        pOutput.accept(ModItems.RUNE_CHESTPLATE.get());
                        pOutput.accept(ModItems.RUNE_LEGGINGS.get());
                        pOutput.accept(ModItems.RUNE_BOOTS.get());

                        pOutput.accept(ModItems.BRONZE_ARROW.get());
                        pOutput.accept(ModItems.IRON_ARROW.get());
                        pOutput.accept(ModItems.STEEL_ARROW.get());
                        pOutput.accept(ModItems.MITHRIL_ARROW.get());
                        pOutput.accept(ModItems.ADAMANT_ARROW.get());
                        pOutput.accept(ModItems.RUNE_ARROW.get());

                        pOutput.accept(ModBlocks.TIN_BLOCK.get());
                        pOutput.accept(ModBlocks.BRONZE_BLOCK.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.ADAMANTITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RUNITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_BRONZE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_ADAMANTITE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_RUNITE_BLOCK.get());
                        pOutput.accept(ModBlocks.TIN_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        pOutput.accept(ModBlocks.MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
                        pOutput.accept(ModBlocks.ADAMANTITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get());
                        pOutput.accept(ModBlocks.RUNITE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_RUNITE_ORE.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
