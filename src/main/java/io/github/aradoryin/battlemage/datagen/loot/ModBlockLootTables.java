package io.github.aradoryin.battlemage.datagen.loot;

import io.github.aradoryin.battlemage.init.BlockInit;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot
{
	private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05f, 0.0625f, 0.083333336f, 0.1f };

	@Override
	protected void addTables()
	{
		// this.dropSelf(BlockInit.BLOCK.get());
		// this.add(BlockInit.ORE.get(), (block) -> createOreDrop(BlockInit.ORE.get(), ItemInit.ITEM.get()));
		// this.dropWhenSilkTouch(BlockInit.BLOCK);
		// LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
		// 		.hasBlockStateProperties(BlockInit.PLANT.get())
		//		.setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PlantBlockClass.AGE, AGE));
		// this.add(BlockInit.PLANT.get(), createCropDrops(BlockInit.PLANT.get(), ItemInit.PLANT.get(), ItemInit.PLANT_SEED.get(), lootitemcondition$builder));
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks()
	{
		return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
	
}
