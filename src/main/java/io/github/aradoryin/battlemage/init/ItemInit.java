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
	

	//create GemBase class for below section
	//GEM
	public static final RegistryObject<Item> RUBY = register("ruby", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Harder Hitting AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item> SAPPHIRE = register("sapphire", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> More focused AugmentType.CONTROL spells
	
	public static final RegistryObject<Item> ONYX = register("onyx", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Longer lasting AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item> TIGERS_EYE = register("tigers_eye", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> More focused AugmentType.DESTRUCTION spells
	

	//create ElementalCoreBase for below section
	//ELEMENTAL CORE
	public static final RegistryObject<Item> FIRE_CORE = register("fire_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	public static final RegistryObject<Item> ICE_CORE = register("ice_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	public static final RegistryObject<Item> LIGHTNING_CORE = register("lightning_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> KINESIS_CORE = register("kinesis_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	public static final RegistryObject<Item> CORRUPTION_CORE = register("corruption_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> NECROMANCY_CORE = register("necromancy_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	public static final RegistryObject<Item> DELIRIUM_CORE = register("delirium_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> PHASE_CORE = register("phase_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	public static final RegistryObject<Item> EARTH_CORE = register("earth_core", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	
	//create ElementalCoreEngravedGemBase class for below section
	//ELEMENTAL CORE ENGRAVED GEM

	public static final RegistryObject<Item> FIRE_ENGRAVED_RUBY = register("fire_engraved_ruby", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.DESTRUCTION
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine

	public static final RegistryObject<Item> FIRE_ENGRAVED_SAPPHIRE = register("fire_engraved_sapphire", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.CONTROL
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine

	public static final RegistryObject<Item> FIRE_ENGRAVED_EMERALD = register("fire_engraved_emerald", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.MASTERY
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	

	//ENGRAVING
	public static final RegistryObject<Item> IRON_POWDER = register("iron_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.LIGHTNING
	// -> Tablet Engraving Ingredient for AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item> GOLD_POWDER = register("gold_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.EARTH
	// -> Tablet Engraving Ingredient for AugmentType.MASTERY spells
	
	public static final RegistryObject<Item> NETHERITE_POWDER = register("netherite_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.FIRE
	
	public static final RegistryObject<Item> WITHER_BONE_POWDER = register("wither_bone_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.NECROMANCY
	
	public static final RegistryObject<Item> ICE_POWDER = register("ice_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.ICE
	// -> Tablet Engraving Ingredient for AugmentType.CONTROL spells
	
	public static final RegistryObject<Item> AETHER_INFUSED_STONE_POWDER = register("aether_infused_stone_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.PHASE
	// -> Tablet Engraving Ingredient Base
	
	public static final RegistryObject<Item> AETHER_INFUSED_OBSIDIAN_POWDER = register("aether_infused_obsidian_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.PHASE
	// -> Tablet Engraving Ingredient Base
	
	
	/*
	 * RuneType Item Tablets
	 */
	//ITEM
	public static final RegistryObject<Item> STONE_TABLET = register("stone_tablet", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Quality
	// -> Trash < Common < Rare
	
	public static final RegistryObject<Item> AETHER_INFUSED_TABLET = register("aether_infused_tablet", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Quality 
	// -> Rare < Legendary < Mythic
	
	public static final RegistryObject<Item> RUNE_ENGRAVED_STONE_TABLET = register("rune_engraved_stone_tablet", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Quality
	// -> Trash < Poor < Common < Uncommon < Rare < Epic
	
	public static final RegistryObject<Item> RUNE_ENGRAVED_AETHER_INFUSED_TABLET = register("rune_engraved_aether_infused_tablet", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Quality
	// -> Rare < Epic < Legendary < Unique < Mythic < Pristine
	
	public static final RegistryObject<Item> AETHER_FRUIT = register("aether_fruit", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Tangy but very sweet fruit.

	public static final RegistryObject<Item> WITHER_BONE = register("wither_bone", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	
	//EQUIPMENT
	public static final RegistryObject<Item> BRACER = register("bracer", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Slots
	// -> 3 Gem or Element-Engraved Gem
	// -> 9 Rune-Engraved Tablet or Rune-Engraved Aether-Infused Tablet
	// -> 3 Engraving
	// >Quality
	// -> Trash < Common < Rare < Legendary < Mythic < Pristine
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
	
}
