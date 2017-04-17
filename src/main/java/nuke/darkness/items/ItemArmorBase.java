package nuke.darkness.items;

import net.minecraft.client.renderer.block.model.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import nuke.darkness.*;

public class ItemArmorBase extends ItemArmor implements IModeledItem {

	public ItemArmorBase(ArmorMaterial mat, int reduction, EntityEquipmentSlot slot, String name, boolean addToTab) {
		super(mat, reduction, slot);
		switch (slot) {
			case CHEST: {
				setUnlocalizedName(name + "_chest");
				break;
			}
			case FEET: {
				setUnlocalizedName(name + "_feet");
				break;
			}
			case HEAD: {
				setUnlocalizedName(name + "_head");
				break;
			}
			case LEGS: {
				setUnlocalizedName(name + "_legs");
				break;
			}
			default:
				break;
		}
		this.setMaxStackSize(1);
		this.setRegistryName(Darkness.prependModID(getUnlocalizedName()).substring(7));
		if(addToTab) this.setCreativeTab(Darkness.darkTab);
		GameRegistry.register(this);
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}
}