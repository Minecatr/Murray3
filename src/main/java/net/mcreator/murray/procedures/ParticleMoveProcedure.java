package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

import java.util.Random;

public class ParticleMoveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Random = 0;
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == MurrayModBlocks.CORRUPTION_GRASS.get()) {
			world.setBlock(new BlockPos(x, y, z), MurrayModBlocks.CORRUPT_PARTICLE.get().defaultBlockState(), 3);
		}
		Random = Math.round(Math.random() * 6);
		if (Random == 1
				&& ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x + 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 2
				&& ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x - 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 3
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x, y + 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 4
				&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x, y - 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 5
				&& ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x, y, z + 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if (Random == 6
				&& ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.AIR) == true) {
			world.setBlock(new BlockPos(x, y, z - 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
