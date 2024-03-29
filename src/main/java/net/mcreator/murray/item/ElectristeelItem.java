
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
import net.mcreator.murray.procedures.ElectristeelBootsTickEventProcedure;
import net.mcreator.murray.procedures.ElectristeelBodyTickEventProcedure;
import net.mcreator.murray.init.MurrayModTabs;

public abstract class ElectristeelItem extends ArmorItem {
	public ElectristeelItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{8, 8, 8, 8}[slot.getIndex()];
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
				return "electristeel";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends ElectristeelItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/electristeel__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			PlasmasteelHelmetTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ElectristeelItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/electristeel__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElectristeelBodyTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}

	public static class Leggings extends ElectristeelItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/electristeel__layer_2.png";
		}
	}

	public static class Boots extends ElectristeelItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(MurrayModTabs.TAB_MURRAY_3_HALL_OF_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "murray:textures/models/armor/electristeel__layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ElectristeelBootsTickEventProcedure.execute(entity);
		}
	}
}
