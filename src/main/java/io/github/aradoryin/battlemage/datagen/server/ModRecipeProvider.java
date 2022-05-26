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
import net.minecraft.data.recipes.SingleItemRecipeBuilder;
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
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath()));
		//STONE
		ShapedRecipeBuilder.shaped(BlockInit.A_I_STONE_BRICKS.get(), 4)
			.define('a', BlockInit.A_I_STONE.get())
			.pattern("aa")
			.pattern("aa")
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_BRICKS.get().getRegistryName().getPath()));
		buttonBuilder(BlockInit.A_I_STONE_BUTTON.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_BUTTON.get().getRegistryName().getPath()));
		chiseledBuilder(BlockInit.A_I_CHISELED_STONE_BRICKS.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_CHISELED_STONE_BRICKS.get().getRegistryName().getPath()));
		pressurePlateBuilder(BlockInit.A_I_STONE_PRESSURE_PLATE.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_PRESSURE_PLATE.get().getRegistryName().getPath()));
		slabBuilder(BlockInit.A_I_STONE_SLAB.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_SLAB.get().getRegistryName().getPath()));
		stairBuilder(BlockInit.A_I_STONE_STAIRS.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_STAIRS.get().getRegistryName().getPath()));
		wallBuilder(BlockInit.A_I_STONE_WALL.get().asItem(), Ingredient.of(TagInit.Items.MOD_STONE))
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_WALL.get().getRegistryName().getPath()));
		
		stonecutterResultFromBase(consumer, BlockInit.A_I_STONE_SLAB.get().asItem(), BlockInit.A_I_STONE.get().asItem(), 2);
		stonecutterResultFromBase(consumer, BlockInit.A_I_STONE_STAIRS.get().asItem(), BlockInit.A_I_STONE.get().asItem());
		stonecutterResultFromBase(consumer, BlockInit.A_I_STONE_BRICKS.get().asItem(), BlockInit.A_I_STONE.get().asItem());
		stonecutterResultFromBase(consumer, BlockInit.A_I_STONE_BRICK_SLAB.get().asItem(), BlockInit.A_I_STONE.get().asItem(), 2);
		stonecutterResultFromBase(consumer, BlockInit.A_I_STONE_BRICK_STAIRS.get().asItem(), BlockInit.A_I_STONE.get().asItem());
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockInit.A_I_STONE.get().asItem()), BlockInit.A_I_CHISELED_STONE_BRICKS.get().asItem())
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_CHISELED_STONE_BRICKS.get().getRegistryName().getPath() + "_from_stonecutting"));
		SingleItemRecipeBuilder.stonecutting(Ingredient.of(BlockInit.A_I_STONE.get().asItem()), BlockInit.A_I_STONE_BRICK_WALL.get().asItem())
			.unlockedBy("has_a_i_stone", has(BlockInit.A_I_STONE.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.A_I_STONE_BRICK_WALL.get().getRegistryName().getPath() + "_from_stonecutting"));
		
		
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
