package world.stomt.craft.plus.procedure;

import world.stomt.craft.plus.ElementsStomtcraftplusMod;

import net.minecraft.util.text.TextComponentString;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsStomtcraftplusMod.ModElement.Tag
public class ProcedureCmdscpCommandExecuted extends ElementsStomtcraftplusMod.ModElement {
	public ProcedureCmdscpCommandExecuted(ElementsStomtcraftplusMod instance) {
		super(instance, 27);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CmdscpCommandExecuted!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer && !entity.world.isRemote) {
			((EntityPlayer) entity).sendStatusMessage(new TextComponentString("[StomtCraftPlus \u5BA2\u6237\u7AEF\u4FA7]\u7248\u672C 1.11.1"),
					(false));
		}
	}
}
