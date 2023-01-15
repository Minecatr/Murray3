
package net.mcreator.murray.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.murray.procedures.MechStrikeRightClickedInAirProcedure;
import net.mcreator.murray.init.MurrayModTabs;

public class MechStrikeItem extends Item {
	public MechStrikeItem() {
		super(new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		MechStrikeRightClickedInAirProcedure.execute(world, x, y, z, itemstack);
		return ar;
	}
}
