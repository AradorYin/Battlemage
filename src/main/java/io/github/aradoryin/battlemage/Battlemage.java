package io.github.aradoryin.battlemage;
import io.github.aradoryin.battlemage.init.BlockInit;
import io.github.aradoryin.battlemage.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Battlemage.MOD_ID)
public class Battlemage 
{
	
	public static final String MOD_ID = "battlemage";
	
	/*
	 * .json file location: client-extra.jar
	 * forge class files location: forge-1.18.2	 */
	
	/*
	 * >Blocks
	 * ->Amethyst Block
	 * --> Based on quality of GemType.QUALITY used to make
	 * ->Diamond Block
	 * --> Based on quality of GemType.QUALITY used to make
	 * ->Emerald Block
	 * --> Based on quality of GemType.QUALITY used to make
	 * >Quartz Block
	 * -> Based on quality of GemType.QUALITY used to make
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
	 * -> Nether Star
	 * ---> Harder Hitting AugmentType.MASTERY spells
	 * Quality:
	 * -> Trash < Poor < Common < Uncommon < Rare < Epic < Legendary < Unique < Mythic < Pristine
	 * Higher chance on using/obtaining AugmentType.MASTERY elements: Amethyst | Diamond | Nether Star
	 * Higher chance on using/obtaining AugmentType.CONTROL elements: Emerald | Quartz | Sapphire
	 * Higher chance on using/obtaining AugmentType.DESTRUCTION elements: Ruby | Onyx | Tiger's Eye
	 * 
	 * >Engravings:
	 * -> Leather
	 * ---> Used to make Bracer
	 * -> Phantom Membrane
	 * ---> Used to upgrade Bracer with better control over ElementType.DELIRIUM
	 * -> String
	 * ---> Used to make Bracer
	 * -> Nether Star
	 * ---> Used to upgrade Bracer with better control over ElementType.CORRUPTION
	 */

	public static final CreativeModeTab BATTLEMAGE_TAB = new CreativeModeTab(MOD_ID)
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon()
		{
			return new ItemStack(ItemInit.EXAMPLE_ITEM.get());
		}
	};
	
	public Battlemage()
	{
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
