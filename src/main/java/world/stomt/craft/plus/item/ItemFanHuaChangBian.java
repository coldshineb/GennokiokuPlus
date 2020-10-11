
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
public class ItemFanHuaChangBian extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:fan_hua_chang_bian")
	public static final Item block = null;
	public ItemFanHuaChangBian(ElementsStomtcraftplusMod instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:fan_hua_chang_bian", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("fan_hua_chang_bian", ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:fan_hua_chang_bian_luo")));
			setUnlocalizedName("fan_hua_chang_bian");
			setRegistryName("fan_hua_chang_bian");
			setCreativeTab(TabMusife.tab);
		}
	}
}
