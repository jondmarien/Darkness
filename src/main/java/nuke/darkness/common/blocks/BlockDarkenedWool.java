package nuke.darkness.common.blocks;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import nuke.darkness.common.*;

public class BlockDarkenedWool extends BlockBase{
	public BlockDarkenedWool(Material mat, String name, String toolUsed, int toolStrength, float hardness,
	        float resistance, SoundType sound, boolean addToTab)
	{
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab);
	}

	@Override
	public void onBlockHarvested( World world, BlockPos pos, IBlockState state, EntityPlayer player ) {
		super.onBlockHarvested(world, pos, state, player);
	}

	@Override
	public Item getItemDropped( IBlockState state, Random rand, int fortune ) {
		return Content.darkened_string;
	}
}