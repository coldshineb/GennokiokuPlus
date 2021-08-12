
package world.stomt.craft.plus.itemgroup;

import world.stomt.craft.plus.item.RailwayTransitItem;
import world.stomt.craft.plus.StomtcraftplusModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@StomtcraftplusModElements.ModElement.Tag
public class MetroStationBlockItemGroup extends StomtcraftplusModElements.ModElement {
	public MetroStationBlockItemGroup(StomtcraftplusModElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmetro_station_block") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RailwayTransitItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
