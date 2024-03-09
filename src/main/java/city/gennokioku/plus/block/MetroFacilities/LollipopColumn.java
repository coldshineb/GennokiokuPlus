package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

import static net.minecraft.block.Block.makeCuboidShape;

public class LollipopColumn {
    //灯箱悬挂立柱
    public static class LollipopColumnInside extends Block {

        public LollipopColumnInside() {
            super(getBlockProperties());
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getVoxelShape(state, world, pos);
        }
    }
    //出入口立柱
    public static class LollipopColumnEntrance extends Block {

        public LollipopColumnEntrance() {
            super(getBlockProperties());
        }

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
            return getVoxelShape(state, world, pos);
        }
    }

    private static VoxelShape getVoxelShape(BlockState state, IBlockReader world, BlockPos pos) {
        Vector3d offset = state.getOffset(world, pos);
        return VoxelShapes.or(makeCuboidShape(6, 0, 6, 10, 16, 10))
                .withOffset(offset.x, offset.y, offset.z);
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
