package nuke.darkness.gui;

import net.minecraft.client.gui.inventory.*;
import net.minecraft.inventory.*;
import nuke.darkness.*;
import nuke.darkness.util.*;

public class GuiScrollBag extends GuiContainer {

	public GuiScrollBag(Container inventorySlots) {
		super(inventorySlots);
	}

	@Override
	public boolean doesGuiPauseGame() {
		return false;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer( float partialTicks, int mouseX, int mouseY ) {
		//Miscellaneous.bindTexture("darkness:textures/gui/scrollbag.png");
		Miscellaneous.bindTexture(Darkness.prependModID("textures/gui/scrollbag.png"));
	}
}