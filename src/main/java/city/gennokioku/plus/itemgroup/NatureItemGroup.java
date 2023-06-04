
package city.gennokioku.plus.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import city.gennokioku.plus.block.DirtWayBlock;
import city.gennokioku.plus.GennokiokuPlusElements;

@GennokiokuPlusElements.ModElement.Tag
public class NatureItemGroup extends GennokiokuPlusElements.ModElement {
	public NatureItemGroup(GennokiokuPlusElements instance) {
		super(instance, 83);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabnature") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DirtWayBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
