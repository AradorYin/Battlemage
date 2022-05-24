package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{

	public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper)
	{
		super(generator, Battlemage.MOD_ID, helper);
	}
	
	@Override
	protected void addTags()
	{
		// MINECRAFT TAGS
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			;
		tag(BlockTags.NEEDS_STONE_TOOL)
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE);
		
		// FORGE TAGS
		tag(Tags.Blocks.ORE_RATES_SINGULAR)
			.addTag(TagInit.Blocks.EXAMPLE_ORE);
		tag(Tags.Blocks.ORES)
			.addTag(TagInit.Blocks.EXAMPLE_ORE);
		tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		tag(Tags.Blocks.ORES_IN_GROUND_STONE)
			.add(BlockInit.EXAMPLE_ORE.get());
		
		
		// MOD TAGS
		tag(TagInit.Blocks.WOOD_MINEABLE);
		tag(TagInit.Blocks.STONE_MINEABLE);
		tag(TagInit.Blocks.MOD_BUTTONS)
			.addTag(TagInit.Blocks.MOD_STONE_BUTTONS);
		tag(TagInit.Blocks.MOD_PRESSURE_PLATE)
			.addTag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE);
		tag(TagInit.Blocks.MOD_SLAB)
			.addTag(TagInit.Blocks.MOD_STONE_SLAB);
		tag(TagInit.Blocks.MOD_STAIRS)
			.addTag(TagInit.Blocks.MOD_STONE_STAIRS);
		
		//EXAMPLE TAGS
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get());
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		
		//MOD STONES
		tag(TagInit.Blocks.MOD_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CHISELED_STONE_BRICKS.get());
		tag(TagInit.Blocks.MOD_CRACKED_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CRACKED_STONE_BRICKS.get());
		tag(TagInit.Blocks.MOD_STONE)
			.add(BlockInit.A_I_STONE.get());
		tag(TagInit.Blocks.MOD_STONE_BRICKS)
			.add(BlockInit.A_I_STONE_BRICK.get());
		tag(TagInit.Blocks.MOD_STONE_BUTTONS)
			.add(BlockInit.A_I_STONE_BUTTON.get());
		tag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE)
			.add(BlockInit.A_I_STONE_PRESSURE_PLATE.get());
		tag(TagInit.Blocks.MOD_STONE_SLAB)
			.add(BlockInit.A_I_STONE_SLAB.get());
		tag(TagInit.Blocks.MOD_STONE_STAIRS)
			.add(BlockInit.A_I_STONE_BRICK_STAIRS.get())
			.add(BlockInit.A_I_STONE_STAIRS.get());
	}

}
