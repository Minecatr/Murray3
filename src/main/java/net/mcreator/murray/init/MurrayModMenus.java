
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.murray.world.inventory.MagneticDissasemblerGuiMenu;
import net.mcreator.murray.world.inventory.InvestingMenu;
import net.mcreator.murray.world.inventory.CNDGUIMenu;
import net.mcreator.murray.MurrayMod;

public class MurrayModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MurrayMod.MODID);
	public static final RegistryObject<MenuType<InvestingMenu>> INVESTING = REGISTRY.register("investing",
			() -> IForgeMenuType.create(InvestingMenu::new));
	public static final RegistryObject<MenuType<MagneticDissasemblerGuiMenu>> MAGNETIC_DISSASEMBLER_GUI = REGISTRY
			.register("magnetic_dissasembler_gui", () -> IForgeMenuType.create(MagneticDissasemblerGuiMenu::new));
	public static final RegistryObject<MenuType<CNDGUIMenu>> CNDGUI = REGISTRY.register("cndgui", () -> IForgeMenuType.create(CNDGUIMenu::new));
}
