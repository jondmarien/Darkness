package nuke.darkness.api;

import java.util.*;

import org.apache.logging.log4j.*;

import lombok.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class References {

	public static final String MCVERSION = "1.11.2";

	public static final String MODID = "darkness";
	public static final String NAME = "Darkness";
	public static final String VERSION = MCVERSION + "-" + "0.0.1";
	public static final String APIVERSION = MCVERSION + "-" + "1.0.0";
	//public static final String DEPENDENCIES = "required-after:guideapi;";
	public static final String DEPENDENCIES = "";
	public static final String ACCEPTEDMCVERSIONS = "[1.11.2]";

	public static final String CLIENT_PROXY_CLASS = "nuke.darkness.core.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nuke.darkness.core.ServerProxy";

	public static final Random RANDOM = new Random();
	public static final Logger logger = LogManager.getLogger(NAME);

	public enum DarknessItem {
		BLACK_HOLE("ItemBlackHole"), 
		BOOK_BINDING("ItemBookBinding"),
		COMPENDIUM("ItemCompendium"), 
		DARKENED_STRING("ItemDarkenedString"),
		DARKRUNIC_AXE("ItemDarkRunicAxe"),
		DARKRUNIC_DROPLET("ItemDarkRunicDroplet"),
		DARKRUNIC_HOE("ItemDarkRunicHoe"),
		DARKRUNIC_INGOT("ItemDarkRunicIngot"),
		DARKRUNIC_PICKAXE("ItemDarkRunicPickaxe"),
		DARKRUNIC_SHOVEL("ItemDarkRunicShovel"),
		DARKRUNIC_SWORD("ItemDarkRunicSword"),
		RUNE_CORRUPT("ItemRuneCorrupt"),
		SCROLL("ItemScroll"),
		SCROLL_BAG("ItemScrollBag"),
		SLATE_BLANK("ItemSlateBlank");

		@Getter
		private final String regName;

		DarknessItem(String regName) {
			this.regName = regName;
		}

		public Item returnItem() {
			return DarknessAPI.returnItem(getRegName());
		}
	}

	public enum DarknessBlock {
		DARKENED_WEB("BlockDarkenedWeb"),
		DARKENED_WOOL("BlockDarkenedWool");

		@Getter
		private final String regName;

		DarknessBlock(String regName) {
			this.regName = regName;
		}

		public Block returnBlock() {
			return DarknessAPI.returnBlock(getRegName());
		}
	}
}