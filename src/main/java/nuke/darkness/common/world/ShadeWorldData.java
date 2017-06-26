package nuke.darkness.common.world;

import java.lang.ref.*;

import net.minecraft.nbt.*;
import net.minecraft.world.*;
import net.minecraft.world.storage.*;
import nuke.darkness.client.util.*;

public class ShadeWorldData extends WorldSavedData {

	public ShadeWorldData(String name) {
		super(name);
	}

	/**
	 * Needed for a constructor I can use to return with no parameters
	 */
	public ShadeWorldData() {
		super(Vars.MODID);
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
			if ((ShadeWorldData) world.loadData(ShadeWorldData.class, Vars.MODID) != null) {
				swd = (ShadeWorldData) world.loadData(ShadeWorldData.class, Vars.MODID);
			}
		}

		if (swd == null && world != null) {
			swd = new ShadeWorldData();
		}

		return swd;
	}
}