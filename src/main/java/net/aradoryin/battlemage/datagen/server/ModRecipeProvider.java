package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // BLASTING
        simpleBlastingRecipe(consumer, ModItems.GEODE_WIP.get(), ModItems.GEM_WIP.get(), 2f, 180);
        simpleBlastingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 180);
        simpleBlastingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 180);
        // CAMPFIRE
        // SHAPELESS CRAFTING
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GEM_WIP.get(), 9, ModBlocks.BLOCK_WIP.get());
        // SMELTING
        simpleSmeltingRecipe(consumer, ModItems.GEODE_WIP.get(), ModItems.GEM_WIP.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get(), 1f, 200);
        // SMOKING
        // STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.GEM_WIP.get(), ModBlocks.BLOCK_WIP.get());
    }
    /*
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GEM_WIP.get())
            .requires(ModBlocks.BLOCK_WIP.get())
            .unlockedBy("has_block_wip", inventoryTrigger(ItemPredicate.Builder.item()
                    .of(ModBlocks.BLOCK_WIP.get()).build()))
            .save(consumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(ModItems.GEM_WIP.get()) + "_x");
     ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_WIP.get())
            .define('B', ModItems.GEM_WIP.get())
            .pattern("BBB")
            .pattern("BBB")
            .pattern("BBB")
            .unlockedBy("has_gem_wip", inventoryTrigger(ItemPredicate.Builder.item()
                    .of(ModItems.GEM_WIP.get()).build()))
            .save(consumer);
     */

    /**
     * This is a complex recipe method for any Shapeless Crafting in the 2x2 or 3x3 crafting GUI.
     *
     * This method is complex and therefore takes in a RecipeConsumer consumer, a RecipeCategory RecipeCategory.X where 'X' equals the location where
     * you want this recipe to go, ItemLike output for the final Item/Block of the craft, int outputAmount for how many outputs to give the player,
     * ItemLike... inputs for an input array. The max usable number of inputs is 9.
     * @param recipeConsumer consumer
     * @param recipeCategory RecipeCategory.MISC
     * @param output ModItems.GEM_WIP.get()
     * @param outputAmount 9
     * @param inputs ModBlocks.BLOCK_WIP.get()
     */
    private void shapelessRecipe(Consumer<FinishedRecipe> recipeConsumer, RecipeCategory recipeCategory, ItemLike output, int outputAmount, ItemLike... inputs)
    {
        switch (inputs.length)
        {
            case 1:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 2:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 3:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 4:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
            case 5:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .requires(inputs[4])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 6:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .requires(inputs[4]).requires(inputs[5])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 7:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .requires(inputs[4]).requires(inputs[5]).requires(inputs[6])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 8:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .requires(inputs[4]).requires(inputs[5]).requires(inputs[6]).requires(inputs[7])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            case 9:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .requires(inputs[4]).requires(inputs[5]).requires(inputs[6]).requires(inputs[7]).requires(inputs[8])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + "_shapeless"));
                break;
            default:
        }
    }
    /**
     * This recipe method is intended for simple Blast Furnace recipes.
     * @param recipeConsumer consumer
     * @param input ModBlocks.ORE_WIP.get()
     * @param output ModItems.GEODE_WIP.get()
     * @param experience 3f
     * @param cookingTime 180
     */
    private void simpleBlastingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, float experience, int cookingTime)
    {
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime)
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build())).save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_blasting"));
    }
    /**
     * This recipe method is intended for simple Furnace recipes.
     * @param recipeConsumer consumer
     * @param input ModBlocks.ORE_WIP.get()
     * @param output ModItems.GEODE_WIP.get()
     * @param experience 3f
     * @param cookingTime 180
     */
    private void simpleSmeltingRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, float experience, int cookingTime)
    {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, output, experience, cookingTime)
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build())).save(recipeConsumer,
                        new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_smelting"));
    }

    /**
     * This recipe method is intended for simple Storage Block Recipes.
     * @param recipeConsumer consumer
     * @param input ModItems.GEM_WIP.get()
     * @param output ModBlocks.BLOCK_WIP.get()
     */
    private void storageBlockRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define('i', input)
                .pattern("iii")
                .pattern("iii")
                .pattern("iii")
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_storage_block"));
    }
}
