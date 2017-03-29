package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;

public class ServerProxy extends CommonProxy {

	/**
	 * Finds items, blocks, config, creates them and registers with GameRegistry
	 */
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);

	}

	/**
	 * Exotic Permutations mod setup. Recipes, send messages, etc.
	 */
	public void init(FMLInitializationEvent e) {
		super.init(e);

	}

	/**
	 * Interaction with other mods
	 */
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}