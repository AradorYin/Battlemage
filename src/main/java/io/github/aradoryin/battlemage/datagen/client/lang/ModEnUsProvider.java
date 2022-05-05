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
		
		//ITEM
		add(ItemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		//ITEM GEM
		add(ItemInit.RUBY.get(), "Ruby");
		add(ItemInit.ONYX.get(), "Onyx");
		add(ItemInit.SAPPHIRE.get(), "Sapphire");
		add(ItemInit.TIGERS_EYE.get(), "Tiger's Eye");
		
		//ITEM ELEMENTAL CORE
		add(ItemInit.FIRE_CORE.get(), "Fire Core");
		add(ItemInit.ICE_CORE.get(), "Ice Core");
		add(ItemInit.PHASE_CORE.get(), "Phase Core");
		add(ItemInit.EARTH_CORE.get(), "Earth Core");
		add(ItemInit.KINESIS_CORE.get(), "Kinesis Core");
		add(ItemInit.DELIRIUM_CORE.get(), "Delirium Core");
		add(ItemInit.LIGHTNING_CORE.get(), "Lightning Core");
		add(ItemInit.CORRUPTION_CORE.get(), "Corruption Core");
		add(ItemInit.NECROMANCY_CORE.get(), "Necromancy Core");
		
		//ITEM ELEMENTAL CORE ENGRAVED GEM
		add(ItemInit.FIRE_ENGRAVED_RUBY.get(), "Fire-Engraved Ruby");
		add(ItemInit.FIRE_ENGRAVED_EMERALD.get(), "Fire-Engraved Emerald");
		add(ItemInit.FIRE_ENGRAVED_SAPPHIRE.get(), "Fire-Engraved Sapphire");
		
		//BLOCK
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
		add(BlockInit.ONYX_ORE_DEEPSLATE.get(), "Deepslate Onyx Ore");
		add(BlockInit.RUBY_ORE.get(), "Ruby Ore");
		add(BlockInit.RUBY_ORE_DEEPSLATE.get(), "Deepslate Ruby Ore");
		add(BlockInit.SAPPHIRE_ORE.get(), "Sapphire Ore");
		add(BlockInit.SAPPHIRE_ORE_DEEPSLATE.get(), "Deepslate Sapphire Ore");
		add(BlockInit.TIGERS_EYE_ORE.get(), "Tiger's Eye Ore");
		add(BlockInit.TIGERS_EYE_ORE_DEEPSLATE.get(), "Deepslate Tiger's Eye Ore");
	}

}
