package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        // <----- Standard Method Recipes ----->
        // BLASTING
        simpleBlastingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 180);
        simpleBlastingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get(), 2f, 180);
        // CAMPFIRE
        // PLANK
        simpleLogToPlanksRecipe(consumer, ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_PLANKS.get(), 4);
        simpleLogToPlanksRecipe(consumer, ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.DAPHNE_PLANKS.get(), 4);
        // SHAPELESS CRAFTING
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GEM_WIP.get(), 9, ModBlocks.BLOCK_WIP.get());
        // SMELTING
        simpleSmeltingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get(), 1f, 200);
        // SMOKING
        // STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.GEM_WIP.get(), ModBlocks.BLOCK_WIP.get());
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_SHARD.get(), Blocks.PRISMARINE);
        storageBlockGeodeRecipe(consumer, ModItems.AQUAMARINE_SHARD.get(), ModBlocks.AQUAMARINE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.CITRINE_SHARD.get(), ModBlocks.CITRINE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.GARNET_SHARD.get(), ModBlocks.GARNET_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.OPAL_SHARD.get(), ModBlocks.OPAL_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.PERIDOT_SHARD.get(), ModBlocks.PERIDOT_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.RUBY_SHARD.get(), ModBlocks.RUBY_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.SAPPHIRE_SHARD.get(), ModBlocks.SAPPHIRE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.TOPAZ_SHARD.get(), ModBlocks.TOPAZ_BLOCK.get());
        // WOOD
        simpleLogToWoodRecipe(consumer, ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_WOOD.get(), 3);
        simpleLogToWoodRecipe(consumer, ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.STRIPPED_DAPHNE_WOOD.get(), 3);

        // <----- Non-Standard Method Recipes ----->
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BRACER_PATCHWORK.get(), 1)
                .define('L', Items.LEATHER)
                .define('S', Items.STRING)
                .pattern("SLS")
                .pattern("L L")
                .pattern("SLS")
                .unlockedBy("has_" + Items.LEATHER, inventoryTrigger(ItemPredicate.Builder.item().of(Items.LEATHER).build()))
                .unlockedBy("has_" + Items.STRING, inventoryTrigger(ItemPredicate.Builder.item().of(Items.STRING).build()))
                .save(consumer, new ResourceLocation(Battlemage.MOD_ID, "bracer_patchwork"));

    }

    /**
     * This is a complex recipe method for any Shapeless Crafting in the 2x2 or 3x3 crafting GUI using only 1-4 inputs.
     *
     * This method is complex and therefore takes in a RecipeConsumer consumer, a RecipeCategory RecipeCategory.X where 'X' equals the location where
     * you want this recipe to go, ItemLike output for the final Item/Block of the craft, int outputAmount for how many outputs to give the player,
     * ItemLike... inputs for an input array. The max usable number of inputs is 4.
     * @param recipeConsumer consumer
     * @param recipeCategory RecipeCategory.MISC
     * @param output ModItems.GEM_WIP.get()
     * @param outputAmount 9
     * @param inputs ModBlocks.BLOCK_WIP.get()
     */
    private void shapelessRecipe(Consumer<FinishedRecipe> recipeConsumer, RecipeCategory recipeCategory, ItemLike output, int outputAmount, ItemLike... inputs)
    {
        String shapeless = "_shapeless";
        switch (inputs.length)
        {
            case 1:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + shapeless));
                break;
            case 2:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + shapeless));
                break;
            case 3:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + shapeless));
                break;
            case 4:
                ShapelessRecipeBuilder.shapeless(recipeCategory, output, outputAmount).requires(inputs[0]).requires(inputs[1]).requires(inputs[2]).requires(inputs[3])
                        .unlockedBy("has_" + getItemName(output), inventoryTrigger(ItemPredicate.Builder.item().of(output).build()))
                        .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(output) + shapeless));
                break;
            default: break;
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
     * This is a simple recipe method for turning Logs into Planks.
     * @param recipeConsumer consumer
     * @param input ModBlocks.DAPHNE_LOG.get()
     * @param output ModBlocks.DAPHNE_PLANKS.get()
     * @param outputAmount 4
     */
    private void simpleLogToPlanksRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, int outputAmount) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, outputAmount).requires(input)
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_to_planks"));
    }

    /**
     * This is a simple recipe method for turning Logs into Wood
     * @param recipeConsumer
     * @param input
     * @param output
     * @param outputAmount
     */
    private void simpleLogToWoodRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, int outputAmount) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, outputAmount)
                .define('L', input)
                .pattern("LL")
                .pattern("LL")
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_to_wood"));
    }
    /**
     * This is a simple recipe method intended for simple Furnace recipes.
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
     * This is a recipe method intended for simple Storage Block Recipes.
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

    /**
     * This is a recipe method intended for simple geode Storage Block Recipes.
     * @param recipeConsumer consumer
     * @param input ModItems.GEM_WIP.get()
     * @param output ModBlocks.BLOCK_WIP.get()
     */
    private void storageBlockGeodeRecipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output)
    {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .define('i', input)
                .pattern("ii")
                .pattern("ii")
                .unlockedBy("has_" + getItemName(input), inventoryTrigger(ItemPredicate.Builder.item().of(input).build()))
                .save(recipeConsumer, new ResourceLocation(Battlemage.MOD_ID, getItemName(input) + "_geode_storage_block"));
    }
}
