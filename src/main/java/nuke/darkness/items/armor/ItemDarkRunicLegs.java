package nuke.darkness.items.armor;

import java.util.*;

import com.mojang.realmsclient.gui.*;

import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.*;

public class ItemDarkRunicLegs extends ItemArmorBase {

	public ItemDarkRunicLegs() {
		super("darkrunic_legs", true, DarknessContent.armor_mat_darkrunic_cloth, 0, EntityEquipmentSlot.LEGS);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation( ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced ) {
		tooltip.add(ChatFormatting.BOLD + "Dark Runic Legs");
	}
}