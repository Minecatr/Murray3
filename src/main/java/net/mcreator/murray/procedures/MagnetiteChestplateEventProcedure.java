package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.MurrayMod;

public class MagnetiteChestplateEventProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = ((entity instanceof LivingEntity _entGetArmor
					? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
					: ItemStack.EMPTY).getItem() == MurrayModItems.MAGNETITE_ARMOR_CHESTPLATE.get());
			_player.onUpdateAbilities();
		}
		MurrayMod.queueServerWork(20, () -> {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof LivingEntity _entGetArmor
						? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST)
						: ItemStack.EMPTY).getItem() == MurrayModItems.MAGNETITE_ARMOR_CHESTPLATE.get());
				_player.onUpdateAbilities();
			}
		});
	}
}
