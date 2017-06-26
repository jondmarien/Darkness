package nuke.darkness.common.items;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.*;
import nuke.darkness.core.*;

public class ItemHoeBase extends ItemHoe implements IModeledObject {

	public ItemHoeBase(ToolMaterial tmat, String name, boolean addToTab) {
		super(tmat);
		setUnlocalizedName(References.MODID + "." + name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		//GameRegistry.register(this);
	}

	public ItemHoeBase(ToolMaterial tmat, EnumRarity rarity, String name, boolean addToTab) {
		super(tmat);
		setUnlocalizedName(References.MODID + "." + name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		//GameRegistry.register(this);
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}