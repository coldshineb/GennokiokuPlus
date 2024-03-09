package city.gennokioku.plus.item;

import city.gennokioku.plus.register.CreativeTabRegistry;
import net.minecraft.item.Item;

public class Items {
    public static class Gennokioku extends Item {
        public Gennokioku() {
            super(new Properties().group(CreativeTabRegistry.METROFACILITIES));
        }
    }

    public static class RailwayTransit extends Item {
        public RailwayTransit() {
            super(new Properties().group(CreativeTabRegistry.METROFACILITIES));
        }
    }

    public static class Shouhutong extends Item {
        public Shouhutong() {
            super(new Properties().group(CreativeTabRegistry.METROFACILITIES));
        }
    }

    public static class OneWayTicket extends Item {
        public OneWayTicket() {
            super(new Properties().group(CreativeTabRegistry.METROFACILITIES));
        }
    }
}
