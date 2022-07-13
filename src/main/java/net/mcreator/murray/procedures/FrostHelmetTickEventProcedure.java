package net.mcreator.murray.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.init.MurrayModItems;
import net.mcreator.murray.entity.BlowAbilityEntity;

public class FrostHelmetTickEventProcedure {
	public static void execute(Entity entity) {
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
			if (entity.isShiftKeyDown() == true) {
				if (entity instanceof LivingEntity _ent_sa && !_ent_sa.level.isClientSide()) {
					BlowAbilityEntity.shoot(_ent_sa.level, _ent_sa, _ent_sa.level.getRandom(), (float) 0.5, 0, 2);
				}
			}
		}
	}
}
