package nuke.darkness.common.item.iface;

import net.minecraft.item.*;

public interface IEnergizable {
	boolean getEnergized(ItemStack stack);

	ItemStack setEnergizedState(ItemStack stack, boolean energized);
}