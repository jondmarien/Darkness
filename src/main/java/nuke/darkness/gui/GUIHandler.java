package nuke.darkness.gui;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.network.*;

public class GUIHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement( int ID, EntityPlayer player, World world, int x, int y, int z ) {
		return null;
	}

	@Override
	public Object getClientGuiElement( int ID, EntityPlayer player, World world, int x, int y, int z ) {
		if(ID == 1) return new GUIScrollBag();
		return null;
	}

}