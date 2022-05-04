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
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get())
			;
		
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			;
		
		tag(BlockTags.NEEDS_IRON_TOOL)
			.add(BlockInit.EXAMPLE_BLOCK.get())
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			;
		
		tag(Tags.Blocks.ORES)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			;
	}

}
