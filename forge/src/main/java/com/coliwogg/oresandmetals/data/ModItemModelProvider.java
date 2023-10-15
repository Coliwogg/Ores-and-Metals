package com.coliwogg.oresandmetals.data;

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
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

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

        handheldItem(ModItems.BRONZE_SWORD);
        handheldItem(ModItems.BRONZE_SHOVEL);
        handheldItem(ModItems.BRONZE_PICKAXE);
        handheldItem(ModItems.BRONZE_AXE);
        handheldItem(ModItems.BRONZE_HOE);
        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_HOE);
        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_HOE);
        handheldItem(ModItems.ADAMANT_SWORD);
        handheldItem(ModItems.ADAMANT_SHOVEL);
        handheldItem(ModItems.ADAMANT_PICKAXE);
        handheldItem(ModItems.ADAMANT_AXE);
        handheldItem(ModItems.ADAMANT_HOE);
        handheldItem(ModItems.RUNE_SWORD);
        handheldItem(ModItems.RUNE_SHOVEL);
        handheldItem(ModItems.RUNE_PICKAXE);
        handheldItem(ModItems.RUNE_AXE);
        handheldItem(ModItems.RUNE_HOE);

        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);
        trimmedArmorItem(ModItems.STEEL_HELMET);
        trimmedArmorItem(ModItems.STEEL_CHESTPLATE);
        trimmedArmorItem(ModItems.STEEL_LEGGINGS);
        trimmedArmorItem(ModItems.STEEL_BOOTS);
        trimmedArmorItem(ModItems.MITHRIL_HELMET);
        trimmedArmorItem(ModItems.MITHRIL_CHESTPLATE);
        trimmedArmorItem(ModItems.MITHRIL_LEGGINGS);
        trimmedArmorItem(ModItems.MITHRIL_BOOTS);
        trimmedArmorItem(ModItems.ADAMANT_HELMET);
        trimmedArmorItem(ModItems.ADAMANT_CHESTPLATE);
        trimmedArmorItem(ModItems.ADAMANT_LEGGINGS);
        trimmedArmorItem(ModItems.ADAMANT_BOOTS);
        trimmedArmorItem(ModItems.RUNE_HELMET);
        trimmedArmorItem(ModItems.RUNE_CHESTPLATE);
        trimmedArmorItem(ModItems.RUNE_LEGGINGS);
        trimmedArmorItem(ModItems.RUNE_BOOTS);

        simpleItem(ModItems.BRONZE_ARROW);
        simpleItem(ModItems.IRON_ARROW);
        simpleItem(ModItems.STEEL_ARROW);
        simpleItem(ModItems.MITHRIL_ARROW);
        simpleItem(ModItems.ADAMANT_ARROW);
        simpleItem(ModItems.RUNE_ARROW);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = OresAndMetals.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
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
