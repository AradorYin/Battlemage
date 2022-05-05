package io.github.aradoryin.battlemage.datagen.server;

import java.util.function.Consumer;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModRecipeProvider extends RecipeProvider
{

	public ModRecipeProvider(DataGenerator generator)
	{
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer)
	{
		//Shaped Recipes
		//EXAMPLE BLOCK
		ShapedRecipeBuilder.shaped(BlockInit.EXAMPLE_BLOCK.get())
			.define('a', ItemInit.EXAMPLE_ITEM.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		//BLOCK
		ShapedRecipeBuilder.shaped(BlockInit.ONYX_BLOCK.get())
			.define('a', ItemInit.ONYX.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_" + ItemInit.ONYX.get().getRegistryName().getPath(), has(ItemInit.ONYX.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.ONYX_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		ShapedRecipeBuilder.shaped(BlockInit.RUBY_BLOCK.get())
			.define('a', ItemInit.RUBY.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_" + ItemInit.RUBY.get().getRegistryName().getPath(), has(ItemInit.RUBY.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.RUBY_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		ShapedRecipeBuilder.shaped(BlockInit.SAPPHIRE_BLOCK.get())
			.define('a', ItemInit.SAPPHIRE.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_" + ItemInit.SAPPHIRE.get().getRegistryName().getPath(), has(ItemInit.SAPPHIRE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.SAPPHIRE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		ShapedRecipeBuilder.shaped(BlockInit.TIGERS_EYE_BLOCK.get())
			.define('a', ItemInit.TIGERS_EYE.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_" + ItemInit.TIGERS_EYE.get().getRegistryName().getPath(), has(ItemInit.TIGERS_EYE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.TIGERS_EYE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		
		//Shapeless Recipes
		//EXAMPLE ITEM
		ShapelessRecipeBuilder.shapeless(ItemInit.EXAMPLE_ITEM.get(), 9)
			.requires(BlockInit.EXAMPLE_BLOCK.get())
			.unlockedBy("has_" + BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath(), has(BlockInit.EXAMPLE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath() + "_crafting"));
		
		//ITEM
		ShapelessRecipeBuilder.shapeless(ItemInit.ONYX.get(), 9)
			.requires(BlockInit.ONYX_BLOCK.get())
			.unlockedBy("has_" + BlockInit.ONYX_BLOCK.get().getRegistryName().getPath(), has(BlockInit.ONYX_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.ONYX.get().getRegistryName().getPath() + "_crafting"));
		
		ShapelessRecipeBuilder.shapeless(ItemInit.SAPPHIRE.get(), 9)
			.requires(BlockInit.SAPPHIRE_BLOCK.get())
			.unlockedBy("has_" + BlockInit.SAPPHIRE_BLOCK.get().getRegistryName().getPath(), has(BlockInit.SAPPHIRE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.SAPPHIRE.get().getRegistryName().getPath() + "_crafting"));
		
		ShapelessRecipeBuilder.shapeless(ItemInit.RUBY.get(), 9)
			.requires(BlockInit.RUBY_BLOCK.get())
			.unlockedBy("has_" + BlockInit.RUBY_BLOCK.get().getRegistryName().getPath(), has(BlockInit.RUBY_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.RUBY.get().getRegistryName().getPath() + "_crafting"));
		
		ShapelessRecipeBuilder.shapeless(ItemInit.TIGERS_EYE.get(), 9)
			.requires(BlockInit.TIGERS_EYE_BLOCK.get())
			.unlockedBy("has_" + BlockInit.TIGERS_EYE_BLOCK.get().getRegistryName().getPath(), has(BlockInit.TIGERS_EYE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.TIGERS_EYE.get().getRegistryName().getPath() + "_crafting"));
		
		
		/*
		 * SimpleCookingRecipeBuilder.smelting(Ingredient.of([BLOCKINIT].[BLOCK].get().asItem(), [ITEMINIT].[ITEM].get(), [EXPERIENCE ORBS], [COOKING TIME TICKS])
		 * 		.unlockedBy("has_", has([BLOCKINIT].[BLOCK].get()))
		 * 		.save(consumer, new ResourceLocation(Battlemage.MOD_ID, [ITEMINIT].[ITEM].get().getRegistryName().getPath() + "_smelting")));
		 */
		//Cooking Recipe
		//EXAMPLE ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.EXAMPLE_ORE.get().asItem()), ItemInit.EXAMPLE_ITEM.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.EXAMPLE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem()), ItemInit.EXAMPLE_ITEM.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.DEEPSLATE_EXAMPLE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_EXAMPLE_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		//ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.ONYX_ORE.get().asItem()), ItemInit.ONYX.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.ONYX_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.ONYX_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.ONYX_ORE_DEEPSLATE.get().asItem()), ItemInit.ONYX.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.ONYX_ORE_DEEPSLATE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.ONYX_ORE_DEEPSLATE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.RUBY_ORE.get().asItem()), ItemInit.RUBY.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.RUBY_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.RUBY_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.RUBY_ORE_DEEPSLATE.get().asItem()), ItemInit.RUBY.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.RUBY_ORE_DEEPSLATE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.RUBY_ORE_DEEPSLATE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.SAPPHIRE_ORE.get().asItem()), ItemInit.SAPPHIRE.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.SAPPHIRE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.SAPPHIRE_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get().asItem()), ItemInit.SAPPHIRE.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.SAPPHIRE_ORE_DEEPSLATE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.TIGERS_EYE_ORE.get().asItem()), ItemInit.TIGERS_EYE.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.TIGERS_EYE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.TIGERS_EYE_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get().asItem()), ItemInit.TIGERS_EYE.get(), 3, 100)
			.unlockedBy("has_", has(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get().getRegistryName().getPath() + "_smelting"));
	}

}
