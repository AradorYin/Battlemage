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
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
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
		ShapedRecipeBuilder.shaped(BlockInit.EXAMPLE_BLOCK.get(), 1)
			.define('a', ItemInit.EXAMPLE_ITEM.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_example_item", has(ItemInit.EXAMPLE_ITEM.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		
		
		//Shapeless Recipes
		
		//EXAMPLE ITEM
		ShapelessRecipeBuilder.shapeless(ItemInit.EXAMPLE_ITEM.get(), 9)
			.requires(BlockInit.EXAMPLE_BLOCK.get())
			.unlockedBy("has_example_block", has(BlockInit.EXAMPLE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath() + "_crafting"));
		
		
		//Cooking Recipe
		
		//EXAMPLE ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(TagInit.Items.EXAMPLE_ORE), ItemInit.EXAMPLE_ITEM.get(), 3, 100)
			.unlockedBy("has_" + TagInit.Items.EXAMPLE_ORE.toString(), has(TagInit.Items.EXAMPLE_ORE))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, TagInit.Items.EXAMPLE_ORE.location().getPath()));
	}

}
