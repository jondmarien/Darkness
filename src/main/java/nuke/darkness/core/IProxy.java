package nuke.darkness.core;

import javax.annotation.*;

import net.minecraft.entity.player.*;
import net.minecraft.world.*;

public interface IProxy {
	void preInit();

	void init();

	void postInit();

	void doClientRightClick();

	@Nullable
	EntityPlayer getClientPlayer();

	@Nullable
	World getClientWorld();

	class IncorrectSideException extends RuntimeException {
		public IncorrectSideException(String msg) {
			super(msg);
		}

		public IncorrectSideException(String msg, Throwable cause) {
			super(msg, cause);
		}
	}
}