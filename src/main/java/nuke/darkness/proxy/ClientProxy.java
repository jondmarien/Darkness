package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;
import nuke.darkness.*;
import nuke.darkness.util.*;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit( FMLPreInitializationEvent e ) {
		super.preInit(e);
		KeybindHandler.init();
		DarknessContent.registerRenderer();
	}

	@Override
	public void init( FMLInitializationEvent e ) {
		super.init(e);

	}

	@Override
	public void postInit( FMLPostInitializationEvent e ) {
		super.postInit(e);
	}
}