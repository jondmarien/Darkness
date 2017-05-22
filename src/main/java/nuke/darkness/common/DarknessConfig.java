package nuke.darkness.common;

import java.io.*;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import nuke.darkness.*;
import nuke.darkness.client.util.*;

public class DarknessConfig {
	public static Configuration darkConfig;
	
	public static int duoVeinSize, duoMinY, duoMaxY, duoVeinsPerChunk;
	public static int triVeinSize, triMinY, triMaxY, triVeinsPerChunk;
	
	public static void initConfig(File file){
		if(darkConfig == null){
			darkConfig = new Configuration(file);
			loadConfig();
		}
	}
	
	public static void loadConfig(){
		
		String categoryOres = "Ores";
		
		darkConfig.addCustomCategoryComment(categoryOres, "All configurations related to ores and their generation.");
		
		duoVeinSize = darkConfig.getInt("duoVeinSize", categoryOres, 9, 0, 255, "Max size of a duo ore gem vein.");
		duoVeinsPerChunk = darkConfig.getInt("duoVeinsPerChunk", categoryOres, 7, 0, 255, "Number of times the duo ore gem will try to generate.");
		duoMinY = darkConfig.getInt("duoMinY", categoryOres, 0, 0, 255, "Min height over that a duo ore gem vein will spawn.");
		duoMaxY = darkConfig.getInt("duoMaxY", categoryOres, 35, 0, 255, "Max height under that a duo ore gem vein will spawn.");
		
		triVeinSize = darkConfig.getInt("triVeinSize", categoryOres, 9, 0, 255, "Max size of a tri ore gem vein.");
		triVeinsPerChunk = darkConfig.getInt("triVeinsPerChunk", categoryOres, 7, 0, 255, "Number of times the tri ore gem will try to generate.");
		triMinY = darkConfig.getInt("triMinY", categoryOres, 0, 0, 255, "Min height over that a tri ore gem vein will spawn.");
		triMaxY = darkConfig.getInt("triMaxY", categoryOres, 35, 0, 255, "Max height under that a tri ore gem vein will spawn.");
		
		if(darkConfig.hasChanged()){
			darkConfig.save();
		}
	}
	
	@SubscribeEvent
	public void whenConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e){
		if(e.getModID().equalsIgnoreCase(References.MODID)){
			loadConfig();
		}
	}
}