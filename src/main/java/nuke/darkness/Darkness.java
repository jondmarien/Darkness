package nuke.darkness;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)
public class Darkness {

	@Mod.Instance(References.MODID)
	public static Darkness instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	/**
	 * Prepend the name with the mod ID, suitable for ResourceLocations such as textures.
	 * @param name
	 * @return eg "darkness:myblockname"
	 */
	public static String prependModID( String name ) {
		return References.MODID + ":" + name;
	}

	@EventHandler
	public void preInit( FMLPreInitializationEvent e ) {
		proxy.preInit();
	}

	@EventHandler
	public void init( FMLInitializationEvent e ) {
		proxy.init();
	}

	@EventHandler
	public void postInit( FMLPostInitializationEvent e ) {
		proxy.postInit();
	}

}