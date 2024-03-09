package city.gennokioku.plus.block.metrolines.numberslines;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Line1 extends Block {
    public Line1() {
        super(Block.Properties
                .create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1f, 10f)
                .setLightLevel(s -> 0));
    }
}
