package net.mcreator.murray.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.murray.init.MurrayModItems;

public class FlightEnablerItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = ((entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(MurrayModItems.FLIGHT_ENABLER.get()))
					: false) == true);
			_player.onUpdateAbilities();
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (entity instanceof Player _player) {
					_player.getAbilities().mayfly = ((entity instanceof Player _playerHasItem
							? _playerHasItem.getInventory().contains(new ItemStack(MurrayModItems.FLIGHT_ENABLER.get()))
							: false) == true);
					_player.onUpdateAbilities();
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 20);
	}
}
