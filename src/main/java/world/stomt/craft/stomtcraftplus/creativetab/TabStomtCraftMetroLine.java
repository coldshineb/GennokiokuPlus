
package world.stomt.craft.stomtcraftplus.creativetab;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import world.stomt.craft.stomtcraftplus.item.ItemRailwayTransit;
import world.stomt.craft.stomtcraftplus.util.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabStomtCraftMetroLine extends ElementsStomtcraftplusMod.ModElement {
	public TabStomtCraftMetroLine(ElementsStomtcraftplusMod instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabstomtcraftmetroline") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack createIcon() {
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
