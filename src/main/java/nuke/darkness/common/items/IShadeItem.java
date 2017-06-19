package nuke.darkness.common.items;

import net.minecraft.item.*;

public interface IShadeItem {
	public double getShade(ItemStack stack);

	public double getShadeCapacity(ItemStack stack);

	public void setShade(ItemStack stack, double val);

	public void setShadeCapacity(ItemStack stack, double val);

	public double addAmount(ItemStack stack, double val, boolean add);

	public double removeAmount(ItemStack stack, double val, boolean remove);
}