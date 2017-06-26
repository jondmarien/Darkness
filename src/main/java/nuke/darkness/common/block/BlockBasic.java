package nuke.darkness.common.block;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import nuke.darkness.client.util.*;
import nuke.darkness.core.*;

public class BlockBasic extends Block {

	public BlockBasic(Material mat, MapColor mapColor, String name) {
		super(mat, mapColor);
		setCreativeTab(Darkness.darknessTab);
		setBlockName(this, name);
	}

	public BlockBasic(Material mat, String name) {
		this(mat, mat.getMaterialMapColor(), name);
	}

	public static void setBlockName(Block block, String name) {
		block.setRegistryName(Darkness.resourcePrefix(name));
		block.setUnlocalizedName(block.getRegistryName().toString());
	}
}