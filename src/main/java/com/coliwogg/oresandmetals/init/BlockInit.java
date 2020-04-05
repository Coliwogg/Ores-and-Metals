package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OresandMetals.MODID)
@Mod.EventBusSubscriber(modid=OresandMetals.MODID, bus=Bus.MOD)
public class BlockInit {

	public static final Block COPPER_ORE = null;
	public static final Block TIN_ORE = null;
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).sound(SoundType.STONE)).setRegistryName("copper_ore"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 15.0F).sound(SoundType.STONE)).setRegistryName("tin_ore"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(COPPER_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("copper_ore"));
		event.getRegistry().register(new BlockItem(TIN_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("tin_ore"));
	}
}
