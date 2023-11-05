package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_BRONZE.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 200, "bronze");
        oreBlasting(consumer, List.of(ModItems.RAW_BRONZE.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.7f, 100, "bronze");
        oreSmelting(consumer, List.of(ModItems.RAW_STEEL.get()), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 200, "steel");
        oreBlasting(consumer, List.of(ModItems.RAW_STEEL.get()), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.7f, 100, "steel");
        oreSmelting(consumer, List.of(ModItems.RAW_MITHRIL.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 200, "mithril");
        oreBlasting(consumer, List.of(ModItems.RAW_MITHRIL.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 100, "mithril");
        oreSmelting(consumer, List.of(ModItems.RAW_ADAMANTITE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 200, "adamantite");
        oreBlasting(consumer, List.of(ModItems.RAW_ADAMANTITE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 100, "adamantite");
        oreSmelting(consumer, List.of(ModItems.RAW_RUNITE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 200, "runite");
        oreBlasting(consumer, List.of(ModItems.RAW_RUNITE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 100, "runite");

        oreSmelting(consumer, List.of(ModBlocks.TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 200, "tin");
        oreBlasting(consumer, List.of(ModBlocks.TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 100, "tin");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 200, "tin");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_TIN_ORE.get()), RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.7f, 100, "tin");
        oreSmelting(consumer, List.of(ModBlocks.MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 200, "mithril");
        oreBlasting(consumer, List.of(ModBlocks.MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 100, "mithril");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 200, "mithril");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 1.0f, 100, "mithril");
        oreSmelting(consumer, List.of(ModBlocks.ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 200, "adamantite");
        oreBlasting(consumer, List.of(ModBlocks.ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 100, "adamantite");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 200, "adamantite");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 1.4f, 100, "adamantite");
        oreSmelting(consumer, List.of(ModBlocks.RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 200, "runite");
        oreBlasting(consumer, List.of(ModBlocks.RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 100, "runite");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 200, "runite");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 2.0f, 100, "runite");
        oreSmelting(consumer, List.of(ModBlocks.ORICHALCITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP.get(), 2.0f, 200, "orichalcite");
        oreBlasting(consumer, List.of(ModBlocks.ORICHALCITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.ORICHALCITE_SCRAP.get(), 2.0f, 100, "orichalcite");
        oreSmelting(consumer, List.of(ModBlocks.NECRITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.NECRITE_SCRAP.get(), 2.0f, 200, "necrite");
        oreBlasting(consumer, List.of(ModBlocks.NECRITE_DEBRIS.get()), RecipeCategory.MISC, ModItems.NECRITE_SCRAP.get(), 2.0f, 100, "necrite");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT.get(), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT.get(), RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.RUNITE_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.ORIKALKUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.ORIKALKUM_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.NECRONIUM_INGOT.get(), RecipeCategory.MISC, ModBlocks.NECRONIUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN.get(), RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BRONZE.get(), RecipeCategory.MISC, ModBlocks.RAW_BRONZE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_STEEL.get(), RecipeCategory.MISC, ModBlocks.RAW_STEEL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL.get(), RecipeCategory.MISC, ModBlocks.RAW_MITHRIL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE.get(), RecipeCategory.MISC, ModBlocks.RAW_RUNITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_DRAKOLITH.get(), RecipeCategory.MISC, ModBlocks.RAW_DRAKOLITH_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PHASMATITE.get(), RecipeCategory.MISC, ModBlocks.RAW_PHASMATITE_BLOCK.get());

        offerIngotRecipe(consumer, ModItems.MITHRIL_INGOT.get(), 4, ModItems.MITHRIL_SCRAP.get());
        offerIngotRecipe(consumer, ModItems.ADAMANTITE_INGOT.get(), 6, ModItems.ADAMANTITE_SCRAP.get());
        offerIngotRecipe(consumer, ModItems.RUNITE_INGOT.get(), 8, ModItems.RUNITE_SCRAP.get());
        offerSpecialIngotRecipe(consumer, ModItems.ORIKALKUM_INGOT.get(), ModItems.ORICHALCITE_SCRAP.get(), ModItems.RAW_DRAKOLITH.get());
        offerSpecialIngotRecipe(consumer, ModItems.NECRONIUM_INGOT.get(), ModItems.NECRITE_SCRAP.get(), ModItems.RAW_PHASMATITE.get());

        offerArrowRecipe(consumer, ModItems.BRONZE_ARROW.get(), ModItems.BRONZE_INGOT.get());
        offerArrowRecipe(consumer, ModItems.IRON_ARROW.get(), Items.IRON_INGOT.asItem());
        offerArrowRecipe(consumer, ModItems.STEEL_ARROW.get(), ModItems.STEEL_INGOT.get());
        offerArrowRecipe(consumer, ModItems.MITHRIL_ARROW.get(), ModItems.MITHRIL_INGOT.get());
        offerArrowRecipe(consumer, ModItems.ADAMANT_ARROW.get(), ModItems.ADAMANTITE_INGOT.get());
        offerArrowRecipe(consumer, ModItems.RUNE_ARROW.get(), ModItems.RUNITE_INGOT.get());

        offerAxeRecipe(consumer, ModItems.BRONZE_AXE.get(), ModItems.BRONZE_INGOT.get());
        offerAxeRecipe(consumer, ModItems.STEEL_AXE.get(), ModItems.STEEL_INGOT.get());
        offerAxeRecipe(consumer, ModItems.MITHRIL_AXE.get(), ModItems.MITHRIL_INGOT.get());
        offerAxeRecipe(consumer, ModItems.ADAMANT_AXE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerAxeRecipe(consumer, ModItems.RUNE_AXE.get(), ModItems.RUNITE_INGOT.get());

        offerBootsRecipe(consumer, ModItems.BRONZE_BOOTS.get(), ModItems.BRONZE_INGOT.get());
        offerBootsRecipe(consumer, ModItems.STEEL_BOOTS.get(), ModItems.STEEL_INGOT.get());
        offerBootsRecipe(consumer, ModItems.MITHRIL_BOOTS.get(), ModItems.MITHRIL_INGOT.get());
        offerBootsRecipe(consumer, ModItems.ADAMANT_BOOTS.get(), ModItems.ADAMANTITE_INGOT.get());
        offerBootsRecipe(consumer, ModItems.RUNE_BOOTS.get(), ModItems.RUNITE_INGOT.get());

        offerChestplateRecipe(consumer, ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_INGOT.get());
        offerChestplateRecipe(consumer, ModItems.STEEL_CHESTPLATE.get(), ModItems.STEEL_INGOT.get());
        offerChestplateRecipe(consumer, ModItems.MITHRIL_CHESTPLATE.get(), ModItems.MITHRIL_INGOT.get());
        offerChestplateRecipe(consumer, ModItems.ADAMANT_CHESTPLATE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerChestplateRecipe(consumer, ModItems.RUNE_CHESTPLATE.get(), ModItems.RUNITE_INGOT.get());

        offerHelmetRecipe(consumer, ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_INGOT.get());
        offerHelmetRecipe(consumer, ModItems.STEEL_HELMET.get(), ModItems.STEEL_INGOT.get());
        offerHelmetRecipe(consumer, ModItems.MITHRIL_HELMET.get(), ModItems.MITHRIL_INGOT.get());
        offerHelmetRecipe(consumer, ModItems.ADAMANT_HELMET.get(), ModItems.ADAMANTITE_INGOT.get());
        offerHelmetRecipe(consumer, ModItems.RUNE_HELMET.get(), ModItems.RUNITE_INGOT.get());

        offerHoeRecipe(consumer, ModItems.BRONZE_HOE.get(), ModItems.BRONZE_INGOT.get());
        offerHoeRecipe(consumer, ModItems.STEEL_HOE.get(), ModItems.STEEL_INGOT.get());
        offerHoeRecipe(consumer, ModItems.MITHRIL_HOE.get(), ModItems.MITHRIL_INGOT.get());
        offerHoeRecipe(consumer, ModItems.ADAMANT_HOE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerHoeRecipe(consumer, ModItems.RUNE_HOE.get(), ModItems.RUNITE_INGOT.get());

        offerLeggingsRecipe(consumer, ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_INGOT.get());
        offerLeggingsRecipe(consumer, ModItems.STEEL_LEGGINGS.get(), ModItems.STEEL_INGOT.get());
        offerLeggingsRecipe(consumer, ModItems.MITHRIL_LEGGINGS.get(), ModItems.MITHRIL_INGOT.get());
        offerLeggingsRecipe(consumer, ModItems.ADAMANT_LEGGINGS.get(), ModItems.ADAMANTITE_INGOT.get());
        offerLeggingsRecipe(consumer, ModItems.RUNE_LEGGINGS.get(), ModItems.RUNITE_INGOT.get());

        offerPickaxeRecipe(consumer, ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_INGOT.get());
        offerPickaxeRecipe(consumer, ModItems.STEEL_PICKAXE.get(), ModItems.STEEL_INGOT.get());
        offerPickaxeRecipe(consumer, ModItems.MITHRIL_PICKAXE.get(), ModItems.MITHRIL_INGOT.get());
        offerPickaxeRecipe(consumer, ModItems.ADAMANT_PICKAXE.get(), ModItems.ADAMANTITE_INGOT.get());
        offerPickaxeRecipe(consumer, ModItems.RUNE_PICKAXE.get(), ModItems.RUNITE_INGOT.get());

        offerShovelRecipe(consumer, ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_INGOT.get());
        offerShovelRecipe(consumer, ModItems.STEEL_SHOVEL.get(), ModItems.STEEL_INGOT.get());
        offerShovelRecipe(consumer, ModItems.MITHRIL_SHOVEL.get(), ModItems.MITHRIL_INGOT.get());
        offerShovelRecipe(consumer, ModItems.ADAMANT_SHOVEL.get(), ModItems.ADAMANTITE_INGOT.get());
        offerShovelRecipe(consumer, ModItems.RUNE_SHOVEL.get(), ModItems.RUNITE_INGOT.get());

        offerSwordRecipe(consumer, ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_INGOT.get());
        offerSwordRecipe(consumer, ModItems.STEEL_SWORD.get(), ModItems.STEEL_INGOT.get());
        offerSwordRecipe(consumer, ModItems.MITHRIL_SWORD.get(), ModItems.MITHRIL_INGOT.get());
        offerSwordRecipe(consumer, ModItems.ADAMANT_SWORD.get(), ModItems.ADAMANTITE_INGOT.get());
        offerSwordRecipe(consumer, ModItems.RUNE_SWORD.get(), ModItems.RUNITE_INGOT.get());
    }

    protected static void offerIngotRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, int coalQuantity, ItemLike input) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output)
                .requires(input)
                .requires(Ingredient.of(ItemTags.COALS), coalQuantity)
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy("has_coal", has(ItemTags.COALS))
                .save(finishedRecipe);
    }
    protected static void offerSpecialIngotRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input1, ItemLike input2) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, output)
                .requires(input1, 4)
                .requires(input2, 4)
                .unlockedBy(getHasName(input1), has(input1))
                .unlockedBy(getHasName(input2), has(input2))
                .save(finishedRecipe);
    }

    protected static void offerArrowRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output, 4)
                .pattern("X")
                .pattern("|")
                .pattern("Y")
                .define('X', input)
                .define('|', Items.STICK.asItem())
                .define('Y', Items.FEATHER.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .unlockedBy(getHasName(Items.FEATHER.asItem()), has(Items.FEATHER.asItem()))
                .save(finishedRecipe);
    }

    protected static void offerAxeRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern("#|")
                .pattern(" |")
                .define('#', input)
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(finishedRecipe);
    }

    protected static void offerBootsRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerChestplateRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerHelmetRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerHoeRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("##")
                .pattern(" |")
                .pattern(" |")
                .define('#', input)
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(finishedRecipe);
    }

    protected static void offerLeggingsRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .define('#', input)
                .unlockedBy(getHasName(input), has(input))
                .save(finishedRecipe);
    }

    protected static void offerPickaxeRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("###")
                .pattern(" | ")
                .pattern(" | ")
                .define('#', input)
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(finishedRecipe);
    }

    protected static void offerShovelRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, output)
                .pattern("#")
                .pattern("|")
                .pattern("|")
                .define('#', input)
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(finishedRecipe);
    }

    protected static void offerSwordRecipe(Consumer<FinishedRecipe> finishedRecipe, ItemLike output, ItemLike input) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, output)
                .pattern("#")
                .pattern("#")
                .pattern("|")
                .define('#', input)
                .define('|', Items.STICK.asItem())
                .unlockedBy(getHasName(input), has(input))
                .unlockedBy(getHasName(Items.STICK.asItem()), has(Items.STICK.asItem()))
                .save(finishedRecipe);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(OresAndMetals.MOD_ID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipesWithBlockName(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipesWithBlockName(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_,
                                                  RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_,
                                                  String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_))
                .save(p_250423_, new ResourceLocation(OresAndMetals.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(OresAndMetals.MOD_ID, p_250475_));
    }

    protected static void nineBlockStorageRecipesWithBlockName(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_,
                                                  RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_,
                                                  String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_))
                .save(p_250423_, new ResourceLocation(OresAndMetals.MOD_ID, p_252237_ + "_from_" + p_250475_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(OresAndMetals.MOD_ID, p_250475_));
    }

}
