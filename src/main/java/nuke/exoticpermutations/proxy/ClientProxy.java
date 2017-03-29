package nuke.exoticpermutations.proxy;

import net.minecraft.client.*;
import net.minecraft.client.entity.*;
import net.minecraft.entity.player.*;
import nuke.exoticpermutations.*;

public class ClientProxy extends CommonProxy {

	/**
	 * Finds items, blocks, config, creates them and registers with GameRegistry
	 */
	public void preInit() {
		super.preInit();

	}

	/**
	 * Exotic Permutations mod setup. Recipes, send messages, etc.
	 */
	public void init() {
		super.init();

	}

	/**
	 * Interaction with other mods
	 */
	public void postInit() {
		super.postInit();
	}

	@Override
	public boolean playerIsInCreativeMode( EntityPlayer ep ) {
		if (ep instanceof EntityPlayerMP) {
			EntityPlayerMP epMP = (EntityPlayerMP) ep;
			return epMP.interactionManager.isCreative();
		} else if (ep instanceof EntityPlayerSP) { return Minecraft.getMinecraft().playerController
		        .isInCreativeMode(); }
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		return false;
	}
}