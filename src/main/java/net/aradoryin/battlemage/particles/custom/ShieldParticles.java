package net.aradoryin.battlemage.particles.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class ShieldParticles extends TextureSheetParticle {
    /*
    TODO: Update the values below to reflect a "Shield"
     */
    protected ShieldParticles(ClientLevel clientLevel, double x, double y, double z,
                              SpriteSet spriteSet, double xSpeed, double ySpeed, double zSpeed) {
        super(clientLevel, x, y, z, xSpeed, ySpeed, zSpeed);

        this.friction = 0.8f;
        this.xd = xSpeed;
        this.yd = ySpeed;
        this.zd = zSpeed;

        this.quadSize *= 0.75;
        this.lifetime = 20;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 1f;
        this.gCol = 1f;
        this.bCol = 1f;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public Provider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel clientLevel, double x, double y, double z,
                                       double xSpeed, double ySpeed, double zSpeed) {
            return new ShieldParticles(clientLevel, x, y, z, this.spriteSet, xSpeed, ySpeed, zSpeed);
        }
    }
}
