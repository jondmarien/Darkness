package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;
import nuke.darkness.reg.*;

public class CommonProxy {

	public void preInit( FMLPreInitializationEvent e ) {
		ModStuffs.init();
	}

	public void init( FMLInitializationEvent e ) {
		//TERegistry.registerTEs();
		//ModRecipes.registerRecipes(); 
	}

	public void postInit( FMLPostInitializationEvent e ) {

	}
}