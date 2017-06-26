package nuke.darkness.common.reg;

import java.util.*;

import com.google.common.base.*;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.tileentity.*;
import net.minecraft.util.*;
import net.minecraftforge.event.*;
import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.eventhandler.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraftforge.fml.common.registry.GameRegistry.*;
import net.minecraftforge.registries.*;
import nuke.darkness.client.util.*;
import nuke.darkness.common.block.*;
import nuke.darkness.core.*;

@ObjectHolder(Vars.MODID)
public class DBlocks {
	public static final BlockDarkenedWool DARKENED_WOOL = new BlockDarkenedWool();

	public static final BlockDarkenedWeb DARKENED_WEB = new BlockDarkenedWeb();

	@Mod.EventBusSubscriber(modid = Vars.MODID)
	public static class RegHandler {
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();

		@SubscribeEvent
		public static void regBlocks(RegistryEvent.Register<Block> e) {
			IForgeRegistry<Block> reg = e.getRegistry();

			Block[] blocks = {
					DARKENED_WOOL,
					DARKENED_WEB
			};

			reg.registerAll(blocks);
		}

		public static void regItemBlocks(RegistryEvent.Register<Item> e) {
			ItemBlock[] items = {
					new ItemBlock(DARKENED_WOOL),
					new ItemBlock(DARKENED_WEB)
			};

			IForgeRegistry<Item> reg = e.getRegistry();

			for (ItemBlock ib : items) {

				Block block = ib.getBlock();

				ResourceLocation regName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);

				reg.register(ib.setRegistryName(regName));

				ITEM_BLOCKS.add(ib);
			}

			// regTileEntities();
		}
	}

	private static void regTileEntities() {

	}

	private static void regTileEntity(Class< ? extends TileEntity> teClass, String name) {
		GameRegistry.registerTileEntity(teClass, Darkness.resourcePrefix(name));
	}
}