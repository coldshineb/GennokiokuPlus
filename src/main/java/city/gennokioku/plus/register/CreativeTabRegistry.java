package city.gennokioku.plus.register;

import city.gennokioku.plus.creativetab.MetroFacilities;
import city.gennokioku.plus.creativetab.MetroLines;
import net.minecraft.item.ItemGroup;

/*
* 本类用于注册所有创造模式物品栏项目
* 注册顺序从上到下
* */

public class CreativeTabRegistry {
    public static final ItemGroup METROLINES = new MetroLines();
    public static final ItemGroup METROFACILITIES = new MetroFacilities();
}
