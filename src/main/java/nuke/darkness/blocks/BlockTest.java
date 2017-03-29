package nuke.darkness.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.creativetab.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.*;

public class BlockTest extends Block {

	public BlockTest() {
		super(Material.ROCK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.SOLID;
	}

	@Override
	public boolean isOpaqueCube( IBlockState ibs ) {
		return true;
	}

	@Override
	public boolean isFullCube( IBlockState ibs ) {
		return true;
	}

	@Override
	public EnumBlockRenderType getRenderType( IBlockState ibs ) {
		return EnumBlockRenderType.MODEL;
	}
}