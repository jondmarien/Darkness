package nuke.darkness.common.world;

import java.lang.ref.*;

import net.minecraft.nbt.*;
import net.minecraft.world.*;
import nuke.darkness.client.util.*;

public class ShadeWorldData extends WorldSavedData {

	public ShadeWorldData(String name) {
		super(name);
	}

	/**
	 * Needed for a constructor I can use to return with no parameters
	 */
	public ShadeWorldData() {
		super(References.MODID);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {

	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound compound) {
		return null;
	}

	public static ShadeWorldData getWorldData(World world) {
		ShadeWorldData swd = null;

		if (world != null) {
			if ((ShadeWorldData) world.loadData(ShadeWorldData.class, References.MODID) != null) {
				swd = (ShadeWorldData) world.loadData(ShadeWorldData.class, References.MODID);
			}
		}

		if (swd == null && world != null) {
			swd = new ShadeWorldData();
		}

		return swd;
	}
}