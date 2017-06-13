package nuke.darkness.client.util;

import org.lwjgl.input.*;

import net.minecraft.client.settings.*;
import net.minecraftforge.fml.client.registry.*;

public class KeybindHandler {

	public static KeyBinding charge;

	public static void init() {
		charge = new KeyBinding("Charge Blackhole", Keyboard.KEY_C, "Darkness Keybindings");
		ClientRegistry.registerKeyBinding(charge);
	}
}