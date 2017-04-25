package nuke.darkness.energy;

import net.minecraft.nbt.*;

public interface IDarknessCapability {
	public void writeToNBT(NBTTagCompound tag);
	public void readFromNBT(NBTTagCompound tag);
	public void setDarkness(double val);
	public void setDarknessCapacity(double val);
	public double getDarkness();
	public double getDarknessCapacity();
	public double addAmount(double val, boolean add);
	public double removeAmount(double val, boolean remove);
}