package nuke.darkness.core;

import java.util.*;

import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.*;
import net.minecraftforge.fml.common.network.simpleimpl.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.client.gui.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.*;
import nuke.darkness.common.reg.*;

@Mod(modid = Vars.MODID, name = Vars.NAME, version = Vars.VERSION, acceptedMinecraftVersions = Vars.ACCEPTEDMCVERSIONS)

@Mod.EventBusSubscriber
public class Darkness {

	@Instance(Vars.MODID)
	public static Darkness instance;

	public static SimpleNetworkWrapper network;

	public static DarknessTab darknessTab = new DarknessTab();

	@SidedProxy(clientSide = Vars.CLIENT_PROXY_CLASS)
	public static IProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Logger.setLogger(e.getModLog());
		FMLLog.bigWarning("Random UUID: {}", UUID.randomUUID().toString());

		// regMapGen
		// regEntities
		// regLootTables

		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		// regRecipes
		// removeRecipes
		// regWorldGens
		// addEntitySpawns

		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		proxy.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		// regCommands
	}

	@EventHandler
	public void serverStopped(FMLServerStoppedEvent event) {
		// ...
	}

	public static String resourcePrefix(String name) {
		return Vars.MODID + ":" + name;
	}

	public static String resourcePrefixWithCapacity(String name) {
		return Vars.MODID + ":" + name + "Capacity";
	}
}