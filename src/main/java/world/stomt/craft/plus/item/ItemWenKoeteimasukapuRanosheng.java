
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
public class ItemWenKoeteimasukapuRanosheng extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:wen_koeteimasukapu_ranosheng")
	public static final Item block = null;
	public ItemWenKoeteimasukapuRanosheng(ElementsStomtcraftplusMod instance) {
		super(instance, 40);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:wen_koeteimasukapu_ranosheng", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("wen_koeteimasukapu_ranosheng",
					ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:wen_koeteimasukapu_ranosheng")));
			setUnlocalizedName("wen_koeteimasukapu_ranosheng");
			setRegistryName("wen_koeteimasukapu_ranosheng");
			setCreativeTab(TabMusife.tab);
		}
	}
}
