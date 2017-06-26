package nuke.darkness.client.util;

import java.util.*;

import org.apache.logging.log4j.*;

public class Vars {

	public static final String MCVERSION = "1.12";

	public static final String MODID = "darkness";
	public static final String NAME = "Darkness";
	public static final String VERSION = MCVERSION + "-" + "0.0.2";
	public static final String APIVERSION = MCVERSION + "-" + "1.0.0";
	public static final String DEPENDENCIES = "";
	public static final String ACCEPTEDMCVERSIONS = "[1.12]";

	public static final String CLIENT_PROXY_CLASS = "nuke.darkness.core.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nuke.darkness.core.ServerProxy";

	public static final Random RANDOM = new Random();
	public static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(NAME);
}