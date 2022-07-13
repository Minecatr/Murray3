
package net.mcreator.murray.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.murray.procedures.VenomGlaiveEntitySwingsItemProcedure;

public class VenomGlaiveItem extends SwordItem {
	public VenomGlaiveItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		VenomGlaiveEntitySwingsItemProcedure.execute(entity);
		return retval;
	}
}
