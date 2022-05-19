package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
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
		// MINECRAFT TAGS
		
		// FORGE TAGS
		tag(Tags.Items.ORES)
			.addTag(TagInit.Items.EXAMPLE_ORE);
		tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE)
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
		tag(Tags.Items.ORES_IN_GROUND_STONE)
			.add(BlockInit.EXAMPLE_ORE.get().asItem());
		tag(Tags.Items.ORE_RATES_SINGULAR)
			.addTag(TagInit.Items.EXAMPLE_ORE);
		
		// MOD TAGS
		tag(TagInit.Items.EXAMPLE_ITEM)
			.add(ItemInit.EXAMPLE_ITEM.get());
		tag(TagInit.Items.RUNE_PATTERNS)
			.add(ItemInit.PATTERN_AOE.get())
			.add(ItemInit.PATTERN_POOL.get())
			.add(ItemInit.PATTERN_TRAP.get())
			.add(ItemInit.PATTERN_TARGETED.get())
			.add(ItemInit.PATTERN_LOB.get())
			.add(ItemInit.PATTERN_RAY.get())
			.add(ItemInit.PATTERN_NOVA.get());
		tag(TagInit.Items.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
	}

}
