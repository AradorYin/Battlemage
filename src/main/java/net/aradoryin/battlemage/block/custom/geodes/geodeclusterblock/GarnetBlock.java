package net.aradoryin.battlemage.block.custom.geodes.geodeclusterblock;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

// TODO Update SoundEvents
public class GarnetBlock extends Block {
    public GarnetBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void onProjectileHit(Level level, BlockState blockState, BlockHitResult blockHitResult, Projectile projectile) {
        if (!level.isClientSide) {
            BlockPos blockpos = blockHitResult.getBlockPos();
            level.playSound((Player)null, blockpos, SoundEvents.AMETHYST_BLOCK_HIT, SoundSource.BLOCKS, 1.0F, 0.5F + level.random.nextFloat() * 1.2F);
            level.playSound((Player)null, blockpos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1.0F, 0.5F + level.random.nextFloat() * 1.2F);
        }

    }
}