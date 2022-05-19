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

		//EXAMPLE TAGS
		public static final TagKey<Block> EXAMPLE_BLOCK = mod("example_block");
		public static final TagKey<Block> EXAMPLE_ORE = mod("example_ore");
		
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
		
		//RUNE PATTERNS
		public static final TagKey<Item> RUNE_PATTERNS = mod("rune_patterns");
		
		private static TagKey<Item> mod(String path)
		{
			return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
}
