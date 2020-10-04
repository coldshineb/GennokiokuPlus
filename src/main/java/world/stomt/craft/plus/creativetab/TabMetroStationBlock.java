
package world.stomt.craft.plus.creativetab;

import world.stomt.craft.plus.item.ItemRailwayTransit;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabMetroStationBlock extends ElementsStomtcraftplusMod.ModElement {
	public TabMetroStationBlock(ElementsStomtcraftplusMod instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmetro_station_block") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemRailwayTransit.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}