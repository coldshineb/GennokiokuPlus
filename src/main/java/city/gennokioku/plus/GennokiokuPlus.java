package city.gennokioku.plus;

import city.gennokioku.plus.register.BlockRegistry;
import city.gennokioku.plus.register.ItemRegistry;
import city.gennokioku.plus.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Util.MODID)
public class GennokiokuPlus {
    public GennokiokuPlus(){
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
