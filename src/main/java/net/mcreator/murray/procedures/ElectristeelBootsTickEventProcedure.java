package net.mcreator.murray.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.murray.init.MurrayModItems;

public class ElectristeelBootsTickEventProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.ELECTRISTEEL_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
						.getItem() == MurrayModItems.ELECTRISTEEL_HELMET.get()) {
			if (entity.isSprinting()) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3, 4, (false), (false)));
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3, 2, (false), (false)));
			}
		}
	}
}
