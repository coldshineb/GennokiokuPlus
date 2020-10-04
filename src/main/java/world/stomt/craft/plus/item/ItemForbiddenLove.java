
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
public class ItemForbiddenLove extends ElementsStomtcraftplusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:forbidden_love")
	public static final Item block = null;
	public ItemForbiddenLove(ElementsStomtcraftplusMod instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stomtcraftplus:forbidden_love", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("forbidden_love", ElementsStomtcraftplusMod.sounds.get(new ResourceLocation("stomtcraftplus:forbidden_love")));
			setUnlocalizedName("forbidden_love");
			setRegistryName("forbidden_love");
			setCreativeTab(TabMusife.tab);
		}
	}
}