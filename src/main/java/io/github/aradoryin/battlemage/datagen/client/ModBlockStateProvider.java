package io.github.aradoryin.battlemage.datagen.client;

import java.util.function.Function;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
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
		// PLACE HERE
	}
	
	public void makeCrop(CropBlock block, String modelName, String textureName) 
	{
		Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);
	}
	
	private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName)
	{
		ConfiguredModel[] models = new ConfiguredModel[1];
		models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(block.getAgeProperty()), 
				new ResourceLocation(Battlemage.MOD_ID, "block/" + textureName + state.getValue(block.getAgeProperty()))));
		
		return models;
	}
	
}
