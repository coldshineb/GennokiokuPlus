
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
public class ItemShengCunZaiMaoXian extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:sheng_cun_zai_mao_xian")
	public static final Item block = null;
	public ItemShengCunZaiMaoXian(ElementsStomtcraftplusMod instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:sheng_cun_zai_mao_xian", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("sheng_cun_zai_mao_xian", ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:sheng_cun_zai_mao_xian")));
			setUnlocalizedName("sheng_cun_zai_mao_xian");
			setRegistryName("sheng_cun_zai_mao_xian");
			setCreativeTab(TabMusife.tab);
		}
	}
}
