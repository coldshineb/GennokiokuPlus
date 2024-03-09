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

public class ScreenDoor {
    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    //全高站台门
    public static class ScreenDoorFullGlass extends Block {

        public ScreenDoorFullGlass() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorFullGlassVoxelShape(state, world, pos);
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

    //全高站台门（终点）
    public static class ScreenDoorFullGlassTerminus extends Block {

        public ScreenDoorFullGlassTerminus() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getScreenDoorFullGlassVoxelShape(state, world, pos);
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

    //全高屏蔽门（右）
    public static class ScreenDoorFullRight extends Block {

        public ScreenDoorFullRight() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            Vector3d offset = state.getOffset(world, pos);
            switch ((Direction) state.get(FACING)) {
                case SOUTH:
                default:
                    return VoxelShapes
                            .or(makeCuboidShape(16, 2, 8, 1, 32, 7), makeCuboidShape(17, 0, 8, 16, 32, 7), makeCuboidShape(16, 0, 8, 1, 2, 7),
                                    makeCuboidShape(1, 0, 8, 0, 32, 7))

                            .withOffset(offset.x, offset.y, offset.z);
                case NORTH:
                    return VoxelShapes
                            .or(makeCuboidShape(0, 2, 8, 15, 32, 9), makeCuboidShape(-1, 0, 8, 0, 32, 9), makeCuboidShape(0, 0, 8, 15, 2, 9),
                                    makeCuboidShape(15, 0, 8, 16, 32, 9))

                            .withOffset(offset.x, offset.y, offset.z);
                case EAST:
                    return VoxelShapes
                            .or(makeCuboidShape(8, 2, 0, 7, 32, 15), makeCuboidShape(8, 0, -1, 7, 32, 0), makeCuboidShape(8, 0, 0, 7, 2, 15),
                                    makeCuboidShape(8, 0, 15, 7, 32, 16))

                            .withOffset(offset.x, offset.y, offset.z);
                case WEST:
                    return VoxelShapes
                            .or(makeCuboidShape(8, 2, 16, 9, 32, 1), makeCuboidShape(8, 0, 17, 9, 32, 16), makeCuboidShape(8, 0, 16, 9, 2, 1),
                                    makeCuboidShape(8, 0, 1, 9, 32, 0))

                            .withOffset(offset.x, offset.y, offset.z);
            }
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

    //全高屏蔽门（左）
    public static class ScreenDoorFullLeft extends Block {

        public ScreenDoorFullLeft() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            Vector3d offset = state.getOffset(world, pos);
            switch ((Direction) state.get(FACING)) {
                case SOUTH:
                default:
                    return VoxelShapes
                            .or(makeCuboidShape(15, 2, 8, 0, 32, 7), makeCuboidShape(16, 0, 8, 15, 32, 7), makeCuboidShape(15, 0, 8, 0, 2, 7),
                                    makeCuboidShape(0, 0, 8, -1, 32, 7))

                            .withOffset(offset.x, offset.y, offset.z);
                case NORTH:
                    return VoxelShapes
                            .or(makeCuboidShape(1, 2, 8, 16, 32, 9), makeCuboidShape(0, 0, 8, 1, 32, 9), makeCuboidShape(1, 0, 8, 16, 2, 9),
                                    makeCuboidShape(16, 0, 8, 17, 32, 9))

                            .withOffset(offset.x, offset.y, offset.z);
                case EAST:
                    return VoxelShapes
                            .or(makeCuboidShape(8, 2, 1, 7, 32, 16), makeCuboidShape(8, 0, 0, 7, 32, 1), makeCuboidShape(8, 0, 1, 7, 2, 16),
                                    makeCuboidShape(8, 0, 16, 7, 32, 17))

                            .withOffset(offset.x, offset.y, offset.z);
                case WEST:
                    return VoxelShapes
                            .or(makeCuboidShape(8, 2, 15, 9, 32, 0), makeCuboidShape(8, 0, 16, 9, 32, 15), makeCuboidShape(8, 0, 15, 9, 2, 0),
                                    makeCuboidShape(8, 0, 0, 9, 32, -1))

                            .withOffset(offset.x, offset.y, offset.z);
            }
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

    private static VoxelShape getScreenDoorFullGlassVoxelShape(BlockState state, IBlockReader world, BlockPos pos) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case SOUTH:
            default:
                return VoxelShapes.or(makeCuboidShape(16, 0, 9, 0, 32, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case NORTH:
                return VoxelShapes.or(makeCuboidShape(0, 0, 7, 16, 32, 8))

                        .withOffset(offset.x, offset.y, offset.z);
            case EAST:
                return VoxelShapes.or(makeCuboidShape(9, 0, 0, 8, 32, 16))

                        .withOffset(offset.x, offset.y, offset.z);
            case WEST:
                return VoxelShapes.or(makeCuboidShape(7, 0, 16, 8, 32, 0))

                        .withOffset(offset.x, offset.y, offset.z);
        }
    }

    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.GLASS)
                .sound(SoundType.GLASS)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0)
                .notSolid()
                .setOpaque((bs, br, bp) -> false);
    }
}
