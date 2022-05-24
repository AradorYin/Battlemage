package io.github.aradoryin.battlemage.datagen.loot;

import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
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
		
		//EXAMPLE BLOCK
		this.dropSelf(BlockInit.EXAMPLE_BLOCK.get());
		//EXAMPLE ORES
		this.add(BlockInit.EXAMPLE_ORE.get(), (block) -> createOreDrop(BlockInit.EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get()));
		this.dropWhenSilkTouch(BlockInit.EXAMPLE_ORE.get());
		this.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), (block) -> createOreDrop(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), ItemInit.EXAMPLE_ITEM.get()));
		this.dropWhenSilkTouch(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		
		//STONES
		this.dropSelf(BlockInit.A_I_CHISELED_STONE_BRICKS.get());
		this.dropSelf(BlockInit.A_I_CRACKED_STONE_BRICKS.get());
		this.dropSelf(BlockInit.A_I_STONE.get());
		this.dropSelf(BlockInit.A_I_STONE_BRICK.get());
		this.dropSelf(BlockInit.A_I_STONE_BRICK_STAIRS.get());
		this.dropSelf(BlockInit.A_I_STONE_BUTTON.get());
		this.dropSelf(BlockInit.A_I_STONE_PRESSURE_PLATE.get());
		this.dropSelf(BlockInit.A_I_STONE_SLAB.get());
		this.dropSelf(BlockInit.A_I_STONE_STAIRS.get());
		this.dropSelf(BlockInit.A_I_STONE_WALL.get());
	}
	
	@Override
	protected Iterable<Block> getKnownBlocks()
	{
		return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
	
}
