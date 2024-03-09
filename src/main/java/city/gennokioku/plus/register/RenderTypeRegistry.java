package city.gennokioku.plus.register;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RenderTypeRegistry {
    @SubscribeEvent
    public static void onRenderTypeSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            //添加需要透明的方块
            RenderTypeLookup.setRenderLayer(BlockRegistry.screen_door_full_glass.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockRegistry.screen_door_full_glass_terminus.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockRegistry.screen_door_full_left.get(), RenderType.getCutout());
            RenderTypeLookup.setRenderLayer(BlockRegistry.screen_door_full_right.get(), RenderType.getCutout());
        });
    }
}
