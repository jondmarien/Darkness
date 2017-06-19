package nuke.darkness.client.util;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import nuke.darkness.common.items.*;

public class ShadeInventoryUtil {
	public static double getShadeCapacityTotal(EntityPlayer player) {
		double val = 0;
		// 36 for the amount of slots in the players inventory, hotbar included, armor aka 36 slots excluded.
		for (int i = 0; i < 36; i++) {
			// Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryShadeBlackhole && player.inventory.getStackInSlot(i).getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.inventory.getStackInSlot(i).getItem()).getShade(player.inventory.getStackInSlot(i));
				}
			}
			// Off-Hand Item Slot (press f)
			if (player.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemOffhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemOffhand().getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.getHeldItemOffhand().getItem()).getShadeCapacity(player.getHeldItemOffhand());
				}
			}
			// Main-Hand Item Slot
			if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemMainhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemMainhand().getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.getHeldItemMainhand().getItem()).getShadeCapacity(player.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static double getShadeTotal(EntityPlayer player) {
		double val = 0;
		// 36 for the amount of slots in the players inventory, hotbar included, armor aka 36 slots excluded.
		for (int i = 0; i < 36; i++) {
			// Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryShadeBlackhole && player.inventory.getStackInSlot(i).getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.inventory.getStackInSlot(i).getItem()).getShade(player.inventory.getStackInSlot(i));
				}
			}
			// Off-Hand Item Slot (press f)
			if (player.getHeldItem(EnumHand.OFF_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemOffhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemOffhand().getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.getHeldItemOffhand().getItem()).getShadeCapacity(player.getHeldItemOffhand());
				}
			}
			// Main-Hand Item Slot
			if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
				if (player.getHeldItemMainhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemMainhand().getItem() instanceof IShadeItem) {
					val += ((IShadeItem) player.getHeldItemMainhand().getItem()).getShadeCapacity(player.getHeldItemMainhand());
				}
			}
		}
		return val;
	}

	public static void removeShade(EntityPlayer player, double val) {
		double amount = val;
		// Off-Hand Item Slot (press f)
		if (player.getHeldItemOffhand() != ItemStack.EMPTY) {
			if (player.getHeldItemOffhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemOffhand().getItem() instanceof IShadeItem) {
				amount -= ((IShadeItem) player.getHeldItemOffhand().getItem()).removeAmount(player.getHeldItemOffhand(), amount, true);
			}
		}
		// Main-Hand Item Slot
		if (player.getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
			if (player.getHeldItemMainhand().getItem() instanceof IHeldShadeBlackhole && player.getHeldItemMainhand().getItem() instanceof IShadeItem) {
				amount -= ((IShadeItem) player.getHeldItemMainhand().getItem()).removeAmount(player.getHeldItemMainhand(), amount, true);
			}
		}

		// 36 for the amount of slots in the players inventory, hotbar included, armor aka 36 slots excluded.
		for (int i = 0; i < 36; i++) {
			// Normal Item Slot
			if (player.inventory.getStackInSlot(i) != ItemStack.EMPTY) {
				if (player.inventory.getStackInSlot(i).getItem() instanceof IInventoryShadeBlackhole && player.inventory.getStackInSlot(i).getItem() instanceof IShadeItem) {
					amount -= ((IShadeItem) player.inventory.getStackInSlot(i).getItem()).removeAmount(player.inventory.getStackInSlot(i), amount, true);
				}
			}
		}
	}
}