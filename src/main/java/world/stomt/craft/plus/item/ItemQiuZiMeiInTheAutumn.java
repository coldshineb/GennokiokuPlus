
package world.stomt.craft.plus.item;

import world.stomt.craft.plus.creativetab.TabMusife;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@ElementsStomtcraftplusMod.ModElement.Tag
public class ItemQiuZiMeiInTheAutumn extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:qiu_zi_mei_in_the_autumn")
	public static final Item block = null;
	public ItemQiuZiMeiInTheAutumn(ElementsStomtcraftplusMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:qiu_zi_mei_in_the_autumn", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("qiu_zi_mei_in_the_autumn",
					ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:qiu_zi_mei_nonakuqing_ni_in_the_autumn_sky")));
			setUnlocalizedName("qiu_zi_mei_in_the_autumn");
			setRegistryName("qiu_zi_mei_in_the_autumn");
			setCreativeTab(TabMusife.tab);
		}
	}
}
