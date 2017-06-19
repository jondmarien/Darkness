package nuke.darkness.common.items.runes;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.items.*;
import nuke.darkness.core.*;

public class ItemRuneBase extends Item implements IModeledItem {

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

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}