package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid=OresandMetals.MODID, bus=Bus.MOD)
@ObjectHolder(OresandMetals.MODID)
public class ItemInit {
	
	public static final Item BRONZE_INGOT = null;
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName("bronze_ingot"));
	}
}
