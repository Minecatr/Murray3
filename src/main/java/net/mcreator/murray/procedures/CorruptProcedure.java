package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

public class CorruptProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() >= 0.33) {
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y, z + 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y, z - 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y + 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y + 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z + 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y + 1, z - 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x + 1, y - 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x - 1, y - 1, z), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z + 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
			if (Math.random() >= 0.5) {
				if (!((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.AIR)) {
					if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						world.setBlock(new BlockPos(x, y - 1, z - 1), MurrayModBlocks.ACTIVE_CORRUPTION_GRASS.get().defaultBlockState(), 3);
					}
				}
			}
		} else {
			world.setBlock(new BlockPos(x, y, z), MurrayModBlocks.CORRUPTION_GRASS.get().defaultBlockState(), 3);
		}
	}
}
