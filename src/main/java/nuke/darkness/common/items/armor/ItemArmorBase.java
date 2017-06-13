package nuke.darkness.common.items.armor;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.core.*;

public class ItemArmorBase extends ItemArmor implements IModeledItemArmor {

	public ItemArmorBase(String name, boolean addToTab, ArmorMaterial mat, int index, EntityEquipmentSlot slot) {
		super(mat, index, slot);
		setUnlocalizedName(name);
		this.setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		GameRegistry.register(this);
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}