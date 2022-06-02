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

	// ELEMENTAL PATTERNS
	//MASTERY
	public static final RegistryObject<Item> PATTERN_ELEMENT_CORRUPTION = register("pattern_element_corruption", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_DELIRIUM = register("pattern_element_delirium", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_LIGHTNING = register("pattern_element_lightning", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	//DESTRUCTION
	public static final RegistryObject<Item> PATTERN_ELEMENT_EARTH = register("pattern_element_earth", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_FIRE = register("pattern_element_fire", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_NECROMANCY = register("pattern_element_necromancy", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	//CONTROL
	public static final RegistryObject<Item> PATTERN_ELEMENT_ICE = register("pattern_element_ice", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_KINESIS = register("pattern_element_kinesis", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_ELEMENT_PHASE = register("pattern_element_phase", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	
	// RUNE PATTERNS
	//AOE
	public static final RegistryObject<Item> PATTERN_RUNE_AOE = register("pattern_rune_aoe", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_RUNE_POOL = register("pattern_rune_pool", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_RUNE_TRAP = register("pattern_rune_trap", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	//SINGLE
	public static final RegistryObject<Item> PATTERN_RUNE_TARGETED = register("pattern_rune_targeted", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_RUNE_LOB = register("pattern_rune_lob", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> PATTERN_RUNE_RAY = register("pattern_rune_ray", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	//SHIELD
	public static final RegistryObject<Item> PATTERN_RUNE_NOVA = register("pattern_rune_nova", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	//TABLETS
	public static final RegistryObject<Item> TABLET_STONE = register("tablet_stone", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> TABLET_STONE_RUNED = register("tablet_stone_runed", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Item> TABLET_STONE_RUNED_TARGETED = register("tablet_stone_runed_targeted", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_RAY = register("tablet_stone_runed_ray", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_LOB = register("tablet_stone_runed_lob", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_AOE = register("tablet_stone_runed_aoe", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_POOL = register("tablet_stone_runed_pool", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_TRAP = register("tablet_stone_runed_trap", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
	public static final RegistryObject<Item> TABLET_STONE_RUNED_NOVA = register("tablet_stone_runed_nova", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));	
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
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
	
	private static void registerTabletOutputItem(final String name)
	{
		RegistryObject<Item> tempItem;
	}
	
}
