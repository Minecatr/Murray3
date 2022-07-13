package net.mcreator.murray.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.init.MurrayModItems;

public class MinecatShieldsProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
				.getItem() == MurrayModItems.MINECAT_HELMET.get())) {
			(itemstack).shrink(1);
		}
	}
}
