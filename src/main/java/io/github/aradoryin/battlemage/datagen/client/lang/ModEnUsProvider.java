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
		//CREATIVE TABS
		add("itemGroup.battlemage", "Battlemage");
		
		//ITEMS
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		//BLOCKS
		add(BlockInit.EXAMPLE_BLOCK.get(), "Example Block");
		add(BlockInit.EXAMPLE_ORE.get(), "Example Ore");
		add(BlockInit.DEEPSLATE_EXAMPLE_ORE.get(), "Deepslate Example Ore");
	}

}
