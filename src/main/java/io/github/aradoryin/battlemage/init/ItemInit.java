package io.github.aradoryin.battlemage.init;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	/*
	 * List of ITEMS to implement:
	 * 
	 * >Gems:
	 * -> Amethyst
	 * ---> More focused AugmentType.MASTERY spells
	 * -> Diamond
	 * ---> Longer lasting AugmentType.CONTROL spells
	 * -> Emerald
	 * ---> Longer lasting AugmentType.MASTERY spells
	 * -> Quartz
	 * ---> Harder Hitting AugmentType.CONTROL spells
	 * -> Ruby
	 * ---> Harder Hitting AugmentType.DESTRUCTION spells
	 * -> Sapphire
	 * ---> More focused AugmentType.CONTROL spells
	 * -> Nether Star
	 * ---> Harder Hitting AugmentType.MASTERY spells
	 * -> Onyx
	 * ---> Longer lasting AugmentType.DESTRUCTION spells
	 * -> Tiger's Eye
	 * ---> More focused AugmentType.DESTRUCTION spells
	 * Quality:
	 * -> Trash < Poor < Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	 * Higher chance on using/obtaining AugmentType.MASTERY elements: Amethyst | Diamond | Nether Star
	 * Higher chance on using/obtaining AugmentType.CONTROL elements: Emerald | Quartz | Sapphire
	 * Higher chance on using/obtaining AugmentType.DESTRUCTION elements: Ruby | Onyx | Tiger's Eye
	 * 
	 * Engravings:
	 * -> Iron Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.LIGHTNING
	 * --->Tablet Engraving Ingredient for AugmentType.DESTRUCTION spells
	 * -> Gold Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.EARTH
	 * --->Tablet Engraving Ingredient for AugmentType.MASTERY spells
	 * -> Netherite Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.FIRE
	 * -> Leather
	 * ---> Used to make Bracer
	 * -> Phantom Membrane
	 * ---> Used to upgrade Bracer with better control over ElementType.DELIRIUM
	 * -> String
	 * ---> Used to make Bracer
	 * -> Wither Bone Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.NECROMANCY
	 * -> Ice Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.ICE
	 * --> Tablet Engraving Ingredient for AugmentType.CONTROL spells
	 * -> Aether-Infused Stone Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.Kinesis
	 * ---> Tablet Engraving Ingredient
	 * -> Aether-Infused Obsidian Powder
	 * ---> Used to upgrade Bracer with better control over ElementType.Phase
	 * ---> Tablet Engraving Ingredient
	 * -> Nether Star
	 * ---> Used to upgrade Bracer with better control over ElementType.CORRUPTION
	 * 
	 * >Bracer
	 * Slots:
	 * -> 3 Gem | Element-Engraved Gem
	 * -> 9 Rune-Engraved Tablet | Rune-Engraved Aether-Infused Tablet
	 * -> 3 Engraving
	 * Quality:
	 * -> Trash < Common < Rare < Legendary < Mythic < Pristine
	 * 
	 * >Element-Engraved Gem:
	 * Takes:
	 * -> GemType: All
	 * -> ElementType: All
	 * Quality:
	 * -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	 * 
	 * >Aether Fruit
	 * 
	 * >Stone Tablet
	 * Quality:
	 * -> Trash < Common < Rare
	 * 
	 * >Aether-Infused Tablet
	 * Quality:
	 * -> Rare < Legendary < Mythic
	 * 
	 * >Rune-Engraved Stone Tablet
	 * Quality:
	 * -> Trash < Poor < Common < Uncommon < Rare
	 * 
	 * >Rune-Engraved Aether-Infused Tablet
	 * Quality:
	 * -> Epic < Legendary < Unique < Mythic < Pristine
	 */
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
	
}
