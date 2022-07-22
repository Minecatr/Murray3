
package net.mcreator.murray.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.murray.init.MurrayModTabs;

public class BeansItem extends Item {
	public BeansItem() {
		super(new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.2f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
