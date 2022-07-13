
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.murray.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.murray.world.inventory.MagneticDissasemblerGuiMenu;
import net.mcreator.murray.world.inventory.InvestingMenu;
import net.mcreator.murray.world.inventory.CNDGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MurrayModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<InvestingMenu> INVESTING = register("investing", (id, inv, extraData) -> new InvestingMenu(id, inv, extraData));
	public static final MenuType<MagneticDissasemblerGuiMenu> MAGNETIC_DISSASEMBLER_GUI = register("magnetic_dissasembler_gui",
			(id, inv, extraData) -> new MagneticDissasemblerGuiMenu(id, inv, extraData));
	public static final MenuType<CNDGUIMenu> CNDGUI = register("cndgui", (id, inv, extraData) -> new CNDGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
