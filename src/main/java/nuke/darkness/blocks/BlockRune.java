package nuke.darkness.blocks;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.item.*;
import nuke.darkness.*;

public class BlockRune extends BlockBase {
	public BlockRune(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance,
	        SoundType sound, boolean addToTab)
	{
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab);
	}

	@Override
	public Item getItemDropped( IBlockState state, Random rand, int fortune ) {
		return Item.getItemFromBlock(ModStuffs.block_rune);
	}
}