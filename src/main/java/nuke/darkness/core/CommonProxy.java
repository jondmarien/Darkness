package nuke.darkness.core;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import nuke.darkness.client.gui.*;
import nuke.darkness.common.*;
import nuke.darkness.common.crafting.*;

public class CommonProxy {

	public void preInit( FMLPreInitializationEvent e ) {
		Content.init();
		Recipes.init();
	}

	public void init( FMLInitializationEvent e ) {
		//TERegistry.registerTEs();
	}

	public void postInit( FMLPostInitializationEvent e ) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Darkness.instance, new GuiHandler());
	}

}