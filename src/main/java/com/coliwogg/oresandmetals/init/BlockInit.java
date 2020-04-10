package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;
import com.coliwogg.oresandmetals.objects.blocks.ModOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
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
	public static final Block MITHRIL_ORE = null;
	public static final Block ADAMANTITE_ORE = null;
	public static final Block RUNITE_ORE = null;
	
	public static final Block BRONZE_BLOCK = null;
	public static final Block STEEL_BLOCK = null;
	public static final Block MITHRIL_BLOCK = null;
	public static final Block ADAMANTITE_BLOCK = null;
	public static final Block RUNITE_BLOCK = null;

	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("copper_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("tin_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("mithril_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("adamantite_ore"));
		event.getRegistry().register(new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)).setRegistryName("runite_ore"));
	
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("bronze_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("steel_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("mithril_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("adamantite_block"));
		event.getRegistry().register(new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)).setRegistryName("runite_block"));
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(COPPER_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("copper_ore"));
		event.getRegistry().register(new BlockItem(TIN_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("tin_ore"));
		event.getRegistry().register(new BlockItem(MITHRIL_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_ore"));
		event.getRegistry().register(new BlockItem(ADAMANTITE_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_ore"));
		event.getRegistry().register(new BlockItem(RUNITE_ORE, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_ore"));
		
		event.getRegistry().register(new BlockItem(BRONZE_BLOCK, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_block"));
		event.getRegistry().register(new BlockItem(STEEL_BLOCK, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_block"));
		event.getRegistry().register(new BlockItem(MITHRIL_BLOCK, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_block"));
		event.getRegistry().register(new BlockItem(ADAMANTITE_BLOCK, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_block"));
		event.getRegistry().register(new BlockItem(RUNITE_BLOCK, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_block"));
	}
}
