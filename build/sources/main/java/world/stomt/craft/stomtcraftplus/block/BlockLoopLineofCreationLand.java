
package world.stomt.craft.stomtcraftplus.block;

import world.stomt.craft.stomtcraftplus.creativetab.TabStomtCraftMetroLine;
import world.stomt.craft.stomtcraftplus.ElementsStomtCraftPlusMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsStomtCraftPlusMod.ModElement.Tag
public class BlockLoopLineofCreationLand extends ElementsStomtCraftPlusMod.ModElement {
	@GameRegistry.ObjectHolder("stomtcraftplus:looplineofcreationland")
	public static final Block block = null;
	public BlockLoopLineofCreationLand(ElementsStomtCraftPlusMod instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("looplineofcreationland"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("stomtcraftplus:looplineofcreationland", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("looplineofcreationland");
			setSoundType(SoundType.GROUND);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabStomtCraftMetroLine.tab);
		}
	}
}
