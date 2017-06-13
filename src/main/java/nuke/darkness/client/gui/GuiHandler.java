package nuke.darkness.client.gui;

import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.world.*;
import net.minecraftforge.fml.common.network.*;

public class GuiHandler implements IGuiHandler {

	Container inventoryPlayer;

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if (ID == 1) return new GuiScrollBag(inventoryPlayer);
		else if (ID == 2) return new GuiCompendium();
		return null;
	}
}