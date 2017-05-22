package nuke.darkness.common.blocks;

import java.util.*;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.core.*;

public class BlockDoubleSlabBase extends BlockSlab implements IModeledBlock {

	private Block slab;
	public Item itemBlock = null;
	public boolean isOpaqueCube = true, isFullCube = true;
	public BlockRenderLayer layer = BlockRenderLayer.SOLID;

	public static AxisAlignedBB FULL_AABB = new AxisAlignedBB(0, 0, 0, 1, 1, 1);

	public BlockDoubleSlabBase(Material mat, String name, boolean addToTab) {
		super(mat);
		setUnlocalizedName(name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		GameRegistry.register(this);
		GameRegistry.register(itemBlock = (new ItemBlock(this).setRegistryName(this.getRegistryName())));
	}

	@Override
	public ArrayList<ItemStack> getDrops( IBlockAccess world, BlockPos pos, IBlockState state, int fortune ) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Item.getItemFromBlock(this.slab), 1));
		drops.add(new ItemStack(Item.getItemFromBlock(this.slab), 1));
		return drops;
	}

	@Override
	public ItemStack getPickBlock( IBlockState state, RayTraceResult target, World world, BlockPos pos,
	        EntityPlayer player )
	{
		return new ItemStack(Item.getItemFromBlock(this.slab));
	}

	@Override
	public AxisAlignedBB getBoundingBox( IBlockState state, IBlockAccess source, BlockPos pos ) {
		return FULL_AABB;
	}

	public void setSlab( Block slab ) {
		this.slab = slab;
	}

	@SideOnly(Side.CLIENT)
	protected static boolean isHalfSlab( IBlockState state ) {
		return true;
	}

	public BlockDoubleSlabBase setHarvestProperties( String tool, int level ) {
		super.setHarvestLevel(tool, level);
		return this;
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, HALF);
	}

	public IBlockState getStateFromMeta( int meta ) {
		IBlockState ibs = this.getDefaultState();
		if (!this.isDouble()) {
			ibs = ibs.withProperty(HALF, (meta) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
		}
		return ibs;
	}

	@Override
	public int getMetaFromState( IBlockState state ) {
		return state.getValue(HALF) == EnumBlockHalf.BOTTOM ? 0 : 1;
	}

	public BlockDoubleSlabBase setIsOpaqueCube( boolean bool ) {
		isOpaqueCube = bool;
		return this;
	}

	public BlockDoubleSlabBase setIsFullCube( boolean bool ) {
		isFullCube = bool;
		return this;
	}

	@Override
	public String getUnlocalizedName( int meta ) {
		return null;
	}

	@Override
	public boolean isOpaqueCube( IBlockState state ) {
		return isOpaqueCube;
	}

	@Override
	public boolean isFullCube( IBlockState state ) {
		return isFullCube;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}

	@Override
	public Comparable<?> getTypeForItem( ItemStack stack ) {
		return 0;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
		        new ModelResourceLocation(getRegistryName().toString()));
	}
}