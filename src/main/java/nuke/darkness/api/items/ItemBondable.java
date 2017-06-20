package nuke.darkness.api.items;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import nuke.darkness.api.ifaces.*;

public class ItemBondable extends Item implements IBondable {
	public ItemBondable() {
		super();
	}

	@Override
	public boolean onBond(EntityPlayer player, ItemStack stack) {
		return true;
	}
}