package net.aradoryin.battlemage.block.custom.cluster;

import net.aradoryin.battlemage.block.custom.block.OpalBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class OpalClusterBlock extends OpalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    protected final VoxelShape northAabb;
    protected final VoxelShape southAabb;
    protected final VoxelShape eastAabb;
    protected final VoxelShape westAabb;
    protected final VoxelShape upAabb;
    protected final VoxelShape downAabb;

    public OpalClusterBlock(int i, int i1, Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.valueOf(false)).setValue(FACING, Direction.UP));
        this.upAabb = Block.box(i1, 0.0D, i1, (16 - i1), i, (16 - i1));
        this.downAabb = Block.box(i1, (16 - i), i1, (16 - i1), 16.0D, (16 - i1));
        this.northAabb = Block.box(i1, i1, (16 - i), (16 - i1), (16 - i1), 16.0D);
        this.southAabb = Block.box(i1, i1, 0.0D, (16 - i1), (16 - i1), i);
        this.eastAabb = Block.box(0.0D, i1, i1, i, (16 - i1), (16 - i1));
        this.westAabb = Block.box((16 - i), i1, i1, 16.0D, (16 - i1), (16 - i1));
    }

    public VoxelShape min(BlockState blockState) {
        Direction direction = blockState.getValue(FACING);
        switch (direction) {
            case NORTH: return this.northAabb;
            case SOUTH: return this.southAabb;
            case EAST: return this.eastAabb;
            case WEST: return this.westAabb;
            case DOWN: return this.downAabb;
            case UP: return this.upAabb;
            default: return null;
        }
    }

    /**
     * @deprecated This method will be altered in the future once a better match is found.
     */
    @Override
    @Deprecated(forRemoval = true)
    public boolean canSurvive(BlockState blockState, LevelReader levelReader, BlockPos blockPos) {
        Direction direction = blockState.getValue(FACING);
        BlockPos blockpos = blockPos.relative(direction.getOpposite());
        return levelReader.getBlockState(blockpos).isFaceSturdy(levelReader, blockpos, direction);
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        LevelAccessor levelaccessor = blockPlaceContext.getLevel();
        BlockPos blockpos = blockPlaceContext.getClickedPos();
        return this.defaultBlockState().setValue(WATERLOGGED,
                Boolean.valueOf(levelaccessor.getFluidState(blockpos).getType() == Fluids.WATER)).setValue(FACING, blockPlaceContext.getClickedFace());
    }

    /**
     * @deprecated This method will be altered in the future once a better match is found.
     */
    @Override
    @Deprecated(forRemoval = true)
    public BlockState rotate(BlockState blockState, Rotation rotation) {
        return blockState.setValue(FACING, rotation.rotate(blockState.getValue(FACING)));
    }

    /**
     * @deprecated This method will be altered in the future once a better match is found.
     */
    @Override
    @Deprecated(forRemoval = true)
    public BlockState mirror(BlockState blockState, Mirror mirror) {
        return blockState.rotate(mirror.getRotation(blockState.getValue(FACING)));
    }

    public FluidState is(BlockState blockState) {
        return blockState.getFluidState().isSourceOfType(Fluids.WATER) ? Fluids.WATER.getSource(true) : super.defaultBlockState().getFluidState();
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) { builder.add(WATERLOGGED, FACING); }

    public PushReaction getPistonPushReaction() { return PushReaction.DESTROY; }

}
