package nuke.darkness;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraftforge.fml.relauncher.*;

public class RegistryManager {
	public static ArrayList<Block> blocks = new ArrayList<Block>();
	public static ArrayList<Item> items = new ArrayList<Item>();

	@SideOnly(Side.CLIENT)
	public static void registerAll() {
		//blocks

		//items

		//fluids
		registerFluids();

		//tile entities
	}

	public static void registerRendering() {
		//special renders
		
	}
	
	public static void registerFluids() {

	}	
}