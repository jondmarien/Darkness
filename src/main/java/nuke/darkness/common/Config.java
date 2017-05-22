package nuke.darkness.common;

import java.io.*;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import nuke.darkness.client.util.*;

public class Config {
	public static Configuration cfg;
	
	public static int duoVeinSize, duoMinY, duoMaxY, duoVeinsPerChunk;
	public static int triVeinSize, triMinY, triMaxY, triVeinsPerChunk;
	
	private final static String CATEGORY_ORES = "ores";
	
	public static void initConfig(File file){
		if(cfg == null){
			cfg = new Configuration(file);
			loadConfig();
		}
	}
	
	public static void loadConfig(){		
		
		cfg.addCustomCategoryComment(CATEGORY_ORES, "Ore Gen Config Options");
		
		duoVeinSize = cfg.getInt("duoVeinSize", CATEGORY_ORES, 9, 0, 255, "Max size of a duo ore gem vein.");
		duoVeinsPerChunk = cfg.getInt("duoVeinsPerChunk", CATEGORY_ORES, 7, 0, 255, "Number of times the duo ore gem will try to generate.");
		duoMinY = cfg.getInt("duoMinY", CATEGORY_ORES, 0, 0, 255, "Min height over that a duo ore gem vein will spawn.");
		duoMaxY = cfg.getInt("duoMaxY", CATEGORY_ORES, 35, 0, 255, "Max height under that a duo ore gem vein will spawn.");
		
		triVeinSize = cfg.getInt("triVeinSize", CATEGORY_ORES, 9, 0, 255, "Max size of a tri ore gem vein.");
		triVeinsPerChunk = cfg.getInt("triVeinsPerChunk", CATEGORY_ORES, 7, 0, 255, "Number of times the tri ore gem will try to generate.");
		triMinY = cfg.getInt("triMinY", CATEGORY_ORES, 0, 0, 255, "Min height over that a tri ore gem vein will spawn.");
		triMaxY = cfg.getInt("triMaxY", CATEGORY_ORES, 35, 0, 255, "Max height under that a tri ore gem vein will spawn.");
		
		if(cfg.hasChanged()){
			cfg.save();
		}
	}
	
	@SubscribeEvent
	public void whenConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e){
		if(e.getModID().equalsIgnoreCase(References.MODID)){
			loadConfig();
		}
	}
}