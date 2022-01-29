package com.diglis.halowip;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.diglis.halowip.core.init.BlockInit;
import com.diglis.halowip.core.init.FeatureInit;
import com.diglis.halowip.core.init.ItemInit;
import com.diglis.halowip.core.itemgroup.HaloModItemGroupMisc;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("halowip")
@Mod.EventBusSubscriber(modid = HaloWip.MOD_ID, bus = Bus.MOD)
public class HaloWip {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "halowip";

	public HaloWip() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		
		MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, FeatureInit::addOres);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItem(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(HaloModItemGroupMisc.HALO_CRAFTING_EVOLVED))
					.setRegistryName(block.getRegistryName()));
		});
	}
}
