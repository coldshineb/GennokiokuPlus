
package city.gennokioku.plus.item;

import city.gennokioku.plus.GennokiokuPlusElements;
import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import city.gennokioku.plus.itemgroup.MetroStationBlockItemGroup;

@GennokiokuPlusElements.ModElement.Tag
public class RailwayTransitItem extends GennokiokuPlusElements.ModElement {
	@ObjectHolder("gennokiokuplus:railway_transit")
	public static final Item block = null;

	public RailwayTransitItem(GennokiokuPlusElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MetroStationBlockItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("railway_transit");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
