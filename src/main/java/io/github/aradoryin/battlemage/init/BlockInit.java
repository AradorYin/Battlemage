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
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block", 
			()-> new ExampleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
					.strength(3.0f)
					.sound(SoundType.METAL)
					.requiresCorrectToolForDrops()), object -> 
			()-> new BlockItem(object.get(),new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
			
	public static final RegistryObject<Block> EXAMPLE_ORE = register("example_ore", 
			()-> new Block(BlockBehaviour.Properties.of(Material.METAL)
					.strength(3.0f)
					.sound(SoundType.STONE)
					.requiresCorrectToolForDrops()), object -> 
			()-> new BlockItem(object.get(),new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB))));
	public static final RegistryObject<Block> DEEPSLATE_EXAMPLE_ORE = register("deepslate_example_ore", 
			()-> new Block(BlockBehaviour.Properties.of(Material.STONE)
					.strength(3.0f)
					.sound(SoundType.DEEPSLATE)
					.requiresCorrectToolForDrops()), object ->
			()-> new BlockItem(object.get(), new Item.Properties().tab(Battlemage.BATTLEMAGE_TAB)));
			
	/*
	 * List of BLOCKS to implement:
	 * 
	 * >Amethyst Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * 
	 * >Diamond Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * 
	 * >Emerald Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * 
	 * >Quartz Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * 
	 * >Ruby Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * >Ruby Ore
	 * -> Normal Break: Drops Ruby Gem
	 * -> Fortune: 1 -> Chance of 2 | 2 -> Chance of 3 | 3 -> Chance of 4
	 * -> Silk Touch: Drops Ruby Ore Block
	 * 
	 * >Sapphire Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * >Sapphire Ore
	 * -> Normal Break: Drops Sapphire Gem
	 * -> Fortune: 1 -> Chance of 2 | 2 -> Chance of 3 | 3 -> Chance of 4
	 * -> Silk Touch: Drops Sapphire Ore Block
	 * 
	 * >Tiger's Eye Block
	 * -> Based on quality of GemType.QUALITY used to make
	 * >Tiger's Eye Ore
	 * -> Normal Break: Drops Tiger's Eye Gem
	 * -> Fortune: 1 -> Chance of 2 | 2 -> Chance of 3 | 3 -> Chance of 4
	 * -> Silk Touch: Drops Tiger's Eye Ore Block
	 * 
	 * >Aether-Infused Log
	 * >Aether-Infused Plank
	 * >Aether-Infused Wood
	 * >Aether-Infused Leaves
	 * >Aether-Infused Sapling
	 * 
	 * >Aether-Infused Stone
	 * 
	 * >Aether-Infused Obsidian
	 */
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block)
	{
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item)
	{
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}

}
