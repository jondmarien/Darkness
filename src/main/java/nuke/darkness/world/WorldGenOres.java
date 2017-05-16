package nuke.darkness.world;

import java.util.*;

import net.minecraft.util.math.*;
import net.minecraft.world.*;
import net.minecraft.world.chunk.*;
import net.minecraft.world.gen.feature.*;
import net.minecraftforge.fml.common.*;
import nuke.darkness.*;

public class WorldGenOres implements IWorldGenerator {

	@Override
	public void generate( Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
	        IChunkProvider chunkProvider )
	{
		switch (world.provider.getDimension()) {
			case 0: {
				WorldGenMinable ore_duo = new WorldGenMinable(DarknessContent.ore_duo.getDefaultState(), 9);
				for (int i = 0; i < 5; i++) {
					int x = chunkX * 16 + random.nextInt(16);
					int y = random.nextInt(DarknessConfig.duoMaxY - DarknessConfig.duoMinY) + DarknessConfig.duoMinY;
					int z = chunkZ * 16 + random.nextInt(16);
					ore_duo.generate(world, random, new BlockPos(x, y, z));
				}
				WorldGenMinable ore_tri = new WorldGenMinable(DarknessContent.ore_tri.getDefaultState(), 9);
				for (int i = 0; i < 5; i++) {
					int x = chunkX * 16 + random.nextInt(16);
					int y = random.nextInt(DarknessConfig.triMaxY - DarknessConfig.triMinY) + DarknessConfig.triMinY;
					int z = chunkZ * 16 + random.nextInt(16);
					ore_tri.generate(world, random, new BlockPos(x, y, z));
				}
				break;
			}
			default:
				break;
		}
	}
}