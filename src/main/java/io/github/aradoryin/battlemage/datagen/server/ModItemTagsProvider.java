package io.github.aradoryin.battlemage.datagen.server;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import io.github.aradoryin.battlemage.init.TagInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
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
		//TAG BONES
		tag(Tags.Items.BONES)
//			.add(ItemInit.WITHER_BONE.get())
			;
		
		//TAG FENCE_GATES
		tag(Tags.Items.FENCE_GATES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get().asItem())
			;
		
		//TAG FENCE_GATES_WOODEN
		tag(Tags.Items.FENCE_GATES_WOODEN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get().asItem())
			;
		
		//TAG FENCES
		tag(Tags.Items.FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get().asItem())
			;
		
		//TAG FENCES_WOODEN
		tag(Tags.Items.FENCES_WOODEN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get().asItem())
			;
		
		//TAG GEM
		tag(Tags.Items.GEMS)
			.add(ItemInit.ONYX.get())
			.add(ItemInit.RUBY.get())
			.add(ItemInit.SAPPHIRE.get())
			.add(ItemInit.TIGERS_EYE.get());
		
		//TAG FORGE_BUTTONS
		tag(ItemTags.BUTTONS)
//			.add(BlockInit.AETHER_INFUSED_STONE_BUTTON.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get().asItem())
			;
		
		//TAG FORGE_DOORS
		tag(ItemTags.DOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_DOOR.get().asItem())
			;
		
		//TAG FORGE_FENCES
		tag(ItemTags.FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get().asItem())
			;
		
		//TAG FORGE_LEAVES
		tag(ItemTags.LEAVES)
//			.add(BlockInit.AETHER_INFUSED_LEAVES.get().asItem())
			;
		
		//TAG FORGE_LOGS
		tag(ItemTags.LOGS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get().asItem())
			;
		
		//TAG FORGE_LOGS_THAT_BURN
		tag(ItemTags.LOGS_THAT_BURN)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get().asItem())
			;
		
		//TAG FORGE_PLANKS
		tag(ItemTags.PLANKS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_PLANK.get().asItem())
			;
		
		//TAG FORGE_SAPLINGS
		tag(ItemTags.SAPLINGS)
//			.add(BlockInit.AETHER_INFUSED_SAPLING.get().asItem())
			;
		
		//TAG FORGE_SLABS
		tag(ItemTags.SLABS)
//			.add(BlockInit.AETHER_INFUSED_STONE_SLAB.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get().asItem())
			;
		
		//TAG FORGE_SOUL_FIRE_BASE_BLOCK
		tag(ItemTags.SOUL_FIRE_BASE_BLOCKS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_LOG.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get().asItem())
			;
		
		//TAG FORGE_STAIRS
		tag(ItemTags.STAIRS)
//			.add(BlockInit.AETHER_INFUSED_STONE_STAIRS.get().asItem())
//			.add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get().asItem())
			;
		
		//TAG FORGE_STONE_BRICKS
		tag(ItemTags.STONE_BRICKS)
//			.add(BlockInit.AETHER_INFUSED_STONE_BRICKS.get())
			;
		
		//TAG FORGE_STONE_CRAFTING_MATERIALS
		tag(ItemTags.STONE_CRAFTING_MATERIALS)
//			.add(BlockInit.AETHER_INFUSED_STONE.get().asItem())
			;
		
		//TAG FORGE_STONE_TOOL_MATERIALS
		tag(ItemTags.STONE_TOOL_MATERIALS)
//			.add(BlockInit.AETHER_INFUSED_STONE.get().asItem())
			;
		
		//TAG FORGE_TRAPDOORS
		tag(ItemTags.TRAPDOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get().asItem())
			;
		
		//TAG FORGE_WALLS
		tag(ItemTags.WALLS)
//			.add(BlockInit.AETHER_INFUSED_STONE_WALL.get().asItem())
			;
		
		//TAG FORGE_WOODEN_BUTTONS
		tag(ItemTags.WOODEN_BUTTONS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get().asItem())
			;
		
		//TAG FORGE_WOODEN_DOORS
		tag(ItemTags.WOODEN_DOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_DOOR.get().asItem())
			;
		
		//TAG FORGE_WODDEN_FENCES
		tag(ItemTags.WOODEN_FENCES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get().asItem())
			;
		
		//TAG FORGE_WOODEN_PRESSURE_PLATE
		tag(ItemTags.WOODEN_PRESSURE_PLATES)
//			.add(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get().asItem())
			;
		
		//TAG FORGE_WOODEN_SLABS
		tag(ItemTags.WOODEN_SLABS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get().asItem())
			;
		
		//TAG FORGE_WOODEN_STAIRS
		tag(ItemTags.WOODEN_STAIRS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get().asItem())
			;
		
		//TAG FORGE_WOODEN_TRAPDOORS
		tag(ItemTags.WOODEN_TRAPDOORS)
//			.add(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get().asItem())
			;
		
		//TAG MOD_BRACER_UPGRADE_ITEM
		tag(TagInit.Items.BRACER_UPGRADE_ITEM)
//			.add(ItemInit.AETHER_INFUSED_STONE_POWDER.get())
//			.add(ItemInit.COPPER_POWDER.get())
			.add(ItemInit.GOLD_POWDER.get())
			.add(ItemInit.ICE_POWDER.get())
			.add(ItemInit.IRON_POWDER.get())
			.add(ItemInit.NETHERITE_POWDER.get())
//			.add(ItemInit.WITHER_BONE_POWDER.get())
			.add(Items.LEATHER)
			.add(Items.NETHER_STAR)
			.add(Items.PHANTOM_MEMBRANE)
			.add(Items.STRING)
			;
		
		//TAG MOD_ELEMENTAL_CORE
		tag(TagInit.Items.ELEMENTAL_CORE)
			.add(ItemInit.CORRUPTION_CORE.get())
			.add(ItemInit.DELIRIUM_CORE.get())
			.add(ItemInit.EARTH_CORE.get())
			.add(ItemInit.FIRE_CORE.get())
			.add(ItemInit.ICE_CORE.get())
			.add(ItemInit.KINESIS_CORE.get())
			.add(ItemInit.LIGHTNING_CORE.get())
			.add(ItemInit.NECROMANCY_CORE.get())
			.add(ItemInit.PHASE_CORE.get());
		
		//TAG MOD_EXAMPLE
		tag(TagInit.Items.EXAMPLE_ITEM)
			.add(ItemInit.EXAMPLE_ITEM.get());
		
		//TAG MOD_GEM
		tag(TagInit.Items.GEM)
			.add(ItemInit.ONYX.get())
			.add(ItemInit.RUBY.get())
			.add(ItemInit.SAPPHIRE.get())
			.add(ItemInit.TIGERS_EYE.get())
			.add(Items.AMETHYST_CLUSTER)
			.add(Items.DIAMOND)
			.add(Items.EMERALD)
			.add(Items.NETHER_STAR)
			.add(Items.QUARTZ);
		
		//TAG MOD_RUNE_TABLET
		tag(TagInit.Items.RUNE_TABLET)
//			.add(ItemInit.AOE_RUNE_TABLET.get())
//			.add(ItemInit.DASH_RUNE_TABLET.get())
//			.add(ItemInit.LOBBED_RUNE_TABLET.get())
//			.add(ItemInit.POOL_RUNE_TABLET.get())
//			.add(ItemInit.RAY_RUNE_TABLET.get())
//			.add(ItemInit.RUNE_TABLET.get())
//			.add(ItemInit.SHIELD_RUNE_TABLET.get())
//			.add(ItemInit.TARGETED_RUNE_TABLET.get())
//			.add(ItemInit.TRAP_RUNE_TABLET.get())
			;
		
		//TAG MOD_TABLET_ENGRAVING_ITEM
		tag(TagInit.Items.TABLET_ENGRAVING_INGREDIENT)
//			.add(ItemInit.AETHER_INFUSED_STONE_POWDER.get())
			.add(ItemInit.AETHER_INFUSED_TABLET.get())
//			.add(ItemInit.COPPER_POWDER.get())
			.add(ItemInit.GOLD_POWDER.get())
//			.add(ItemInit.ICE_POWDER.get())
//			.add(ItemInit.RUNIC_AETHER_INFUSED_TABLET.get())
//			.add(ItemInit.RUNIC_STONE_TABLET.get())
//			.add(ItemInit.STONE_POWDER.get())
			.add(ItemInit.STONE_TABLET.get())
			.addTag(TagInit.Items.RUNE_TABLET);
			;
			
		//Tag ORE_RATES_SINGULAR
		tag(Tags.Items.ORE_RATES_SINGULAR)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get().asItem())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().asItem())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().asItem())
			;
			
		//TAG ORES
		tag(Tags.Items.ORES)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get().asItem())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().asItem())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get().asItem())
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().asItem())
			;

		
		//TAG ORES_IN_GROUND_DEEPSLATE
		tag(Tags.Items.ORES_IN_GROUND_DEEPSLATE)
			// >EXAMPLE
			.add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get().asItem())
			// >ONYX
			.add(BlockInit.DEEPSLATE_ONYX_ORE.get().asItem())
			// >RUBY
			.add(BlockInit.DEEPSLATE_RUBY_ORE.get().asItem())
			// >SAPPHIRE
			.add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get().asItem())
			// >TIGERS_EYE
			.add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get().asItem())
			;

		
		//TAG ORES_IN_GROUND_STONE
		tag(Tags.Items.ORES_IN_GROUND_STONE)
			// >EXAMPLE
			.add(BlockInit.EXAMPLE_ORE.get().asItem())
			// >ONYX
			.add(BlockInit.ONYX_ORE.get().asItem())
			// >RUBY
			.add(BlockInit.RUBY_ORE.get().asItem())
			// >SAPPHIRE
			.add(BlockInit.SAPPHIRE_ORE.get().asItem())
			// >TIGERS_EYE
			.add(BlockInit.TIGERS_EYE_ORE.get().asItem())
			;
		
		//Tag STONE
		tag(Tags.Items.STONE)
//			.add(BlockInit.AETHER_INFUSED_STONE.get())
			;
	}

}
