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
		
		//TAG BLOCK
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get());
		tag(TagInit.Blocks.ONYX_BLOCK)
			.add(BlockInit.ONYX_BLOCK.get());
		tag(TagInit.Blocks.RUBY_BLOCK)
			.add(BlockInit.RUBY_BLOCK.get());
		tag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.add(BlockInit.RUBY_BLOCK.get());
		tag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.add(BlockInit.TIGERS_EYE_BLOCK.get());
		
		//TAG ORE CUSTOM
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		tag(TagInit.Blocks.ONYX_ORE)
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.ONYX_ORE_DEEPSLATE.get());
		tag(TagInit.Blocks.RUBY_ORE)
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.RUBY_ORE_DEEPSLATE.get());
		tag(TagInit.Blocks.SAPPHIRE_ORE)
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get());
		tag(TagInit.Blocks.TIGERS_EYE_ORE)
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get());
		
		//TAG ORE
		tag(Tags.Blocks.ORES)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.ONYX_ORE_DEEPSLATE.get())
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.RUBY_ORE_DEEPSLATE.get())
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get())
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get())
			;
		
		//TAG MINEABLE WITH PICKAXE
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.add(BlockInit.EXAMPLE_BLOCK.get())
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			.add(BlockInit.ONYX_BLOCK.get())
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.ONYX_ORE_DEEPSLATE.get())
			.add(BlockInit.RUBY_BLOCK.get())
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.RUBY_ORE_DEEPSLATE.get())
			.add(BlockInit.SAPPHIRE_BLOCK.get())
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get())
			.add(BlockInit.TIGERS_EYE_BLOCK.get())
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get())
			;
		
		//TAG NEEDS IRON TOOL
		tag(BlockTags.NEEDS_IRON_TOOL)
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
	}

}
