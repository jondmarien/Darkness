package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import nuke.darkness.*;
import nuke.darkness.crafting.*;
import nuke.darkness.gui.*;

public class CommonProxy {

	public void preInit( FMLPreInitializationEvent e ) {
		ModContent.init();
		ModRecipes.init(); 
	}

	public void init( FMLInitializationEvent e ) {
		//TERegistry.registerTEs();
	}

	public void postInit( FMLPostInitializationEvent e ) {
		NetworkRegistry.INSTANCE.registerGuiHandler(Darkness.instance, new GuiHandler());
	}
}