package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, OresAndMetals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.RAW_BRONZE);
        simpleItem(ModItems.RAW_STEEL);
        simpleItem(ModItems.RAW_MITHRIL);
        simpleItem(ModItems.RAW_ADAMANTITE);
        simpleItem(ModItems.RAW_RUNITE);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.MITHRIL_SCRAP);
        simpleItem(ModItems.MITHRIL_INGOT);
        simpleItem(ModItems.ADAMANTITE_SCRAP);
        simpleItem(ModItems.ADAMANTITE_INGOT);
        simpleItem(ModItems.RUNITE_SCRAP);
        simpleItem(ModItems.RUNITE_INGOT);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(OresAndMetals.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(OresAndMetals.MOD_ID,"item/" + item.getId().getPath()));
    }
}
