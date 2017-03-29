package com.example.examplemod;

import net.minecraft.init.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod {
	public static final String MODID = "examplemod";
	public static final String VERSION = "1.0";

	@EventHandler
	public void init( FMLInitializationEvent event ) {
		// some example code
		System.out.println("DIRT BLOCK >> " + Blocks.DIRT.getUnlocalizedName());
	}
}
