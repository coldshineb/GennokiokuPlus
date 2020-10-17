
package world.stomt.craft.plus.creativetab;

import world.stomt.craft.plus.item.ItemStomtCraft;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabMisc extends ElementsStomtcraftplusMod.ModElement {
	public TabMisc(ElementsStomtcraftplusMod instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmisc") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemStomtCraft.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
