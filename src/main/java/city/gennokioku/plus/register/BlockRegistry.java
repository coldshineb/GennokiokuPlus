package city.gennokioku.plus.register;

import city.gennokioku.plus.block.Nature;
import city.gennokioku.plus.util.RegistryKey;
import city.gennokioku.plus.util.Util;
import city.gennokioku.plus.block.MetroLines;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * 本类用于注册所有方块项目
 *
 * */

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Util.MODID);
    public static final RegistryObject<Block> line_1 = BLOCKS.register(RegistryKey.LINE_1, MetroLines.Line1::new);
    public static final RegistryObject<Block> line_2 = BLOCKS.register(RegistryKey.LINE_2, MetroLines.Line2::new);
    public static final RegistryObject<Block> line_3 = BLOCKS.register(RegistryKey.LINE_3, MetroLines.Line3::new);
    public static final RegistryObject<Block> line_4 = BLOCKS.register(RegistryKey.LINE_4, MetroLines.Line4::new);
    public static final RegistryObject<Block> line_5 = BLOCKS.register(RegistryKey.LINE_5, MetroLines.Line5::new);
    public static final RegistryObject<Block> line_6 = BLOCKS.register(RegistryKey.LINE_6, MetroLines.Line6::new);
    public static final RegistryObject<Block> line_7 = BLOCKS.register(RegistryKey.LINE_7, MetroLines.Line7::new);
    public static final RegistryObject<Block> line_8 = BLOCKS.register(RegistryKey.LINE_8, MetroLines.Line8::new);
    public static final RegistryObject<Block> line_9 = BLOCKS.register(RegistryKey.LINE_9, MetroLines.Line9::new);
    public static final RegistryObject<Block> line_10 = BLOCKS.register(RegistryKey.LINE_10, MetroLines.Line10::new);
    public static final RegistryObject<Block> line_11 = BLOCKS.register(RegistryKey.LINE_11, MetroLines.Line11::new);
    public static final RegistryObject<Block> line_12 = BLOCKS.register(RegistryKey.LINE_12, MetroLines.Line12::new);
    public static final RegistryObject<Block> line_13 = BLOCKS.register(RegistryKey.LINE_13, MetroLines.Line13::new);
    public static final RegistryObject<Block> line_15 = BLOCKS.register(RegistryKey.LINE_15, MetroLines.Line15::new);
    public static final RegistryObject<Block> line_16 = BLOCKS.register(RegistryKey.LINE_16, MetroLines.Line16::new);
    public static final RegistryObject<Block> line_17 = BLOCKS.register(RegistryKey.LINE_17, MetroLines.Line17::new);
    public static final RegistryObject<Block> line_18 = BLOCKS.register(RegistryKey.LINE_18, MetroLines.Line18::new);
    public static final RegistryObject<Block> line_20 = BLOCKS.register(RegistryKey.LINE_20, MetroLines.Line20::new);
    public static final RegistryObject<Block> line_21 = BLOCKS.register(RegistryKey.LINE_21, MetroLines.Line21::new);
    public static final RegistryObject<Block> line_24 = BLOCKS.register(RegistryKey.LINE_24, MetroLines.Line24::new);
    public static final RegistryObject<Block> line_25 = BLOCKS.register(RegistryKey.LINE_25, MetroLines.Line25::new);
    public static final RegistryObject<Block> line_s1 = BLOCKS.register(RegistryKey.LINE_S1, MetroLines.LineS1::new);
    public static final RegistryObject<Block> line_s2 = BLOCKS.register(RegistryKey.LINE_S2, MetroLines.LineS2::new);
    public static final RegistryObject<Block> line_s3 = BLOCKS.register(RegistryKey.LINE_S3, MetroLines.LineS3::new);
    public static final RegistryObject<Block> line_s4 = BLOCKS.register(RegistryKey.LINE_S4, MetroLines.LineS4::new);
    public static final RegistryObject<Block> line_ll = BLOCKS.register(RegistryKey.LINE_LL, MetroLines.LineLL::new);
    public static final RegistryObject<Block> line_mn_ms = BLOCKS.register(RegistryKey.LINE_MN_MS, MetroLines.LineMNMS::new);
    public static final RegistryObject<Block> line_c5 = BLOCKS.register(RegistryKey.LINE_C5, MetroLines.LineC5::new);
    public static final RegistryObject<Block> basalt = BLOCKS.register(RegistryKey.BASALT, Nature.BasaltBlock::new);
    public static final RegistryObject<Block> basalt_brick = BLOCKS.register(RegistryKey.BASALT_BRICK, Nature.BasaltBrickBlock::new);
    public static final RegistryObject<Block> basalt_circle = BLOCKS.register(RegistryKey.BASALT_CIRCLE, Nature.BasaltCircleBlock::new);
    public static final RegistryObject<Block> dirt_way = BLOCKS.register(RegistryKey.DIRT_WAY, Nature.DirtWayBlock::new);
    public static final RegistryObject<Block> dirt_way_grey = BLOCKS.register(RegistryKey.DIRT_WAY_GREY, Nature.DirtWayGreyBlock::new);
}
