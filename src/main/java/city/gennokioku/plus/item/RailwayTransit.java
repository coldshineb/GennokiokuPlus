package city.gennokioku.plus.item;

import city.gennokioku.plus.register.CreativeTabRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RailwayTransit extends Item {
    public RailwayTransit() {
        super(new Properties().group(CreativeTabRegistry.METROFACILITIES));
    }
}
