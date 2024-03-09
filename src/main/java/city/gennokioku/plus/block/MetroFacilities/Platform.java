package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Platform {
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
    }

    public static class PlatformLeft2 extends Block {
        public PlatformLeft2() {
            super(getBlockProperties());
        }
    }

    public static class PlatformRight1 extends Block {
        public PlatformRight1() {
            super(getBlockProperties());
        }
    }

    public static class PlatformRight2 extends Block {
        public PlatformRight2() {
            super(getBlockProperties());
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
