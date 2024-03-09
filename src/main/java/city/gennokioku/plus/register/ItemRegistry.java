package city.gennokioku.plus.register;

import city.gennokioku.plus.util.RegistryKey;
import city.gennokioku.plus.util.Util;
import city.gennokioku.plus.item.RailwayTransit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * 本类用于注册所有物品项目
 * 对于方块，在注册最后放入指定创造模式物品栏
 * 所有物品和方块已 static，从上到下按顺序注册
 * 按创造模式物品栏前后顺序注册
 * */

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Util.MODID);
    //统一定义创造模式物品栏
    public static final ItemGroup METROFACILITIES = CreativeTabRegistry.METROFACILITIES;
    public static final ItemGroup METROLINES = CreativeTabRegistry.METROLINES;
    public static final ItemGroup NATURE = CreativeTabRegistry.NATURE;

    //注册 轨道交通设施
    public static final RegistryObject<Item> railway_transit = ITEMS.register("railway_transit", RailwayTransit::new);
    public static final RegistryObject<Item> light_box_dark = ITEMS.register(RegistryKey.LIGHT_BOX_DARK, () -> new BlockItem(BlockRegistry.light_box_dark.get(), new Item.Properties().group(METROFACILITIES)));
    public static final RegistryObject<Item> light_box_light = ITEMS.register(RegistryKey.LIGHT_BOX_LIGHT, () -> new BlockItem(BlockRegistry.light_box_light.get(), new Item.Properties().group(METROFACILITIES)));

    //注册 轨道交通色块
    public static final RegistryObject<Item> line_1 = ITEMS.register(RegistryKey.LINE_1, () -> new BlockItem(BlockRegistry.line_1.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_2 = ITEMS.register(RegistryKey.LINE_2, () -> new BlockItem(BlockRegistry.line_2.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_3 = ITEMS.register(RegistryKey.LINE_3, () -> new BlockItem(BlockRegistry.line_3.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_4 = ITEMS.register(RegistryKey.LINE_4, () -> new BlockItem(BlockRegistry.line_4.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_5 = ITEMS.register(RegistryKey.LINE_5, () -> new BlockItem(BlockRegistry.line_5.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_6 = ITEMS.register(RegistryKey.LINE_6, () -> new BlockItem(BlockRegistry.line_6.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_7 = ITEMS.register(RegistryKey.LINE_7, () -> new BlockItem(BlockRegistry.line_7.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_8 = ITEMS.register(RegistryKey.LINE_8, () -> new BlockItem(BlockRegistry.line_8.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_9 = ITEMS.register(RegistryKey.LINE_9, () -> new BlockItem(BlockRegistry.line_9.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_10 = ITEMS.register(RegistryKey.LINE_10, () -> new BlockItem(BlockRegistry.line_10.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_11 = ITEMS.register(RegistryKey.LINE_11, () -> new BlockItem(BlockRegistry.line_11.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_12 = ITEMS.register(RegistryKey.LINE_12, () -> new BlockItem(BlockRegistry.line_12.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_13 = ITEMS.register(RegistryKey.LINE_13, () -> new BlockItem(BlockRegistry.line_13.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_15 = ITEMS.register(RegistryKey.LINE_15, () -> new BlockItem(BlockRegistry.line_15.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_16 = ITEMS.register(RegistryKey.LINE_16, () -> new BlockItem(BlockRegistry.line_16.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_17 = ITEMS.register(RegistryKey.LINE_17, () -> new BlockItem(BlockRegistry.line_17.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_18 = ITEMS.register(RegistryKey.LINE_18, () -> new BlockItem(BlockRegistry.line_18.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_20 = ITEMS.register(RegistryKey.LINE_20, () -> new BlockItem(BlockRegistry.line_20.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_21 = ITEMS.register(RegistryKey.LINE_21, () -> new BlockItem(BlockRegistry.line_21.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_24 = ITEMS.register(RegistryKey.LINE_24, () -> new BlockItem(BlockRegistry.line_24.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_25 = ITEMS.register(RegistryKey.LINE_25, () -> new BlockItem(BlockRegistry.line_25.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_s1 = ITEMS.register(RegistryKey.LINE_S1, () -> new BlockItem(BlockRegistry.line_s1.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_s2 = ITEMS.register(RegistryKey.LINE_S2, () -> new BlockItem(BlockRegistry.line_s2.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_s3 = ITEMS.register(RegistryKey.LINE_S3, () -> new BlockItem(BlockRegistry.line_s3.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_s4 = ITEMS.register(RegistryKey.LINE_S4, () -> new BlockItem(BlockRegistry.line_s4.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_ll = ITEMS.register(RegistryKey.LINE_LL, () -> new BlockItem(BlockRegistry.line_ll.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_mn_ms = ITEMS.register(RegistryKey.LINE_MN_MS, () -> new BlockItem(BlockRegistry.line_mn_ms.get(), new Item.Properties().group(METROLINES)));
    public static final RegistryObject<Item> line_c5 = ITEMS.register(RegistryKey.LINE_C5, () -> new BlockItem(BlockRegistry.line_c5.get(), new Item.Properties().group(METROLINES)));

    //注册 自然
    public static final RegistryObject<Item> basalt = ITEMS.register(RegistryKey.BASALT, () -> new BlockItem(BlockRegistry.basalt.get(), new Item.Properties().group(NATURE)));
    public static final RegistryObject<Item> basalt_brick = ITEMS.register(RegistryKey.BASALT_BRICK, () -> new BlockItem(BlockRegistry.basalt_brick.get(), new Item.Properties().group(NATURE)));
    public static final RegistryObject<Item> basalt_circle = ITEMS.register(RegistryKey.BASALT_CIRCLE, () -> new BlockItem(BlockRegistry.basalt_circle.get(), new Item.Properties().group(NATURE)));
    public static final RegistryObject<Item> dirt_way = ITEMS.register(RegistryKey.DIRT_WAY, () -> new BlockItem(BlockRegistry.dirt_way.get(), new Item.Properties().group(NATURE)));
    public static final RegistryObject<Item> dirt_way_grey = ITEMS.register(RegistryKey.DIRT_WAY_GREY, () -> new BlockItem(BlockRegistry.dirt_way_grey.get(), new Item.Properties().group(NATURE)));

}
