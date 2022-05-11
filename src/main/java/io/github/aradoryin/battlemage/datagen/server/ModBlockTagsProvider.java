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
		
		//TAG FENCE_GATES
		tag(Tags.Blocks.FENCE_GATES)
//			.add(BlockInit.AETHER_INFUSED_STONE_GATE.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get())
			;
		
		//TAG FENCE_GATES_WOODEN
		tag(Tags.Blocks.FENCE_GATES_WOODEN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get())
			;
		
		//TAG FENCES
		tag(Tags.Blocks.FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get())
			;
		
		//TAG FENCES_WOODEN
		tag(Tags.Blocks.FENCES_WOODEN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get())
			;
		
		//TAG FORGE_ANIMALS_SPAWNABLE_ON
		tag(BlockTags.ANIMALS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_AXOLOTLS_SPAWNABLE_ON
		tag(BlockTags.AXOLOTLS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_BUTTONS
		tag(BlockTags.BUTTONS)
//			.add(BlockInit.AETHER_INFUSED_STONE_BUTTON.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get())
			;
		
		//TAG FORGE_FENCE_GATES
		tag(BlockTags.FENCE_GATES)
//		.add(BlockInit.AETHER_INFUSED_STONE_GATE.get())
//		.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get())
			;
		
		//TAG FORGE_FENCES
		tag(BlockTags.FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get())
			;
		
		//TAG FORGE_FOXES_SPAWNABLE_ON
		tag(BlockTags.FOXES_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_GOATS_SPAWNABLE_ON
		tag(BlockTags.GOATS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_LEAVES
		tag(BlockTags.LEAVES)
//			.add(BlockInit.AETHER_INFUSED_LEAVES.get())
			;
		
		//TAG FORGE_LOGS
		tag(BlockTags.LOGS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get())
			;
		
		//TAG FORGE_LOGS_THAT_BURN
		tag(BlockTags.LOGS_THAT_BURN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get())
			;
		
		//TAG FORGE_MOOSHROOMS_SPAWNABLE_ON
		tag(BlockTags.MOOSHROOMS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_PARROTS_SPAWNABLE_ON
		tag(BlockTags.PARROTS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_PLANKS
		tag(BlockTags.PLANKS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
			;
		
		//TAG FORGE_POLAR_BEARS_SPAWNABLE_ON_IN_FROZEN_OCEAN
		tag(BlockTags.POLAR_BEARS_SPAWNABLE_ON_IN_FROZEN_OCEAN)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_RABBITS_SPAWNABLE_ON
		tag(BlockTags.RABBITS_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_SAPLINGS
		tag(BlockTags.SAPLINGS)
//			.add(BlockInit.AETHER_INFUSED_SAPLING.get())
			;
		
		//TAG FORGE_SLABS
		tag(BlockTags.SLABS)
//			.add(BlockInit.AETHER_INFUSED_STONE_SLAB.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get())
			;
		
		//TAG FORGE_SOUL_FIRE_BASE_BLOCKS
		tag(BlockTags.SOUL_FIRE_BASE_BLOCKS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get())
			;
		
		//TAG FORGE_STAIRS
		tag(BlockTags.STAIRS)
//			.add(BlockInit.AETHER_INFUSED_STONE_STAIRS.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get())
			;
		
		//TAG FORGE_STONE_BRICKS
		tag(BlockTags.STONE_BRICKS)
//			.add(BlockInit.AETHER_INFUSED_STONE_BRICKS.get())
			;
		
		//TAG FORGE_STONE_PRESSURE_PLATES
		tag(BlockTags.STONE_PRESSURE_PLATES)
//			.add(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get())
			;
		
		//TAG FORGE_WALLS
		tag(BlockTags.WALLS)
//			.add(BlockInit.AETHER_INFUSED_STONE_WALL.get())
			;
		
		//TAG FORGE_WOLVES_SPAWNABLE_ON
		tag(BlockTags.WOLVES_SPAWNABLE_ON)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG FORGE_WOODEN_BUTTONS
		tag(BlockTags.WOODEN_BUTTONS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get())
			;
		
		//TAG FORGE_WOODEN_DOORS
		tag(BlockTags.WOODEN_DOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_DOOR.get())
			;
		
		//TAG FORGE_WOODEN_FENCES
		tag(BlockTags.WOODEN_FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get())
			;
		
		//TAG FORGE_WOODEN_PRESSURE_PLATES
		tag(BlockTags.WOODEN_PRESSURE_PLATES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get())
			;
		
		//TAG FORGE_WOODEN_SLABS
		tag(BlockTags.WOODEN_SLABS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get())
			;
		
		//TAG FORGE_WOODEN_STAIRS
		tag(BlockTags.WOODEN_STAIRS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get())
			;
		
		//TAG FORGE_WOODEN_TRAPDOORS
		tag(BlockTags.WOODEN_TRAPDOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get())
			;
		
		//TAG FORGE_VALID_SPAWN
		tag(BlockTags.VALID_SPAWN)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >Tag MOD_STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG MINEABLE_WITH_AXE
		tag(BlockTags.MINEABLE_WITH_AXE)
			// >WOOD
//			.add(BlockInit.AETHER_INFUSED_LEAVES.get())
//			.add(BlockInit.AETHER_INFUSED_SAPLING.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD.get())
//			.add(BlockInit.AETHER_INFUSED_STRIPPED_WOOD.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_DOOR.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_PLANK.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get())
//			.add(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get())
			;
		
		//TAG MINEABLE WITH PICKAXE
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_BLOCK.get())
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			// >ONYX
			.add(BlockInit.ONYX_BLOCK.get())
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get())
			// >RUBY
			.add(BlockInit.RUBY_BLOCK.get())
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_BLOCK.get())
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_BLOCK.get())
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get())
			// >STONE
//			.add(BlockInit.AETHER_INFUSED_STONE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_BRICKS.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_BUTTON.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_GATE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_SLAB.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_STAIRS.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_WALL.get())
			;
		
		//TAG MOD_BLOCK
		// >EXAMPLE
		tag(TagInit.Blocks.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get());
		// >ONYX
		tag(TagInit.Blocks.ONYX_BLOCK)
			.add(BlockInit.ONYX_BLOCK.get());
		// >RUBY
		tag(TagInit.Blocks.RUBY_BLOCK)
			.add(BlockInit.RUBY_BLOCK.get());
		// >SAPPHIRE
		tag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.add(BlockInit.SAPPHIRE_BLOCK.get());
		// >TIGERS_EYE
		tag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.add(BlockInit.TIGERS_EYE_BLOCK.get());
		
		//TAG MOD_ORE
		// >EXAMPLE
		tag(TagInit.Blocks.EXAMPLE_ORE)
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get());
		// >ONYX
		tag(TagInit.Blocks.ONYX_ORE)
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get());
		// >RUBY
		tag(TagInit.Blocks.RUBY_ORE)
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get());
		// >SAPPHIRE
		tag(TagInit.Blocks.SAPPHIRE_ORE)
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get());
		// >TIGERS_EYE
		tag(TagInit.Blocks.TIGERS_EYE_ORE)
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get())
			;
		
		//TAG MOD_STONE
		tag(TagInit.Blocks.MOD_STONE)
//			.add(BlockInit.AETHER_INFUSED_STONE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_BRICKS.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_BUTTON.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_GATE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_SLAB.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_STAIRS.get())
//			.add(BlockInit.AETHER_INFUSED_STONE_WALL.get())
			;
		
		//TAG NEEDS_STONE_TOOL
		tag(BlockTags.NEEDS_STONE_TOOL)
			// >TAG EXAMPLE
			.addTag(TagInit.Blocks.EXAMPLE_BLOCK)
			.addTag(TagInit.Blocks.EXAMPLE_ORE)
			// >TAG ONYX
			.addTag(TagInit.Blocks.ONYX_BLOCK)
			.addTag(TagInit.Blocks.ONYX_ORE)
			// >TAG RUBY
			.addTag(TagInit.Blocks.RUBY_BLOCK)
			.addTag(TagInit.Blocks.RUBY_ORE)
			// >TAG SAPPHIRE
			.addTag(TagInit.Blocks.SAPPHIRE_BLOCK)
			.addTag(TagInit.Blocks.SAPPHIRE_ORE)
			// >TAG TIGERS_EYE
			.addTag(TagInit.Blocks.TIGERS_EYE_BLOCK)
			.addTag(TagInit.Blocks.TIGERS_EYE_ORE)
			;
		
		//TAG NEEDS_WOOD_TOOL
		tag(Tags.Blocks.NEEDS_WOOD_TOOL)
			// >TAG STONE
			.addTag(TagInit.Blocks.MOD_STONE)
			;
		
		//TAG ORE
		tag(Tags.Blocks.ORES)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get())
			;
		
		//TAG ORE_IN_GROUND_DEEPSLATE
		tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
			// >EXAMPLE
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			// >ONYX
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get())
			// >RUBY
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get())
			// >SAPPHIRE
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get())
			// >TIGERS_EYE
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get())
			;
		
		//TAG ORE_IN_GROUND_STONE
		tag(Tags.Blocks.ORES_IN_GROUND_STONE)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get())
			;
		
		//TAG ORE_RATES_SINGULAR
		tag(Tags.Blocks.ORE_RATES_SINGULAR)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get())
			;
		
	}

}
