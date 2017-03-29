package nuke.exoticpermutations.proxy;

import net.minecraft.entity.player.*;
import nuke.exoticpermutations.*;

public class ServerProxy extends CommonProxy {

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
		}
		return false;
	}

	@Override
	public boolean isDedicatedServer() {
		return true;
	}
}