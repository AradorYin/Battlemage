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
		public static final TagKey<Block> WOOD_MINEABLE = mod("wood_mineable");
		public static final TagKey<Block> STONE_MINEABLE = mod("stone_mineable");
		
		//GENERAL TAGS
		public static final TagKey<Block> MOD_BUTTONS = mod("mod_buttons");
		public static final TagKey<Block> MOD_PRESSURE_PLATE = mod("mod_pressure_plate");
		public static final TagKey<Block> MOD_SLAB = mod("mod_slab");
		public static final TagKey<Block> MOD_STAIRS = mod("mod_stairs");
		
		//ORE TAGS
		public static final TagKey<Block> EXAMPLE_ORE = mod("example_ore");
		
		//STONE TAGS
		public static final TagKey<Block> MOD_CHISELED_STONE_BRICKS = mod("mod_chiseled_stone_bricks");
		public static final TagKey<Block> MOD_CRACKED_CHISELED_STONE_BRICKS = mod("mod_cracked_chiseled_stone_bricks");
		public static final TagKey<Block> MOD_STONE = mod("mod_stone");
		public static final TagKey<Block> MOD_STONE_BRICKS = mod("mod_stone_bricks");
		public static final TagKey<Block> MOD_STONE_BUTTONS = mod("mod_stone_buttons");
		public static final TagKey<Block> MOD_STONE_PRESSURE_PLATE = mod("mod_stone_pressure_plate");
		public static final TagKey<Block> MOD_STONE_SLAB = mod("mod_stone_slab");
		public static final TagKey<Block> MOD_STONE_STAIRS = mod("mod_stone_stairs");
		public static final TagKey<Block> MOD_WALLS = mod("mod_walls");
		
		//STORAGE BLOCK TAGS
		public static final TagKey<Block> EXAMPLE_BLOCK = mod("example_block");
		
		private static TagKey<Block> mod(String path)
		{
			return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
	public static final class Items
	{

		//EXAMPLE TAGS
		public static final TagKey<Item> EXAMPLE_BLOCK = mod("example_block");
		public static final TagKey<Item> EXAMPLE_ITEM = mod("example_item");
		public static final TagKey<Item> EXAMPLE_ORE = mod("example_ore");
		
		//GENERAL TAGS
		public static final TagKey<Item> MOD_BUTTONS = mod("mod_buttons");
		public static final TagKey<Item> MOD_PRESSURE_PLATE = mod("mod_pressure_plate");
		public static final TagKey<Item> MOD_SLAB = mod("mod_slab");
		public static final TagKey<Item> MOD_STAIRS = mod("mod_stairs");
		
		//RUNE PATTERNS
		public static final TagKey<Item> RUNE_PATTERNS = mod("rune_patterns");
		
		//ELEMENT PATTERNS
		public static final TagKey<Item> ELEMENT_PATTERNS = mod("element_patterns");
		
		private static TagKey<Item> mod(String path)
		{
			return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
}
