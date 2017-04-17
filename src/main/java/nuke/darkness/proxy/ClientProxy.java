package nuke.darkness.proxy;

import net.minecraftforge.fml.common.event.*;
import nuke.darkness.reg.*;

public class ClientProxy extends CommonProxy {

	//Creates Items, Blocks & Models (+configs)
	@Override
	public void preInit( FMLPreInitializationEvent e ) {
		super.preInit(e);
		ModStuffs.registerRenderer();
	}

	//Recipes
	@Override
	public void init( FMLInitializationEvent e ) {
		super.init(e);

	}

	//Interaction with other mods
	@Override
	public void postInit( FMLPostInitializationEvent e ) {
		super.postInit(e);
	}
}