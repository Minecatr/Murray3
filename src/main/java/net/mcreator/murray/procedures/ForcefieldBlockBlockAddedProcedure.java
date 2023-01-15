package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.MurrayMod;

public class ForcefieldBlockBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MurrayMod.queueServerWork(200, () -> {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		});
	}
}
