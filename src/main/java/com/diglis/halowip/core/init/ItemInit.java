package com.diglis.halowip.core.init;

import com.diglis.halowip.HaloWip;
import com.diglis.halowip.common.CustomArmorMaterial;
import com.diglis.halowip.common.PickaxeToolMaterial;
import com.diglis.halowip.core.itemgroup.*;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, HaloWip.MOD_ID);

	public static final RegistryObject<Item> ASSAULT_RIFLE = ITEMS.register("assault_rifle",
			() -> new Item(new Item.Properties().tab(HaloModItemGroupWeapons.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> RIFLE_AMMO = ITEMS.register("ammo_pouch", 
			() -> new Item(new Item.Properties().tab(HaloModItemGroupWeapons.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", 
			() -> new Item(new Item.Properties().tab(HaloModItemGroupMisc.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> PURE_TITANIUM = ITEMS.register("pure_titanium", 
			() -> new Item(new Item.Properties().tab(HaloModItemGroupMisc.HALO_CRAFTING_EVOLVED).fireResistant()));
	
	public static final RegistryObject<Item> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", 
			() -> new PickaxeItem(PickaxeToolMaterial.TITANIUM_PICKAXE, 10, -1f, new Item.Properties().tab(HaloModItemGroupWeapons.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> TITANIUM_SWORD = ITEMS.register("titanium_sword", 
			() -> new SwordItem(PickaxeToolMaterial.TITANIUM_SWORD, 5, -1f, new Item.Properties().tab(HaloModItemGroupWeapons.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> MASTER_CHIEF_HELMET = ITEMS.register("mk6_helm",
			() -> new ArmorItem(CustomArmorMaterial.MK6_ARMOR, EquipmentSlotType.HEAD, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED).fireResistant()));
	
	public static final RegistryObject<Item> MASTER_CHIEF_CHEST = ITEMS.register("mk6_chest", 
			() -> new ArmorItem(CustomArmorMaterial.MK6_ARMOR, EquipmentSlotType.CHEST, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED).fireResistant()));
	
	public static final RegistryObject<Item> MASTER_CHIEF_LEGGINGS = ITEMS.register("mk6_legs", 
			() -> new ArmorItem(CustomArmorMaterial.MK6_ARMOR, EquipmentSlotType.LEGS, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED).fireResistant()));
	
	public static final RegistryObject<Item> MASTER_CHIEF_BOOTS = ITEMS.register("mk6_boots", 
			() -> new ArmorItem(CustomArmorMaterial.MK6_ARMOR, EquipmentSlotType.FEET, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED).fireResistant()));
	
	public static final RegistryObject<Item> TRANSPARENT_MK6_HELM = ITEMS.register("mk6_clear", 
			() -> new ArmorItem(CustomArmorMaterial.NOVISR_MK6_HELM, EquipmentSlotType.HEAD, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED)));
	
	public static final RegistryObject<Item> BLUE_MK6_HELM = ITEMS.register("mk6_blue", 
			() -> new ArmorItem(CustomArmorMaterial.BLUE_MK6_HELM, EquipmentSlotType.HEAD, new Item.Properties().tab(HaloModItemGroupArmor.HALO_CRAFTING_EVOLVED)));
	
	

}
