package io.github.aradoryin.battlemage.datagen.client.lang;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider
{

	public ModEnUsProvider(DataGenerator gen)
	{
		super(gen, Battlemage.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations()
	{
		//CREATIVE TAB
		add("itemGroup.battlemage", "Battlemage");
		
		// !--ITEM--!
		
		//ITEM EXAMPLE
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		//ITEM GEM
		add(ItemInit.ONYX.get(), "Onyx");
		add(ItemInit.RUBY.get(), "Ruby");
		add(ItemInit.SAPPHIRE.get(), "Sapphire");
		add(ItemInit.TIGERS_EYE.get(), "Tiger's Eye");
		
		//ITEM ELEMENTAL CORE
		add(ItemInit.CORRUPTION_CORE.get(), "Corruption Core");
		add(ItemInit.DELIRIUM_CORE.get(), "Delirium Core");
		add(ItemInit.EARTH_CORE.get(), "Earth Core");
		add(ItemInit.FIRE_CORE.get(), "Fire Core");
		add(ItemInit.ICE_CORE.get(), "Ice Core");
		add(ItemInit.KINESIS_CORE.get(), "Kinesis Core");
		add(ItemInit.LIGHTNING_CORE.get(), "Lightning Core");
		add(ItemInit.NECROMANCY_CORE.get(), "Necromancy Core");
		add(ItemInit.PHASE_CORE.get(), "Phase Core");
		
		//ITEM ELEMENTAL CORE ENGRAVED GEM
		add(ItemInit.FIRE_ENGRAVED_RUBY.get(), "Fire-Engraved Ruby");
		add(ItemInit.FIRE_ENGRAVED_EMERALD.get(), "Fire-Engraved Emerald");
		add(ItemInit.FIRE_ENGRAVED_SAPPHIRE.get(), "Fire-Engraved Sapphire");
		//Add more engraved gems
		
		//ITEM TABLET ENGRAVING | BRACER UPGRADING | RUNE TABLET
		add(ItemInit.AETHER_INFUSED_STONE_POWDER.get(), "Aether-Infused Stone Powder");
		add(ItemInit.AETHER_INFUSED_TABLET.get(), "Aether-Infused Tablet");
//		add(ItemInit.AOE_RUNE_TABLET.get(), "AoE Rune");
		add(ItemInit.BRACER.get(), "Battlemage's Bracer");
//		add(ItemInit.DASH_RUNE_TABLET.get(), "Dash Rune");
		add(ItemInit.GOLD_POWDER.get(), "Gold Powder");
		add(ItemInit.ICE_POWDER.get(), "Ice Powder");
		add(ItemInit.COPPER_POWDER.get(), "Iron Powder");
//		add(ItemInit.LOBBED_RUNE_TABLET.get(), "Lobbed Rune");
		add(ItemInit.NETHERITE_POWDER.get(), "Netherite Powder");
//		add(ItemInit.POOL_RUNE_TABLET.get(), "Pool Rune");
//		add(ItemInit.RAY_RUNE_TABLET.get(), "Ray Rune");
//		add(ItemInit.RUNE_TABLET.get(), "Rune");
		add(ItemInit.RUNIC_AETHER_INFUSED_TABLET.get(), "Runic Aether-Infused Tablet");
//		add(ItemInit.RUNIC_STONE_TABLET.get(), "Runic Stone Tablet");
//		add(ItemInit.SHIELD_RUNE_TABLET.get(), "Shield Rune");
//		add(ItemInit.STONE_POWDER.get(), "Stone Powder");
		add(ItemInit.STONE_TABLET.get(), "Stone Tablet");
//		add(ItemInit.TARGETED_RUNE_TABLET.get(), "Targeted Rune");
//		add(ItemInit.TRAP_RUNE_TABLET.get(), "Trap Rune");
//		add(ItemInit.WITHER_BONE_POWDER.get(), "Wither Bone Powder");
		
		//ITEM
//		add(ItemInit.AETHER_FRUIT.get(), "Aether Fruit");
//		add(ItemInit.WITHER_BONE.get(), "Wither Bone");
		
		// !--BLOCK--!
		
		//EXAMPLE BLOCKS
		add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
		add(BlockInit.EXAMPLE_ORE.get(), "Example Ore");
		add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), "Deepslate Example Ore");
		
		//BLOCKS
		add(BlockInit.ONYX_BLOCK.get(), "Onyx Block");
		add(BlockInit.RUBY_BLOCK.get(), "Ruby Block");
		add(BlockInit.SAPPHIRE_BLOCK.get(), "Sapphire Block");
		add(BlockInit.TIGERS_EYE_BLOCK.get(), "Tiger's Eye Block");
		
		//ORES
		add(BlockInit.ONYX_ORE.get(), "Onyx Ore");
		add(BlockInit.DEEPSLATE_ONYX_ORE.get(), "Deepslate Onyx Ore");
		add(BlockInit.RUBY_ORE.get(), "Ruby Ore");
		add(BlockInit.DEEPSLATE_RUBY_ORE.get(), "Deepslate Ruby Ore");
		add(BlockInit.SAPPHIRE_ORE.get(), "Sapphire Ore");
		add(BlockInit.DEEPSLATE_SAPPHIRE_ORE.get(), "Deepslate Sapphire Ore");
		add(BlockInit.TIGERS_EYE_ORE.get(), "Tiger's Eye Ore");
		add(BlockInit.DEEPSLATE_TIGERS_EYE_ORE.get(), "Deepslate Tiger's Eye Ore");
		
		//STONE
//		add(BlockInit.AETHER_INFUSED_STONE.get(), "Aether-Infused Stone");
//		add(BlockInit.AETHER_INFUSED_STONE_BRICKS.get(), "Aether-Infused Stone Bricks");
//		add(BlockInit.AETHER_INFUSED_STONE_BUTTON.get(), "Aether-Infused Stone Button");
//		add(BlockInit.AETHER_INFUSED_STONE_GATE.get(), "Aether-Infused Stone Gate");
//		add(BlockInit.AETHER_INFUSED_STONE_PRESSURE_PLATE.get(), "Aether-Infused Stone Pressure Plate");
//		add(BlockInit.AETHER_INFUSED_STONE_SLAB.get(), "Aether-Infused Stone Slab");
//		add(BlockInit.AETHER_INFUSED_STONE_STAIRS.get(), "Aether-Infused Stone Stairs");
//		add(BlockInit.AETHER_INFUSED_STONE_WALL.get(), "Aether-Infused Stone Wall");
		
		//WOOD
//		add(BlockInit.AETHER_INFUSED_LEAVES.get(), "Aether-Infused Leaves");
//		add(BlockInit.AETHER_INFUSED_SAPLING.get(), "Aether-Infused Sapling");
//		add(BlockInit.AETHER_INFUSED_WOOD.get(), "Aether-Infused Wood");
//		add(BlockInit.AETHER_INFUSED_STRIPPED_WOOD.get(), "Aether-Infused Stripped Wood");
//		add(BlockInit.AETHER_INFUSED_WOOD_BUTTON.get(), "Aether-Infused Wood Button");
//		add(BlockInit.AETHER_INFUSED_WOOD_DOOR.get(), "Aether-Infused Wood Door");
//		add(BlockInit.AETHER_INFUSED_WOOD_FENCE.get(), "Aether-Infused Wood Fence");
//		add(BlockInit.AETHER_INFUSED_WOOD_FENCE_GATE.get(), "Aether-Infused Wood Fence Gate");
//		add(BlockInit.AETHER_INFUSED_WOOD_LOG.get(), "Aether-Infused Log");
//		add(BlockInit.AETHER_INFUSED_WOOD_STRIPPED_LOG.get(), "Aether-Infused Stripped Log");
//		add(BlockInit.AETHER_INFUSED_WOOD_PLANK.get(), "Aether-Infused Planks");
//		add(BlockInit.AETHER_INFUSED_WOOD_PRESSURE_PLATE.get(), "Aether-Infused Wood Pressure Plate");
//		add(BlockInit.AETHER_INFUSED_WOOD_SLAB.get(), "Aether-Infused Wood Slab");
//		add(BlockInit.AETHER_INFUSED_WOOD_STAIRS.get(), "Aether-Infused Wood Stairs");
//		add(BlockInit.AETHER_INFUSED_WOOD_TRAPDOOR.get(), "Aether-Infused Wood Trapdoor");
		
		//MACHINES
		//ToDo: -> Rune Crafting Altar
		//ToDo: -> Gem Cutting Table
		//ToDo: -> Runed Altar
		//ToDo: -> Bracer Upgrade Bench
	}

}
