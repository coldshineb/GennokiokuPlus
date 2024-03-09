package city.gennokioku.plus.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/*
 * 自然 方块
 *
 * */

public class Nature {
    public static class BasaltBlock extends Block {
        public BasaltBlock() {
            super(getBlockProperties());
        }
    }

    public static class BasaltBrickBlock extends Block {
        public BasaltBrickBlock() {
            super(getBlockProperties());
        }
    }

    public static class BasaltCircleBlock extends Block {
        public BasaltCircleBlock() {
            super(getBlockProperties());
        }
    }

    public static class DirtWayBlock extends Block {
        public DirtWayBlock() {
            super(getBlockProperties());
        }
    }

    public static class DirtWayGreyBlock extends Block {
        public DirtWayGreyBlock() {
            super(getBlockProperties());
        }
    }

    // 所有自然 方块具有相同的属性，新方法用于返回相同的 AbstractBlock.Properties 对象
    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0);
    }
}
