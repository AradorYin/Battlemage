package io.github.aradoryin.battlemage.init;

import java.util.function.Function;

import com.google.common.base.Supplier;

import io.github.aradoryin.battlemage.Battlemage;
import io.github.aradoryin.battlemage.block.ExampleBlock;
import io.github.aradoryin.battlemage.block.ModButtonBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
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
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));

	public static final RegistryObject<Block> EXAMPLE_ORE = register("example_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
			
	public static final RegistryObject<Block> DEEPSLATE_EXAMPLE_ORE = register("deepslate_example_ore",
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	// !!--------------------------------------------!!

	// STONE
	public static final RegistryObject<Block> A_I_STONE = register("a_i_stone", 
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Block> A_I_STONE_BRICKS = register("a_i_stone_bricks", 
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Block> A_I_CHISELED_STONE_BRICKS = register("a_i_chiseled_stone_bricks", 
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<Block> A_I_CRACKED_STONE_BRICKS = register("a_i_cracked_stone_bricks", 
			() -> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<SlabBlock> A_I_STONE_BRICK_SLAB = register("a_i_stone_brick_slab", 
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<StairBlock> A_I_STONE_BRICK_STAIRS = register("a_i_stone_brick_stairs", 
			() -> new StairBlock(A_I_STONE.get().defaultBlockState(),BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<WallBlock> A_I_STONE_BRICK_WALL = register("a_i_stone_brick_wall", 
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<ButtonBlock> A_I_STONE_BUTTON = register("a_i_stone_button", 
			() -> new ModButtonBlock(false, BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()
					.noCollission()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<PressurePlateBlock> A_I_STONE_PRESSURE_PLATE = register("a_i_stone_pressure_plate", 
			() -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()
					.noCollission()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<SlabBlock> A_I_STONE_SLAB = register("a_i_stone_slab", 
			() -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<StairBlock> A_I_STONE_STAIRS = register("a_i_stone_stairs", 
			() -> new StairBlock(A_I_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	public static final RegistryObject<WallBlock> A_I_STONE_WALL = register("a_i_stone_wall", 
			() -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), 
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
	
	/*
	 * GEM BLOCKS
	 * GEM ORES
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
