
package net.mcreator.murray.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.murray.procedures.MagnetiteSwordLivingEntityIsHitWithToolProcedure;

public class MagnetiteSwordItem extends SwordItem {
	public MagnetiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		MagnetiteSwordLivingEntityIsHitWithToolProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
		return retval;
	}
}
