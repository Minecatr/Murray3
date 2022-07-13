package net.mcreator.murray.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.murray.init.MurrayModItems;

public class TrueEnderiumEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.TRUE_ENDERIUM_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.TRUE_ENDERIUM_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.TRUE_ENDERIUM_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.TRUE_ENDERIUM_HELMET.get()) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.LEVITATION) : false) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.LEVITATION);
			}
			if (entity.getY() <= -60) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 6, (entity.getDeltaMovement().z())));
			}
		}
	}
}
