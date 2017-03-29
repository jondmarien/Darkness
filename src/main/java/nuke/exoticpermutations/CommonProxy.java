package nuke.exoticpermutations;

import net.minecraft.entity.player.*;

public abstract class CommonProxy {
	
	public void preInit() {
		
	}
	
	public void init() {
		
	}
	
	public void postInit() {
		
	}
	
	abstract public boolean playerIsInCreativeMode(EntityPlayer ep);
	
	abstract public boolean isDedicatedServer();
}