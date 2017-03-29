package nuke.exoticpermutations;

import net.minecraftforge.fml.common.*;

@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)
public class ExoticPermutations {
	
	@Mod.Instance(References.MODID)
	public static ExoticPermutations instance;
	
	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
}