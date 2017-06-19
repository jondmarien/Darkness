package nuke.darkness.common.blocks;

import java.util.*;

import javax.annotation.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.entity.*;
import net.minecraft.entity.player.*;
import net.minecraft.init.*;
import net.minecraft.item.*;
import net.minecraft.stats.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.common.*;
import nuke.darkness.common.*;

public class BlockDarkenedWeb extends BlockBase implements IShearable {
	public BlockDarkenedWeb(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance, SoundType sound, boolean addToTab) {
		super(mat, name, toolUsed, toolStrength, hardness, resistance, sound, addToTab);
	}

	@Override
	public void onEntityCollidedWithBlock(World world, BlockPos pos, IBlockState state, Entity entity) {
		entity.setInWeb();
	}

	@Nullable
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess world, BlockPos pos) {
		return NULL_AABB;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Content.darkened_string;
	}

	@Override
	public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
		return true;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos) {
		return true;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return com.google.common.collect.Lists.newArrayList(new ItemStack(Item.getItemFromBlock(this), 1));
	}

	@Override
	public BlockRenderLayer getBlockLayer() {
		brlayer = BlockRenderLayer.CUTOUT;
		return brlayer;
	}

	@Override
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te, ItemStack stack) {
		if (!world.isRemote && stack.getItem() == Items.SHEARS) {
			player.addStat(StatList.getBlockStats(this));
			spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this)));
		} else {
			super.harvestBlock(world, player, pos, state, te, stack);
		}
	}
}