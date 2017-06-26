package nuke.darkness.common.reg;

import org.lwjgl.input.*;

import net.minecraft.client.settings.*;
import net.minecraftforge.client.settings.*;
import net.minecraftforge.fml.client.registry.*;

public class DKeybinds {

	private static final String GENERAL = "key.catgeory.darkness:general";

	public static final KeyBinding CHARGE_BLACKHOLE = new KeyBinding("key.darkness:charge_blackhole", KeyConflictContext.IN_GAME, Keyboard.KEY_C, GENERAL);

	public static void registerKeyBindings() {
		ClientRegistry.registerKeyBinding(CHARGE_BLACKHOLE);
	}
}