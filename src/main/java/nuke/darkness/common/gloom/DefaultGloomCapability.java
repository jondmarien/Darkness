package nuke.darkness.common.gloom;

import net.minecraft.nbt.*;
import nuke.darkness.core.*;

public class DefaultGloomCapability implements IGloomCapability {
	private double gloom = 0;
	private double capacity = 0;

	@Override
	public void writeToNBT( NBTTagCompound tag ) {
		tag.setDouble(Darkness.prependModID("gloom"), gloom);
		tag.setDouble(Darkness.prependModIDCapacity("gloom"), capacity);
	}

	@Override
	public void readFromNBT( NBTTagCompound tag ) {
		if (tag.hasKey(Darkness.prependModID("gloom"))) gloom = tag.getDouble(Darkness.prependModID("gloom"));
		if (tag.hasKey(Darkness.prependModIDCapacity("gloom")))
		    capacity = tag.getDouble(Darkness.prependModID("gloom"));
	}

	@Override
	public void setGloom( double val ) {
		gloom = val;
	}

	@Override
	public void setGloomCapacity( double val ) {
		capacity = val;
	}

	@Override
	public double getGloom() {
		return gloom;
	}

	@Override
	public double getGloomCapacity() {
		return capacity;
	}

	@Override
	public double addAmount( double val, boolean add ) {
		if (gloom + val > capacity) {
			double added = capacity - gloom;
			if (add) gloom = capacity;
			return added;
		}
		if (add) gloom += val;

		return val;
	}

	@Override
	public double removeAmount( double val, boolean remove ) {
		if (gloom - val < 0) {
			double removed = gloom;
			if (remove) gloom = 0;
			return removed;
		}
		if (remove) gloom -= val;

		return val;
	}

}