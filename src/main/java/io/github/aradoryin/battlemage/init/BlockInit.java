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

	public static final RegistryObject<Block> ONYX_BLOCK = register("onyx_block",
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

	/*
	 * List of BLOCKS to implement:
	 * 
	 * >Aether-Infused Log >Aether-Infused Plank >Aether-Infused Wood
	 * >Aether-Infused Leaves >Aether-Infused Sapling
	 * 
	 * >Aether-Infused Stone
	 * 
	 * >Aether-Infused Obsidian
	 */

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
