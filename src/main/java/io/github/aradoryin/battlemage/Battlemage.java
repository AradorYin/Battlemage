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
	 * Enum Runes:
	 * -> Shield
	 * -> Dash
	 * -> Targeted
	 * -> Lobbed
	 * -> Ray
	 * -> AoE
	 * -> Trap
	 * -> Pool
	 * 
	 * Enum Augments:
	 * -> Control
	 * -> Mastery
	 * -> Destruction
	 * 
	 * Enum Elements:
	 * -> Fire > Destruction
	 * -> Ice > Control
	 * -> Lightning > Mastery
	 * -> Kinesis > Control
	 * -> Corruption > Mastery
	 * -> Necromancy > Destruction
	 * -> Delirium > Mastery
	 * -> Phase > Control
	 * -> Earth > Destruction
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
