package nuke.darkness.energy;

import net.minecraft.nbt.*;
import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;
import net.minecraftforge.common.capabilities.Capability.*;

public class DarknessCapabilityStorage implements IStorage<IDarknessCapability> {

	@Override
	public NBTBase writeNBT( Capability<IDarknessCapability> capability, IDarknessCapability instance,
	        EnumFacing side )
	{
		return null;
	}

	@Override
	public void readNBT( Capability<IDarknessCapability> capability, IDarknessCapability instance, EnumFacing side,
	        NBTBase nbt )
	{}
}