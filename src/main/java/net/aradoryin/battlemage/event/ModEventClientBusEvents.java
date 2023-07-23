package net.aradoryin.battlemage.event;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.particles.ModParticles;
import net.aradoryin.battlemage.particles.custom.ShieldParticles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Battlemage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {

    @SubscribeEvent
    public static void registerParticleFactories(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticles.SHIELD_PARTICLES.get(), ShieldParticles.Provider::new);
    }
}
