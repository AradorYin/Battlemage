package io.github.aradoryin.battlemage;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("battlemage")
public class Battlemage 
{

	public Battlemage()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}
	
}
