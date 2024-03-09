package city.gennokioku.plus.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/*
 * 轨道交通色块 方块
 *
 * */

public class MetroLines {
    //数字线
    public static class Line1 extends Block {
        public Line1() {
            super(getBlockProperties());
        }
    }

    public static class Line2 extends Block {
        public Line2() {
            super(getBlockProperties());
        }
    }

    public static class Line3 extends Block {
        public Line3() {
            super(getBlockProperties());
        }
    }

    public static class Line4 extends Block {
        public Line4() {
            super(getBlockProperties());
        }
    }

    public static class Line5 extends Block {
        public Line5() {
            super(getBlockProperties());
        }
    }

    public static class Line6 extends Block {
        public Line6() {
            super(getBlockProperties());
        }
    }

    public static class Line7 extends Block {
        public Line7() {
            super(getBlockProperties());
        }
    }

    public static class Line8 extends Block {
        public Line8() {
            super(getBlockProperties());
        }
    }

    public static class Line9 extends Block {
        public Line9() {
            super(getBlockProperties());
        }
    }

    public static class Line10 extends Block {
        public Line10() {
            super(getBlockProperties());
        }
    }

    public static class Line11 extends Block {
        public Line11() {
            super(getBlockProperties());
        }
    }

    public static class Line12 extends Block {
        public Line12() {
            super(getBlockProperties());
        }
    }

    public static class Line13 extends Block {
        public Line13() {
            super(getBlockProperties());
        }
    }

    public static class Line15 extends Block {
        public Line15() {
            super(getBlockProperties());
        }
    }

    public static class Line16 extends Block {
        public Line16() {
            super(getBlockProperties());
        }
    }

    public static class Line17 extends Block {
        public Line17() {
            super(getBlockProperties());
        }
    }

    public static class Line18 extends Block {
        public Line18() {
            super(getBlockProperties());
        }
    }

    public static class Line20 extends Block {
        public Line20() {
            super(getBlockProperties());
        }
    }

    public static class Line21 extends Block {
        public Line21() {
            super(getBlockProperties());
        }
    }

    public static class Line24 extends Block {
        //aka LineLS 南城环线
        public Line24() {
            super(getBlockProperties());
        }
    }

    public static class Line25 extends Block {
        //aka LineLC 创新港环线
        public Line25() {
            super(getBlockProperties());
        }
    }
    //市域线
    public static class LineS1 extends Block {
        public LineS1() {
            super(getBlockProperties());
        }
    }

    public static class LineS2 extends Block {
        public LineS2() {
            super(getBlockProperties());
        }
    }

    public static class LineS3 extends Block {
        public LineS3() {
            super(getBlockProperties());
        }
    }

    public static class LineS4 extends Block {
        public LineS4() {
            super(getBlockProperties());
        }
    }
    //特殊线
    public static class LineLL extends Block {
        public LineLL() {
            super(getBlockProperties());
        }
    }

    public static class LineMNMS extends Block {
        public LineMNMS() {
            super(getBlockProperties());
        }
    }
    //云轨线
    public static class LineC5 extends Block {
        public LineC5() {
            super(getBlockProperties());
        }
    }


    // 所有轨道交通色块 方块具有相同的属性，新方法用于返回相同的 AbstractBlock.Properties 对象
    private static AbstractBlock.Properties getBlockProperties() {
        return AbstractBlock.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0);
    }
}
