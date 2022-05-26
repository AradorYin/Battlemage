package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{

	public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper)
	{
		super(generator, Battlemage.MOD_ID, helper);
	}
	
	@Override
	protected void addTags()
	{
		// MINECRAFT TAGS
		
		//TOOL TAGS
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.WOOD_MINEABLE_PICKAXE)
			.addTag(TagInit.Blocks.STONE_MINEABLE_PICKAXE);
		tag(BlockTags.MINEABLE_WITH_AXE)
			.addTag(TagInit.Blocks.STONE_MINEABLE_AXE);
		tag(BlockTags.NEEDS_STONE_TOOL)
			.addTag(TagInit.Blocks.STONE_MINEABLE_PICKAXE);
		
		//SPAWN TAGS
		tag(BlockTags.VALID_SPAWN)
			.addTag(TagInit.Blocks.MOD_VALID_SPAWNABLE);
		tag(BlockTags.ANIMALS_SPAWNABLE_ON);
		tag(BlockTags.AXOLOTLS_SPAWNABLE_ON);
		tag(BlockTags.GOATS_SPAWNABLE_ON);
		tag(BlockTags.MOOSHROOMS_SPAWNABLE_ON);
		tag(BlockTags.PARROTS_SPAWNABLE_ON);
		tag(BlockTags.POLAR_BEARS_SPAWNABLE_ON_IN_FROZEN_OCEAN);
		tag(BlockTags.RABBITS_SPAWNABLE_ON);
		tag(BlockTags.FOXES_SPAWNABLE_ON);
		tag(BlockTags.WOLVES_SPAWNABLE_ON);
		
		//WORLD GEN TAGS
		tag(BlockTags.BASE_STONE_OVERWORLD);
		tag(BlockTags.STONE_ORE_REPLACEABLES);
		tag(BlockTags.GEODE_INVALID_BLOCKS);
		
		//GENERAL TAGS
		tag(BlockTags.BUTTONS)
			.addTag(TagInit.Blocks.MOD_BUTTONS);
		tag(BlockTags.CROPS);
		tag(BlockTags.DOORS)
			.addTag(TagInit.Blocks.MOD_DOORS);
		tag(BlockTags.FENCE_GATES);
		tag(BlockTags.FENCES);
		tag(BlockTags.PRESSURE_PLATES)
			.addTag(TagInit.Blocks.MOD_PRESSURE_PLATE);
		tag(BlockTags.SLABS)
			.addTag(TagInit.Blocks.MOD_SLAB);
		tag(BlockTags.STAIRS)
			.addTag(TagInit.Blocks.MOD_STAIRS);
		tag(BlockTags.TRAPDOORS);
		tag(BlockTags.WALLS)
			.addTag(TagInit.Blocks.MOD_WALLS);
		
		//STONE TAGS
		tag(BlockTags.STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_STONE_BRICKS);
		tag(BlockTags.STONE_PRESSURE_PLATES)
			.addTag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE);
		
		//WOOD TAGS
		tag(BlockTags.LEAVES);
		tag(BlockTags.LOGS);
		tag(BlockTags.LOGS_THAT_BURN);
		tag(BlockTags.PLANKS);
		tag(BlockTags.SAPLINGS);
		tag(BlockTags.WOODEN_BUTTONS);
		tag(BlockTags.WOODEN_DOORS);
		tag(BlockTags.WOODEN_FENCES);
		tag(BlockTags.WOODEN_PRESSURE_PLATES);
		tag(BlockTags.WOODEN_SLABS);
		tag(BlockTags.WOODEN_STAIRS);
		tag(BlockTags.WOODEN_TRAPDOORS);
		
		
		// FORGE TAGS
		
		//TOOL TAGS
		tag(Tags.Blocks.NEEDS_WOOD_TOOL)
			.addTag(TagInit.Blocks.WOOD_MINEABLE_PICKAXE);
		
		//WORLD GEN TAGS
		tag(Tags.Blocks.ORE_BEARING_GROUND_DEEPSLATE);
		tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_DEEPSLATE);
		tag(Tags.Blocks.ORE_BEARING_GROUND_STONE);
		tag(Tags.Blocks.ORES_IN_GROUND_STONE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_STONE);
		tag(Tags.Blocks.ORE_RATES_SINGULAR)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_DEEPSLATE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_STONE);
		
		//ORE TAGS
		tag(Tags.Blocks.ORES)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_DEEPSLATE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_STONE);
		
		//GENERAL TAGS
		tag(Tags.Blocks.FENCE_GATES);
		tag(Tags.Blocks.FENCES);
		
		//STORAGE BLOCK TAGS
		tag(Tags.Blocks.STORAGE_BLOCKS)
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK);
		
		//STONE TAGS
		tag(Tags.Blocks.STONE)
			.addTag(TagInit.Blocks.MOD_STONE);
		
		//WOOD TAGS
		tag(Tags.Blocks.FENCE_GATES_WOODEN);
		tag(Tags.Blocks.FENCES_WOODEN);
		
		
		// MOD TAGS
		
		//TOOL TAGS
		tag(TagInit.Blocks.WOOD_MINEABLE_PICKAXE)
			.addTag(TagInit.Blocks.MOD_CHISELED_STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_CRACKED_CHISELED_STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_STONE)
			.addTag(TagInit.Blocks.MOD_STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_STONE_BRICK_SLAB)
			.addTag(TagInit.Blocks.MOD_STONE_BRICK_STAIRS)
			.addTag(TagInit.Blocks.MOD_STONE_BRICK_WALL)
			.addTag(TagInit.Blocks.MOD_STONE_BUTTONS)
			.addTag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE)
			.addTag(TagInit.Blocks.MOD_STONE_SLAB)
			.addTag(TagInit.Blocks.MOD_STONE_STAIRS)
			.addTag(TagInit.Blocks.MOD_STONE_WALL);
		tag(TagInit.Blocks.STONE_MINEABLE_PICKAXE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_DEEPSLATE)
			.addTag(TagInit.Blocks.MOD_STONE_ORE_STONE);
		tag(TagInit.Blocks.STONE_MINEABLE_AXE);
		
		//GENERAL TAGS
		tag(TagInit.Blocks.MOD_BUTTONS)
			.addTag(TagInit.Blocks.MOD_STONE_BUTTONS);
		tag(TagInit.Blocks.MOD_PRESSURE_PLATE)
			.addTag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE);
		tag(TagInit.Blocks.MOD_SLAB)
			.addTag(TagInit.Blocks.MOD_STONE_SLAB);
		tag(TagInit.Blocks.MOD_STAIRS)
			.addTag(TagInit.Blocks.MOD_STONE_STAIRS);
		tag(TagInit.Blocks.MOD_VALID_SPAWNABLE)
			.addTag(TagInit.Blocks.MOD_CHISELED_STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_CRACKED_CHISELED_STONE_BRICKS)
			.addTag(TagInit.Blocks.MOD_STONE)
			.addTag(TagInit.Blocks.MOD_STONE_BRICKS);
		tag(TagInit.Blocks.MOD_WALLS)
			.addTag(TagInit.Blocks.MOD_STONE_BRICK_WALL)
			.addTag(TagInit.Blocks.MOD_STONE_WALL);
		
		//STORAGE BLOCK TAGS
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get());
		
		//ORE TAGS
		tag(TagInit.Blocks.MOD_STONE_ORE_DEEPSLATE)
			.addTag(TagInit.Blocks.DEEPSLATE_EXAMPLE_ORE);
		tag(TagInit.Blocks.MOD_STONE_ORE_STONE)
			.addTag(TagInit.Blocks.EXAMPLE_ORE);
		
		tag(TagInit.Blocks.DEEPSLATE_EXAMPLE_ORE)
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get());
		
		//STONE TAGS
		tag(TagInit.Blocks.MOD_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CHISELED_STONE_BRICKS.get());
		tag(TagInit.Blocks.MOD_CRACKED_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CRACKED_STONE_BRICKS.get());
		tag(TagInit.Blocks.MOD_STONE)
			.add(BlockInit.A_I_STONE.get());
		tag(TagInit.Blocks.MOD_STONE_BRICKS)
			.add(BlockInit.A_I_STONE_BRICKS.get());
		tag(TagInit.Blocks.MOD_STONE_BRICK_SLAB)
			.add(BlockInit.A_I_STONE_BRICK_SLAB.get());
		tag(TagInit.Blocks.MOD_STONE_BRICK_STAIRS)
			.add(BlockInit.A_I_STONE_BRICK_STAIRS.get());
		tag(TagInit.Blocks.MOD_STONE_BRICK_WALL)
			.add(BlockInit.A_I_STONE_BRICK_WALL.get());
		tag(TagInit.Blocks.MOD_STONE_BUTTONS)
			.add(BlockInit.A_I_STONE_BUTTON.get());
		tag(TagInit.Blocks.MOD_STONE_PRESSURE_PLATE)
			.add(BlockInit.A_I_STONE_PRESSURE_PLATE.get());
		tag(TagInit.Blocks.MOD_STONE_SLAB)
			.add(BlockInit.A_I_STONE_SLAB.get());
		tag(TagInit.Blocks.MOD_STONE_STAIRS)
			.add(BlockInit.A_I_STONE_STAIRS.get());
		tag(TagInit.Blocks.MOD_STONE_WALL)
			.add(BlockInit.A_I_STONE_WALL.get());
		
		//WOOD TAGS
	}

}
