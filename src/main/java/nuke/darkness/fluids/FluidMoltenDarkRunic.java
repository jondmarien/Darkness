package nuke.darkness.fluids;

import java.awt.*;

import net.minecraft.util.*;
import net.minecraftforge.fluids.*;
import nuke.darkness.*;
import nuke.darkness.reg.*;

public class FluidMoltenDarkRunic extends Fluid {
	public FluidMoltenDarkRunic() {
		super("darkrunic", new ResourceLocation(Darkness.prependModID("blocks/molten_darkrunic_still")),
		        new ResourceLocation(Darkness.prependModID("blocks/molten_darkrunic_flowing")));
		this.setViscosity(3750);
		this.setDensity(1250);
		this.setLuminosity(6);
		this.setTemperature(600);
		this.setBlock(ModStuffs.block_molten_dark_runic);
		this.setUnlocalizedName("darkrunic");
	}
	
	@Override
	public int getColor() {
		return Color.WHITE.getRGB();
	}
}