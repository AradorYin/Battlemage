package io.github.aradoryin.battlemage.item;

import net.minecraft.world.item.Item;

public class BracerItem extends Item
{

	/*
	 * Slots:
	 * > 3 Gem | Substitute Element-Engraved Gem
	 * > 9 Runic Stone Tablet | Substitute Runic Aether-Infused Tablet
	 * > 3 Engraving
	 * Quality
	 * > Trash < Common < Rare < Legendary < Mythic < Pristine
	 * 
	 * GEM:
	 * > Higher chance on using/obtaining AugmentType.MASTERY elements: Amethyst | Diamond | Nether Star
	 * > Higher chance on using/obtaining AugmentType.CONTROL elements: Emerald | Quartz | Sapphire
	 * > Higher chance on using/obtaining AugmentType.DESTRUCTION elements: Ruby | Onyx | Tiger's Eye
	 */

	public BracerItem(Properties properties)
	{
		super(properties);
	}
	
}
