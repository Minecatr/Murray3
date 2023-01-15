package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SandwormUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x + 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x - 1, y, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x, y + 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x, y - 1, z), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x, y, z - 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.world.level.material.Material.SAND) {
			world.setBlock(new BlockPos(x, y, z + 1), (world.getBlockState(new BlockPos(x, y, z))), 3);
		}
		world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
