package city.gennokioku.plus.creativetab;

import city.gennokioku.plus.register.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Nature extends ItemGroup {

    public Nature() {
        super("nature");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.railway_transit.get());
    }
}
