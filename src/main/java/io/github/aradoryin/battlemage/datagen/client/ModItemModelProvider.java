package io.github.aradoryin.battlemage.datagen.client;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider
{

	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper)
	{
		super(generator, Battlemage.MOD_ID, helper);
	}
	
	protected void simpleBlockItem(Item item)
	{
		getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
	}
	
	private ItemModelBuilder simpleItem(Item item)
	{
		return withExistingParent(item.getRegistryName().getPath(), 
				new ResourceLocation("item/generated")).texture("layer0", 
						new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getRegistryName().getPath()));
	}
	
	private ItemModelBuilder handheldItem(Item item)
	{
		return withExistingParent(item.getRegistryName().getPath(), 
				new ResourceLocation("item/handheld")).texture("layer0", 
						new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getRegistryName().getPath()));
	}

	@Override
	protected void registerModels()
	{
		// ITEMS
		
		//EXAMPLE ITEM
		simpleItem(ItemInit.EXAMPLE_ITEM.get());
		
		//RUNE PATTERNS
		simpleItem(ItemInit.PATTERN_RUNE_AOE.get());
		simpleItem(ItemInit.PATTERN_RUNE_LOB.get());
		simpleItem(ItemInit.PATTERN_RUNE_NOVA.get());
		simpleItem(ItemInit.PATTERN_RUNE_POOL.get());
		simpleItem(ItemInit.PATTERN_RUNE_RAY.get());
		simpleItem(ItemInit.PATTERN_RUNE_TARGETED.get());
		simpleItem(ItemInit.PATTERN_RUNE_TRAP.get());
		
		//ELEMENT PATTERNS
		simpleItem(ItemInit.PATTERN_ELEMENT_CORRUPTION.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_DELIRIUM.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_EARTH.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_FIRE.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_ICE.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_KINESIS.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_LIGHTNING.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_NECROMANCY.get());
		simpleItem(ItemInit.PATTERN_ELEMENT_PHASE.get());
		
		
		// BLOCKS
		
		//EXAMPLE BLOCKS
		simpleBlockItem(BlockInit.EXAMPLE_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.EXAMPLE_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
		
		//STONES
		simpleBlockItem(BlockInit.A_I_CHISELED_STONE_BRICKS.get().asItem());
		simpleBlockItem(BlockInit.A_I_CRACKED_STONE_BRICKS.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_BRICK.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_BRICK_STAIRS.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_BUTTON.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_PRESSURE_PLATE.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_SLAB.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_STAIRS.get().asItem());
		simpleBlockItem(BlockInit.A_I_STONE_WALL.get().asItem());
	}
	
}
