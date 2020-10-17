
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
public class ItemTunajueXxing extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:tunajue_xing")
	public static final Item block = null;
	public ItemTunajueXxing(ElementsStomtcraftplusMod instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:tunajue_xing", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("tunajue_xing", ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:tunajue_xing")));
			setUnlocalizedName("tunajue_xing");
			setRegistryName("tunajue_xing");
			setCreativeTab(TabMusife.tab);
		}
	}
}