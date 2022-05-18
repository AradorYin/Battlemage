package io.github.aradoryin.battlemage.client;

import io.github.aradoryin.battlemage.Battlemage;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Battlemage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientListener
{

	private void clientSetup(final FMLClientSetupEvent event)
	{
		event.enqueueWork(()-> {
			
		});
	}
	
}
