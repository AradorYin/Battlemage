package io.github.aradoryin.battlemage.init;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.enums.AugmentType;
import io.github.aradoryin.battlemage.enums.Quality;
import io.github.aradoryin.battlemage.item.BracerItem;
import io.github.aradoryin.battlemage.item.ElementalCoreEngravedGemItem;
import io.github.aradoryin.battlemage.item.ElementalCoreItem;
import io.github.aradoryin.battlemage.item.ExampleItem;
import io.github.aradoryin.battlemage.item.GemItem;
import io.github.aradoryin.battlemage.item.RuneTabletItem;
import io.github.aradoryin.battlemage.item.TabletEngravingItem;
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
	

	//GEM
	public static final RegistryObject<Item> ONYX = register("onyx", ()-> new GemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Longer lasting AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item>  RUBY = register("ruby", ()-> new GemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Harder Hitting AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item> SAPPHIRE = register("sapphire", ()-> new GemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> More focused AugmentType.CONTROL spells
	
	public static final RegistryObject<Item> TIGERS_EYE = register("tigers_eye", ()-> new GemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> More focused AugmentType.DESTRUCTION spells
	

	//ELEMENTAL CORE
	public static final RegistryObject<Item> CORRUPTION_CORE = register("corruption_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> DELIRIUM_CORE = register("delirium_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> EARTH_CORE = register("earth_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	public static final RegistryObject<Item> FIRE_CORE = register("fire_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	public static final RegistryObject<Item> ICE_CORE = register("ice_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	public static final RegistryObject<Item> KINESIS_CORE = register("kinesis_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	public static final RegistryObject<Item> LIGHTNING_CORE = register("lightning_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.MASTERY
	
	public static final RegistryObject<Item> NECROMANCY_CORE = register("necromancy_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.DESTRUCTION
	
	public static final RegistryObject<Item> PHASE_CORE = register("phase_core", ()-> new ElementalCoreItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> AugmentType.CONTROL
	
	
	//ELEMENTAL CORE ENGRAVED GEM
	public static final RegistryObject<Item> FIRE_ENGRAVED_RUBY = register("fire_engraved_ruby", ()-> new ElementalCoreEngravedGemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.DESTRUCTION
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine

	public static final RegistryObject<Item> FIRE_ENGRAVED_SAPPHIRE = register("fire_engraved_sapphire", ()-> new ElementalCoreEngravedGemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.CONTROL
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine

	public static final RegistryObject<Item> FIRE_ENGRAVED_EMERALD = register("fire_engraved_emerald", ()-> new ElementalCoreEngravedGemItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// >Elemental Enhancement
	// -> Fire
	// >AugmentType.MASTERY
	// >Quality
	// -> Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	

	//TABLET ENGRAVING | BRACER UPGRADING | RUNE TABLET
	public static final RegistryObject<Item> AETHER_INFUSED_STONE_POWDER = register("aether_infused_stone_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.PHASE
	// -> Tablet Engraving Ingredient Base
	
	public static final RegistryObject<Item> AETHER_INFUSED_TABLET = register("aether_infused_tablet", ()-> new TabletEngravingItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// > Required Tablet Engraving Ingredient
	
	public static final RegistryObject<Item> AOE_RUNE_TABLET = register("aoe_rune_tablet", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	public static final RegistryObject<Item> BRACER = register("bracer", ()-> new BracerItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> COPPER_POWDER = register("copper_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.LIGHTNING
	// -> Tablet Engraving Ingredient for AugmentType.MASTERY spells
	
	public static final RegistryObject<Item> DASH_RUNE_TABLET = register("dash_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> GOLD_POWDER = register("gold_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.EARTH
	// -> Tablet Engraving Ingredient for AugmentType.DESTRUCTION spells
	
	public static final RegistryObject<Item> ICE_POWDER = register("ice_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.ICE
	// -> Tablet Engraving Ingredient for AugmentType.CONTROL spells
	
	public static final RegistryObject<Item> IRON_POWDER = register("iron_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.ICE
	
	public static final RegistryObject<Item> LOBBED_RUNE_TABLET = register("lobbed_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> NETHERITE_POWDER = register("netherite_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.FIRE
	
	public static final RegistryObject<Item> POOL_RUNE_TABLET = register("pool_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> RAY_RUNE_TABLET = register("ray_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> RUNE_TABLET = register("rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> RUNIC_AETHER_INFUSED_TABLET = register("runic_aether_infused_tablet", ()-> new TabletEngravingItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// > Default Tablet containing no spells
	
	public static final RegistryObject<Item> RUNIC_STONE_TABLET = register("runic_stone_tablet", ()-> new TabletEngravingItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// > Default Tablet containing no spells
	
	public static final RegistryObject<Item> SHIELD_RUNE_TABLET = register("shield_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> STONE_POWDER = register("stone_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Tablet Engraving Ingredient Base
	
	public static final RegistryObject<Item> STONE_TABLET = register("stone_tablet", ()-> new TabletEngravingItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// > Required Tablet Engraving Ingredient
	
	public static final RegistryObject<Item> TARGETED_RUNE_TABLET = register("targeted_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> TRAP_RUNE_TABLET = register("trap_rune_tablet", ()-> new RuneTabletItem(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Item> WITHER_BONE_POWDER = register("wither_bone_powder", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Used to upgrade Bracer with better control over ElementType.NECROMANCY
	
	
	//ITEM
	public static final RegistryObject<Item> AETHER_FRUIT = register("aether_fruit", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// -> Tangy but very sweet fruit.

	public static final RegistryObject<Item> WITHER_BONE = register("wither_bone", ()-> new Item(new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item)
	{
		return ITEMS.register(name, item);
	}
	
}
