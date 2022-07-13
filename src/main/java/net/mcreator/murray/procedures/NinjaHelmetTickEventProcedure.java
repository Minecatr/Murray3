package net.mcreator.murray.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.entity.ShurikenEntity;

public class NinjaHelmetTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.NINJA_HELMET.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.NINJA_BOOTS.get()) {
			if (entity.isShiftKeyDown()) {
				if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					ShurikenEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), 4, 1, 0);
				}
			}
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 3, (false), (false)));
			}
		}
	}
}
