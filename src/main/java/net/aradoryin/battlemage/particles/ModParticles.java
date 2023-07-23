package net.aradoryin.battlemage.particles;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Battlemage.MOD_ID);

    /*
    TODO: Add in the rest of the particles
    Spell Particles to Implement: Target, Ray, Grenade, AoE, Pool, Trap, Shield
    Block Particles to Implement: Altar, Obelisk (more to be added here)
     */
    public static final RegistryObject<SimpleParticleType> SHIELD_PARTICLES = PARTICLE_TYPES.register("shield_particles",
            ()-> new SimpleParticleType(true));

    public static void register(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
    }
}
