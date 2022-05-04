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
		simpleBlock(BlockInit.EXAMPLE_BLOCK.get());
		simpleBlock(BlockInit.EXAMPLE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
	}
	
}
