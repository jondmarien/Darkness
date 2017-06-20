package nuke.darkness.api.items;

import net.minecraft.item.*;
import nuke.darkness.api.ifaces.*;
import nuke.darkness.client.util.*;

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