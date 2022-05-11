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
		//EXAMPLE BLOCKS
		simpleBlock(BlockInit.EXAMPLE_BLOCK.get());
		simpleBlock(BlockInit.EXAMPLE_ORE.get());
		simpleBlock(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		
		//BLOCKS
		// > ONYX
		simpleBlock(BlockInit.ONYX_BLOCK.get());
		// > RUBY
		simpleBlock(BlockInit.RUBY_BLOCK.get());
		// > SAPPHIRE
		simpleBlock(BlockInit.SAPPHIRE_BLOCK.get());
		// > STONE
//		simpleBlock(BlockInit.AETHER_INFUSED_STONE.get());
		// > STONE BUTTON
//		buttonBlock((ButtonBlock) BlockInit.AETHER_INFUSED_STONE_BUTTON.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()));
		// > STONE BRICKS
//		simpleBlock(BlockInit.AETHER_INFUSED_STONE_BRICKS.get());
		// > STONE GATE
//		fenceGateBlock((FenceGateBlock) BlockInit.AETHER_INFUSED_STONE_GATE.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()));
		// > STONE PRESSURE PLATES
//		pressurePlateBlock((PressurePlateBlock) BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get()));
		// > STONE SLABS
//		slabBlock((SlabBlock) BlockInit.AETHER_INFUSED_STONE_SLAB.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()));
		// > STONE STAIRS
//		stairsBlock((StairBlock) BlockInit.AETHER_INFUSED_STONE_STAIRS.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()));
		// > STONE WALLS
//		wallBlock((WallBlock) BlockInit.AETHER_INFUSED_STONE_WALL.get(), blockTexture(BlockInit.AETHER_INFUSED_STONE.get()));
		// > TIGERS_EYE
		simpleBlock(BlockInit.TIGERS_EYE_BLOCK.get());
		// > WOOD
//		logBlock((RotatedPillarBlock) BlockInit.AETHER_INFUSED_WOOD_LOG.get());
//		simpleBlock(BlockInit.AETHER_INFUSED_WOOD_PLANK.get());
//		axisBlock((RotatedPillarBlock) BlockInit.AETHER_INFUSED_WOOD_LOG.get());
//		axisBlock((RotatedPillarBlock) BlockInit.AETHER_INFUSED_WOOD.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_LOG.get()), blockTexture(BlockInit.AETHER_INFUSED_WOOD_LOG.get()));
//		axisBlock((RotatedPillarBlock) BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get(), 
//				new ResourceLocation(Battlemage.MOD_ID, "block/aether_infused_wood_stripped_log"), 
//				new ResourceLocation(Battlemage.MOD_ID, "block/aether_infused_wood_stripped_top"));
		// > WOOD BUTTONS
//		buttonBlock((ButtonBlock) BlockInit.AETHER_INFUSED_WOOD_BUTTON.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()));
		// > WOOD DOORS
//		doorBlock((DoorBlock) BlockInit.AETHER_INFUSED_WOOD_DOOR.get(), new ResourceLocation(Battlemage.MOD_ID, "block/aether_infused_wood_door_bottom"), new ResourceLocation(Battlemage.MOD_ID, "block/aether_infused_wood_door_top"));
		// > WOOD FENCES
//		fenceBlock((FenceBlock) BlockInit.AETHER_INFUSED_WOOD_FENCE.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()));
		// > WOOD FENCE GATES
//		fenceGateBlock((FenceGateBlock) BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()));
		// > WOOD PRESSURE PLATES
//		pressurePlateBlock((PressurePlateBlock) BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()));
		// > WOOD SLABS
//		slabBlock((SlabBlock) BlockInit.AETHER_INFUSED_WOOD_SLAB.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()), blockTexture(BlockInit.AETHER_INFUSED_WOOD_SLAB.get()));
		// > WOOD STAIRS
//		stairsBlock((StairBlock) BlockInit.AETHER_INFUSED_WOOD_STAIRS.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_PLANK.get()));
		// > WOOD TRAPDOORS
//		trapdoorBlock((TrapDoorBlock) BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get(), blockTexture(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get()), true);
		
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
