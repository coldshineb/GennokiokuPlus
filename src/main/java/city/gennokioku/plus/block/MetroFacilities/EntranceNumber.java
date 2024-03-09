package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EntranceNumber {
    //入口编号
    public static class EntranceNumberA extends Block {
        public EntranceNumberA() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberA1 extends Block {
        public EntranceNumberA1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberA2 extends Block {
        public EntranceNumberA2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberA3 extends Block {
        public EntranceNumberA3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberB extends Block {
        public EntranceNumberB() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberB1 extends Block {
        public EntranceNumberB1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberB2 extends Block {
        public EntranceNumberB2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberB3 extends Block {
        public EntranceNumberB3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberC extends Block {
        public EntranceNumberC() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberC1 extends Block {
        public EntranceNumberC1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberC2 extends Block {
        public EntranceNumberC2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberC3 extends Block {
        public EntranceNumberC3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberD extends Block {
        public EntranceNumberD() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberD1 extends Block {
        public EntranceNumberD1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberD2 extends Block {
        public EntranceNumberD2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberD3 extends Block {
        public EntranceNumberD3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberE extends Block {
        public EntranceNumberE() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberE1 extends Block {
        public EntranceNumberE1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberE2 extends Block {
        public EntranceNumberE2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberE3 extends Block {
        public EntranceNumberE3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberF extends Block {
        public EntranceNumberF() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberF1 extends Block {
        public EntranceNumberF1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberF2 extends Block {
        public EntranceNumberF2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberF3 extends Block {
        public EntranceNumberF3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberG extends Block {
        public EntranceNumberG() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberG1 extends Block {
        public EntranceNumberG1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberG2 extends Block {
        public EntranceNumberG2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberG3 extends Block {
        public EntranceNumberG3() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberH extends Block {
        public EntranceNumberH() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberH1 extends Block {
        public EntranceNumberH1() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberH2 extends Block {
        public EntranceNumberH2() {
            super(getBlockProperties());
        }
    }

    public static class EntranceNumberH3 extends Block {
        public EntranceNumberH3() {
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
