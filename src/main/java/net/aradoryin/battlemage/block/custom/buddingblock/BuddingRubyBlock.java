package net.aradoryin.battlemage.block.custom.buddingblock;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.block.custom.block.RubyBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;

public class BuddingRubyBlock extends RubyBlock {
    public static final int GROWTH_CHANCE = 5;
    private static final Direction[] DIRECTIONS = Direction.values();

    public BuddingRubyBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    public static boolean canClusterGrowAtState(BlockState blockState) {
        return blockState.isAir() || blockState.is(Blocks.WATER) && blockState.getFluidState().getAmount() == 8;
    }

    public PushReaction getPistonPushReaction(BlockState blockState) {
        return PushReaction.DESTROY;
    }

    public void randomTick(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, RandomSource randomSource) {
        if (randomSource.nextInt(5) == 0) {
            Direction direction = DIRECTIONS[randomSource.nextInt(DIRECTIONS.length)];
            BlockPos blockpos = blockPos.relative(direction);
            BlockState blockstate = serverLevel.getBlockState(blockpos);
            Block block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = ModBlocks.SMALL_RUBY_BUD.get(); // Blocks.SMALL_AMETHYST_BUD;
            } else if (blockstate.is(ModBlocks.SMALL_RUBY_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_RUBY_BUD.get(); // Blocks.MEDIUM_AMETHYST_BUD;
            } else if (blockstate.is(ModBlocks.MEDIUM_RUBY_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_RUBY_BUD.get(); // Blocks.LARGE_AMETHYST_BUD;
            } else if (blockstate.is(ModBlocks.LARGE_RUBY_BUD.get()) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.RUBY_CLUSTER.get(); // Blocks.AMETHYST_CLUSTER;
            }

            if (block != null) {
                BlockState blockstate1 = block.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction).setValue(AmethystClusterBlock.WATERLOGGED,
                        Boolean.valueOf(blockstate.getFluidState().getType() == Fluids.WATER));
                serverLevel.setBlockAndUpdate(blockpos, blockstate1);
            }

        }
    }
}
