
package net.mcreator.murray.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.murray.procedures.XZswapRightClickedInAirProcedure;
import net.mcreator.murray.init.MurrayModTabs;
import net.mcreator.murray.init.MurrayModSounds;

import java.util.List;

public class XZswapItem extends RecordItem {
	public XZswapItem() {
		super(0, MurrayModSounds.REGISTRY.get(new ResourceLocation("murray:xzswap")),
				new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_MISC).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("swaps x and z position"));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		XZswapRightClickedInAirProcedure.execute(entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
		return ar;
	}
}
