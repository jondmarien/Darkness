package nuke.darkness.common.shade;

import net.minecraft.nbt.*;

public interface IShadeCapability {
	public void writeToNBT(NBTTagCompound tag);

	public void readFromNBT(NBTTagCompound tag);

	public void setShade(double val);

	public void setShadeCapacity(double val);

	public double getShade();

	public double getShadeCapacity();

	public double addAmount(double val, boolean add);

	public double removeAmount(double val, boolean remove);
}