package net.mcreator.murray.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.murray.init.MurrayModEntities;
import net.mcreator.murray.entity.MoltronMechEntity;

public class MechStrikeRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		(itemstack).shrink(1);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new MoltronMechEntity(MurrayModEntities.MOLTRON_MECH.get(), _level);
			entityToSpawn.moveTo(x, (y + 20), z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
	}
}
