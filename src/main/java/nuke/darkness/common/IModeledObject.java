package nuke.darkness.common;

import net.minecraftforge.fml.relauncher.*;

public interface IModeledObject {
	@SideOnly(Side.CLIENT)
	public void initModel();
}