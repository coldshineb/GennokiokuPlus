
package world.stomt.craft.stomtcraftplus.creativetab;

import world.stomt.craft.stomtcraftplus.item.ItemRailwayTransit;
import world.stomt.craft.stomtcraftplus.ElementsStomtCraftPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtCraftPlusMod.ModElement.Tag
public class TabStomtCraftMetroLine extends ElementsStomtCraftPlusMod.ModElement {
	public TabStomtCraftMetroLine(ElementsStomtCraftPlusMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstomtcraftmetroline") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRailwayTransit.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
