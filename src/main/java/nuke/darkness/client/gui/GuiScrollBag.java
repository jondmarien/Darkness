package nuke.darkness.client.gui;

import net.minecraft.client.gui.inventory.*;
import net.minecraft.inventory.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class GuiScrollBag extends GuiContainer {

	public GuiScrollBag(Container inventorySlots) {
		super(inventorySlots);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
		MiscUtils.bindTexture(Darkness.resourcePrefix("textures/gui/scrollbag.png"));
	}
}