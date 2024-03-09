package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;

public class Platform {

    public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    //站台方块 站台边缘
    public static class PlatformBlock extends Block {
        public PlatformBlock() {
            super(getBlockProperties());
        }
    }

    public static class PlatformLeft1 extends Block {
        public PlatformLeft1() {
            super(getBlockProperties());
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

    public static class PlatformLeft2 extends Block {
        public PlatformLeft2() {
            super(getBlockProperties());
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

    public static class PlatformRight1 extends Block {
        public PlatformRight1() {
            super(getBlockProperties());
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

    public static class PlatformRight2 extends Block {
        public PlatformRight2() {
            super(getBlockProperties());
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

    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0);
    }
}
