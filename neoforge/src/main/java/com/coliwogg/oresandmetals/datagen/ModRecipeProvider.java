package com.coliwogg.oresandmetals.datagen;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.blocks.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TIN_SMELTABLES = List.of(ModBlocks.TIN_ORE.get(), ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get());
    private static final List<ItemLike> MITHRIL_SMELTABLES = List.of(ModBlocks.MITHRIL_ORE.get(), ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get());
    private static final List<ItemLike> ADAMANTITE_SMELTABLES = List.of(ModBlocks.ADAMANTITE_ORE.get(), ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get(), ModItems.RAW_ADAMANTITE.get());
    private static final List<ItemLike> RUNITE_SMELTABLES = List.of(ModBlocks.RUNITE_ORE.get(), ModBlocks.DEEPSLATE_RUNITE_ORE.get(), ModItems.RAW_RUNITE.get());

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_BRONZE.get())
                .requires(ModItems.RAW_TIN.get())
                .requires(Items.RAW_COPPER)
                .unlockedBy(getHasName(ModItems.RAW_TIN.get()), has(ModItems.RAW_TIN.get()))
                .unlockedBy(getHasName(Items.RAW_COPPER), has(Items.RAW_COPPER))
                .save(recipeOutput, OresAndMetals.identifier(getItemName(ModItems.RAW_BRONZE.get())) + "_from_crafting");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_STEEL.get())
                .requires(Items.RAW_IRON)
                .requires(Ingredient.of(ItemTags.COALS), 2)
                .unlockedBy(getHasName(Items.RAW_IRON), has(Items.RAW_IRON))
                .unlockedBy("has_coal", has(ItemTags.COALS))
                .save(recipeOutput, OresAndMetals.identifier(getItemName(ModItems.RAW_STEEL.get())) + "_from_crafting");

        oreSmelting(recipeOutput, List.of(ModItems.RAW_BRONZE.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 200, "bronze");
        oreBlasting(recipeOutput, List.of(ModItems.RAW_BRONZE.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 100, "bronze");
        oreSmelting(recipeOutput, List.of(ModItems.RAW_STEEL.get()), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 200, "steel");
        oreBlasting(recipeOutput, List.of(ModItems.RAW_STEEL.get()), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 100, "steel");
        
        oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 200, "tin");
        oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 100, "tin");
        oreSmelting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_SCRAP.get(), 1.0f, 200, "mithril");
        oreBlasting(recipeOutput, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_SCRAP.get(), 1.0f, 100, "mithril");
        oreSmelting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP.get(), 1.4f, 200, "adamantite");
        oreBlasting(recipeOutput, ADAMANTITE_SMELTABLES, RecipeCategory.MISC, ModItems.ADAMANTITE_SCRAP.get(), 1.4f, 100, "adamantite");
        oreSmelting(recipeOutput, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_SCRAP.get(), 2.0f, 200, "runite");
        oreBlasting(recipeOutput, RUNITE_SMELTABLES, RecipeCategory.MISC, ModItems.RUNITE_SCRAP.get(), 2.0f, 100, "runite");
        oreSmelting(recipeOutput, List.of(ModBlocks.ORICHALCITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP.get(), 2.0f, 200, "orichalcite");
        oreBlasting(recipeOutput, List.of(ModBlocks.ORICHALCITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP.get(), 2.0f, 100, "orichalcite");
        oreSmelting(recipeOutput, List.of(ModBlocks.NECRITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.NECRITE_SCRAP.get(), 2.0f, 200, "necrite");
        oreBlasting(recipeOutput, List.of(ModBlocks.NECRITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.NECRITE_SCRAP.get(), 2.0f, 100, "necrite");

        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT.get(), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT.get(), RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.RUNITE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.ORIKALKUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.ORIKALKUM_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.NECRONIUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.NECRONIUM_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN.get(), RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BRONZE.get(), RecipeCategory.MISC, ModBlocks.RAW_BRONZE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_STEEL.get(), RecipeCategory.MISC, ModBlocks.RAW_STEEL_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL.get(), RecipeCategory.MISC, ModBlocks.RAW_MITHRIL_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE.get(), RecipeCategory.MISC, ModBlocks.RAW_RUNITE_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DRAKOLITH.get(), RecipeCategory.MISC, ModBlocks.RAW_DRAKOLITH_BLOCK.get());
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PHASMATITE.get(), RecipeCategory.MISC, ModBlocks.RAW_PHASMATITE_BLOCK.get());

        offerIngotRecipe(recipeOutput, ModItems.MITHRIL_INGOT.get(), 4, ModItems.MITHRIL_SCRAP.get());
        offerIngotRecipe(recipeOutput, ModItems.ADAMANTITE_INGOT.get(), 6, ModItems.ADAMANTITE_SCRAP.get());
        offerIngotRecipe(recipeOutput, ModItems.RUNITE_INGOT.get(), 8, ModItems.RUNITE_SCRAP.get());
        offerSpecialIngotRecipe(recipeOutput, ModItems.ORIKALKUM_INGOT.get(), ModItems.ORICHALCITE_SCRAP.get(), ModItems.RAW_DRAKOLITH.get());
        offerSpecialIngotRecipe(recipeOutput, ModItems.NECRONIUM_INGOT.get(), ModItems.NECRITE_SCRAP.get(), ModItems.RAW_PHASMATITE.get());

        orikalkumSmithing(recipeOutput, ModItems.RUNE_SWORD.get(), RecipeCategory.COMBAT, ModItems.ORIKALKUM_SWORD.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_AXE.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_AXE.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_PICKAXE.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_PICKAXE.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_HOE.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_HOE.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_SHOVEL.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_SHOVEL.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_HELMET.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_HELMET.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_CHESTPLATE.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_CHESTPLATE.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_LEGGINGS.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_LEGGINGS.get());
        orikalkumSmithing(recipeOutput, ModItems.RUNE_BOOTS.get(), RecipeCategory.TOOLS, ModItems.ORIKALKUM_BOOTS.get());

        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_SWORD.get(), RecipeCategory.COMBAT, ModItems.NECRONIUM_SWORD.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_AXE.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_AXE.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_PICKAXE.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_PICKAXE.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_HOE.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_HOE.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_SHOVEL.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_SHOVEL.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_HELMET.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_HELMET.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_CHESTPLATE.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_CHESTPLATE.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_LEGGINGS.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_LEGGINGS.get());
        necroniumSmithing(recipeOutput, ModItems.ORIKALKUM_BOOTS.get(), RecipeCategory.TOOLS, ModItems.NECRONIUM_BOOTS.get());

        offerSmithingTemplate(recipeOutput, ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RAW_DRAKOLITH.get(), ModItems.RUNITE_INGOT.get(), ModItems.ORICHALCITE_SCRAP.get());
        offerSmithingTemplate(recipeOutput, ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE.get(), ModItems.RAW_PHASMATITE.get(), ModItems.ORIKALKUM_INGOT.get(), ModItems.NECRITE_SCRAP.get());

        offerArrowRecipe(recipeOutput, ModItems.BRONZE_ARROW.get(), ModItems.BRONZE_INGOT.get());
        offerArrowRecipe(recipeOutput, ModItems.IRON_ARROW.get(), Items.IRON_INGOT.asItem());
        offerArrowRecipe(recipeOutput, ModItems.STEEL_ARROW.get(), ModItems.STEEL_INGOT.get());
        offerArrowRecipe(recipeOutput, ModItems.MITHRIL_ARROW.get(), ModItems.MITHRIL_INGOT.get());
        offerArrowRecipe(recipeOutput, ModItems.ADAMANT_ARROW.get(), ModItems.ADAMANTITE_INGOT.get());
        offerArrowRecipe(recipeOutput, ModItems.RUNE_ARROW.get(), ModItems.RUNITE_INGOT.get());

        offerAxeRecipe(recipeOutput, ModItems.BRONZE_AXE.get(), ModItems.BRONZE_INGOT.get());
        offerAxeRecipe(recipeOutput, ModItems.STEEL_AXE.get(), ModItems.STEEL_INGOT.get());
        offerAxeRecipe(recipeOutput, ModItems.MITHRIL_AXE.get(), ModItems.MITHRIL_INGOT.get());
        offerAxeRecipe(recipeOutput, ModItems.ADAMANT_AXE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerAxeRecipe(recipeOutput, ModItems.RUNE_AXE.get(), ModItems.RUNITE_INGOT.get());

        offerBootsRecipe(recipeOutput, ModItems.BRONZE_BOOTS.get(), ModItems.BRONZE_INGOT.get());
        offerBootsRecipe(recipeOutput, ModItems.STEEL_BOOTS.get(), ModItems.STEEL_INGOT.get());
        offerBootsRecipe(recipeOutput, ModItems.MITHRIL_BOOTS.get(), ModItems.MITHRIL_INGOT.get());
        offerBootsRecipe(recipeOutput, ModItems.ADAMANT_BOOTS.get(), ModItems.ADAMANTITE_INGOT.get());
        offerBootsRecipe(recipeOutput, ModItems.RUNE_BOOTS.get(), ModItems.RUNITE_INGOT.get());

        offerChestplateRecipe(recipeOutput, ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_INGOT.get());
        offerChestplateRecipe(recipeOutput, ModItems.STEEL_CHESTPLATE.get(), ModItems.STEEL_INGOT.get());
        offerChestplateRecipe(recipeOutput, ModItems.MITHRIL_CHESTPLATE.get(), ModItems.MITHRIL_INGOT.get());
        offerChestplateRecipe(recipeOutput, ModItems.ADAMANT_CHESTPLATE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerChestplateRecipe(recipeOutput, ModItems.RUNE_CHESTPLATE.get(), ModItems.RUNITE_INGOT.get());

        offerHelmetRecipe(recipeOutput, ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_INGOT.get());
        offerHelmetRecipe(recipeOutput, ModItems.STEEL_HELMET.get(), ModItems.STEEL_INGOT.get());
        offerHelmetRecipe(recipeOutput, ModItems.MITHRIL_HELMET.get(), ModItems.MITHRIL_INGOT.get());
        offerHelmetRecipe(recipeOutput, ModItems.ADAMANT_HELMET.get(), ModItems.ADAMANTITE_INGOT.get());
        offerHelmetRecipe(recipeOutput, ModItems.RUNE_HELMET.get(), ModItems.RUNITE_INGOT.get());

        offerHoeRecipe(recipeOutput, ModItems.BRONZE_HOE.get(), ModItems.BRONZE_INGOT.get());
        offerHoeRecipe(recipeOutput, ModItems.STEEL_HOE.get(), ModItems.STEEL_INGOT.get());
        offerHoeRecipe(recipeOutput, ModItems.MITHRIL_HOE.get(), ModItems.MITHRIL_INGOT.get());
        offerHoeRecipe(recipeOutput, ModItems.ADAMANT_HOE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerHoeRecipe(recipeOutput, ModItems.RUNE_HOE.get(), ModItems.RUNITE_INGOT.get());

        offerLeggingsRecipe(recipeOutput, ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_INGOT.get());
        offerLeggingsRecipe(recipeOutput, ModItems.STEEL_LEGGINGS.get(), ModItems.STEEL_INGOT.get());
        offerLeggingsRecipe(recipeOutput, ModItems.MITHRIL_LEGGINGS.get(), ModItems.MITHRIL_INGOT.get());
        offerLeggingsRecipe(recipeOutput, ModItems.ADAMANT_LEGGINGS.get(), ModItems.ADAMANTITE_INGOT.get());
        offerLeggingsRecipe(recipeOutput, ModItems.RUNE_LEGGINGS.get(), ModItems.RUNITE_INGOT.get());

        offerPickaxeRecipe(recipeOutput, ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_INGOT.get());
        offerPickaxeRecipe(recipeOutput, ModItems.STEEL_PICKAXE.get(), ModItems.STEEL_INGOT.get());
        offerPickaxeRecipe(recipeOutput, ModItems.MITHRIL_PICKAXE.get(), ModItems.MITHRIL_INGOT.get());
        offerPickaxeRecipe(recipeOutput, ModItems.ADAMANT_PICKAXE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerPickaxeRecipe(recipeOutput, ModItems.RUNE_PICKAXE.get(), ModItems.RUNITE_INGOT.get());

        offerShovelRecipe(recipeOutput, ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_INGOT.get());
        offerShovelRecipe(recipeOutput, ModItems.STEEL_SHOVEL.get(), ModItems.STEEL_INGOT.get());
        offerShovelRecipe(recipeOutput, ModItems.MITHRIL_SHOVEL.get(), ModItems.MITHRIL_INGOT.get());
        offerShovelRecipe(recipeOutput, ModItems.ADAMANT_SHOVEL.get(), ModItems.ADAMANTITE_INGOT.get());
        offerShovelRecipe(recipeOutput, ModItems.RUNE_SHOVEL.get(), ModItems.RUNITE_INGOT.get());

        offerSwordRecipe(recipeOutput, ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_INGOT.get());
        offerSwordRecipe(recipeOutput, ModItems.STEEL_SWORD.get(), ModItems.STEEL_INGOT.get());
        offerSwordRecipe(recipeOutput, ModItems.MITHRIL_SWORD.get(), ModItems.MITHRIL_INGOT.get());
        offerSwordRecipe(recipeOutput, ModItems.ADAMANT_SWORD.get(), ModItems.ADAMANTITE_INGOT.get());
        offerSwordRecipe(recipeOutput, ModItems.RUNE_SWORD.get(), ModItems.RUNITE_INGOT.get());
    }

    protected static void offerIngotRecipe(RecipeOutput finishedRecipe, ItemLike output, int coalQuantity, ItemLike input) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output)
                .requires(input)
                .requires(Ingredient.of(ItemTags.COALS), coalQuantity)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy("has_coal", has(ItemTags.COALS))
                .save(finishedRecipe);
    }

    protected static void offerSpecialIngotRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input1, ItemLike input2) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output)
                .requires(input1, 4)
                .requires(input2, 4)
                .unlockedBy(getHasName(input1), has(input1))
                .unlockedBy(getHasName(input2), has(input2))
                .save(finishedRecipe);
    }

    protected static void orikalkumSmithing(RecipeOutput recipeOutput, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.ORIKALKUM_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(pIngredientItem),
                        Ingredient.of(ModItems.ORIKALKUM_INGOT.get()), pCategory, pResultItem)
                .unlocks(getHasName(ModItems.ORIKALKUM_INGOT.get()), has(ModItems.ORIKALKUM_INGOT.get()))
                .save(recipeOutput, OresAndMetals.identifier(getItemName(pResultItem) + "_smithing"));
    }

    protected static void necroniumSmithing(RecipeOutput recipeOutput, Item pIngredientItem, RecipeCategory pCategory, Item pResultItem) {
        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.NECRONIUM_UPGRADE_SMITHING_TEMPLATE.get()),
                        Ingredient.of(pIngredientItem),
                        Ingredient.of(ModItems.NECRONIUM_INGOT.get()), pCategory, pResultItem)
                .unlocks(getHasName(ModItems.NECRONIUM_INGOT.get()), has(ModItems.NECRONIUM_INGOT.get()))
                .save(recipeOutput, OresAndMetals.identifier(getItemName(pResultItem) + "_smithing"));
    }

    private void offerSmithingTemplate(RecipeOutput finishedRecipe, ItemLike output, ItemLike input1, ItemLike input2, ItemLike input3) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .define('#', input1)
                .define('C', input2)
                .define('S', input3)
                .unlockedBy(getHasName(input1), has(input1))
                .unlockedBy(getHasName(input2), has(input2))
                .unlockedBy(getHasName(input3), has(input3))
                .save(finishedRecipe);
    }

    private void copySmithingTemplate(RecipeOutput finishedRecipe, ItemLike output, ItemLike input1, ItemLike input2, ItemLike input3) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output, 2)
                .pattern("#S#")
                .pattern("#C#")
                .pattern("###")
                .define('#', input1)
                .define('C', input2)
                .define('S', input3)
                .unlockedBy(getHasName(input1), has(input1))
                .unlockedBy(getHasName(input2), has(input2))
                .unlockedBy(getHasName(input3), has(input3))
                .save(finishedRecipe);
    }

    protected static void offerArrowRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output, 4)
                .pattern("X")
                .pattern("|")
                .pattern("Y")
                .define('X', input)
                .define('|', Items.STICK)
                .define('Y', Items.FEATHER)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .unlockedBy(getHasName(Items.FEATHER), has(Items.FEATHER))
                .save(finishedRecipe);
    }

    protected static void offerAxeRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .define('#', input)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(finishedRecipe);
    }

    protected static void offerBootsRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerChestplateRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerHelmetRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerHoeRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .define('#', input)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(finishedRecipe);
    }

    protected static void offerLeggingsRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerPickaxeRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', input)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(finishedRecipe);
    }

    protected static void offerShovelRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .define('#', input)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(finishedRecipe);
    }

    protected static void offerSwordRecipe(RecipeOutput finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .define('#', input)
                .define('|', Items.STICK)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .save(finishedRecipe);
    }
}
