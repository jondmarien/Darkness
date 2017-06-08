package nuke.darkness.common.gloom;

import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;

public class GloomCapabilityProvider implements ICapabilityProvider {

	@CapabilityInject(IGloomCapability.class)
	public static final Capability<IGloomCapability> gloomCapability = null;

	private IGloomCapability capability = null;

	public GloomCapabilityProvider() {
		setCapability(new DefaultGloomCapability());
	} 

	public GloomCapabilityProvider(IGloomCapability capability) {
		this.setCapability(capability);
	}

	@Override
	public boolean hasCapability( Capability<?> capability, EnumFacing facing ) {
		return capability == gloomCapability;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getCapability( Capability<T> capability, EnumFacing facing ) {
		if (gloomCapability != null && capability == gloomCapability) return (T) capability;
		return null;
	}

	public IGloomCapability getCapability() {
		return capability;
	}

	public void setCapability(IGloomCapability capability) {
		this.capability = capability;
	}
}