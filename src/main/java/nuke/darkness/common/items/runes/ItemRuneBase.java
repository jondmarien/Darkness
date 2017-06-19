package nuke.darkness.common.items.runes;

import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemRuneBase extends Item {

	/**
	 * @param name name of item in the code
	 * @param addToTab true or false, add to tab or not
	 */
	public ItemRuneBase(String name, boolean addToTab) {
		setUnlocalizedName(References.MODID + ".rune." + name);
		this.setRegistryName(Darkness.prependModID(name));

		if (addToTab) setCreativeTab(Darkness.darknessTab);

		GameRegistry.register(this);
	}
}