package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

public class JarnumleaveUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random = 0;
		random = Math.round(Mth.nextDouble(RandomSource.create(), 1, 5));
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z)).canOcclude() || world.getBlockState(new BlockPos(x - 1, y - 1, z)).canOcclude()
				|| world.getBlockState(new BlockPos(x, y - 1, z + 1)).canOcclude() || world.getBlockState(new BlockPos(x, y - 1, z - 1)).canOcclude())
				&& world.isEmptyBlock(new BlockPos(x, y - 1, z)) && random == 1) {
			world.setBlock(new BlockPos(x, y - 1, z), MurrayModBlocks.JARNUMLEAVE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y - 1, z + 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 1, y - 1, z + 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 0, y - 1, z + 2)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 0, y - 1, z - 0)).canOcclude()) && world.isEmptyBlock(new BlockPos(x + 0, y - 1, z + 1))
				&& random == 2) {
			world.setBlock(new BlockPos(x + 0, y - 1, z + 1), MurrayModBlocks.JARNUMLEAVE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 1, y - 1, z - 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 1, y - 1, z - 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 0, y - 1, z - 2)).canOcclude()) && world.isEmptyBlock(new BlockPos(x + 0, y - 1, z - 1))
				&& random == 3) {
			world.setBlock(new BlockPos(x + 0, y - 1, z - 1), MurrayModBlocks.JARNUMLEAVE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 2, y - 1, z + 0)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 0, y - 1, z + 0)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 1, y - 1, z + 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x + 1, y - 1, z - 1)).canOcclude()) && world.isEmptyBlock(new BlockPos(x + 1, y - 1, z + 0))
				&& random == 4) {
			world.setBlock(new BlockPos(x + 1, y - 1, z + 0), MurrayModBlocks.JARNUMLEAVE.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(new BlockPos(x + 0, y - 1, z + 0)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 2, y - 1, z + 0)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 1, y - 1, z + 1)).canOcclude()
				|| world.getBlockState(new BlockPos(x - 1, y - 1, z - 1)).canOcclude()) && world.isEmptyBlock(new BlockPos(x - 1, y - 1, z + 0))
				&& random == 5) {
			world.setBlock(new BlockPos(x - 1, y - 1, z + 0), MurrayModBlocks.JARNUMLEAVE.get().defaultBlockState(), 3);
		}
	}
}
