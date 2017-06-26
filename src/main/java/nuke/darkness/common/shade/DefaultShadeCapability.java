package nuke.darkness.common.shade;

import net.minecraft.nbt.*;
import nuke.darkness.core.*;

public class DefaultShadeCapability implements IShadeCapability {
	private double shade = 0;
	private double capacity = 0;

	@Override
	public void writeToNBT(NBTTagCompound tag) {
		tag.setDouble(Darkness.resourcePrefix("shade"), shade);
		tag.setDouble(Darkness.resourcePrefixWithCapacity("shade"), capacity);
	}

	@Override
	public void readFromNBT(NBTTagCompound tag) {
		if (tag.hasKey(Darkness.resourcePrefix("shade"))) shade = tag.getDouble(Darkness.resourcePrefix("shade"));
		if (tag.hasKey(Darkness.resourcePrefixWithCapacity("shade"))) capacity = tag.getDouble(Darkness.resourcePrefix("shade"));
	}

	@Override
	public void setShade(double val) {
		shade = val;
	}

	@Override
	public void setShadeCapacity(double val) {
		capacity = val;
	}

	@Override
	public double getShade() {
		return shade;
	}

	@Override
	public double getShadeCapacity() {
		return capacity;
	}

	@Override
	public double addAmount(double val, boolean add) {
		if (shade + val > capacity) {
			double added = capacity - shade;
			if (add) shade = capacity;
			return added;
		}
		if (add) shade += val;

		return val;
	}

	@Override
	public double removeAmount(double val, boolean remove) {
		if (shade - val < 0) {
			double removed = shade;
			if (remove) shade = 0;
			return removed;
		}
		if (remove) shade -= val;

		return val;
	}

}