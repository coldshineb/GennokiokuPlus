
package world.stomt.craft.plus.block;

import world.stomt.craft.plus.itemgroup.StomtCraftMetroLineItemGroup;
import world.stomt.craft.plus.StomtcraftplusModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

@StomtcraftplusModElements.ModElement.Tag
public class LoopLineofCreationLandBlock extends StomtcraftplusModElements.ModElement {
	@ObjectHolder("stomtcraftplus:loop_line_of_creation_land")
	public static final Block block = null;
	public LoopLineofCreationLandBlock(StomtcraftplusModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(
				() -> new BlockItem(block, new Item.Properties().group(StomtCraftMetroLineItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("loop_line_of_creation_land");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
