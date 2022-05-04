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
		dropSelf(BlockInit.EXAMPLE_BLOCK.get());
		dropSilkTouch(BlockInit.EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get(), 1, 4);
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
