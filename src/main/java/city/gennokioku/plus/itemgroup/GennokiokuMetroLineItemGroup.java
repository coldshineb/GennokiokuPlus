
package city.gennokioku.plus.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import city.gennokioku.plus.item.RailwayTransitItem;
import city.gennokioku.plus.GennokiokuPlusElements;

@GennokiokuPlusElements.ModElement.Tag
public class GennokiokuMetroLineItemGroup extends GennokiokuPlusElements.ModElement {
	public GennokiokuMetroLineItemGroup(GennokiokuPlusElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmetro_line") {
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
