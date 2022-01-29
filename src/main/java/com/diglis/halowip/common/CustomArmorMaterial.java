package com.diglis.halowip.common;

import com.diglis.halowip.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum CustomArmorMaterial implements IArmorMaterial {
	MK6_ARMOR("mjolnir", 10, new int[] {32, 43, 35, 30}, 17, SoundEvents.ARMOR_EQUIP_DIAMOND, 8f, 2.6f, Ingredient.of(ItemInit.PURE_TITANIUM.get())),
	NOVISR_MK6_HELM("mjolnirnovisr", 10, new int[] {24, 32, 26, 22}, 17, SoundEvents.ARMOR_EQUIP_DIAMOND, 6f, 1.5f, Ingredient.of(ItemInit.PURE_TITANIUM.get())),
	BLUE_MK6_HELM("mjolnirblue", 10, new int[] {32, 43, 35, 30}, 17, SoundEvents.ARMOR_EQUIP_DIAMOND, 8f, 2.6f, Ingredient.of(ItemInit.PURE_TITANIUM.get()));

	private static final int[] baseDurability = { 128, 144, 160, 112 };
	private final String name;
	private final int durabilityMultiplier;
	private final int[] armorVal;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	CustomArmorMaterial(String name, int durabilityMultiplier, int[] armorVal, int enchantability,
			SoundEvent equipSound, float toughness, float knockbackResistance, Ingredient repairIngredient) {
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.armorVal = armorVal;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repairIngredient;
	}

	@Override
	public int getDurabilityForSlot(EquipmentSlotType p_200896_1_) {
		return this.baseDurability[p_200896_1_.getIndex()] * this.durabilityMultiplier;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlotType p_200902_1_) {
		return this.armorVal[p_200902_1_.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getEquipSound() {
		return this.equipSound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return this.repairIngredient;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return this.knockbackResistance;
	}
}
