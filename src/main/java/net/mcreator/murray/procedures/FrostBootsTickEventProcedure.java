package net.mcreator.murray.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.init.MurrayModBlocks;

public class FrostBootsTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.FROST_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.FROST_HELMET.get()) {
			if (entity.isSprinting() == true) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y - 1, z), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + 1, y - 1, z), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x - 1, y - 1, z), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y - 1, z + 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x, y - 1, z - 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y - 1, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + 1, y - 1, z + 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y - 1, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x - 1, y - 1, z - 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x - 1, y - 1, z + 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x - 1, y - 1, z + 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
				if ((world.getBlockState(new BlockPos(x + 1, y - 1, z - 1))).getBlock() == Blocks.AIR) {
					world.setBlock(new BlockPos(x + 1, y - 1, z - 1), MurrayModBlocks.TRAIL_ICE.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
