package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.SoundType;
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

public class LightBoxEntrance {
    //出入口盖板
    public static class LightBoxEntranceImpl extends Block {

        public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

        public LightBoxEntranceImpl() {
            super(Properties
                    .create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1f, 10f)
                    .setLightLevel(s -> 0)
                    .notSolid()
                    .setOpaque((bs, br, bp) -> false));
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            Vector3d offset = state.getOffset(world, pos);
            switch ((Direction) state.get(FACING)) {
                case SOUTH:
                case NORTH:
                default:
                    return VoxelShapes.or(makeCuboidShape(0, 0, 6, 16, 16, 10))

                            .withOffset(offset.x, offset.y, offset.z);
                case EAST:
                case WEST:
                    return VoxelShapes.or(makeCuboidShape(6, 0, 0, 10, 16, 16))

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

}
