package nuke.darkness.common.tileentity;

import net.minecraft.block.state.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;

public interface ITileEntityBase {
	public boolean activate(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing face, float hitX, float hitY, float hitZ);

	public void breakBlock(World world, BlockPos pos, IBlockState state, EntityPlayer player);

	public void markNeedsUpdate();

	public boolean updateNeeded();

	public void clean();
}