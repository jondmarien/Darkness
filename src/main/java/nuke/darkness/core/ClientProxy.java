package nuke.darkness.core;

import javax.annotation.*;

import net.minecraft.client.*;
import net.minecraft.client.settings.*;
import net.minecraft.entity.player.*;
import net.minecraft.world.*;
import nuke.darkness.common.reg.*;

public class ClientProxy implements IProxy {

	private final Minecraft MC = Minecraft.getMinecraft();

	@Override
	public void preInit() {
		// regRenderers
		// regClientCommands
		DKeybinds.registerKeyBindings();
	}

	@Override
	public void init() {
		// regColourHandlers
	}

	@Override
	public void postInit() {

	}

	@Override
	public void doClientRightClick() {
		KeyBinding.onTick(MC.gameSettings.keyBindUseItem.getKeyCode());
	}

	@Nullable
	@Override
	public EntityPlayer getClientPlayer() {
		return MC.player;
	}

	@Nullable
	@Override
	public World getClientWorld() {
		return MC.world;
	}
}