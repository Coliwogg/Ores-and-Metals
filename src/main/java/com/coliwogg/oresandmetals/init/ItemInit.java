package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(OresandMetals.MODID)
@Mod.EventBusSubscriber(modid=OresandMetals.MODID, bus=Bus.MOD)
public class ItemInit {
	
	public static final Item COPPER_FRAGMENTS = null;
	public static final Item TIN_FRAGMENTS = null;
	public static final Item BRONZE_CHUNK = null;
	public static final Item BRONZE_INGOT = null;
		
	public static final Item STEEL_CHUNK = null;
	public static final Item STEEL_INGOT = null;
	
	public static final Item MITHRIL_FRAGMENTS = null;
	public static final Item MITHRIL_CHUNK = null;
	public static final Item MITHRIL_INGOT = null;
	
	public static final Item ADAMANTITE_FRAGMENTS = null;
	public static final Item ADAMANTITE_CHUNK = null;
	public static final Item ADAMANTITE_INGOT = null;

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("copper_fragments"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("tin_fragments"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_chunk"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_ingot"));
				
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_chunk"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_ingot"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_fragments"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_chunk"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_ingot"));
		
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_fragments"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_chunk"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_ingot"));
	}
}
