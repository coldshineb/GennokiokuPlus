package world.stomt.craft.stomtcraftplus.util;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.resources.I18n;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.Display;
import world.stomt.craft.stomtcraftplus.feature.IconLoader;
import world.stomt.craft.stomtcraftplus.feature.Info;
import world.stomt.craft.stomtcraftplus.feature.TitleScreen;

import java.io.File;
import java.nio.file.Paths;
import java.util.Random;

@ElementsStomtcraftplusMod.ModElement.Tag
public class Stomtlize extends ElementsStomtcraftplusMod.ModElement {
	@SideOnly(Side.CLIENT)
	public static Logger logger;
	/**
	 * Do not remove this constructor
	 */
	public Stomtlize(ElementsStomtcraftplusMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void preInit(FMLPreInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(LoadTitleScreen.instance());
		setTitle();//改标题
		logger = event.getModLog();
		File di = Paths.get(event.getModConfigurationDirectory().getAbsolutePath(), "stomtcraft").toFile();
		File icon = Paths.get(di.getAbsolutePath(), "icon.png").toFile();
		if (icon.exists() && !icon.isDirectory()) {
			Display.setIcon(IconLoader.load(icon));
		} else {
			logger.error(I18n.format("logger.verifyfailed"));
		}//设置图标
	}
	@SideOnly(Side.CLIENT)
	private void setTitle() {
		Display.setTitle(Info.TITLE);
	}

	@Override
	public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
	}

	@Override
	public void registerModels(ModelRegistryEvent event) {
	}
}
