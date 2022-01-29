package com.diglis.halowip.core.itemgroup;

import com.diglis.halowip.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HaloModItemGroupArmor extends ItemGroup {

	public static final HaloModItemGroupArmor HALO_CRAFTING_EVOLVED = new HaloModItemGroupArmor(ItemGroup.TABS.length, "halowip");
	
	public HaloModItemGroupArmor(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.MASTER_CHIEF_HELMET.get());
	}

}
