package nuke.darkness.common;

import java.io.*;

import net.minecraftforge.common.config.*;
import net.minecraftforge.fml.client.event.*;
import net.minecraftforge.fml.common.eventhandler.*;
import nuke.darkness.client.util.*;

public class Config {
	public static Configuration cfg;

	private final static String CATEGORY_TEST = "test";
	
	public static void initConfig(File file){
		if(cfg == null){
			cfg = new Configuration(file);
			loadConfig();
		}
	}
	
	public static void loadConfig(){		
		
		cfg.addCustomCategoryComment(CATEGORY_TEST, "Test Config Options");

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