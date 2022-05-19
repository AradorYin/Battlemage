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
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get());
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
	}

}
