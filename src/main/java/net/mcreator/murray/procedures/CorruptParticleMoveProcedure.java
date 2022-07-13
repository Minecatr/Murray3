package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import java.util.Random;

public class CorruptParticleMoveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		Random = Math.round(Math.random() * 6);
		if (Random == 1) {
			world.setBlock(new BlockPos(x + 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 2) {
			world.setBlock(new BlockPos(x - 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 3) {
			world.setBlock(new BlockPos(x, y + 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 4) {
			world.setBlock(new BlockPos(x, y - 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 5) {
			world.setBlock(new BlockPos(x, y, z + 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 6) {
			world.setBlock(new BlockPos(x, y, z - 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
