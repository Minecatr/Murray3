package net.mcreator.murray.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class CactusArmorHelmetTickEventProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((itemstack).isEnchantable() == true) {
			(itemstack).enchant(Enchantments.THORNS, 5);
		}
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("cactus").bypassArmor(), (float) 0.1);
	}
}
