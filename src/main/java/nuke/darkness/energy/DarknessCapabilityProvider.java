package nuke.darkness.energy;

import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;

public class DarknessCapabilityProvider implements ICapabilityProvider {

	@CapabilityInject(IDarknessCapability.class)
	public static final Capability<IDarknessCapability> darknessCapability = null;

	private IDarknessCapability capability = null;

	public DarknessCapabilityProvider() {
		capability = new DefaultDarknessCapability();
	}

	public DarknessCapabilityProvider(IDarknessCapability capability) {
		this.capability = capability;
	}

	@Override
	public boolean hasCapability( Capability<?> capability, EnumFacing facing ) {
		return capability == darknessCapability;
	}

	@Override
	public <T> T getCapability( Capability<T> capability, EnumFacing facing ) {
		if (darknessCapability != null && capability == darknessCapability) return (T) capability;
		return null;
	}
}