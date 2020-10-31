
package world.stomt.craft.plus.creativetab;

import world.stomt.craft.plus.item.ItemDiscAWalkInTheRain;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabMusife extends ElementsStomtcraftplusMod.ModElement {
	public TabMusife(ElementsStomtcraftplusMod instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmusife") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemDiscAWalkInTheRain.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
