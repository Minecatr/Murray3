
package net.mcreator.murray.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.murray.init.MurrayModTabs;

public class MinecoinItem extends Item {
	public MinecoinItem() {
		super(new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
