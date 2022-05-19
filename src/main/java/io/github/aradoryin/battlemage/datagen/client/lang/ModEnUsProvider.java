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
		
		//EXAMPLE ITEM
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		//RUNE PATTERNS
		add(ItemInit.PATTERN_AOE.get(), "AoE Pattern");
		add(ItemInit.PATTERN_POOL.get(), "Pool Pattern");
		add(ItemInit.PATTERN_TRAP.get(), "Trap Pattern");
		add(ItemInit.PATTERN_TARGETED.get(), "Targeted Pattern");
		add(ItemInit.PATTERN_LOB.get(), "Lob Pattern");
		add(ItemInit.PATTERN_RAY.get(), "Ray Pattern");
		add(ItemInit.PATTERN_NOVA.get(), "Nova Pattern");
		
		// BLOCKS
		
		//EXAMPLE BLOCKS
		add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
		add(BlockInit.EXAMPLE_ORE.get(), "Example Ore");
		add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), "Deepslate Example Ore");
	}

}
