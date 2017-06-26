package nuke.darkness.common.item;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import nuke.darkness.common.item.iface.*;

public class ItemBondable extends Item implements IBondable {
	public ItemBondable() {
		super();
	}

	@Override
	public boolean onBond(EntityPlayer player, ItemStack stack) {
		return true;
	}
}