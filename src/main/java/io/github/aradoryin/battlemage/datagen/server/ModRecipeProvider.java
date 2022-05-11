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
		ShapedRecipeBuilder.shaped(BlockInit.EXAMPLE_BLOCK.get(), 1)
			.define('a', ItemInit.EXAMPLE_ITEM.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_example_item", has(ItemInit.EXAMPLE_ITEM.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		// > BRACER
		ShapedRecipeBuilder.shaped(ItemInit.BRACER.get(), 1)
			.define('a', Items.LEATHER)
			.define('b', Items.STRING)
			.pattern("bab")
			.pattern("aba")
			.pattern("bab")
			.unlockedBy("has_leather", has(Items.LEATHER))
			.unlockedBy("has_string", has(Items.STRING))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.BRACER.get().getRegistryName().getPath() + "_crafting"));
		// > ONYX
		ShapedRecipeBuilder.shaped(BlockInit.ONYX_BLOCK.get(), 1)
			.define('a', ItemInit.ONYX.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_onyx", has(ItemInit.ONYX.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.ONYX_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		// > RUBY
		ShapedRecipeBuilder.shaped(BlockInit.RUBY_BLOCK.get(), 1)
			.define('a', ItemInit.RUBY.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_ruby", has(ItemInit.RUBY.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.RUBY_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		// > SAPPHIRE
		ShapedRecipeBuilder.shaped(BlockInit.SAPPHIRE_BLOCK.get(), 1)
			.define('a', ItemInit.SAPPHIRE.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_sapphire", has(ItemInit.SAPPHIRE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.SAPPHIRE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		// > STONE BRICKS
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_BRICKS.get(), 4)
//			.define('a',  BlockInit.AETHER_INFUSED_STONE.get())
//			.pattern("aa")
//			.pattern("aa")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_BRICKS.get().getRegistryName().getPath() + "_crafting"));
		// > STONE GATE
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_GATE.get(), 1)
//			.define('a', Items.STICK)
//			.define('b', BlockInit.AETHER_INFUSED_STONE.get())
//			.pattern("aba")
//			.pattern("aba")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_GATE.get().getRegistryName().getPath() + "_crafting"));
		// > STONE PRESSURE PLATE
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get(), 1)
//			.define('a', BlockInit.AETHER_INFUSED_STONE.get())
//			.pattern("aa")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get().getRegistryName().getPath() + "_crafting"));
		// > STONE SLAB
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_SLAB.get(), 6)
//			.define('a', BlockInit.AETHER_INFUSED_STONE_SLAB.get())
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_SLAB.get().getRegistryName().getPath() + "_crafting"));
		// > STONE STAIRS
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_STAIRS.get(), 4)
//			.define('a', BlockInit.AETHER_INFUSED_STONE.get())
//			.pattern("a  ")
//			.pattern("aa ")
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_STAIRS.get().getRegistryName().getPath() + "_crafting"));
		// > STONE WALL
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_STONE_WALL.get(), 6)
//			.define('a', BlockInit.AETHER_INFUSED_STONE.get())
//			.pattern("aaa")
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_WALL.get().getRegistryName().getPath() + "_crafting"));
		// > TIGERS_EYE
		ShapedRecipeBuilder.shaped(BlockInit.TIGERS_EYE_BLOCK.get(), 1)
			.define('a', ItemInit.TIGERS_EYE.get())
			.pattern("aaa")
			.pattern("aaa")
			.pattern("aaa")
			.unlockedBy("has_tigers_eye", has(ItemInit.TIGERS_EYE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.TIGERS_EYE_BLOCK.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD DOOR
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_DOOR.get(), 3)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("aa ")
//			.pattern("aa ")
//			.pattern("aa ")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_DOOR.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD FENCE
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_FENCE.get(), 3)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("aaa")
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_FENCE.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD FENCE GATE
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get(), 3)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.define('b', Items.STICK)
//			.pattern("bab")
//			.pattern("bab")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_FENCE.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD PRESSURE PLATE
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get(), 1)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("aa")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD SLAB
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_SLAB.get(), 6)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_SLAB.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD STAIRS
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get(), 3)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("a  ")
//			.pattern("aa ")
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_STAIRS.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD TRAPDOOR
//		ShapedRecipeBuilder.shaped(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get(), 2)
//			.define('a', BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.pattern("aaa")
//			.pattern("aaa")
//			.unlockedBy("has_aether_infused_wood_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get().getRegistryName().getPath() + "_crafting"));
		
		//Shapeless Recipes
		//EXAMPLE ITEM
		ShapelessRecipeBuilder.shapeless(ItemInit.EXAMPLE_ITEM.get(), 9)
			.requires(BlockInit.EXAMPLE_BLOCK.get())
			.unlockedBy("has_example_item", has(BlockInit.EXAMPLE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.EXAMPLE_ITEM.get().getRegistryName().getPath() + "_crafting"));
		// > ONYX
		ShapelessRecipeBuilder.shapeless(ItemInit.ONYX.get(), 9)
			.requires(BlockInit.ONYX_BLOCK.get())
			.unlockedBy("has_onyx_block", has(BlockInit.ONYX_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.ONYX.get().getRegistryName().getPath() + "_crafting"));
		// > RUBY
		ShapelessRecipeBuilder.shapeless(ItemInit.RUBY.get(), 9)
			.requires(BlockInit.RUBY_BLOCK.get())
			.unlockedBy("has_ruby_block", has(BlockInit.RUBY_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.RUBY.get().getRegistryName().getPath() + "_crafting"));
		// > SAPPHIRE
		ShapelessRecipeBuilder.shapeless(ItemInit.SAPPHIRE.get(), 9)
			.requires(BlockInit.SAPPHIRE_BLOCK.get())
			.unlockedBy("has_sapphire_block", has(BlockInit.SAPPHIRE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.SAPPHIRE.get().getRegistryName().getPath() + "_crafting"));
		// > STONE BUTTON
//		ShapelessRecipeBuilder.shapeless(BlockInit.AETHER_INFUSED_STONE_BUTTON.get(), 1)
//			.requires(BlockInit.AETHER_INFUSED_STONE.get())
//			.unlockedBy("has_aether_infused_stone", has(BlockInit.AETHER_INFUSED_STONE.get().asItem()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_STONE_BUTTON.get().getRegistryName().getPath() + "_crafting"));
		// > TIGERS_EYE
		ShapelessRecipeBuilder.shapeless(ItemInit.TIGERS_EYE.get(), 9)
			.requires(BlockInit.TIGERS_EYE_BLOCK.get())
			.unlockedBy("has_tigers_eye_block", has(BlockInit.TIGERS_EYE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, ItemInit.TIGERS_EYE.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD BUTTON
//		ShapelessRecipeBuilder.shapeless(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get(), 1)
//			.requires(BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.unlockedBy("has_aether_infused_plank", has(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_BUTTON.get().getRegistryName().getPath() + "_crafting"));
		// > WOOD PLANK
//		ShapelessRecipeBuilder.shapeless(BlockInit.AETHER_INFUSED_WOOD_PLANK.get(), 4)
//			.requires(BlockInit.AETHER_INFUSED_WOOD_LOG.get())
//			.unlockedBy("has_aether_infused_wood_log", has(BlockInit.AETHER_INFUSED_WOOD_LOG.get()))
//			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.AETHER_INFUSED_WOOD_PLANK.get().getRegistryName().getPath() + "_crafting"));
		
		/*
		 * SimpleCookingRecipeBuilder.smelting(Ingredient.of([BLOCKINIT].[BLOCK].get().asItem(), [ITEMINIT].[ITEM].get(), [EXPERIENCE ORBS], [COOKING TIME TICKS])
		 * 		.unlockedBy("has_", has([BLOCKINIT].[BLOCK].get()))
		 * 		.save(consumer, new ResourceLocation(Battlemage.MOD_ID, [ITEMINIT].[ITEM].get().getRegistryName().getPath() + "_smelting")));
		 */
		//Cooking Recipe
		//EXAMPLE ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.EXAMPLE_ORE.get().asItem()), ItemInit.EXAMPLE_ITEM.get(), 3, 100)
			.unlockedBy("has_example_ore", has(BlockInit.EXAMPLE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.EXAMPLE_ORE.get().getRegistryName().getPath() + "_smelting"));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem()), ItemInit.EXAMPLE_ITEM.get(), 3, 100)
			.unlockedBy("has_deepslate_example_ore", has(BlockInit.DEEPSLATE_EXAMPLE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_EXAMPLE_ORE.get().getRegistryName().getPath() + "_smelting"));
		// > ONYX ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.ONYX_ORE.get().asItem()), ItemInit.ONYX.get(), 3, 100)
			.unlockedBy("has_onyx_ore", has(BlockInit.ONYX_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.ONYX_ORE.get().getRegistryName().getPath() + "_smelting"));
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_ONYX_ORE.get().asItem()), ItemInit.ONYX.get(), 3, 100)
			.unlockedBy("has_deepslate_onyx_ore", has(BlockInit.DEEPSLATE_ONYX_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_ONYX_ORE.get().getRegistryName().getPath() + "_smelting"));
		// > RUBY ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.RUBY_ORE.get().asItem()), ItemInit.RUBY.get(), 3, 100)
			.unlockedBy("has_ruby_ore", has(BlockInit.RUBY_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.RUBY_ORE.get().getRegistryName().getPath() + "_smelting"));
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem()), ItemInit.RUBY.get(), 3, 100)
			.unlockedBy("has_deepslate_ruby_ore", has(BlockInit.DEEPSLATE_RUBY_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_RUBY_ORE.get().getRegistryName().getPath() + "_smelting"));
		// > SAPPHIRE ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.SAPPHIRE_ORE.get().asItem()), ItemInit.SAPPHIRE.get(), 3, 100)
			.unlockedBy("has_sapphire_ore", has(BlockInit.SAPPHIRE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.SAPPHIRE_ORE.get().getRegistryName().getPath() + "_smelting"));
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().asItem()), ItemInit.SAPPHIRE.get(), 3, 100)
			.unlockedBy("has_deepslate_sapphire_ore", has(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().getRegistryName().getPath() + "_smelting"));
		// > TIGERS_EYE ORES
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.TIGERS_EYE_ORE.get().asItem()), ItemInit.TIGERS_EYE.get(), 3, 100)
			.unlockedBy("has_tigers_eye_ore", has(BlockInit.TIGERS_EYE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.TIGERS_EYE_ORE.get().getRegistryName().getPath() + "_smelting"));
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().asItem()), ItemInit.TIGERS_EYE.get(), 3, 100)
			.unlockedBy("has_deepslate_tigers_eye_ore", has(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get()))
			.save(consumer, new ResourceLocation(Battlemage.MOD_ID, BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().getRegistryName().getPath() + "_smelting"));
	}

}
