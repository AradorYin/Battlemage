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
		// ITEMS
		
		//CREATIVE TAB
		add("itemGroup.battlemage", "Battlemage");
		
		//EXAMPLE ITEM
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		//RUNE PATTERNS
		add(ItemInit.PATTERN_RUNE_AOE.get(), "AoE Pattern");
		add(ItemInit.PATTERN_RUNE_LOB.get(), "Lob Pattern");
		add(ItemInit.PATTERN_RUNE_NOVA.get(), "Nova Pattern");
		add(ItemInit.PATTERN_RUNE_POOL.get(), "Pool Pattern");
		add(ItemInit.PATTERN_RUNE_RAY.get(), "Ray Pattern");
		add(ItemInit.PATTERN_RUNE_TARGETED.get(), "Targeted Pattern");
		add(ItemInit.PATTERN_RUNE_TRAP.get(), "Trap Pattern");
		
		//ELEMENT PATTERNS
		add(ItemInit.PATTERN_ELEMENT_CORRUPTION.get(), "Corruption Pattern");
		add(ItemInit.PATTERN_ELEMENT_DELIRIUM.get(), "Delirium Pattern");
		add(ItemInit.PATTERN_ELEMENT_EARTH.get(), "Earth Pattern");
		add(ItemInit.PATTERN_ELEMENT_FIRE.get(), "Fire Pattern");
		add(ItemInit.PATTERN_ELEMENT_ICE.get(), "Ice Pattern");
		add(ItemInit.PATTERN_ELEMENT_KINESIS.get(), "Kinesis Pattern");
		add(ItemInit.PATTERN_ELEMENT_LIGHTNING.get(), "Lightning Pattern");
		add(ItemInit.PATTERN_ELEMENT_NECROMANCY.get(), "Necromancy Pattern");
		add(ItemInit.PATTERN_ELEMENT_PHASE.get(), "Phase Pattern");
		
		//TABLETS
		add(ItemInit.TABLET_STONE.get(), "Stone Tablet");
		add(ItemInit.TABLET_STONE_RUNED.get(), "Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_AOE.get(), "AoE Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_LOB.get(), "Lob Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_NOVA.get(), "Nova Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_POOL.get(), "Pool Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_RAY.get(), "Ray Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_TARGETED.get(), "Targeted Runed Tablet");
		add(ItemInit.TABLET_STONE_RUNED_TRAP.get(), "Trap Runed Tablet");
		
		
		// BLOCKS
		
		//ORE BLOCKS
		add(BlockInit.EXAMPLE_ORE.get(), "Example Ore");
		add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), "Deepslate Example Ore");
		
		//STONES
		add(BlockInit.A_I_CHISELED_STONE_BRICKS.get(), "Aether-Infused Chiseled Stone Bricks");
		add(BlockInit.A_I_CRACKED_STONE_BRICKS.get(), "Aether-Infused Cracked Stone Bricks");
		add(BlockInit.A_I_STONE.get(), "Aether-Infused Stone");
		add(BlockInit.A_I_STONE_BRICKS.get(), "Aether-Infused Stone Bricks");
		add(BlockInit.A_I_STONE_BRICK_SLAB.get(), "Aether-Infused Stone Brick Slab");
		add(BlockInit.A_I_STONE_BRICK_STAIRS.get(), "Aether-Infused Stone Bricks Stairs");
		add(BlockInit.A_I_STONE_BRICK_WALL.get(), "Aether-Infused Stone Brick Wall");
		add(BlockInit.A_I_STONE_BUTTON.get(), "Aether-Infused Stone Button");
		add(BlockInit.A_I_STONE_PRESSURE_PLATE.get(), "Aether-Infused Stone Pressure Plate");
		add(BlockInit.A_I_STONE_SLAB.get(), "Aether-Infused Stone Slab");
		add(BlockInit.A_I_STONE_STAIRS.get(), "Aether-Infused Stone Stairs");
		add(BlockInit.A_I_STONE_WALL.get(), "Aether-Infused Stone Wall");
		
		//WOOD
		
		//STORAGE BLOCKS
		add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
	}

}
