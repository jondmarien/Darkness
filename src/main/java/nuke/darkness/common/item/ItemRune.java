package nuke.darkness.common.item;

import net.minecraft.item.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.item.iface.*;

public class ItemRune extends ItemBondable implements IRune {

	public ItemRune() {
		super();
	}

	public boolean isIdle(ItemStack stack) {
		MiscUtils.hasNBT(stack);

		return stack.getTagCompound().getBoolean("idle");
	}

	public ItemStack setIdle(ItemStack stack, boolean idle) {
		MiscUtils.hasNBT(stack);

		stack.getTagCompound().setBoolean("idle", idle);

		return stack;
	}
}