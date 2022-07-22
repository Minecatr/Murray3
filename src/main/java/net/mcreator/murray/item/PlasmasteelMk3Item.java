
package net.mcreator.murray.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.murray.procedures.PlasmasteelHelmetTickEventProcedure;
import net.mcreator.murray.procedures.PlasmasteelFlyMk2Procedure;
import net.mcreator.murray.init.MurrayModTabs;

public abstract class PlasmasteelMk3Item extends ArmorItem {
	public PlasmasteelMk3Item(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{12, 12, 12, 12}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 20;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.beacon.activate"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "plasmasteel_mk_3";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.1f;
			}
		}, slot, properties);
	}

	public static class Helmet extends PlasmasteelMk3Item {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/plasmasteel_mk3__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PlasmasteelHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends PlasmasteelMk3Item {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/plasmasteel_mk3__layer_1.png";
		}
	}

	public static class Leggings extends PlasmasteelMk3Item {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/plasmasteel_mk3__layer_2.png";
		}
	}

	public static class Boots extends PlasmasteelMk3Item {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/plasmasteel_mk3__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PlasmasteelFlyMk2Procedure.execute(entity);
		}
	}
}
