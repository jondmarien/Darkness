package nuke.darkness.blocks;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public class BlockTest extends BlockBase {

	public BlockTest(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance,
	        SoundType sound, boolean addToTab)
	{
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab);
	}

	@Override
	public void onBlockHarvested( World world, BlockPos pos, IBlockState state, EntityPlayer player ) {
		super.onBlockHarvested(world, pos, state, player);
	}

	@Override
	public List<ItemStack> getDrops( IBlockAccess world, BlockPos pos, IBlockState state, int fortune ) {
		return super.getDrops(world, pos, state, fortune);
	}
}