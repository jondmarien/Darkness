package nuke.darkness;

import java.util.*;

import org.apache.logging.log4j.*;

public class References {

	public static final String MCVERSION = "1.11.2";
	/**
	 * Updates every MAJOR change,
	 * never resets
	 */
	public static final int MAJOR = 0;
	/**
	 * Updates every time a new block, item or features is added or change,
	 * resets on MAJOR changes
	 */
	public static final int MINOR = 0;
	/**
	 * Updates every time a bug is fixed or issue solved or very minor code changes,
	 * resets on MINOR changes
	 */
	public static final int PATCH = 0;

	public static final String MODID = "darkness";
	public static final String NAME = "Darkness";
	public static final String VERSION = MCVERSION + "-" + MAJOR + "." + MINOR + "." + PATCH + "";
	public static final String DEPENDENCIES = "";

	public static final String CLIENT_PROXY_CLASS = "nuke.darkness.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nuke.darkness.proxy.ServerProxy";

	public static final Random RANDOM = new Random();
	public static final Logger LOGGER = LogManager.getLogger(NAME);
}