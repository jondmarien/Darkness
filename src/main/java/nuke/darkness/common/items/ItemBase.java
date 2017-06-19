package nuke.darkness.common.items;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class ItemBase extends Item implements IModeledItem {

	/**
	 * Basic Item
	 * @param name name of item in the code
	 * @param addToTab true or false, add to tab or not
	 */
	public ItemBase(String name, boolean addToTab) {
		super();
		setUnlocalizedName(References.MODID + "." + name);
		this.setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		GameRegistry.register(this);
	}

	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if (entityIn instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entityIn;
		}
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}