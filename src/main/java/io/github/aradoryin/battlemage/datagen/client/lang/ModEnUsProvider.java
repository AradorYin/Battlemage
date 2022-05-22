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
		
		
		// BLOCKS
		
		//EXAMPLE BLOCKS
		add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
		add(BlockInit.EXAMPLE_ORE.get(), "Example Ore");
		add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), "Deepslate Example Ore");
	}

}
