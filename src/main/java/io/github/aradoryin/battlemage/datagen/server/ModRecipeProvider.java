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
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;

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
		ShapedRecipeBuilder.shaped(ItemInit.EXAMPLE_ITEM.get())
			.define('a', BlockInit.EXAMPLE_BLOCK.get().asItem())
			.define('b', TagInit.Items.EXAMPLE_ITEM)
			.pattern("aba").pattern("bab").pattern("aba")
			.unlockedBy("has_" + BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath(), has(BlockInit.EXAMPLE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath()));
		
		//Shapeless Recipes
		ShapelessRecipeBuilder.shapeless(BlockInit.EXAMPLE_BLOCK.get().asItem(), 4)
			.requires(ItemInit.EXAMPLE_ITEM.get())
			.requires(ItemInit.EXAMPLE_ITEM.get())
			.requires(ItemInit.EXAMPLE_ITEM.get())
			.requires(Items.DIAMOND)
			.unlockedBy("has_" + ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(ItemInit.EXAMPLE_ITEM.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath()));
		
		//Cooking Recipe
		//SimpleCookingRecipeBuilder.smelting(Ingredient.of([BlockInit].[BLOCK].get().asItem(), [ItemInit].[ITEM].get(), [EXPERIENCE ORBS], [COOKING TIME TICKS])
		//	.save(consumer, new ResourceLocation(Battlemage.MOD_ID, [ItemInit].[ITEM].get().getRegistryName().getPath() + "_smelting"));
	}

}
