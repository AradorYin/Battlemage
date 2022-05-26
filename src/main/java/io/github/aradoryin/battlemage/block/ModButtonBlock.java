package io.github.aradoryin.battlemage.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.ButtonBlock;

public class ModButtonBlock extends ButtonBlock
{

	public ModButtonBlock(boolean clicked, Properties properties)
	{
		super(clicked, properties);
	}

	@Override
	protected SoundEvent getSound(boolean clicked)
	{
	      return clicked ? SoundEvents.STONE_BUTTON_CLICK_ON : SoundEvents.STONE_BUTTON_CLICK_OFF;
	}

}
