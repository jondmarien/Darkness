package nuke.darkness.api;

import org.apache.logging.log4j.*;

import lombok.*;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;

/**
 * Base API class for darkness
 * WIP
 * @author Nuke
 */
public class DarknessAPI {

	@Getter
	private static Logger logger = LogManager.getLogger("Darkness.API");

	@Getter
	private static DamageSource dmgSource = new DamageSourceShade();

	/**
	 * 
	 * @param name
	 * @return
	 */
	public static Item returnItem(String name) {
		return ForgeRegistries.ITEMS.getValue(new ResourceLocation(References.MODID, name));
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public static Block returnBlock(String name) {
		return ForgeRegistries.BLOCKS.getValue(new ResourceLocation(References.MODID, name));
	}
}
