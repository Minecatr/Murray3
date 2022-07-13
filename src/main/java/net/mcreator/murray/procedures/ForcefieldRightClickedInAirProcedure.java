package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModBlocks;

public class ForcefieldRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double Yoffset = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 1000);
		Yoffset = 0;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			if ((world.getBlockState(new BlockPos(x + 2, y + Yoffset, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + 2, y + Yoffset, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 2, y + Yoffset, z - 1))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + 2, y + Yoffset, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 2, y + Yoffset, z + 1))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + 2, y + Yoffset, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y + Yoffset, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x, y + Yoffset, z + 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + Yoffset, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 1, y + Yoffset, z + 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + Yoffset, z + 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + 1, y + Yoffset, z + 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 2, y + Yoffset, z))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 2, y + Yoffset, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 2, y + Yoffset, z - 1))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 2, y + Yoffset, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 2, y + Yoffset, z + 1))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 2, y + Yoffset, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x, y + Yoffset, z - 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x, y + Yoffset, z - 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + Yoffset, z - 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x - 1, y + Yoffset, z - 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + Yoffset, z - 2))).getBlock() == Blocks.AIR) {
				world.setBlock(new BlockPos(x + 1, y + Yoffset, z - 2), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
			}
			Yoffset = Yoffset + 1;
		}
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y - 1, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y - 1, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y - 1, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y - 1, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y - 1, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y - 1, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y - 1, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y - 1, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y - 1, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y + 3, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y + 3, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y + 3, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y + 3, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x + 1, y + 3, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x + 1, y + 3, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 3, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 3, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 3, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 3, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x, y + 3, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x, y + 3, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y + 3, z + 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y + 3, z + 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y + 3, z))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y + 3, z), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(new BlockPos(x - 1, y + 3, z - 1))).getBlock() == Blocks.AIR) {
			world.setBlock(new BlockPos(x - 1, y + 3, z - 1), MurrayModBlocks.FORCEFIELD_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
