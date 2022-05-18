package io.github.aradoryin.battlemage.init;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.item.ExampleItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);
	
	// !!THIS SECTION SHOULD NOT BE OBTAINED NORMALLY!!
	//EXAMPLE ITEM
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", ()-> new ExampleItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// !!--------------------------------------------!!

	/*
	 * ELEMENTAL PATTERNS:
	 * Corruption -> AugmentType.MASTERY
	 * Delirium -> AugmentType.MASTERY
	 * Lightning -> AugmentType.MASTERY
	 * Earth -> AugmentType.DESTRUCTION
	 * Fire -> AugmentType.DESTRUCTION
	 * Necromancy -> AugmentType.DESTRUCTION
	 * Ice -> AugmentType.CONTROL
	 * Kinesis -> AugmentType.CONTROL
	 * Phase -> AugmentType.CONTROL
	 */

	/*
	 * TABLETS:
	 * Stone Tablet -> Upgraded to Aether-Infused Tablet
	 * Stone Powder -> Upgraded to Aether-Infused Powder
	 * Rune Pattern -> Any Rune Pattern including Empty Rune Pattern
	 * Ice Powder -> AugmentType.CONTROL
	 * Gold Powder -> AugmentType.MASTERY
	 * Iron Powder -> AugmentType.DESTRUCTION
	 * 
	 * > Output:
	 * Runed Tablet
	 * -> Stone Tablet
	 * -> Stone Powder ? Stone Powder | Aether-Infused Powder -> Quality of Output
	 * -> Rune Pattern -> Type of spell
	 * -> Augment Powder -> Enhancement of spell
	 * Aether-Infused Runed Tablet
	 * -> Aether-Infused Tablet
	 * -> Aether-Infused Powder ? Stone Powder | Aether-Infused Powder -> Quality of Output
	 * -> Rune Pattern -> Type of spell
	 * -> Augment Powder -> Enhancement of spell
	 */
	
	/*
	 * RUNE PATTERNS:
	 * AoE Pattern -> AoE | Pool | Trap
	 * Targeted Pattern -> Targeted | Lobbed | Ray
	 * Nova Pattern
	 */
	
	/*
	 * BRACER:
	 * Bracer
	 * > Slots:
	 * -> 1 Gem Slot -> Upgraded to Elemental Engraved Gem
	 * -> 3 Runed Tablet Slots -> Upgraded to Aether-Infused Tablet
	 * -> 3 Engravings
	 * 
	 * > Quality: -> Grants additional In-Game documentation | Modifies the spells cast
	 * -> Trash < Common < Rare < Legendary < Mythic < Pristine
	 * 
	 * > Output:
	 * -> Key L = Leather
	 * -> Key S = String
	 * -> Pattern "SLS"
	 * -> Pattern "LSL"
	 * -> Pattern "SLS"
	 * 
	 * > Engravings:
	 * -> Nether Star -> Harder hitting AugmentType.MASTERY
	 * -> Emerald Powder -> Longer lasting AugmentType.MASTERY
	 * -> Amethyst Powder -> More focused AugmentType.MASTERY
	 * -> Quartz Powder -> Harder hitting AugmentType.CONTROL
	 * -> Diamond Powder -> Longer lasting AugmentType.CONTROL
	 * -> Sapphire Powder -> More focused AugmentType.CONTROL
	 * -> Ruby Powder -> Harder hitting AugmentType.DESTRUCTION
	 * -> Onyx Powder -> Longer lasting AugmentType.DESTRUCTION
	 * -> Citrine Powder -> More focused AugmentType.DESTRUCTION
	 * 
	 * > Higher chance on using/obtaining AugmentType.MASTERY elements: Amethyst | Emerald | Nether Star
	 * > Higher chance on using/obtaining AugmentType.CONTROL elements: Diamond | Quartz | Sapphire
	 * > Higher chance on using/obtaining AugmentType.DESTRUCTION elements: Ruby | Onyx | Citrine
	 */
	
	/*
	 * PLANTS:
	 * Aether Fruit -> Tangy but very sweet fruit
	 */
	
	/*
	 * GEMS:
	 * Onyx -> Longer lasting AugmentType.DESTRUCTION spells
	 * Ruby -> Harder hitting AugmentType.DESTRUCTION spells
	 * Citrine -> More focused AugmentType.DESTRUCTION spells
	 * Sapphire -> More focused AugmentType.CONTROL spells
	 * Diamond -> Longer lasting AugmentType.CONTROL spells
	 * Quartz -> Harder hitting AugmentType.CONTROL spells
	 * Nether Star -> Harder hitting AugmentType.MASTERY spells
	 * Emerald -> Longer lasting AugmentType.MASTERY spells
	 * Amethyst -> More focused AugmentType.MASTERY spells
	 * 
	 * > Higher chance on using/obtaining AugmentType.MASTERY elements: Amethyst | Emerald | Nether Star
	 * > Higher chance on using/obtaining AugmentType.CONTROL elements: Diamond | Quartz | Sapphire
	 * > Higher chance on using/obtaining AugmentType.DESTRUCTION elements: Ruby | Onyx | Citrine
	 * 
	 * > Quality:
	 * -> Raw < Uncut 
	 * -> Trash < Poor < Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	 */
	
	/*
	 * ELEMENTAL ENGRAVED GEMS:
	 * Elemental Enhancement -> Any Element
	 * Quality -> Dependent on GemQuality used
	 */
	
	private static <T extends Item> RegistryObject<Item> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
	
}
