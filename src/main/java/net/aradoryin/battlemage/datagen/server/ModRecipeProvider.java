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
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        /*
        ----------------------------------------------------------------
                        2X2 CRAFTING SECTION
        ----------------------------------------------------------------
         */

        // STONE
        simple2X2Recipe(consumer, ModBlocks.BLASTED_STONE_DF.get(), ModBlocks.BLASTED_STONE_BRICKS_DF.get(), 4);
        simple2X2Recipe(consumer, ModBlocks.BLASTED_STONE_HL.get(), ModBlocks.BLASTED_STONE_BRICKS_HL.get(), 4);
        simple2X2Recipe(consumer, ModBlocks.BLASTED_STONE_OL.get(), ModBlocks.BLASTED_STONE_BRICKS_OL.get(), 4);
        simple2X2Recipe(consumer, ModBlocks.BLASTED_STONE_SL.get(), ModBlocks.BLASTED_STONE_BRICKS_SL.get(), 4);
        simple2X2Recipe(consumer, ModBlocks.BLASTED_STONE_ST.get(), ModBlocks.BLASTED_STONE_BRICKS_ST.get(), 4);
        // WOOD
        simple2X2Recipe(consumer, ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_WOOD.get(), 3);
        simple2X2Recipe(consumer, ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.STRIPPED_DAPHNE_WOOD.get(), 3);


        /*
        ----------------------------------------------------------------
                        SHAPELESS CRAFTING SECTION
        ----------------------------------------------------------------
         */

        // PLANK
        simpleLogToPlanksRecipe(consumer, ModBlocks.DAPHNE_LOG.get(), ModBlocks.DAPHNE_PLANKS.get(), 4);
        simpleLogToPlanksRecipe(consumer, ModBlocks.STRIPPED_DAPHNE_LOG.get(), ModBlocks.DAPHNE_PLANKS.get(), 4);
        // GEM EMERALDS <- STORAGE BLOCKS
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AMETHYST_EMERALD.get(), 9, ModBlocks.AMETHYST_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AQUAMARINE_EMERALD.get(), 9, ModBlocks.AQUAMARINE_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.CITRINE_EMERALD.get(), 9, ModBlocks.CITRINE_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GARNET_EMERALD.get(), 9, ModBlocks.GARNET_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.OPAL_EMERALD.get(), 9, ModBlocks.OPAL_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.PERIDOT_EMERALD.get(), 9, ModBlocks.PERIDOT_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.RUBY_EMERALD.get(), 9, ModBlocks.RUBY_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE_EMERALD.get(), 9, ModBlocks.SAPPHIRE_EMERALD_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.TOPAZ_EMERALD.get(), 9, ModBlocks.TOPAZ_EMERALD_BLOCK.get());
        // GEM FACETED <- STORAGE BLOCKS
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AMETHYST_FACETED.get(), 9, ModBlocks.AMETHYST_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AQUAMARINE_FACETED.get(), 9, ModBlocks.AQUAMARINE_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.CITRINE_FACETED.get(), 9, ModBlocks.CITRINE_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GARNET_FACETED.get(), 9, ModBlocks.GARNET_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.OPAL_FACETED.get(), 9, ModBlocks.OPAL_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.PERIDOT_FACETED.get(), 9, ModBlocks.PERIDOT_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.RUBY_FACETED.get(), 9, ModBlocks.RUBY_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE_FACETED.get(), 9, ModBlocks.SAPPHIRE_FACETED_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.TOPAZ_FACETED.get(), 9, ModBlocks.TOPAZ_FACETED_BLOCK.get());
        // GEM PEAR <- STORAGE BLOCKS
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AMETHYST_PEAR.get(), 9, ModBlocks.AMETHYST_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AQUAMARINE_PEAR.get(), 9, ModBlocks.AQUAMARINE_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.CITRINE_PEAR.get(), 9, ModBlocks.CITRINE_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GARNET_PEAR.get(), 9, ModBlocks.GARNET_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.OPAL_PEAR.get(), 9, ModBlocks.OPAL_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.PERIDOT_PEAR.get(), 9, ModBlocks.PERIDOT_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.RUBY_PEAR.get(), 9, ModBlocks.RUBY_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE_PEAR.get(), 9, ModBlocks.SAPPHIRE_PEAR_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.TOPAZ_PEAR.get(), 9, ModBlocks.TOPAZ_PEAR_BLOCK.get());
        // GEM SHARDS <- STORAGE BLOCKS
        shapelessRecipe(consumer, RecipeCategory.MISC, Items.AMETHYST_SHARD, 4, Blocks.AMETHYST_BLOCK);
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AQUAMARINE_SHARD.get(), 4, ModBlocks.AQUAMARINE_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.CITRINE_SHARD.get(), 4, ModBlocks.CITRINE_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GARNET_SHARD.get(), 4, ModBlocks.GARNET_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.OPAL_SHARD.get(), 4, ModBlocks.OPAL_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.PERIDOT_SHARD.get(), 4, ModBlocks.PERIDOT_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.RUBY_SHARD.get(), 4, ModBlocks.RUBY_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE_SHARD.get(), 4, ModBlocks.SAPPHIRE_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.TOPAZ_SHARD.get(), 4, ModBlocks.TOPAZ_BLOCK.get());
        // GEM TRILLION <- STORAGE BLOCKS
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AMETHYST_TRILLION.get(), 9, ModBlocks.AMETHYST_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.AQUAMARINE_TRILLION.get(), 9, ModBlocks.AQUAMARINE_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.CITRINE_TRILLION.get(), 9, ModBlocks.CITRINE_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.GARNET_TRILLION.get(), 9, ModBlocks.GARNET_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.OPAL_TRILLION.get(), 9, ModBlocks.OPAL_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.PERIDOT_TRILLION.get(), 9, ModBlocks.PERIDOT_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.RUBY_TRILLION.get(), 9, ModBlocks.RUBY_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.SAPPHIRE_TRILLION.get(), 9, ModBlocks.SAPPHIRE_TRILLION_BLOCK.get());
        shapelessRecipe(consumer, RecipeCategory.MISC, ModItems.TOPAZ_TRILLION.get(), 9, ModBlocks.TOPAZ_TRILLION_BLOCK.get());


        /*
        ----------------------------------------------------------------
                               SMELTING SECTION
        ----------------------------------------------------------------
         */

        // SMELTING
        simpleSmeltingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.WIP_GEODE.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.WIP_GEODE.get(), 1f, 200);
        // --BLOCKS
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_COBBLESTONE_DF.get(), ModBlocks.BLASTED_STONE_DF.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_COBBLESTONE_HL.get(), ModBlocks.BLASTED_STONE_HL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_COBBLESTONE_OL.get(), ModBlocks.BLASTED_STONE_OL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_COBBLESTONE_SL.get(), ModBlocks.BLASTED_STONE_SL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_COBBLESTONE_ST.get(), ModBlocks.BLASTED_STONE_ST.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_STONE_BRICKS_DF.get(), ModBlocks.BLASTED_CRACKED_STONE_BRICKS_DF.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_STONE_BRICKS_HL.get(), ModBlocks.BLASTED_CRACKED_STONE_BRICKS_HL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_STONE_BRICKS_OL.get(), ModBlocks.BLASTED_CRACKED_STONE_BRICKS_OL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_STONE_BRICKS_SL.get(), ModBlocks.BLASTED_CRACKED_STONE_BRICKS_SL.get(), 1f, 200);
        simpleSmeltingRecipe(consumer, ModBlocks.BLASTED_STONE_BRICKS_ST.get(), ModBlocks.BLASTED_CRACKED_STONE_BRICKS_ST.get(), 1f, 200);
        // BLASTING
        simpleBlastingRecipe(consumer, ModBlocks.ORE_WIP.get(), ModItems.WIP_GEODE.get(), 2f, 180);
        simpleBlastingRecipe(consumer, ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.WIP_GEODE.get(), 2f, 180);
        // CAMPFIRE
        // SMOKING


        /*
        ----------------------------------------------------------------
                    STORAGE BLOCK CRAFTING SECTION
        ----------------------------------------------------------------
         */

        // GEM EMERALDS -> STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.AMETHYST_EMERALD.get(), ModBlocks.AMETHYST_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_EMERALD.get(), ModBlocks.AQUAMARINE_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.CITRINE_EMERALD.get(), ModBlocks.CITRINE_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.GARNET_EMERALD.get(), ModBlocks.GARNET_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.OPAL_EMERALD.get(), ModBlocks.OPAL_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.PERIDOT_EMERALD.get(), ModBlocks.PERIDOT_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.RUBY_EMERALD.get(), ModBlocks.RUBY_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.SAPPHIRE_EMERALD.get(), ModBlocks.SAPPHIRE_EMERALD_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.TOPAZ_EMERALD.get(), ModBlocks.TOPAZ_EMERALD_BLOCK.get());
        // GEM FACETED -> STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.AMETHYST_FACETED.get(), ModBlocks.AMETHYST_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_FACETED.get(), ModBlocks.AQUAMARINE_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.CITRINE_FACETED.get(), ModBlocks.CITRINE_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.GARNET_FACETED.get(), ModBlocks.GARNET_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.OPAL_FACETED.get(), ModBlocks.OPAL_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.PERIDOT_FACETED.get(), ModBlocks.PERIDOT_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.RUBY_FACETED.get(), ModBlocks.RUBY_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.SAPPHIRE_FACETED.get(), ModBlocks.SAPPHIRE_FACETED_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.TOPAZ_FACETED.get(), ModBlocks.TOPAZ_FACETED_BLOCK.get());
        // GEM PEAR -> STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.AMETHYST_PEAR.get(), ModBlocks.AMETHYST_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_PEAR.get(), ModBlocks.AQUAMARINE_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.CITRINE_PEAR.get(), ModBlocks.CITRINE_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.GARNET_PEAR.get(), ModBlocks.GARNET_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.OPAL_PEAR.get(), ModBlocks.OPAL_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.PERIDOT_PEAR.get(), ModBlocks.PERIDOT_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.RUBY_PEAR.get(), ModBlocks.RUBY_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.SAPPHIRE_PEAR.get(), ModBlocks.SAPPHIRE_PEAR_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.TOPAZ_PEAR.get(), ModBlocks.TOPAZ_PEAR_BLOCK.get());
        // GEM SHARDS -> STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_SHARD.get(), Blocks.PRISMARINE);
        storageBlockGeodeRecipe(consumer, ModItems.AQUAMARINE_SHARD.get(), ModBlocks.AQUAMARINE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.CITRINE_SHARD.get(), ModBlocks.CITRINE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.GARNET_SHARD.get(), ModBlocks.GARNET_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.OPAL_SHARD.get(), ModBlocks.OPAL_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.PERIDOT_SHARD.get(), ModBlocks.PERIDOT_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.RUBY_SHARD.get(), ModBlocks.RUBY_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.SAPPHIRE_SHARD.get(), ModBlocks.SAPPHIRE_BLOCK.get());
        storageBlockGeodeRecipe(consumer, ModItems.TOPAZ_SHARD.get(), ModBlocks.TOPAZ_BLOCK.get());
        // GEM TRILLION -> STORAGE BLOCKS
        storageBlockRecipe(consumer, ModItems.AMETHYST_TRILLION.get(), ModBlocks.AMETHYST_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.AQUAMARINE_TRILLION.get(), ModBlocks.AQUAMARINE_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.CITRINE_TRILLION.get(), ModBlocks.CITRINE_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.GARNET_TRILLION.get(), ModBlocks.GARNET_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.OPAL_TRILLION.get(), ModBlocks.OPAL_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.PERIDOT_TRILLION.get(), ModBlocks.PERIDOT_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.RUBY_TRILLION.get(), ModBlocks.RUBY_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.SAPPHIRE_TRILLION.get(), ModBlocks.SAPPHIRE_TRILLION_BLOCK.get());
        storageBlockRecipe(consumer, ModItems.TOPAZ_TRILLION.get(), ModBlocks.TOPAZ_TRILLION_BLOCK.get());


        /*
        ----------------------------------------------------------------
                        CUSTOM CRAFTING SECTION
        ----------------------------------------------------------------
         */

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.BRACER_PATCHWORK.get(), 1)
                .define('L', Items.LEATHER)
                .define('S', Items.STRING)
                .pattern("SLS")
                .pattern("L L")
                .pattern("SLS")
                .unlockedBy("has_" + Items.LEATHER, inventoryTrigger(ItemPredicate.Builder.item().of(Items.LEATHER).build()))
                .unlockedBy("has_" + Items.STRING, inventoryTrigger(ItemPredicate.Builder.item().of(Items.STRING).build()))
                .save(consumer, new ResourceLocation(Battlemage.MOD_ID, "bracer_patchwork"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JEWEL_CRAFTING_STATION.get(), 1)
                .define('L', ModBlocks.DAPHNE_PLANKS.get())
                .define('S', ModBlocks.ETHERIC_STONE.get())
                .pattern("SSS")
                .pattern("L L")
                .unlockedBy("has_" + ModBlocks.DAPHNE_PLANKS, inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.DAPHNE_PLANKS.get()).build()))
                .unlockedBy("has_" + ModBlocks.ETHERIC_STONE, inventoryTrigger(ItemPredicate.Builder.item().of(ModBlocks.ETHERIC_STONE.get()).build()))
                .save(consumer, new ResourceLocation(Battlemage.MOD_ID, "jewel_crafting_station"));

    }

    /**
     * This is a complex recipe method for any Shapeless Crafting in the 2x2 or 3x3 crafting GUI using only 1-4 inputs.
     * <p>
     * This method is complex and therefore takes in a RecipeConsumer consumer, a RecipeCategory.X where 'X' equals the location where
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
     * @param recipeConsumer consumer
     * @param input ModBlocks.DAPHNE_LOG.get()
     * @param output ModBlocks.DAPHNE_PLANKS.get()
     * @param outputAmount 4
     */
    private void simple2X2Recipe(Consumer<FinishedRecipe> recipeConsumer, ItemLike input, ItemLike output, int outputAmount) {
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
