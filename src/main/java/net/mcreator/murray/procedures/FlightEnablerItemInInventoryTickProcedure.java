package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.MurrayMod;

public class FlightEnablerItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = ((entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(MurrayModItems.FLIGHT_ENABLER.get()))
					: false) == true);
			_player.onUpdateAbilities();
		}
		MurrayMod.queueServerWork(20, () -> {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = ((entity instanceof Player _playerHasItem
						? _playerHasItem.getInventory().contains(new ItemStack(MurrayModItems.FLIGHT_ENABLER.get()))
						: false) == true);
				_player.onUpdateAbilities();
			}
		});
	}
}
