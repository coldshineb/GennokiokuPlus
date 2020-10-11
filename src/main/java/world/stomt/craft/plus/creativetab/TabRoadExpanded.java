
package world.stomt.craft.plus.creativetab;

import world.stomt.craft.plus.block.BlockRoadObliqueArrow;
import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsStomtcraftplusMod.ModElement.Tag
public class TabRoadExpanded extends ElementsStomtcraftplusMod.ModElement {
	public TabRoadExpanded(ElementsStomtcraftplusMod instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabroad_expanded") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockRoadObliqueArrow.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
