
package city.gennokioku.plus.itemgroup;

import city.gennokioku.plus.GennokiokuPlusElements;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import city.gennokioku.plus.item.RailwayTransitItem;

@GennokiokuPlusElements.ModElement.Tag
public class MetroStationBlockItemGroup extends GennokiokuPlusElements.ModElement {
	public MetroStationBlockItemGroup(GennokiokuPlusElements instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmetro_station_block") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RailwayTransitItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
