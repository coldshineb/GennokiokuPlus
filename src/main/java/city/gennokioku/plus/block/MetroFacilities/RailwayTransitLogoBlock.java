package city.gennokioku.plus.block.MetroFacilities;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RailwayTransitLogoBlock {
    public static class RailwayTransitLogoBlockImpl extends Block {
        public RailwayTransitLogoBlockImpl() {
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
