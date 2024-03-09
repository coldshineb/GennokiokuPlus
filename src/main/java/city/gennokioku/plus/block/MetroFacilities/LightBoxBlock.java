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

public class LightBoxBlock {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    public static class LightBoxDarkBlock extends Block {

        public LightBoxDarkBlock() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getVoxelShape(state, world, pos);
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
    public static class LightBoxLightBlock extends Block {

        public LightBoxLightBlock() {
            super(getBlockProperties());
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getVoxelShape(state, world, pos);
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

    private static VoxelShape getVoxelShape(BlockState state, IBlockReader world, BlockPos pos) {
        Vector3d offset = state.getOffset(world, pos);
        switch ((Direction) state.get(FACING)) {
            case SOUTH:
            default:
                return VoxelShapes.or(makeCuboidShape(16, 0, 11.008, 0, 16, 5.008))

                        .withOffset(offset.x, offset.y, offset.z);
            case NORTH:
                return VoxelShapes.or(makeCuboidShape(0, 0, 4.992, 16, 16, 10.992))

                        .withOffset(offset.x, offset.y, offset.z);
            case EAST:
                return VoxelShapes.or(makeCuboidShape(11.008, 0, 0, 5.008, 16, 16))

                        .withOffset(offset.x, offset.y, offset.z);
            case WEST:
                return VoxelShapes.or(makeCuboidShape(4.992, 0, 16, 10.992, 16, 0))

                        .withOffset(offset.x, offset.y, offset.z);
        }
    }

    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 15)
                .notSolid()
                .setOpaque((bs, br, bp) -> false);
    }
}
