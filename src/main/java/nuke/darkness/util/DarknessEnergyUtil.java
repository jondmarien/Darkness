package nuke.darkness.util;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import nuke.darkness.items.*;

public class DarknessEnergyUtil {
	public static double getDarknessCapacityTotal( EntityPlayer ePlayer ) {
		double val = 0;
		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (ePlayer.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (ePlayer.inventory.getStackInSlot(i).getItem() instanceof IInventoryDarknessPod
				        && ePlayer.inventory.getStackInSlot(i).getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.inventory.getStackInSlot(i).getItem())
					        .getDarkness(ePlayer.inventory.getStackInSlot(i));
				}
			}
			//Off-Hand Item Slot (press f)
			if (ePlayer.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (ePlayer.getHeldItemOffhand().getItem() instanceof IHeldDarknessPod
				        && ePlayer.getHeldItemOffhand().getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.getHeldItemOffhand().getItem())
					        .getDarknessCapacity(ePlayer.getHeldItemOffhand());
				}
			}
			//Main-Hand Item Slot
			if (ePlayer.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (ePlayer.getHeldItemMainhand().getItem() instanceof IHeldDarknessPod
				        && ePlayer.getHeldItemMainhand().getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.getHeldItemMainhand().getItem())
					        .getDarknessCapacity(ePlayer.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static double getDarknessTotal( EntityPlayer ePlayer ) {
		double val = 0;
		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (ePlayer.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (ePlayer.inventory.getStackInSlot(i).getItem() instanceof IInventoryDarknessPod
				        && ePlayer.inventory.getStackInSlot(i).getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.inventory.getStackInSlot(i).getItem())
					        .getDarkness(ePlayer.inventory.getStackInSlot(i));
				}
			}
			//Off-Hand Item Slot (press f)
			if (ePlayer.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (ePlayer.getHeldItemOffhand().getItem() instanceof IHeldDarknessPod
				        && ePlayer.getHeldItemOffhand().getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.getHeldItemOffhand().getItem())
					        .getDarknessCapacity(ePlayer.getHeldItemOffhand());
				}
			}
			//Main-Hand Item Slot
			if (ePlayer.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (ePlayer.getHeldItemMainhand().getItem() instanceof IHeldDarknessPod
				        && ePlayer.getHeldItemMainhand().getItem() instanceof IDarknessItem)
				{
					val += ((IDarknessItem) ePlayer.getHeldItemMainhand().getItem())
					        .getDarknessCapacity(ePlayer.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static void removeDarkness( EntityPlayer ePlayer, double val ) {
		double amount = val;
		//Off-Hand Item Slot (press f)
		if (ePlayer.getHeldItemOffhand() != ItemStack.EMPTY) {
			if (ePlayer.getHeldItemOffhand().getItem() instanceof IHeldDarknessPod
			        && ePlayer.getHeldItemOffhand().getItem() instanceof IDarknessItem)
			{
				amount -= ((IDarknessItem) ePlayer.getHeldItemOffhand().getItem())
				        .removeAmount(ePlayer.getHeldItemOffhand(), amount, true);
			}
		}
		//Main-Hand Item Slot
		if (ePlayer.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
			if (ePlayer.getHeldItemMainhand().getItem() instanceof IHeldDarknessPod
			        && ePlayer.getHeldItemMainhand().getItem() instanceof IDarknessItem)
			{
				amount -= ((IDarknessItem) ePlayer.getHeldItemMainhand().getItem())
				        .removeAmount(ePlayer.getHeldItemMainhand(), amount, true);
			}
		}

		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (ePlayer.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (ePlayer.inventory.getStackInSlot(i).getItem() instanceof IInventoryDarknessPod
				        && ePlayer.inventory.getStackInSlot(i).getItem() instanceof IDarknessItem)
				{
					amount -= ((IDarknessItem) ePlayer.inventory.getStackInSlot(i).getItem())
					        .removeAmount(ePlayer.inventory.getStackInSlot(i), amount, true);
				}
			}
		}
	}
}