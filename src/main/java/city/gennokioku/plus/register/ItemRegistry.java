package city.gennokioku.plus.register;

import city.gennokioku.plus.util.RegistryKey;
import city.gennokioku.plus.util.Util;
import city.gennokioku.plus.item.RailwayTransit;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * 本类用于注册所有物品项目
 * 对于方块，在注册最后放入指定创造模式物品栏
 * */

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Util.MODID);
    //注册 轨道交通设施
    public static final RegistryObject<Item> railway_transit = ITEMS.register("railway_transit", RailwayTransit::new);
    //注册 轨道交通色块
    public static final RegistryObject<Item> line_1 = ITEMS.register(RegistryKey.LINE_1, () -> new BlockItem(BlockRegistry.line_1.get(), new Item.Properties().group(CreativeTabRegistry.METROLINES)));
}
