package io.github.aradoryin.battlemage.init;

import java.util.function.Function;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.block.ExampleBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
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
	// !!--------------------------------------------!!

	/*
	 * GEM BLOCKS
	 * GEM ORES
	 * 
	 * Stones:
	 * Aether-Infused Stone
	 * Aether-Infused Stone Bricks
	 * Aether-Infused Stone Button
	 * Aether-Infused Stone Pressure Plate
	 * Aether-Infused Stone Slab
	 * Aether-Infused Stone Stairs
	 * Aether-Infused Stone Wall
	 * 
	 * Wood:
	 * Aether-Infused Leaves
	 * Aether-Infused Sapling
	 * Aether-Infused Wood | Stripped Wood
	 * Aether-Infused Wooden Button
	 * Aether-Infused Wooden Door
	 * Aether-Infused Wood Fence
	 * Aether-Infused Wood Fence Gate
	 * Aether-Infused Log | Stripped Log
	 * Aether-Infused Wood Plank
	 * Aether-Infused Wooden Pressure Plate
	 * Aether-Infused Wood Slab
	 * Aether-Infused Wood Stairs
	 * Aether-Infused Wood Trapdoor
	 */


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
