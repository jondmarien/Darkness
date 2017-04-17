package nuke.darkness.items;

import net.minecraft.item.*;

public interface IDarknessItem {
	public double getDarkness(ItemStack stack);
	public double getDarknessCapacity(ItemStack stack);
	
	public void setDarkness(ItemStack stack, double value);
	public void setDarknessCapacity(ItemStack stack, double value);
	
	public double addAmount(ItemStack stack, double value, boolean doAdd);
	public double removeAmount(ItemStack stack, double value, boolean doAdd);
}