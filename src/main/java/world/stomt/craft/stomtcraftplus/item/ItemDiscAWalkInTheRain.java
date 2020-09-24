
package world.stomt.craft.stomtcraftplus.item;

import world.stomt.craft.stomtcraftplus.util.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsStomtcraftplusMod.ModElement.Tag
public class ItemDiscAWalkInTheRain extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:disc_a_walk_in_the_rain")
	public static final Item block = null;
	public ItemDiscAWalkInTheRain(ElementsStomtcraftplusMod instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:disc_a_walk_in_the_rain", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("disc_a_walk_in_the_rain", ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:a_walk_in_the_rain")));
			setTranslationKey("disc_a_walk_in_the_rain");
			setRegistryName("disc_a_walk_in_the_rain");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
