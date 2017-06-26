package nuke.darkness.core;

import javax.annotation.*;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;

public class ServerProxy implements IProxy {

	@Override
	public void preInit() {

	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public void doClientRightClick() {
		throw new IncorrectSideException("Tried to perform client right click on the dedicated server.");
	}

	@Nullable
	@Override
	public EntityPlayer getClientPlayer() {
		throw new IncorrectSideException("Tried to get the client player on the dedicated server.");
	}

	@Nullable
	@Override
	public World getClientWorld() {
		throw new IncorrectSideException("Tried to get the client world on the dedicated server.");
	}
}