package world.stomt.craft.plus.procedure;

import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsStomtcraftplusMod.ModElement.Tag
public class ProcedureCmdscpCommandExecuted extends ElementsStomtcraftplusMod.ModElement {
	public ProcedureCmdscpCommandExecuted(ElementsStomtcraftplusMod instance) {
		super(instance, 80);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CmdscpCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(
					new TextComponentString("[StomtCraftPlus \uFFFD\u037B\uFFFD\uFFFD\u02F2\uFFFD]\uFFFD\u6C7E 1.12 (2021.1)"), (false));
		}
	}
}
