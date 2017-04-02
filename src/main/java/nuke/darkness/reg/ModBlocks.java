package nuke.darkness.reg;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import nuke.darkness.blocks.*;

public class ModBlocks {

	public static ArrayList<Block> blocks = new ArrayList<Block>();

	public static Block block_test;

	public static void init() {
		blocks.add(block_test = (new BlockTest(Material.ROCK, "block_test", "pickaxe", 1, 1.0F, 10.0F, SoundType.STONE, true)).setLightOpacity(16));
		
	}

	public static void registerRenderer() {
		for (int i = 0; i < blocks.size(); i++) {
			if (blocks.get(i) instanceof IModeledBlock) {
				((IModeledBlock) blocks.get(i)).initModel();
			}
		}
	}
}