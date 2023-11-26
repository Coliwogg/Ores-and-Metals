package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.RAW_BRONZE), RecipeCategory.MISC, ModItems.BRONZE_INGOT, 0.7f, 200, "bronze");
        offerBlasting(exporter, List.of(ModItems.RAW_BRONZE), RecipeCategory.MISC, ModItems.BRONZE_INGOT, 0.7f, 100, "bronze");
        offerSmelting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.7f, 200, "steel");
        offerBlasting(exporter, List.of(ModItems.RAW_STEEL), RecipeCategory.MISC, ModItems.STEEL_INGOT, 0.7f, 100, "steel");
        offerSmelting(exporter, List.of(ModItems.RAW_MITHRIL), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 200, "mithril");
        offerBlasting(exporter, List.of(ModItems.RAW_MITHRIL), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 100, "mithril");
        offerSmelting(exporter, List.of(ModItems.RAW_ADAMANTITE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 200, "adamantite");
        offerBlasting(exporter, List.of(ModItems.RAW_ADAMANTITE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 100, "adamantite");
        offerSmelting(exporter, List.of(ModItems.RAW_RUNITE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 200, "runite");
        offerBlasting(exporter, List.of(ModItems.RAW_RUNITE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 100, "runite");

        offerSmelting(exporter, List.of(ModBlocks.TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerBlasting(exporter, List.of(ModBlocks.TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 200, "tin");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_TIN_ORE), RecipeCategory.MISC, ModItems.TIN_INGOT, 0.7f, 100, "tin");
        offerSmelting(exporter, List.of(ModBlocks.MITHRIL_ORE), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 200, "mithril");
        offerBlasting(exporter, List.of(ModBlocks.MITHRIL_ORE), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 100, "mithril");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 200, "mithril");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE), RecipeCategory.MISC, ModItems.MITHRIL_SCRAP, 1.0f, 100, "mithril");
        offerSmelting(exporter, List.of(ModBlocks.ADAMANTITE_ORE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 200, "adamantite");
        offerBlasting(exporter, List.of(ModBlocks.ADAMANTITE_ORE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 100, "adamantite");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 200, "adamantite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE), RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP, 1.4f, 100, "adamantite");
        offerSmelting(exporter, List.of(ModBlocks.RUNITE_ORE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 200, "runite");
        offerBlasting(exporter, List.of(ModBlocks.RUNITE_ORE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 100, "runite");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 200, "runite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE), RecipeCategory.MISC, ModItems.RUNITE_SCRAP, 2.0f, 100, "runite");
        offerSmelting(exporter, List.of(ModBlocks.ORICHALCITE_DEBRIS), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP, 2.0f, 200, "orichalcite");
        offerBlasting(exporter, List.of(ModBlocks.ORICHALCITE_DEBRIS), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP, 2.0f, 100, "orichalcite");
        offerSmelting(exporter, List.of(ModBlocks.NECRITE_DEBRIS), RecipeCategory.MISC, ModItems.NECRITE_SCRAP, 2.0f, 200, "necrite");
        offerBlasting(exporter, List.of(ModBlocks.NECRITE_DEBRIS), RecipeCategory.MISC, ModItems.NECRITE_SCRAP, 2.0f, 100, "necrite");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ADAMANTITE_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.RUNITE_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ORIKALKUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ORIKALKUM_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.NECRONIUM_INGOT, RecipeCategory.DECORATIONS, ModBlocks.NECRONIUM_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BRONZE, RecipeCategory.DECORATIONS, ModBlocks.RAW_BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_STEEL, RecipeCategory.DECORATIONS, ModBlocks.RAW_STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MITHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_ADAMANTITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUNITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DRAKOLITH, RecipeCategory.DECORATIONS, ModBlocks.RAW_DRAKOLITH_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PHASMATITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_PHASMATITE_BLOCK);

        offerIngotRecipe(exporter, ModItems.MITHRIL_INGOT, 4, ModItems.MITHRIL_SCRAP);
        offerIngotRecipe(exporter, ModItems.ADAMANTITE_INGOT, 6, ModItems.ADAMANTITE_SCRAP);
        offerIngotRecipe(exporter, ModItems.RUNITE_INGOT, 8, ModItems.RUNITE_SCRAP);
        offerSpecialIngotRecipe(exporter, ModItems.ORIKALKUM_INGOT, ModItems.ORICHALCITE_SCRAP, ModItems.RAW_DRAKOLITH);
        offerSpecialIngotRecipe(exporter, ModItems.NECRONIUM_INGOT, ModItems.NECRITE_SCRAP, ModItems.RAW_PHASMATITE);

        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_SWORD, RecipeCategory.COMBAT, ModItems.ORIKALKUM_SWORD);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_AXE, RecipeCategory.TOOLS, ModItems.ORIKALKUM_AXE);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_PICKAXE, RecipeCategory.TOOLS, ModItems.ORIKALKUM_PICKAXE);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_HOE, RecipeCategory.TOOLS, ModItems.ORIKALKUM_HOE);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_SHOVEL, RecipeCategory.TOOLS, ModItems.ORIKALKUM_SHOVEL);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_HELMET, RecipeCategory.COMBAT, ModItems.ORIKALKUM_HELMET);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_CHESTPLATE, RecipeCategory.COMBAT, ModItems.ORIKALKUM_CHESTPLATE);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_LEGGINGS, RecipeCategory.COMBAT, ModItems.ORIKALKUM_LEGGINGS);
        offerOrikalkumUpgradeRecipe(exporter, ModItems.RUNE_BOOTS, RecipeCategory.COMBAT, ModItems.ORIKALKUM_BOOTS);

        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_SWORD, RecipeCategory.COMBAT, ModItems.NECRONIUM_SWORD);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_AXE, RecipeCategory.TOOLS, ModItems.NECRONIUM_AXE);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_PICKAXE, RecipeCategory.TOOLS, ModItems.NECRONIUM_PICKAXE);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_HOE, RecipeCategory.TOOLS, ModItems.NECRONIUM_HOE);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_SHOVEL, RecipeCategory.TOOLS, ModItems.NECRONIUM_SHOVEL);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_HELMET, RecipeCategory.COMBAT, ModItems.NECRONIUM_HELMET);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_CHESTPLATE, RecipeCategory.COMBAT, ModItems.NECRONIUM_CHESTPLATE);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_LEGGINGS, RecipeCategory.COMBAT, ModItems.NECRONIUM_LEGGINGS);
        offerNecroniumUpgradeRecipe(exporter, ModItems.ORIKALKUM_BOOTS, RecipeCategory.COMBAT, ModItems.NECRONIUM_BOOTS);

        offerSmithingTemplateRecipe(exporter, ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE, ModItems.RAW_DRAKOLITH, ModItems.RUNITE_INGOT, ModItems.ORICHALCITE_SCRAP);
        offerSmithingTemplateRecipe(exporter, ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE, ModItems.RAW_PHASMATITE, ModItems.ORIKALKUM_INGOT, ModItems.NECRITE_SCRAP);

        offerSwordRecipe(exporter, ModItems.BRONZE_SWORD, ModItems.BRONZE_INGOT);
        offerSwordRecipe(exporter, ModItems.STEEL_SWORD, ModItems.STEEL_INGOT);
        offerSwordRecipe(exporter, ModItems.MITHRIL_SWORD, ModItems.MITHRIL_INGOT);
        offerSwordRecipe(exporter, ModItems.ADAMANT_SWORD, ModItems.ADAMANTITE_INGOT);
        offerSwordRecipe(exporter, ModItems.RUNE_SWORD, ModItems.RUNITE_INGOT);

        offerShovelRecipe(exporter, ModItems.BRONZE_SHOVEL, ModItems.BRONZE_INGOT);
        offerShovelRecipe(exporter, ModItems.STEEL_SHOVEL, ModItems.STEEL_INGOT);
        offerShovelRecipe(exporter, ModItems.MITHRIL_SHOVEL, ModItems.MITHRIL_INGOT);
        offerShovelRecipe(exporter, ModItems.ADAMANT_SHOVEL, ModItems.ADAMANTITE_INGOT);
        offerShovelRecipe(exporter, ModItems.RUNE_SHOVEL, ModItems.RUNITE_INGOT);

        offerPickaxeRecipe(exporter, ModItems.BRONZE_PICKAXE, ModItems.BRONZE_INGOT);
        offerPickaxeRecipe(exporter, ModItems.STEEL_PICKAXE, ModItems.STEEL_INGOT);
        offerPickaxeRecipe(exporter, ModItems.MITHRIL_PICKAXE, ModItems.MITHRIL_INGOT);
        offerPickaxeRecipe(exporter, ModItems.ADAMANT_PICKAXE, ModItems.ADAMANTITE_INGOT);
        offerPickaxeRecipe(exporter, ModItems.RUNE_PICKAXE, ModItems.RUNITE_INGOT);

        offerHoeRecipe(exporter, ModItems.BRONZE_HOE, ModItems.BRONZE_INGOT);
        offerHoeRecipe(exporter, ModItems.STEEL_HOE, ModItems.STEEL_INGOT);
        offerHoeRecipe(exporter, ModItems.MITHRIL_HOE, ModItems.MITHRIL_INGOT);
        offerHoeRecipe(exporter, ModItems.ADAMANT_HOE, ModItems.ADAMANTITE_INGOT);
        offerHoeRecipe(exporter, ModItems.RUNE_HOE, ModItems.RUNITE_INGOT);

        offerAxeRecipe(exporter, ModItems.BRONZE_AXE, ModItems.BRONZE_INGOT);
        offerAxeRecipe(exporter, ModItems.STEEL_AXE, ModItems.STEEL_INGOT);
        offerAxeRecipe(exporter, ModItems.MITHRIL_AXE, ModItems.MITHRIL_INGOT);
        offerAxeRecipe(exporter, ModItems.ADAMANT_AXE, ModItems.ADAMANTITE_INGOT);
        offerAxeRecipe(exporter, ModItems.RUNE_AXE, ModItems.RUNITE_INGOT);

        offerHelmetRecipe(exporter, ModItems.BRONZE_HELMET, ModItems.BRONZE_INGOT);
        offerHelmetRecipe(exporter, ModItems.STEEL_HELMET, ModItems.STEEL_INGOT);
        offerHelmetRecipe(exporter, ModItems.MITHRIL_HELMET, ModItems.MITHRIL_INGOT);
        offerHelmetRecipe(exporter, ModItems.ADAMANT_HELMET, ModItems.ADAMANTITE_INGOT);
        offerHelmetRecipe(exporter, ModItems.RUNE_HELMET, ModItems.RUNITE_INGOT);

        offerChestplateRecipe(exporter, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_INGOT);
        offerChestplateRecipe(exporter, ModItems.STEEL_CHESTPLATE, ModItems.STEEL_INGOT);
        offerChestplateRecipe(exporter, ModItems.MITHRIL_CHESTPLATE, ModItems.MITHRIL_INGOT);
        offerChestplateRecipe(exporter, ModItems.ADAMANT_CHESTPLATE, ModItems.ADAMANTITE_INGOT);
        offerChestplateRecipe(exporter, ModItems.RUNE_CHESTPLATE, ModItems.RUNITE_INGOT);

        offerLeggingsRecipe(exporter, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_INGOT);
        offerLeggingsRecipe(exporter, ModItems.STEEL_LEGGINGS, ModItems.STEEL_INGOT);
        offerLeggingsRecipe(exporter, ModItems.MITHRIL_LEGGINGS, ModItems.MITHRIL_INGOT);
        offerLeggingsRecipe(exporter, ModItems.ADAMANT_LEGGINGS, ModItems.ADAMANTITE_INGOT);
        offerLeggingsRecipe(exporter, ModItems.RUNE_LEGGINGS, ModItems.RUNITE_INGOT);

        offerBootsRecipe(exporter, ModItems.BRONZE_BOOTS, ModItems.BRONZE_INGOT);
        offerBootsRecipe(exporter, ModItems.STEEL_BOOTS, ModItems.STEEL_INGOT);
        offerBootsRecipe(exporter, ModItems.MITHRIL_BOOTS, ModItems.MITHRIL_INGOT);
        offerBootsRecipe(exporter, ModItems.ADAMANT_BOOTS, ModItems.ADAMANTITE_INGOT);
        offerBootsRecipe(exporter, ModItems.RUNE_BOOTS, ModItems.RUNITE_INGOT);

        offerArrowRecipe(exporter, ModItems.BRONZE_ARROW, ModItems.BRONZE_INGOT);
        offerArrowRecipe(exporter, ModItems.IRON_ARROW, Items.IRON_INGOT);
        offerArrowRecipe(exporter, ModItems.STEEL_ARROW, ModItems.STEEL_INGOT);
        offerArrowRecipe(exporter, ModItems.MITHRIL_ARROW, ModItems.MITHRIL_INGOT);
        offerArrowRecipe(exporter, ModItems.ADAMANT_ARROW, ModItems.ADAMANTITE_INGOT);
        offerArrowRecipe(exporter, ModItems.RUNE_ARROW, ModItems.RUNITE_INGOT);
    }

    public static void offerReversibleCompactingRecipesWithBlockName(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem) {
        offerReversibleCompactingRecipes(exporter, reverseCategory, baseItem, compactingCategory, compactItem, RecipeProvider.getRecipeName(compactItem), null, RecipeProvider.getRecipeName(baseItem), null);
    }

    public static void offerReversibleCompactingRecipes(Consumer<RecipeJsonProvider> exporter, RecipeCategory reverseCategory, ItemConvertible baseItem, RecipeCategory compactingCategory, ItemConvertible compactItem, String compactingId, @Nullable String compactingGroup, String reverseId, @Nullable String reverseGroup) {
        ShapelessRecipeJsonBuilder.create(reverseCategory, baseItem, 9).input(compactItem).group(reverseGroup).criterion(RecipeProvider.hasItem(compactItem), RecipeProvider.conditionsFromItem(compactItem)).offerTo(exporter, new Identifier(reverseId + "_from_" + RecipeProvider.getItemPath(compactItem)));
        ShapedRecipeJsonBuilder.create(compactingCategory, compactItem).input(Character.valueOf('#'), baseItem).pattern("###").pattern("###").pattern("###").group(compactingGroup).criterion(RecipeProvider.hasItem(baseItem), RecipeProvider.conditionsFromItem(baseItem)).offerTo(exporter, new Identifier(compactingId));
    }

    public static void offerIngotRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, int coalCount, ItemConvertible input) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input(Ingredient.fromTag(ItemTags.COALS), coalCount)
                .input(input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion("has_coal", conditionsFromTag(ItemTags.COALS))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerSpecialIngotRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output)
                .input(input1, 4)
                .input(input2, 4)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .criterion(hasItem(input2), conditionsFromItem(input2))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private void offerSmithingTemplateRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input1, ItemConvertible input2, ItemConvertible input3) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, output, 1)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .input('#', input1)
                .input('C', input2)
                .input('S', input3)
                .criterion(hasItem(input1), conditionsFromItem(input1))
                .criterion(hasItem(input2), conditionsFromItem(input2))
                .criterion(hasItem(input3), conditionsFromItem(input3))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerOrikalkumUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.ORIKALKUM_INGOT), category, result)
                .criterion(hasItem(ModItems.ORIKALKUM_INGOT), conditionsFromItem(ModItems.ORIKALKUM_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }

    public static void offerNecroniumUpgradeRecipe(Consumer<RecipeJsonProvider> exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.NECRONIUM_INGOT), category, result)
                .criterion(hasItem(ModItems.NECRONIUM_INGOT), conditionsFromItem(ModItems.NECRONIUM_INGOT))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }

    public static void offerAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, output, 1)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .input('#', input)
                .input('|', Items.STICK)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerHelmetRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerChestplateRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerLeggingsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    public static void offerBootsRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', input)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }

    private static void offerArrowRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 4)
                .pattern("X")
                .pattern("|")
                .pattern("Y")
                .input('X', input)
                .input('|', Items.STICK)
                .input('Y', Items.FEATHER)
                .criterion(hasItem(input), conditionsFromItem(input))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.FEATHER), conditionsFromItem(Items.FEATHER))
                .offerTo(exporter, new Identifier(getRecipeName(output)));
    }
}
