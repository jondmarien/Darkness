package nuke.darkness.util;

import java.util.*;

import com.google.common.collect.*;

import net.minecraft.client.renderer.texture.*;
import net.minecraftforge.fluids.*;

public class FluidTextureUtil {
	public static Map<Fluid, TextureAtlasSprite> stillTextures = Maps.newHashMap();

	//This code is borrowed and tweaked from Fancy Fluid Storage by LordMau5
	//Find the source here: https://github.com/Lordmau5/FFS/blob/1.10.2/src/main/java/com/lordmau5/ffs/client/FluidHelper.java
	//Also Embers' FluidUtil.
	
	public static void initTextures( TextureMap texmap ) {
		for (Fluid fluid : FluidRegistry.getRegisteredFluids().values()) {
			if (fluid.getStill() != null) {
				String still = fluid.getStill().toString();
				TextureAtlasSprite sprite;
				if (texmap.getTextureExtry(still) != null) sprite = texmap.getTextureExtry(still);
				else sprite = texmap.registerSprite(fluid.getStill());
				stillTextures.put(fluid, sprite);
			}
		}
	}
}