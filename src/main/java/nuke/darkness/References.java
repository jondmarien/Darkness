package nuke.darkness;

import java.util.*;

import org.apache.logging.log4j.*;

public class References {

	public static final String MODID = "darkness";
	public static final String NAME = "Darkness";
	public static final String VERSION = "0.0.1";
	public static final String DEPENDENCIES = "";

	public static final String CLIENT_PROXY_CLASS = "nuke.darkness.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nuke.darkness.proxy.ServerProxy";

	public static final Random RANDOM = new Random();
	public static final Logger LOGGER = LogManager.getLogger(NAME);
}