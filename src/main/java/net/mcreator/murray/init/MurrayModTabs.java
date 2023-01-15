
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MurrayModTabs {
	public static CreativeModeTab TAB_MURRAY_3_HALL_OF_ARMOR;
	public static CreativeModeTab TAB_MURRAY_3_BLOCKS;
	public static CreativeModeTab TAB_MURRAY_3_MISC;

	public static void load() {
		TAB_MURRAY_3_HALL_OF_ARMOR = new CreativeModeTab("tabmurray_3_hall_of_armor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MurrayModItems.PLASMASTEEL_HELMET.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MURRAY_3_BLOCKS = new CreativeModeTab("tabmurray_3_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MurrayModBlocks.KING.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MURRAY_3_MISC = new CreativeModeTab("tabmurray_3_misc") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MurrayModItems.CHIP.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
