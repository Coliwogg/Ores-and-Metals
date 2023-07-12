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
                        entries.add(ModItems.BRONZE_INGOT);

                        entries.add(ModBlocks.BRONZE_BLOCK);
                        entries.add(ModBlocks.TIN_ORE);

                    }).build());

    public static void registerItemGroups() {
        OresAndMetals.LOGGER.info("Registering ModItemGroups for " + OresAndMetals.MOD_ID);
    }
}
