package city.gennokioku.plus;

import city.gennokioku.plus.register.BlockRegistry;
import city.gennokioku.plus.register.ItemRegistry;
import city.gennokioku.plus.util.DiscordRPC.DiscordClient;
import city.gennokioku.plus.util.Util;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Util.MODID)
public class GennokiokuPlus {
    public GennokiokuPlus(){
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
    }
    private void doClientStuff(final FMLClientSetupEvent event) {
        //添加 DiscordRPC 状态
        DiscordClient discordClient = new DiscordClient();
        discordClient.updatePresence("Gennokioku","","Gennokioku");
    }
}
