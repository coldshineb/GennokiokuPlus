
package world.stomt.craft.plus.item;

import world.stomt.craft.plus.itemgroup.MetroStationBlockItemGroup;
import world.stomt.craft.plus.StomtcraftplusModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@StomtcraftplusModElements.ModElement.Tag
public class ShouhutongItem extends StomtcraftplusModElements.ModElement {
	@ObjectHolder("stomtcraftplus:shouhutong")
	public static final Item block = null;
	public ShouhutongItem(StomtcraftplusModElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MetroStationBlockItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("shouhutong");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
