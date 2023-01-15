package net.mcreator.murray.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class MagnetiteSwordLivingEntityIsHitWithToolProcedure {
	public static void execute(double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(((x + sourceentity.getX()) / 2), ((y + sourceentity.getY()) / 2), ((z + sourceentity.getZ()) / 2));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(((x + sourceentity.getX()) / 2), ((y + sourceentity.getY()) / 2), ((z + sourceentity.getZ()) / 2),
						_ent.getYRot(), _ent.getXRot());
		}
	}
}
