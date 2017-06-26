package nuke.darkness.common.item.iface;

import net.minecraft.entity.player.*;
import net.minecraft.item.*;

public interface IBondable {
	boolean onBond(EntityPlayer player, ItemStack stack);
}