package city.gennokioku.plus.register;

import city.gennokioku.plus.util.RegistryKey;
import city.gennokioku.plus.util.Util;
import city.gennokioku.plus.block.metrolines.numberslines.Line1;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/*
 * 本类用于注册所有方块项目
 *
 * */

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Util.MODID);
    public static final RegistryObject<Block> line_1 = BLOCKS.register(RegistryKey.LINE_1, Line1::new);
}
