package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{

	public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blocks, ExistingFileHelper helper)
	{
		super(generator, blocks, Battlemage.MOD_ID, helper);
	}
	
	@Override
	protected void addTags()
	{
		// MINECRAFT TAGS
		
		//TOOL TAGS
		tag(ItemTags.STONE_CRAFTING_MATERIALS);
		tag(ItemTags.STONE_TOOL_MATERIALS);
		
		//GENERAL TAGS
		tag(ItemTags.BUTTONS)
			.addTag(TagInit.Items.MOD_STONE_BUTTONS);
		tag(ItemTags.DOORS);
		tag(ItemTags.FENCES);
		tag(ItemTags.SLABS)
			.addTag(TagInit.Items.MOD_STONE_SLAB);
		tag(ItemTags.TRAPDOORS);
		
		//STONE TAGS
		tag(ItemTags.STONE_BRICKS)
			.addTag(TagInit.Items.MOD_STONE_BRICKS);
		tag(ItemTags.WALLS)
			.addTag(TagInit.Items.MOD_WALLS);
		
		//WOOD TAGS
		tag(ItemTags.LEAVES);
		tag(ItemTags.LOGS);
		tag(ItemTags.LOGS_THAT_BURN);
		tag(ItemTags.PLANKS);
		tag(ItemTags.SAPLINGS);
		tag(ItemTags.WOODEN_BUTTONS);
		tag(ItemTags.WOODEN_DOORS);
		tag(ItemTags.WOODEN_FENCES);
		tag(ItemTags.WOODEN_PRESSURE_PLATES);
		tag(ItemTags.WOODEN_SLABS);
		tag(ItemTags.WOODEN_TRAPDOORS);
		
		
		// FORGE TAGS
		
		//WORLD GEN TAGS
		tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE);
		tag(Tags.Items.ORES_IN_GROUND_STONE);
		tag(Tags.Items.ORE_RATES_SINGULAR);
	
		//ORE TAGS
		tag(Tags.Items.ORES);
		
		//GENERAL TAGS
		tag(Tags.Items.DUSTS);
		tag(Tags.Items.FENCE_GATES);
		tag(Tags.Items.FENCES);
		tag(Tags.Items.GEMS);
		
		//STORAGE BLOCK TAGS
		tag(Tags.Items.STORAGE_BLOCKS);
		
		//STONE TAGS
		tag(Tags.Items.STONE);
		
		//WOOD TAGS
		tag(Tags.Items.FENCE_GATES_WOODEN);
		tag(Tags.Items.FENCES_WOODEN);
		
		
		// MOD TAGS
		
		//GENERAL TAGS
		tag(TagInit.Items.MOD_BUTTONS)
			.addTag(TagInit.Items.MOD_STONE_BUTTONS);
		tag(TagInit.Items.MOD_DOORS);
		tag(TagInit.Items.MOD_PRESSURE_PLATE)
			.addTag(TagInit.Items.MOD_STONE_PRESSURE_PLATE);
		tag(TagInit.Items.MOD_SLAB)
			.addTag(TagInit.Items.MOD_STONE_SLAB);
		tag(TagInit.Items.MOD_STAIRS)
			.addTag(TagInit.Items.MOD_STONE_STAIRS);
		
		//ORE TAGS
		tag(TagInit.Items.MOD_STONE_ORE_DEEPSLATE)
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem());
		tag(TagInit.Items.MOD_STONE_ORE_STONE)
			.add(BlockInit.EXAMPLE_ORE.get().asItem());
		
		//RUNE PATTERN TAGS
		tag(TagInit.Items.RUNE_PATTERNS)
			.add(ItemInit.PATTERN_RUNE_AOE.get())
			.add(ItemInit.PATTERN_RUNE_LOB.get())
			.add(ItemInit.PATTERN_RUNE_NOVA.get())
			.add(ItemInit.PATTERN_RUNE_POOL.get())
			.add(ItemInit.PATTERN_RUNE_RAY.get())
			.add(ItemInit.PATTERN_RUNE_TARGETED.get())
			.add(ItemInit.PATTERN_RUNE_TRAP.get());
		
		//ELEMENT PATTERN TAGS
		tag(TagInit.Items.ELEMENT_PATTERNS)
			.add(ItemInit.PATTERN_ELEMENT_CORRUPTION.get())
			.add(ItemInit.PATTERN_ELEMENT_DELIRIUM.get())
			.add(ItemInit.PATTERN_ELEMENT_EARTH.get())
			.add(ItemInit.PATTERN_ELEMENT_FIRE.get())
			.add(ItemInit.PATTERN_ELEMENT_ICE.get())
			.add(ItemInit.PATTERN_ELEMENT_KINESIS.get())
			.add(ItemInit.PATTERN_ELEMENT_LIGHTNING.get())
			.add(ItemInit.PATTERN_ELEMENT_NECROMANCY.get())
			.add(ItemInit.PATTERN_ELEMENT_PHASE.get());
		
		//STONE TAGS
		tag(TagInit.Items.MOD_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CHISELED_STONE_BRICKS.get().asItem());
		tag(TagInit.Items.MOD_CRACKED_CHISELED_STONE_BRICKS)
			.add(BlockInit.A_I_CRACKED_STONE_BRICKS.get().asItem());
		tag(TagInit.Items.MOD_STONE)
			.add(BlockInit.A_I_STONE.get().asItem());
		tag(TagInit.Items.MOD_STONE_BRICKS)
			.add(BlockInit.A_I_STONE_BRICK.get().asItem());
		tag(TagInit.Items.MOD_STONE_BUTTONS)
			.add(BlockInit.A_I_STONE_BUTTON.get().asItem());
		tag(TagInit.Items.MOD_STONE_PRESSURE_PLATE)
			.add(BlockInit.A_I_STONE_PRESSURE_PLATE.get().asItem());
		tag(TagInit.Items.MOD_STONE_SLAB)
			.add(BlockInit.A_I_STONE_SLAB.get().asItem());
		tag(TagInit.Items.MOD_STONE_STAIRS)
			.add(BlockInit.A_I_STONE_STAIRS.get().asItem());
		tag(TagInit.Items.MOD_WALLS)
			.add(BlockInit.A_I_STONE_WALL.get().asItem());
		
		//WOOD TAGS

		//STORAGE BLOCK TAGS
		tag(TagInit.Items.EXAMPLE_BLOCK)
			.add(BlockInit.EXAMPLE_BLOCK.get().asItem());
		
		//GEM TAGS
		tag(TagInit.Items.EXAMPLE_ITEM)
			.add(ItemInit.EXAMPLE_ITEM.get());
	}

}
