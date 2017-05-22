package nuke.darkness.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.properties.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.core.*;

public class BlockSlabBase extends BlockSlab {

	private Block doubleSlab;
	public boolean isOpaqueCube = true, isFullCube = true;
	public BlockRenderLayer layer = BlockRenderLayer.SOLID;

	public BlockSlabBase(Block block, String name, boolean addToTab) {
		super(block.getDefaultState().getMaterial());
		setUnlocalizedName(name);
		setRegistryName(Darkness.prependModID(name));
		if (addToTab) setCreativeTab(Darkness.darknessTab);
		this.doubleSlab = block;
		this.useNeighborBrightness = true;
		GameRegistry.register(this);
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

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, HALF);
	}

	public BlockSlabBase setHarvestProperties( String tool, int level ) {
		super.setHarvestLevel(tool, level);
		return this;
	}

	public BlockSlabBase setIsOpaqueCube( boolean bool ) {
		isOpaqueCube = bool;
		return this;
	}

	public BlockSlabBase setIsFullCube( boolean bool ) {
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

	@SideOnly(Side.CLIENT)
	protected static boolean isHalfSlab( IBlockState state ) {
		return true;
	}

	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}

	@Override
	public Comparable<?> getTypeForItem( ItemStack stack ) {
		return 0;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
		        new ModelResourceLocation(getRegistryName().toString()));
	}
}