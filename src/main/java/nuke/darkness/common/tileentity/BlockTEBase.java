package nuke.darkness.common.tileentity;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import nuke.darkness.common.blocks.*;

public class BlockTEBase extends BlockBase implements ITileEntityProvider {

	public BlockTEBase(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance, SoundType sound, boolean addToTab) {
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab);
	}

	public BlockTEBase(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance, SoundType sound, boolean addToTab, boolean slippery) {
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab, slippery);
	}

	public BlockTEBase(Material mat, String name, float hardness, float resistance, SoundType sound, boolean addToTab) {
		super(mat, name, hardness, resistance, sound, addToTab);

	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return null;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ) {
		return ((ITileEntityBase) world.getTileEntity(pos)).activate(world, pos, state, player, hand, face, hitX, hitY, hitZ);
	}

	@Override
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		((ITileEntityBase) world.getTileEntity(pos)).breakBlock(world, pos, state, player);
	}
}