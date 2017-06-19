package nuke.darkness.common.shade;

import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.capabilities.Capability.*;

public class ShadeCapabilityStorage implements IStorage<IShadeCapability> {

	@Override
	public NBTBase writeNBT(Capability<IShadeCapability> capability, IShadeCapability instance, EnumFacing side) {
		return null;
	}

	@Override
	public void readNBT(Capability<IShadeCapability> capability, IShadeCapability instance, EnumFacing side, NBTBase nbt) {
	}
}