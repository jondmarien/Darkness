package nuke.darkness;

import net.minecraftforge.fml.common.*;
import net.minecraftforge.fml.common.Mod.*;
import net.minecraftforge.fml.common.event.*;
import nuke.darkness.proxy.*;

@Mod(modid = References.MODID, name = References.VERSION, version = References.VERSION, clientSideOnly = false, serverSideOnly = false, dependencies = References.DEPENDENCIES)

@Mod.EventBusSubscriber
public class Darkness {

	@Instance(References.MODID)
	public static Darkness instance;

	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

//	@ObjectHolder(References.MODID)
//	public static class Blocks {
//		public static final Block test_block = null;
//	}
//
//	@ObjectHolder(References.MODID)
//	public static class Items {
//		public static final Item test_block = null;
//	}
//
//	@SubscribeEvent
//	public static void registerBlocks( RegistryEvent.Register<Block> e ) {
//		e.getRegistry().registerAll(
//				new BlockTest().setRegistryName(References.MODID, "test").setCreativeTab(CreativeTabs.BUILDING_BLOCKS)
//		);
//
//		/*
//		 * Tile Entities
//		 * GameRegistry.registerTileEntity(TileEntityEntity.class, References.MODID + ".entity");
//		 */
//	}
//
//	@SubscribeEvent
//	public static void registerItems( RegistryEvent.Register<Item> e ) {
//		Block[] blocks = { Blocks.test_block };
//
//		for (Block b : blocks) {
//			e.getRegistry().register(new ItemBlock(b).setRegistryName(b.getRegistryName()));
//		}
//	}
//
//	@SubscribeEvent
//	@SideOnly(Side.CLIENT)
//	public static void registerModels( ModelRegistryEvent e ) throws Exception {
//		for (Field f : Item.class.getDeclaredFields()) {
//			Item item = (Item) f.get(null);
//			ModelLoader.setCustomModelResourceLocation(item, 0,
//			        new ModelResourceLocation(item.getRegistryName(), "inventory"));
//		}
//		//ClientRegistry.bindTileEntitySpecialRenderer(tileEntityEntity, new EntityRenderer());
//	}

	@EventHandler
	public void preInit( FMLPreInitializationEvent e ) {
		proxy.preInit(e);
	}

	@EventHandler
	public void init( FMLInitializationEvent e ) {
		proxy.init(e);
	}

	@EventHandler
	public void postInit( FMLPostInitializationEvent e ) {
		proxy.postInit(e);
	}

	@EventHandler
	public void serverStarting( FMLServerStartingEvent e ) {

	}

	public static String prependModID( String name ) {
		return References.MODID + ":" + name;
	}
}