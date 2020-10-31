
package world.stomt.craft.plus.creativetab;

import world.stomt.craft.plus.block.BlockDirtWay;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabNature extends ElementsStomtcraftplusMod.ModElement {
	public TabNature(ElementsStomtcraftplusMod instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnature") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockDirtWay.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
