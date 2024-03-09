package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import static net.minecraft.block.Block.makeCuboidShape;

public class ScreenDoorCover {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
    //屏蔽门盖板（暗）（2格）
    public static class ScreenDoorCoverDark extends Block {

        public ScreenDoorCoverDark() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorCover2VoxelShape(state, world, pos);
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }
    }
    //屏蔽门盖板（亮）（2格）
    public static class ScreenDoorCoverLight extends Block {

        public ScreenDoorCoverLight() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorCover2VoxelShape(state, world, pos);
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }
    }
    //屏蔽门盖板（暗）（3格）
    public static class ScreenDoorCoverDark3 extends Block {

        public ScreenDoorCoverDark3() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorCover3VoxelShape(state, world, pos);
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }
    }
    //屏蔽门盖板（亮）（3格）
    public static class ScreenDoorCoverLight3 extends Block {

        public ScreenDoorCoverLight3() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorCover3VoxelShape(state, world, pos);
        }

        @Override
        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(FACING);
        }

        @Override
        public BlockState getStateForPlacement(BlockItemUseContext context) {
            return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
        }

        public BlockState rotate(BlockState state, Rotation rot) {
            return state.with(FACING, rot.rotate(state.get(FACING)));
        }

        public BlockState mirror(BlockState state, Mirror mirrorIn) {
            return state.rotate(mirrorIn.toRotation(state.get(FACING)));
        }
    }

    private static VoxelShape getScreenDoorCover3VoxelShape(BlockState state, IBlockReader world, BlockPos pos) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case SOUTH:
            default:
                return VoxelShapes.or(makeCuboidShape(32, 0, 10, -16, 16, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case NORTH:
                return VoxelShapes.or(makeCuboidShape(-16, 0, 6, 32, 16, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case EAST:
                return VoxelShapes.or(makeCuboidShape(10, 0, -16, 8, 16, 32))

                        .withOffset(offset.x, offset.y, offset.z);
            case WEST:
                return VoxelShapes.or(makeCuboidShape(6, 0, 32, 8, 16, -16))

                        .withOffset(offset.x, offset.y, offset.z);
        }
    }

    private static VoxelShape getScreenDoorCover2VoxelShape(BlockState state, IBlockReader world, BlockPos pos) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case SOUTH:
            default:
                return VoxelShapes.or(makeCuboidShape(16, 0, 10, -16, 16, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case NORTH:
                return VoxelShapes.or(makeCuboidShape(0, 0, 6, 32, 16, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case EAST:
                return VoxelShapes.or(makeCuboidShape(10, 0, 0, 8, 16, 32))

                        .withOffset(offset.x, offset.y, offset.z);
            case WEST:
                return VoxelShapes.or(makeCuboidShape(6, 0, 16, 8, 16, -16))

                        .withOffset(offset.x, offset.y, offset.z);
        }
    }

    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0)
                .notSolid()
                .setOpaque((bs, br, bp) -> false);
    }
}
