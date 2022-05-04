package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.datagen.BaseLootTableProvider;
import io.github.aradoryin.battlemage.init.BlockInit;
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
