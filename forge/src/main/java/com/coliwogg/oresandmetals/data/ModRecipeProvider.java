package com.coliwogg.oresandmetals.data;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.block.ModBlocks;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
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
        oreSmelting(consumer, List.of(ModBlocks.MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.7f, 200, "mithril");
        oreBlasting(consumer, List.of(ModBlocks.MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.7f, 100, "mithril");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.7f, 200, "mithril");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_MITHRIL_ORE.get()), RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.7f, 100, "mithril");
        oreSmelting(consumer, List.of(ModBlocks.ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.7f, 200, "adamantite");
        oreBlasting(consumer, List.of(ModBlocks.ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.7f, 100, "adamantite");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.7f, 200, "adamantite");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_ADAMANTITE_ORE.get()), RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get(), 0.7f, 100, "adamantite");
        oreSmelting(consumer, List.of(ModBlocks.RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 0.7f, 200, "runite");
        oreBlasting(consumer, List.of(ModBlocks.RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 0.7f, 100, "runite");
        oreSmelting(consumer, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 0.7f, 200, "runite");
        oreBlasting(consumer, List.of(ModBlocks.DEEPSLATE_RUNITE_ORE.get()), RecipeCategory.MISC, ModItems.RUNITE_INGOT.get(), 0.7f, 100, "runite");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TIN_INGOT.get(), RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.BRONZE_INGOT.get(), RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.STEEL_INGOT.get(), RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.MITHRIL_INGOT.get(), RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.ADAMANTITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipesWithBlockName(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RUNITE_INGOT.get(), RecipeCategory.MISC, ModBlocks.RUNITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_TIN.get(), RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_BRONZE.get(), RecipeCategory.MISC, ModBlocks.RAW_BRONZE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_STEEL.get(), RecipeCategory.MISC, ModBlocks.RAW_STEEL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_MITHRIL.get(), RecipeCategory.MISC, ModBlocks.RAW_MITHRIL_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ADAMANTITE.get(), RecipeCategory.MISC, ModBlocks.RAW_ADAMANTITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_RUNITE.get(), RecipeCategory.MISC, ModBlocks.RAW_RUNITE_BLOCK.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get())
                .requires(ModItems.MITHRIL_SCRAP.get())
                .requires(Ingredient.of(ItemTags.COALS), 4)
                .unlockedBy("has_mithril_scrap", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.MITHRIL_SCRAP.get()).build()))
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemTags.COALS).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ADAMANTITE_INGOT.get())
                .requires(ModItems.ADAMANTITE_SCRAP.get())
                .requires(Ingredient.of(ItemTags.COALS), 6)
                .unlockedBy("has_adamantite_scrap", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.ADAMANTITE_SCRAP.get()).build()))
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemTags.COALS).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUNITE_INGOT.get())
                .requires(ModItems.RUNITE_SCRAP.get())
                .requires(Ingredient.of(ItemTags.COALS), 8)
                .unlockedBy("has_runite_scrap", inventoryTrigger(ItemPredicate.Builder.item().of(ModItems.RUNITE_SCRAP.get()).build()))
                .unlockedBy("has_coal", inventoryTrigger(ItemPredicate.Builder.item().of(ItemTags.COALS).build()))
                .save(consumer);

        // ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_OPAL_BLOCK.get())
        //         .define('B', ModItems.BLACK_OPAL.get())
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .pattern("BBB")
        //         .unlockedBy("has_black_opal", inventoryTrigger(ItemPredicate.Builder.item()
        //                 .of(ModItems.BLACK_OPAL.get()).build()))
        //         .save(consumer);
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
