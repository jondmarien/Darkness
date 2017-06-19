package nuke.darkness.common.shade;

import net.minecraft.util.*;
import net.minecraftforge.common.capabilities.*;

public class ShadeCapabilityProvider implements ICapabilityProvider {

	@CapabilityInject(IShadeCapability.class)
	public static final Capability<IShadeCapability> shadeCapability = null;

	private IShadeCapability capability = null;

	public ShadeCapabilityProvider() {
		setCapability(new DefaultShadeCapability());
	}

	public ShadeCapabilityProvider(IShadeCapability capability) {
		this.setCapability(capability);
	}

	@Override
	public boolean hasCapability(Capability< ? > capability, EnumFacing facing) {
		return capability == shadeCapability;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		if (shadeCapability != null && capability == shadeCapability) return (T) capability;
		return null;
	}

	public IShadeCapability getCapability() {
		return capability;
	}

	public void setCapability(IShadeCapability capability) {
		this.capability = capability;
	}
}