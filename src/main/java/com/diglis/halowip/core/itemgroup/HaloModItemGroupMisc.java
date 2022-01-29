package com.diglis.halowip.core.itemgroup;

import com.diglis.halowip.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HaloModItemGroupMisc extends ItemGroup {

	public static final HaloModItemGroupMisc HALO_CRAFTING_EVOLVED = new HaloModItemGroupMisc(ItemGroup.TABS.length, "halowip");

	public HaloModItemGroupMisc(int index, String label) {
		super(index, label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ItemStack makeIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ItemInit.PURE_TITANIUM.get());
	}

}
