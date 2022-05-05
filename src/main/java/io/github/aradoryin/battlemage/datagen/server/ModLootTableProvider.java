package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.datagen.BaseLootTableProvider;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModLootTableProvider extends BaseLootTableProvider
{

	public ModLootTableProvider(DataGenerator generator)
	{
		super(generator);
	}

	@Override
	protected void addTables()
	{
		//EXAMPLE BLOCK LOOT_TABLE
		dropSelf(BlockInit.EXAMPLE_BLOCK.get());

		//EXAMPLE ORE LOOT_TABLE
		dropSilkTouch(BlockInit.EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get(), 1, 4);
		
		//BLOCK LOOT_TABLE
		dropSelf(BlockInit.ONYX_BLOCK.get());
		dropSelf(BlockInit.RUBY_BLOCK.get());
		dropSelf(BlockInit.SAPPHIRE_BLOCK.get());
		dropSelf(BlockInit.TIGERS_EYE_BLOCK.get());
		
		//ORE LOOT_TABLE
		dropSilkTouch(BlockInit.ONYX_ORE.get(), ItemInit.ONYX.get(), 1, 4);
		dropSilkTouch(BlockInit.ONYX_ORE_DEEPSLATE.get(), ItemInit.ONYX.get(), 1, 4);
		dropSilkTouch(BlockInit.RUBY_ORE.get(), ItemInit.RUBY.get(), 1, 4);
		dropSilkTouch(BlockInit.RUBY_ORE_DEEPSLATE.get(), ItemInit.RUBY.get(), 1, 4);
		dropSilkTouch(BlockInit.SAPPHIRE_ORE.get(), ItemInit.SAPPHIRE.get(), 1, 4);
		dropSilkTouch(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get(), ItemInit.SAPPHIRE.get(), 1, 4);
		dropSilkTouch(BlockInit.TIGERS_EYE_ORE.get(), ItemInit.TIGERS_EYE.get(), 1, 4);
		dropSilkTouch(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get(), ItemInit.TIGERS_EYE.get(), 1, 4);
	}
	
	protected void dropSelf(Block block)
	{
		add(block, createSimpleTable(block.getRegistryName().getPath(), block));
	}
	
	protected void dropSilkTouch(Block block, Item silk, int minFortune, int maxFortune)
	{
		add(block, createSilkTouchTable(block.getRegistryName().getPath(), block, silk, minFortune, maxFortune));
	}

}
