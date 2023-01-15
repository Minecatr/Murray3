package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

public class CorruptParticleBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), MurrayModBlocks.CORRUPT_PARTICLE.get().defaultBlockState(), 3);
		world.setBlock(new BlockPos(x, y - 1, z), MurrayModBlocks.CORRUPT_PARTICLE.get().defaultBlockState(), 3);
	}
}
