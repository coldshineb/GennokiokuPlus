package world.stomt.craft.stomtcraftplus.util;

import net.minecraft.client.gui.GuiMainMenu;
import net.minecraftforge.client.event.GuiOpenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import world.stomt.craft.stomtcraftplus.feature.TitleScreen;

@SideOnly(Side.CLIENT)
public class LoadTitleScreen {

    private static LoadTitleScreen instance;
    public static LoadTitleScreen instance() {
        if(instance == null) instance = new LoadTitleScreen();
        return instance;
    }

    @SubscribeEvent
    public void onOpenGUI(GuiOpenEvent event) {
        if(event.getGui() instanceof GuiMainMenu) {
            event.setGui(new TitleScreen());
        }
    }
}
