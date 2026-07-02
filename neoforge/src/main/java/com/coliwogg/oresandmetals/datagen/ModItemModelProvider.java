package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.Constants;
import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.LinkedHashMap;
import java.util.function.Supplier;

public class ModItemModelProvider extends ItemModelProvider {

    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Constants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_TIN.get());
        basicItem(ModItems.RAW_BRONZE.get());
        basicItem(ModItems.RAW_STEEL.get());
        basicItem(ModItems.RAW_MITHRIL.get());
        basicItem(ModItems.RAW_ADAMANTITE.get());
        basicItem(ModItems.RAW_RUNITE.get());
        basicItem(ModItems.RAW_DRAKOLITH.get());
        basicItem(ModItems.RAW_PHASMATITE.get());
        basicItem(ModItems.TIN_INGOT.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.STEEL_INGOT.get());
        basicItem(ModItems.MITHRIL_SCRAP.get());
        basicItem(ModItems.MITHRIL_INGOT.get());
        basicItem(ModItems.ADAMANTITE_SCRAP.get());
        basicItem(ModItems.ADAMANTITE_INGOT.get());
        basicItem(ModItems.RUNITE_SCRAP.get());
        basicItem(ModItems.RUNITE_INGOT.get());
        basicItem(ModItems.ORICHALCITE_SCRAP.get());
        basicItem(ModItems.ORIKALKUM_INGOT.get());
        basicItem(ModItems.NECRITE_SCRAP.get());
        basicItem(ModItems.NECRONIUM_INGOT.get());

        handheldItem("bronze_sword", ModItems.BRONZE_SWORD);
        handheldItem("bronze_shovel", ModItems.BRONZE_SHOVEL);
        handheldItem("bronze_pickaxe", ModItems.BRONZE_PICKAXE);
        handheldItem("bronze_axe", ModItems.BRONZE_AXE);
        handheldItem("bronze_hoe", ModItems.BRONZE_HOE);
        handheldItem("steel_sword", ModItems.STEEL_SWORD);
        handheldItem("steel_shovel", ModItems.STEEL_SHOVEL);
        handheldItem("steel_pickaxe", ModItems.STEEL_PICKAXE);
        handheldItem("steel_axe", ModItems.STEEL_AXE);
        handheldItem("steel_hoe", ModItems.STEEL_HOE);
        handheldItem("mithril_sword", ModItems.MITHRIL_SWORD);
        handheldItem("mithril_shovel", ModItems.MITHRIL_SHOVEL);
        handheldItem("mithril_pickaxe", ModItems.MITHRIL_PICKAXE);
        handheldItem("mithril_axe", ModItems.MITHRIL_AXE);
        handheldItem("mithril_hoe", ModItems.MITHRIL_HOE);
        handheldItem("adamant_sword", ModItems.ADAMANT_SWORD);
        handheldItem("adamant_shovel", ModItems.ADAMANT_SHOVEL);
        handheldItem("adamant_pickaxe", ModItems.ADAMANT_PICKAXE);
        handheldItem("adamant_axe", ModItems.ADAMANT_AXE);
        handheldItem("adamant_hoe", ModItems.ADAMANT_HOE);
        handheldItem("rune_sword", ModItems.RUNE_SWORD);
        handheldItem("rune_shovel", ModItems.RUNE_SHOVEL);
        handheldItem("rune_pickaxe", ModItems.RUNE_PICKAXE);
        handheldItem("rune_axe", ModItems.RUNE_AXE);
        handheldItem("rune_hoe", ModItems.RUNE_HOE);
        handheldItem("orikalkum_sword", ModItems.ORIKALKUM_SWORD);
        handheldItem("orikalkum_shovel", ModItems.ORIKALKUM_SHOVEL);
        handheldItem("orikalkum_pickaxe", ModItems.ORIKALKUM_PICKAXE);
        handheldItem("orikalkum_axe", ModItems.ORIKALKUM_AXE);
        handheldItem("orikalkum_hoe", ModItems.ORIKALKUM_HOE);
        handheldItem("necronium_sword", ModItems.NECRONIUM_SWORD);
        handheldItem("necronium_shovel", ModItems.NECRONIUM_SHOVEL);
        handheldItem("necronium_pickaxe", ModItems.NECRONIUM_PICKAXE);
        handheldItem("necronium_axe", ModItems.NECRONIUM_AXE);
        handheldItem("necronium_hoe", ModItems.NECRONIUM_HOE);

        trimmedArmorItem("bronze_helmet", ModItems.BRONZE_HELMET);
        trimmedArmorItem("bronze_chestplate", ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem("bronze_leggings", ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem("bronze_boots", ModItems.BRONZE_BOOTS);
        trimmedArmorItem("steel_helmet", ModItems.STEEL_HELMET);
        trimmedArmorItem("steel_chestplate", ModItems.STEEL_CHESTPLATE);
        trimmedArmorItem("steel_leggings", ModItems.STEEL_LEGGINGS);
        trimmedArmorItem("steel_boots", ModItems.STEEL_BOOTS);
        trimmedArmorItem("mithril_helmet", ModItems.MITHRIL_HELMET);
        trimmedArmorItem("mithril_chestplate", ModItems.MITHRIL_CHESTPLATE);
        trimmedArmorItem("mithril_leggings", ModItems.MITHRIL_LEGGINGS);
        trimmedArmorItem("mithril_boots", ModItems.MITHRIL_BOOTS);
        trimmedArmorItem("adamant_helmet", ModItems.ADAMANT_HELMET);
        trimmedArmorItem("adamant_chestplate", ModItems.ADAMANT_CHESTPLATE);
        trimmedArmorItem("adamant_leggings", ModItems.ADAMANT_LEGGINGS);
        trimmedArmorItem("adamant_boots", ModItems.ADAMANT_BOOTS);
        trimmedArmorItem("rune_helmet", ModItems.RUNE_HELMET);
        trimmedArmorItem("rune_chestplate", ModItems.RUNE_CHESTPLATE);
        trimmedArmorItem("rune_leggings", ModItems.RUNE_LEGGINGS);
        trimmedArmorItem("rune_boots", ModItems.RUNE_BOOTS);
        trimmedArmorItem("orikalkum_helmet", ModItems.ORIKALKUM_HELMET);
        trimmedArmorItem("orikalkum_chestplate", ModItems.ORIKALKUM_CHESTPLATE);
        trimmedArmorItem("orikalkum_leggings", ModItems.ORIKALKUM_LEGGINGS);
        trimmedArmorItem("orikalkum_boots", ModItems.ORIKALKUM_BOOTS);
        trimmedArmorItem("necronium_helmet", ModItems.NECRONIUM_HELMET);
        trimmedArmorItem("necronium_chestplate", ModItems.NECRONIUM_CHESTPLATE);
        trimmedArmorItem("necronium_leggings", ModItems.NECRONIUM_LEGGINGS);
        trimmedArmorItem("necronium_boots", ModItems.NECRONIUM_BOOTS);

        basicItem(ModItems.BRONZE_ARROW.get());
        basicItem(ModItems.IRON_ARROW.get());
        basicItem(ModItems.STEEL_ARROW.get());
        basicItem(ModItems.MITHRIL_ARROW.get());
        basicItem(ModItems.ADAMANT_ARROW.get());
        basicItem(ModItems.RUNE_ARROW.get());

        basicItem(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE.get());
        basicItem(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE.get());

    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(String itemName, Supplier<Item> itemSupplier) {
        final String MOD_ID = Constants.MOD_ID;

        if(itemSupplier.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = "";
                if(armorItem.toString().contains("helmet")) {
                    armorType = "helmet";
                } else if(armorItem.toString().contains("chestplate")) {
                    armorType = "chestplate";
                } else if(armorItem.toString().contains("leggings")) {
                    armorType = "leggings";
                } else if(armorItem.toString().contains("boots")) {
                    armorType = "boots";
                }

                String trimPath = "minecraft:item/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String modelName = itemName + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath);
                ResourceLocation overlayModel = OresAndMetals.identifier("item/" + modelName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(modelName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", Constants.MOD_ID + ":item/" + itemName)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                getBuilder(itemName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(
                                overlayModel.getNamespace() + ":item/" + overlayModel.getPath()
                        ))
                        .predicate(mcLoc("trim_type"), trimValue)
                        .end()
                        .texture("layer0", Constants.MOD_ID + ":item/" + itemName);
            });
        }
    }

    private ItemModelBuilder handheldItem(String name, Supplier<Item> item) {
        return withExistingParent(name, mcLoc("item/handheld"))
                .texture("layer0", Constants.MOD_ID + ":item/" + name);
    }
}
