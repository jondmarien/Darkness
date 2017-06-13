package nuke.darkness.common.gloom;

import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.capabilities.Capability.*;

public class GloomCapabilityStorage implements IStorage<IGloomCapability> {

	@Override
	public NBTBase writeNBT(Capability<IGloomCapability> capability, IGloomCapability instance, EnumFacing side) {
		return null;
	}

	@Override
	public void readNBT(Capability<IGloomCapability> capability, IGloomCapability instance, EnumFacing side, NBTBase nbt) {
	}
}