package nuke.darkness;

import java.io.*;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class DarknessConfig {
	public static Configuration config;
	
	public static int duoVeinSize, duoMinY, duoMaxY, duoVeinsPerChunk;
	public static int triVeinSize, triMinY, triMaxY, triVeinsPerChunk;
	
	public static void init(File configFile){
		if(config == null){
			config = new Configuration(configFile);
			load();
		}
	}
	
	public static void load(){
		config.addCustomCategoryComment("Ores", "All configurations related to ores and their generation.");
		
		duoVeinSize = config.getInt("duoVeinSize", "Ores", 9, 0, 255, "Max size of a duo ore gem vein.");
		duoVeinsPerChunk = config.getInt("duoVeinsPerChunk", "Ores", 7, 0, 255, "Number of times the duo ore gem will try to generate.");
		duoMinY = config.getInt("duoMinY", "Ores", 0, 0, 255, "Min height over that a duo ore gem vein will spawn.");
		duoMaxY = config.getInt("duoMaxY", "Ores", 35, 0, 255, "Max height under that a duo ore gem vein will spawn.");
		
		triVeinSize = config.getInt("triVeinSize", "Ores", 9, 0, 255, "Max size of a tri ore gem vein.");
		triVeinsPerChunk = config.getInt("triVeinsPerChunk", "Ores", 7, 0, 255, "Number of times the tri ore gem will try to generate.");
		triMinY = config.getInt("triMinY", "Ores", 0, 0, 255, "Min height over that a tri ore gem vein will spawn.");
		triMaxY = config.getInt("triMaxY", "Ores", 35, 0, 255, "Max height under that a tri ore gem vein will spawn.");
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent e){
		if(e.getModID().equalsIgnoreCase(References.MODID)){
			load();
		}
	}
}