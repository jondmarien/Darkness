package nuke.darkness.items;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.*;

public class ItemPickaxeBase extends ItemPickaxe implements IModeledItem {

	public ItemPickaxeBase(ToolMaterial tmat, String name, boolean addToTab) {
		super(tmat);
		setUnlocalizedName(name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darkTab);
		GameRegistry.register(this);
	}
	
	public ItemPickaxeBase(ToolMaterial tmat, EnumRarity rarity, String name, boolean addToTab) {
		super(tmat);
		setUnlocalizedName(name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darkTab);
		GameRegistry.register(this);
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}