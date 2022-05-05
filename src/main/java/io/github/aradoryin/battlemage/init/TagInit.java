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
		
		//BLOCK TAG
		public static final TagKey<Block> RUBY_BLOCK = mod("ruby_block");
		public static final TagKey<Block> ONYX_BLOCK = mod("onyx_block");
		public static final TagKey<Block> SAPPHIRE_BLOCK = mod("sapphire_block");
		public static final TagKey<Block> TIGERS_EYE_BLOCK = mod("tigers_eye_block");
		//ORE TAG
		public static final TagKey<Block> RUBY_ORE = mod("ruby_ore");
		public static final TagKey<Block> ONYX_ORE = mod("onyx_ore");
		public static final TagKey<Block> SAPPHIRE_ORE = mod("sapphire_ore");
		public static final TagKey<Block> TIGERS_EYE_ORE = mod("tigers_eye_ore");
		
		private static TagKey<Block> mod(String path)
		{
			return BlockTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
	public static final class Items
	{

		//EXAMPLE TAGS
		public static final TagKey<Item> EXAMPLE_ITEM = mod("example_item");
		
		//GEM TAG
		public static final TagKey<Item> GEM = mod("gem");
		
		//ELEMENTAL CORE TAG
		public static final TagKey<Item> ELEMENTAL_CORE = mod("elemental_core");
		
//		//ELEMENT.TYPE TAG
//		public static final TagKey<Item> ELEMENTAL_TYPE = mod("elemental_type");
//		
//		//AUGMENT.TYPE TAG
//		public static final TagKey<Item> AUGMENT_TYPE = mod("augment_type");
//		
//		//RUNE.TYPE TAG
//		public static final TagKey<Item> RUNE_TYPE = mod("rune_type");
		
		//TABLET ENGRAVING INGREDIENT TAG
		public static final TagKey<Item> TABLET_ENGRAVING_INGREDIENT = mod("tablet_engraving_ingredient");
		
		//BRACER UPGRADE TAG
		public static final TagKey<Item> BRACER_UPGRADE_ITEM = mod("bracer_upgrade_item");
		
		private static TagKey<Item> mod(String path)
		{
			return ItemTags.create(new ResourceLocation(Battlemage.MOD_ID, path));
		}
	}
	
}
