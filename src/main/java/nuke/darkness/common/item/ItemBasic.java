package nuke.darkness.common.item;

import net.minecraft.item.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemBasic extends Item {
	public ItemBasic(String name) {
		setItemName(this, name);
		setCreativeTab(Darkness.darknessTab);
	}
	
	public static void setItemName(Item item, String name) {
		item.setRegistryName(Darkness.resourcePrefix(name));
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}