package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
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
		tag(TagInit.Items.EXAMPLE_ITEM)
			.add(ItemInit.EXAMPLE_ITEM.get());
		
		//TAG ORE ITEM
		tag(Tags.Items.ORES)
			.add(BlockInit.EXAMPLE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem())
			.add(BlockInit.ONYX_ORE.get().asItem())
			.add(BlockInit.ONYX_ORE_DEEPSLATE.get().asItem())
			.add(BlockInit.RUBY_ORE.get().asItem())
			.add(BlockInit.RUBY_ORE_DEEPSLATE.get().asItem())
			.add(BlockInit.SAPPHIRE_ORE.get().asItem())
			.add(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get().asItem())
			.add(BlockInit.TIGERS_EYE_ORE.get().asItem())
			.add(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get().asItem())
			;
		
		//TAG GEM
		tag(TagInit.Items.GEM)
			.add(ItemInit.RUBY.get())
			.add(ItemInit.ONYX.get())
			.add(ItemInit.SAPPHIRE.get())
			.add(ItemInit.TIGERS_EYE.get())
			.add(Items.DIAMOND)
			.add(Items.QUARTZ)
			.add(Items.AMETHYST_CLUSTER)
			.add(Items.EMERALD)
			.add(Items.NETHER_STAR);
		
		//TAG ELEMENTAL CORE
		tag(TagInit.Items.ELEMENTAL_CORE)
			.add(ItemInit.CORRUPTION_CORE.get())
			.add(ItemInit.DELIRIUM_CORE.get())
			.add(ItemInit.EARTH_CORE.get())
			.add(ItemInit.FIRE_CORE.get())
			.add(ItemInit.ICE_CORE.get())
			.add(ItemInit.KINESIS_CORE.get())
			.add(ItemInit.LIGHTNING_CORE.get())
			.add(ItemInit.NECROMANCY_CORE.get())
			.add(ItemInit.PHASE_CORE.get());
		
		//TAG TABLET ENGRAVING ITEM
		tag(TagInit.Items.TABLET_ENGRAVING_INGREDIENT);
		
		//TAG BRACER UPGRADE ITEM
		tag(TagInit.Items.BRACER_UPGRADE_ITEM);
	}

}
