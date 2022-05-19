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
		simpleItem(ItemInit.PATTERN_AOE.get());
		simpleItem(ItemInit.PATTERN_POOL.get());
		simpleItem(ItemInit.PATTERN_TRAP.get());
		simpleItem(ItemInit.PATTERN_TARGETED.get());
		simpleItem(ItemInit.PATTERN_LOB.get());
		simpleItem(ItemInit.PATTERN_RAY.get());
		simpleItem(ItemInit.PATTERN_NOVA.get());
		
		// BLOCKS
		
		//EXAMPLE BLOCKS
		simpleBlockItem(BlockInit.EXAMPLE_BLOCK.get().asItem());
		simpleBlockItem(BlockInit.EXAMPLE_ORE.get().asItem());
		simpleBlockItem(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
	}
	
}
