package io.github.aradoryin.battlemage.datagen.client;

import java.util.function.Function;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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
		// EXAMPLE BLOCKS
		simpleBlock(BlockInit.EXAMPLE_BLOCK.get());
		simpleBlock(BlockInit.EXAMPLE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		// STONES
		simpleBlock(BlockInit.A_I_STONE.get());
		simpleBlock(BlockInit.A_I_STONE_BRICKS.get());
		simpleBlock(BlockInit.A_I_CHISELED_STONE_BRICKS.get());
		simpleBlock(BlockInit.A_I_CRACKED_STONE_BRICKS.get());
		buttonBlock((ButtonBlock) BlockInit.A_I_STONE_BUTTON.get(), blockTexture(BlockInit.A_I_STONE.get()));
		pressurePlateBlock((PressurePlateBlock) BlockInit.A_I_STONE_PRESSURE_PLATE.get(), blockTexture(BlockInit.A_I_STONE.get()));
		slabBlock((SlabBlock) BlockInit.A_I_STONE_BRICK_SLAB.get(), blockTexture(BlockInit.A_I_STONE_BRICKS.get()), blockTexture(BlockInit.A_I_STONE_BRICKS.get()));
		slabBlock((SlabBlock) BlockInit.A_I_STONE_SLAB.get(), blockTexture(BlockInit.A_I_STONE.get()), blockTexture(BlockInit.A_I_STONE.get()));
		stairsBlock((StairBlock) BlockInit.A_I_STONE_BRICK_STAIRS.get(), blockTexture(BlockInit.A_I_STONE_BRICKS.get()));
		stairsBlock((StairBlock) BlockInit.A_I_STONE_STAIRS.get(), blockTexture(BlockInit.A_I_STONE.get()));
		wallBlock((WallBlock) BlockInit.A_I_STONE_BRICK_WALL.get(), blockTexture(BlockInit.A_I_STONE_BRICKS.get()));
		wallBlock((WallBlock) BlockInit.A_I_STONE_WALL.get(), blockTexture(BlockInit.A_I_STONE.get()));
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
