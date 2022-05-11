package io.github.aradoryin.battlemage.init;

import java.util.function.Function;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.block.ExampleBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Battlemage.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	


	// !!THIS SECTION SHOULD NOT BE OBTAINED NORMALLY!!
	// EXAMPLE BLOCK
	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new ExampleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> EXAMPLE_ORE = register("example_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
			
	public static final RegistryObject<Block> DEEPSLATE_EXAMPLE_ORE = register("deepslate_example_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	// BLOCK
	public static final RegistryObject<Block> ONYX_BLOCK = register("onyx_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
	// Item Will Change based on Quality of GemType.QUALITY
	
	public static final RegistryObject<Block> RUBY_BLOCK = register("ruby_block",
			() -> new ExampleBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
	// Item Will Change based on Quality of GemType.QUALITY

	public static final RegistryObject<Block> SAPPHIRE_BLOCK = register("sapphire_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
	// Item Will Change based on Quality of GemType.QUALITY

	public static final RegistryObject<Block> TIGERS_EYE_BLOCK = register("tigers_eye_block",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// Item Will Change based on Quality of GemType.QUALITY

	// ORE
	public static final RegistryObject<Block> ONYX_ORE = register("onyx_ore",
			() -> new ExampleBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> DEEPSLATE_ONYX_ORE = register("onyx_ore_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> RUBY_ORE = register("ruby_ore",
			() -> new ExampleBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> DEEPSLATE_RUBY_ORE = register("ruby_ore_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> SAPPHIRE_ORE = register("sapphire_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> DEEPSLATE_SAPPHIRE_ORE = register("sapphire_ore_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	public static final RegistryObject<Block> TIGERS_EYE_ORE = register("tigers_eye_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));

	public static final RegistryObject<Block> DEEPSLATE_TIGERS_EYE_ORE = register("tigers_eye_ore_deepslate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	
	// STONE
	public static final RegistryObject<Block> AETHER_INFUSED_STONE = register("aether_infused_stone",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_BRICKS = register("aether_infused_stone_brick",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_BUTTON = register("aether_infused_stone_button",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_GATE = register("aether_infused_stone_gate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_PRESSURE_PLATE = register("aether_infused_stone_pressure_plate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_SLAB = register("aether_infused_stone_slab",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_STAIRS = register("aether_infused_stone_stairs",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STONE_WALL = register("aether_infused_stone_wall",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	
	// WOOD
	public static final RegistryObject<Block> AETHER_INFUSED_LEAVES = register("aether_infused_leaves",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_SAPLING = register("aether_infused_sapling",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD = register("aether_infused_wood",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_STRIPPED_WOOD = register("aether_infused_stripped_wood",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_BUTTON = register("aether_infused_wood_button",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_DOOR = register("aether_infused_wood_door",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	//3
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_FENCE = register("aether_infused_wood_fence",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_FENCE_GATE= register("aether_infused_wood_fence_gate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_LOG = register("aether_infused_wood_log",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_STRIPPED_LOG = register("aether_infused_wood_stripped_log",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_PLANK = register("aether_infused_wood_plank",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_PRESSURE_PLATE = register("aether_infused_wood_pressure_plate",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_SLAB = register("aether_infused_wood_slab",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_STAIRS = register("aether_infused_wood_stairs",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	public static final RegistryObject<Block> AETHER_INFUSED_WOOD_TRAPDOOR = register("aether_infused_wood_trap_door",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));


	//REGISTRIES
	private static <T extends Block> RegistryObject<T> registerBlock(final String name,
			final Supplier<? extends T> block)
	{
		return BLOCKS.register(name, block);
	}

	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item)
	{
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}

}
