package com.diglis.halowip.core.init;

import com.diglis.halowip.HaloWip;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			HaloWip.MOD_ID);

	public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
			() -> new Block(AbstractBlock.Properties.copy(Blocks.DIAMOND_ORE).harvestTool(ToolType.PICKAXE).strength(30f).requiresCorrectToolForDrops().harvestLevel(3)));
}
