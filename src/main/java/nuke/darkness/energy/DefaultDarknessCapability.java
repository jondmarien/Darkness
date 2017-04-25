package nuke.darkness.energy;

import net.minecraft.nbt.*;
import nuke.darkness.*;

public class DefaultDarknessCapability implements IDarknessCapability {
	private double darkness = 0;
	private double capacity = 0;

	@Override
	public void writeToNBT( NBTTagCompound tag ) {
		tag.setDouble(Darkness.prependModID("darkness"), darkness);
		tag.setDouble(Darkness.prependModIDCapacity("darkness"), capacity);
	}

	@Override
	public void readFromNBT( NBTTagCompound tag ) {
		if (tag.hasKey(Darkness.prependModID("darkness"))) darkness = tag.getDouble(Darkness.prependModID("darkness"));
		if (tag.hasKey(Darkness.prependModIDCapacity("darkness")))
		    capacity = tag.getDouble(Darkness.prependModID("darkness"));
	}

	@Override
	public void setDarkness( double val ) {
		darkness = val;
	}

	@Override
	public void setDarknessCapacity( double val ) {
		capacity = val;
	}

	@Override
	public double getDarkness() {
		return darkness;
	}

	@Override
	public double getDarknessCapacity() {
		return capacity;
	}

	@Override
	public double addAmount( double val, boolean add ) {
		if (darkness + val > capacity) {
			double added = capacity - darkness;
			if (add) darkness = capacity;
			return added;
		}
		if (add) darkness += val;

		return val;
	}

	@Override
	public double removeAmount( double val, boolean remove ) {
		if (darkness - val < 0) {
			double removed = darkness;
			if (remove) darkness = 0;
			return removed;
		}
		if (remove) darkness -= val;

		return val;
	}

}