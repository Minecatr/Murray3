package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

public class CorruptionGrassSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
	}
}
