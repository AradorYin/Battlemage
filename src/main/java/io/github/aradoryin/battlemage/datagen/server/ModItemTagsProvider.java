package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{

	public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blocks, ExistingFileHelper helper)
	{
		super(generator, blocks, Battlemage.MOD_ID, helper);
	}
	
	@Override
	protected void addTags()
	{
		tag(TagInit.Items.EXAMPLE_ITEM)
			.add(ItemInit.EXAMPLE_ITEM.get())
			;
		
		tag(Tags.Items.ORES)
//			.add(BlockInit.EXAMPLE_ORE.get())
//			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			;
	}

}
