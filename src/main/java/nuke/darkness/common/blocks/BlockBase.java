package nuke.darkness.common.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.block.state.*;
import net.minecraft.client.renderer.block.model.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraftforge.client.model.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.relauncher.*;
import nuke.darkness.core.*;

public class BlockBase extends Block implements IModeledBlock {

	public boolean isOpaqueCube = true, isFullCube = true, isBeaconBase = false;
	public BlockRenderLayer brlayer = BlockRenderLayer.SOLID;
	public Item itemBlock = null;

	/**
	 * @param mat i.e. Material.ROCK
	 * @param name i.e. "test_block"
	 * @param toolUsed i.e. "pickaxe"
	 * @param toolStrength i.e. Wood: 0, Stone: 1, Iron: 2, Diamond: 3, Gold: 0
	 * @param hardness i.e. 1.0F
	 * @param resistance i.e. 10.0F
	 * @param sound i.e SoundType.GROUND
	 * @param addToTab i.e. true
	 */
	public BlockBase(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance,
	        SoundType sound, boolean addToTab)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(Darkness.prependModID(name));
		this.setHarvestLevel(toolUsed, toolStrength);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
		if (addToTab) this.setCreativeTab(Darkness.darknessTab);

		GameRegistry.register(this);
		GameRegistry.register(itemBlock = (new ItemBlock(this).setRegistryName(this.getRegistryName())));
	}

	/**
	 * @param mat i.e. Material.ROCK
	 * @param name i.e. "test_block"
	 * @param toolUsed i.e. "pickaxe"
	 * @param toolStrength i.e. Wood: 0, Stone: 1, Iron: 2, Diamond: 3, Gold: 0
	 * @param hardness i.e. 1.0F
	 * @param resistance i.e. 10.0F
	 * @param sound i.e SoundType.GROUND
	 * @param slippery i.e. true
	 * @param addToTab i.e. true
	 */
	public BlockBase(Material mat, String name, String toolUsed, int toolStrength, float hardness, float resistance,
	        SoundType sound, boolean addToTab, boolean slippery)
	{
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(Darkness.prependModID(name));
		this.setHarvestLevel(toolUsed, toolStrength);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
		if (addToTab) this.setCreativeTab(Darkness.darknessTab);
		if (slippery) this.slipperiness = 0.98F;

		GameRegistry.register(this);
		GameRegistry.register(itemBlock = (new ItemBlock(this).setRegistryName(this.getRegistryName())));
	}

	/**
	 * @param mat i.e. Material.ROCK
	 * @param name i.e. "test_block"
	 * @param hardness i.e. 1.0F
	 * @param resistance i.e. 10.0F
	 * @param sound i.e SoundType.GROUND
	 * @param addToTab i.e. true
	 */
	public BlockBase(Material mat, String name, float hardness, float resistance, SoundType sound, boolean addToTab) {
		super(mat);
		this.setUnlocalizedName(name);
		this.setRegistryName(Darkness.prependModID(name));
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(sound);
		if (addToTab) this.setCreativeTab(Darkness.darknessTab);

		GameRegistry.register(this);
		GameRegistry.register(itemBlock = (new ItemBlock(this).setRegistryName(this.getRegistryName())));
	}
	
	public BlockBase setHarvestProps(String type, int level){
		super.setHarvestLevel(type, level);
		return this;
	}

	public BlockBase setIsOpaqueCube( boolean bool ) {
		isOpaqueCube = bool;
		return this;
	}

	public BlockBase setIsFullCube( boolean bool ) {
		isFullCube = bool;
		return this;
	}

	public BlockBase setBeaconBase( boolean bool ) {
		isBeaconBase = bool;
		return this;
	}

	@Override
	public boolean isBeaconBase( IBlockAccess world, BlockPos pos, BlockPos beacon ) {
		return isBeaconBase;
	}

	@Override
	public boolean isOpaqueCube( IBlockState ibs ) {
		return isOpaqueCube;
	}

	@Override
	public boolean isFullCube( IBlockState ibs ) {
		return isFullCube;
	}

	@Override
	public boolean isFullBlock( IBlockState ibs ) {
		return isFullCube;
	}

	@SideOnly(Side.CLIENT)
	public BlockRenderLayer getBlockLayer() {
		return brlayer;
	}

	@Override
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
		        new ModelResourceLocation(getRegistryName().toString(), "inventory"));
	}
}