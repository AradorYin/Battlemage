package io.github.aradoryin.battlemage.datagen.client;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider
{

	public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper helper)
	{
		super(generator, Battlemage.MOD_ID, helper);
	}
	
	@Override
	protected void registerStatesAndModels()
	{
		//EXAMPLE BLOCKS
		simpleBlock(BlockInit.EXAMPLE_BLOCK.get());
		simpleBlock(BlockInit.EXAMPLE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		
		//BLOCKS
		simpleBlock(BlockInit.ONYX_BLOCK.get());
		simpleBlock(BlockInit.RUBY_BLOCK.get());
		simpleBlock(BlockInit.SAPPHIRE_BLOCK.get());
		simpleBlock(BlockInit.TIGERS_EYE_BLOCK.get());
		
		//ORES
		simpleBlock(BlockInit.ONYX_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_ONYX_ORE.get());
		simpleBlock(BlockInit.RUBY_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_RUBY_ORE.get());
		simpleBlock(BlockInit.SAPPHIRE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());
		simpleBlock(BlockInit.TIGERS_EYE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get());
	}
	
}
