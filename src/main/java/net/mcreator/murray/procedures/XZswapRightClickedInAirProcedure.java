package net.mcreator.murray.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class XZswapRightClickedInAirProcedure {
	public static void execute(double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 60);
		{
			Entity _ent = entity;
			_ent.teleportTo(z, y, x);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(z, y, x, _ent.getYRot(), _ent.getXRot());
		}
	}
}
