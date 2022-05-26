package io.github.aradoryin.battlemage.init;

import io.github.aradoryin.battlemage.Battlemage;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagInit
{
	
	public static final class Blocks
	{
		//MINEABLE TOOL MATERIAL TAGS
		public static final TagKey<Block> WOOD_MINEABLE_PICKAXE = mod("wood_mineable");
		public static final TagKey<Block> STONE_MINEABLE_PICKAXE = mod("stone_mineable_pickaxe");
		public static final TagKey<Block> STONE_MINEABLE_AXE = mod("stone_mineable");
		
		//GENERAL TAGS
		public static final TagKey<Block> MOD_BUTTONS = mod("mod_buttons");
		public static final TagKey<Block> MOD_DOORS = mod("mod_doors");
		public static final TagKey<Block> MOD_PRESSURE_PLATE = mod("mod_pressure_plate");
		public static final TagKey<Block> MOD_SLAB = mod("mod_slab");
		public static final TagKey<Block> MOD_STAIRS = mod("mod_stairs");
		public static final TagKey<Block> MOD_VALID_SPAWNABLE = mod("mod_valid_spawnable");
		public static final TagKey<Block> MOD_WALLS = mod("mod_walls");
		
		//ORE TAGS
		public static final TagKey<Block> MOD_STONE_ORE_STONE = mod("mod_ore_stone");
		public static final TagKey<Block> MOD_STONE_ORE_DEEPSLATE = mod("mod_ore_deepslate");
		public static final TagKey<Block> DEEPSLATE_EXAMPLE_ORE = mod("deepslate_example_ore");
		public static final TagKey<Block> EXAMPLE_ORE = mod("example_ore");
		
		//STONE TAGS
		public static final TagKey<Block> MOD_CHISELED_STONE_BRICKS = mod("mod_chiseled_stone_bricks");
		public static final TagKey<Block> MOD_CRACKED_CHISELED_STONE_BRICKS = mod("mod_cracked_chiseled_stone_bricks");
		public static final TagKey<Block> MOD_STONE = mod("mod_stone");
		public static final TagKey<Block> MOD_STONE_BRICKS = mod("mod_stone_bricks");
		public static final TagKey<Block> MOD_STONE_BRICK_SLAB = mod("mod_stone_brick_slab");
		public static final TagKey<Block> MOD_STONE_BRICK_STAIRS = mod("mod_stone_brick_stairs");
		public static final TagKey<Block> MOD_STONE_BRICK_WALL = mod("mod_stone_brick_wall");
		public static final TagKey<Block> MOD_STONE_BUTTONS = mod("mod_stone_buttons");
		public static final TagKey<Block> MOD_STONE_PRESSURE_PLATE = mod("mod_stone_pressure_plate");
		public static final TagKey<Block> MOD_STONE_SLAB = mod("mod_stone_slab");
		public static final TagKey<Block> MOD_STONE_STAIRS = mod("mod_stone_stairs");
		public static final TagKey<Block> MOD_STONE_WALL = mod("mod_stone_wall");
		
		//STORAGE BLOCK TAGS
		public static final TagKey<Block> EXAMPLE_BLOCK = mod("example_block");
		
		private static TagKey<Block> mod(String path)
		{
			return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
	public static final class Items
	{
		//MINEABLE TOOL MATERIAL TAGS
		public static final TagKey<Item> WOOD_MINEABLE_PICKAXE = mod("wood_mineable");
		public static final TagKey<Item> STONE_MINEABLE_PICKAXE = mod("stone_mineable_pickaxe");
		public static final TagKey<Item> STONE_MINEABLE_AXE = mod("stone_mineable");
		
		//GENERAL TAGS
		public static final TagKey<Item> MOD_BUTTONS = mod("mod_buttons");
		public static final TagKey<Item> MOD_DOORS = mod("mod_doors");
		public static final TagKey<Item> MOD_GEM = mod("mod_gem");
		public static final TagKey<Item> MOD_PRESSURE_PLATE = mod("mod_pressure_plate");
		public static final TagKey<Item> MOD_SLAB = mod("mod_slab");
		public static final TagKey<Item> MOD_STAIRS = mod("mod_stairs");
		public static final TagKey<Item> MOD_VALID_SPAWNABLE = mod("mod_valid_spawnable");
		public static final TagKey<Item> MOD_WALLS = mod("mod_walls");
		
		//ORE TAGS
		public static final TagKey<Item> MOD_STONE_ORE_STONE = mod("mod_ore_stone");
		public static final TagKey<Item> MOD_STONE_ORE_DEEPSLATE = mod("mod_ore_deepslate");
		public static final TagKey<Item> DEEPSLATE_EXAMPLE_ORE = mod("deepslate_example_ore");
		public static final TagKey<Item> EXAMPLE_ORE = mod("example_ore");
		
		//STONE TAGS
		public static final TagKey<Item> MOD_CHISELED_STONE_BRICKS = mod("mod_chiseled_stone_bricks");
		public static final TagKey<Item> MOD_CRACKED_CHISELED_STONE_BRICKS = mod("mod_cracked_chiseled_stone_bricks");
		public static final TagKey<Item> MOD_STONE = mod("mod_stone");
		public static final TagKey<Item> MOD_STONE_BUTTONS = mod("mod_stone_buttons");
		public static final TagKey<Item> MOD_STONE_BRICKS = mod("mod_stone_bricks");
		public static final TagKey<Item> MOD_STONE_BRICK_SLAB = mod("mod_stone_brick_slab");
		public static final TagKey<Item> MOD_STONE_BRICK_STAIRS = mod("mod_stone_brick_stairs");
		public static final TagKey<Item> MOD_STONE_BRICK_WALL = mod("mod_stone_brick_wall");
		public static final TagKey<Item> MOD_STONE_PRESSURE_PLATE = mod("mod_stone_pressure_plate");
		public static final TagKey<Item> MOD_STONE_SLAB = mod("mod_stone_slab");
		public static final TagKey<Item> MOD_STONE_STAIRS = mod("mod_stone_stairs");
		public static final TagKey<Item> MOD_STONE_WALL = mod("mod_stone_wall");
		
		//STORAGE BLOCK TAGS
		public static final TagKey<Item> MOD_STORAGE_BLOCK = mod("mod_storage_block");
		public static final TagKey<Item> EXAMPLE_BLOCK = mod("example_block");
		
		//RUNE PATTERNS
		public static final TagKey<Item> RUNE_PATTERNS = mod("rune_patterns");
		
		//ELEMENT PATTERNS
		public static final TagKey<Item> ELEMENT_PATTERNS = mod("element_patterns");
		
		//ITEM TAGS
		public static final TagKey<Item> EXAMPLE_ITEM = mod("example_item");
		
		private static TagKey<Item> mod(String path)
		{
			return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
}
