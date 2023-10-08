package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
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

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT, RecipeCategory.DECORATIONS, ModBlocks.TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.STEEL_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.MITHRIL_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ADAMANTITE_BLOCK);
        offerReversibleCompactingRecipesWithBlockName(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.RUNITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN, RecipeCategory.DECORATIONS, ModBlocks.RAW_TIN_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BRONZE, RecipeCategory.DECORATIONS, ModBlocks.RAW_BRONZE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_STEEL, RecipeCategory.DECORATIONS, ModBlocks.RAW_STEEL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL, RecipeCategory.DECORATIONS, ModBlocks.RAW_MITHRIL_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_ADAMANTITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_RUNITE_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MITHRIL_INGOT)
                .input(Ingredient.fromTag(ItemTags.COALS), 4)
                .input(ModItems.MITHRIL_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MITHRIL_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.MITHRIL_SCRAP))
                .criterion(FabricRecipeProvider.hasItem(Items.COAL), FabricRecipeProvider.conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MITHRIL_INGOT)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT)
                .input(Ingredient.fromTag(ItemTags.COALS), 6)
                .input(ModItems.ADAMANTITE_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(ModItems.ADAMANTITE_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.ADAMANTITE_SCRAP))
                .criterion(FabricRecipeProvider.hasItem(Items.COAL), FabricRecipeProvider.conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ADAMANTITE_INGOT)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUNITE_INGOT)
                .input(Ingredient.fromTag(ItemTags.COALS), 8)
                .input(ModItems.RUNITE_SCRAP)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RUNITE_SCRAP), FabricRecipeProvider.conditionsFromItem(ModItems.RUNITE_SCRAP))
                .criterion(FabricRecipeProvider.hasItem(Items.COAL), FabricRecipeProvider.conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RUNITE_INGOT)));

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

    private static void offerArrowRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output,4)
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
