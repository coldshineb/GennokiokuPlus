package city.gennokioku.plus.creativetab;

import city.gennokioku.plus.register.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MetroLines extends ItemGroup {

    public MetroLines() {
        super("metro_lines");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.railway_transit.get());
    }
}
