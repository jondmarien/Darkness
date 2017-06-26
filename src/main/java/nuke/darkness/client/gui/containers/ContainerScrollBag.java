package nuke.darkness.client.gui.containers;

import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.world.*;
import nuke.darkness.common.*;
import nuke.darkness.common.reg.*;

public class ContainerScrollBag {

	public ContainerScrollBag(InventoryPlayer inventoryPlayer, World world, EntityEquipmentSlot entityEquipmentSlot, ItemStack itemHeld) {
		super();

	}

	public boolean canInsert(ItemStack stack, int slotNum, Slot slot) {
		if (stack == null) return true;
		if (DItems.SCROLL_BAG.equals(stack.getItem())) return false;
		else return true;
	}

	public boolean canTake(ItemStack stack, int slotNum, Slot slot) {
		return true;
	}

	int addSlots(InventoryPlayer inventoryPlayer) {
		int i = 0;
		return i;
	}
}