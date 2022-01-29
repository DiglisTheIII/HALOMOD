package com.diglis.halowip.core.itemgroup;

import com.diglis.halowip.core.init.ItemInit;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class HaloModItemGroupWeapons extends ItemGroup {

	public static final HaloModItemGroupWeapons HALO_CRAFTING_EVOLVED = new HaloModItemGroupWeapons(ItemGroup.TABS.length, "halowip");
	
	public HaloModItemGroupWeapons(int index, String label) {
		super(index, label);

	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.ASSAULT_RIFLE.get());
	}

}
