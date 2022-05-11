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
		// > ONYX
		dropSelf(BlockInit.ONYX_BLOCK.get());
		// > RUBY
		dropSelf(BlockInit.RUBY_BLOCK.get());
		// > SAPPHIRE
		dropSelf(BlockInit.SAPPHIRE_BLOCK.get());
		// > STONE
//		dropSelf(BlockInit.AETHER_INFUSED_STONE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_BRICKS.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_BUTTON.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_GATE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_SLAB.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_STAIRS.get());
//		dropSelf(BlockInit.AETHER_INFUSED_STONE_WALL.get());
		// > TIGERS_EYE
		dropSelf(BlockInit.TIGERS_EYE_BLOCK.get());
		// > WOOD
//		dropSelf(BlockInit.AETHER_INFUSED_SAPLING.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_DOOR.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_FENCE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_LOG.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_PLANK.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_SLAB.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get());
//		dropSelf(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get());
		
		//ORE LOOT_TABLE
		dropSilkTouch(BlockInit.ONYX_ORE.get(), ItemInit.ONYX.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_ONYX_ORE.get(), ItemInit.ONYX.get(), 1, 4);
		dropSilkTouch(BlockInit.RUBY_ORE.get(), ItemInit.RUBY.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_RUBY_ORE.get(), ItemInit.RUBY.get(), 1, 4);
		dropSilkTouch(BlockInit.SAPPHIRE_ORE.get(), ItemInit.SAPPHIRE.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), ItemInit.SAPPHIRE.get(), 1, 4);
		dropSilkTouch(BlockInit.TIGERS_EYE_ORE.get(), ItemInit.TIGERS_EYE.get(), 1, 4);
		dropSilkTouch(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get(), ItemInit.TIGERS_EYE.get(), 1, 4);
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
