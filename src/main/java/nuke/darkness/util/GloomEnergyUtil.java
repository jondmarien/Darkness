package nuke.darkness.util;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import nuke.darkness.items.*;

public class GloomEnergyUtil {
	public static double getGloomCapacityTotal( EntityPlayer player ) {
		double val = 0;
		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryGloomCapsule
				        && player.inventory.getStackInSlot(i).getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.inventory.getStackInSlot(i).getItem())
					        .getGloom(player.inventory.getStackInSlot(i));
				}
			}
			//Off-Hand Item Slot (press f)
			if (player.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemOffhand().getItem() instanceof IHeldGloomCapsule
				        && player.getHeldItemOffhand().getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.getHeldItemOffhand().getItem())
					        .getGloomCapacity(player.getHeldItemOffhand());
				}
			}
			//Main-Hand Item Slot
			if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemMainhand().getItem() instanceof IHeldGloomCapsule
				        && player.getHeldItemMainhand().getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.getHeldItemMainhand().getItem())
					        .getGloomCapacity(player.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static double getGloomTotal( EntityPlayer player ) {
		double val = 0;
		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryGloomCapsule
				        && player.inventory.getStackInSlot(i).getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.inventory.getStackInSlot(i).getItem())
					        .getGloom(player.inventory.getStackInSlot(i));
				}
			}
			//Off-Hand Item Slot (press f)
			if (player.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemOffhand().getItem() instanceof IHeldGloomCapsule
				        && player.getHeldItemOffhand().getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.getHeldItemOffhand().getItem())
					        .getGloomCapacity(player.getHeldItemOffhand());
				}
			}
			//Main-Hand Item Slot
			if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemMainhand().getItem() instanceof IHeldGloomCapsule
				        && player.getHeldItemMainhand().getItem() instanceof IGloomItem)
				{
					val += ((IGloomItem) player.getHeldItemMainhand().getItem())
					        .getGloomCapacity(player.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static void removeGloom( EntityPlayer player, double val ) {
		double amount = val;
		//Off-Hand Item Slot (press f)
		if (player.getHeldItemOffhand() != ItemStack.EMPTY) {
			if (player.getHeldItemOffhand().getItem() instanceof IHeldGloomCapsule
			        && player.getHeldItemOffhand().getItem() instanceof IGloomItem)
			{
				amount -= ((IGloomItem) player.getHeldItemOffhand().getItem())
				        .removeAmount(player.getHeldItemOffhand(), amount, true);
			}
		}
		//Main-Hand Item Slot
		if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
			if (player.getHeldItemMainhand().getItem() instanceof IHeldGloomCapsule
			        && player.getHeldItemMainhand().getItem() instanceof IGloomItem)
			{
				amount -= ((IGloomItem) player.getHeldItemMainhand().getItem())
				        .removeAmount(player.getHeldItemMainhand(), amount, true);
			}
		}

		//36 for the amount of slots in the players inventory, hotbar included, armor slots excluded.
		for (int i = 0; i < 36; i++) {
			//Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryGloomCapsule
				        && player.inventory.getStackInSlot(i).getItem() instanceof IGloomItem)
				{
					amount -= ((IGloomItem) player.inventory.getStackInSlot(i).getItem())
					        .removeAmount(player.inventory.getStackInSlot(i), amount, true);
				}
			}
		}
	}
}