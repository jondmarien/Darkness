package nuke.darkness.core;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import nuke.darkness.*;
import nuke.darkness.client.gui.*;
import nuke.darkness.common.*;
import nuke.darkness.common.crafting.*;
import nuke.darkness.core.*;

public class CommonProxy {

	public void serverStarting( FMLServerStartingEvent e ) {
		
	}

	public void preInit( FMLPreInitializationEvent e ) {
		DarknessContent.init();
		ModRecipes.init();
	}

	public void init( FMLInitializationEvent e ) {
		//TERegistry.registerTEs();
	}

	public void postInit( FMLPostInitializationEvent e ) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Darkness.instance, new GuiHandler());
	}

	public void serverStopping( FMLServerStoppingEvent e ) {
		
	}
}