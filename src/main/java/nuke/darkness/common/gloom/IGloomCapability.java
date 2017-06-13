package nuke.darkness.common.gloom;

import net.minecraft.nbt.*;

public interface IGloomCapability {
	public void writeToNBT(NBTTagCompound tag);

	public void readFromNBT(NBTTagCompound tag);

	public void setGloom(double val);

	public void setGloomCapacity(double val);

	public double getGloom();

	public double getGloomCapacity();

	public double addAmount(double val, boolean add);

	public double removeAmount(double val, boolean remove);
}