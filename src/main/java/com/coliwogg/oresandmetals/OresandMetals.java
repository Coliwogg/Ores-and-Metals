package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.init.ItemInit;
import com.coliwogg.oresandmetals.world.gen.OreGeneration;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("oresandmetals")
@Mod.EventBusSubscriber(modid=OresandMetals.MODID, bus=Bus.MOD)
public class OresandMetals {
	
	public static final String MODID = "oresandmetals";
	public static OresandMetals instance;

    public OresandMetals() {  
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
    	modEventBus.addListener(this::doClientStuff);
        
    	instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    
    @SubscribeEvent
    public static void loadComplete(FMLLoadCompleteEvent event) {
    	OreGeneration.generateOre();
    }
    
    public static class OresandMetalsItemGroup extends ItemGroup {
    	public static final OresandMetalsItemGroup instance = new OresandMetalsItemGroup(ItemGroup.GROUPS.length, "oresandmetalstab");
    	private OresandMetalsItemGroup(int index, String label) {
    		super(index, label);
    	}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ItemInit.BRONZE_INGOT);
		}
    }
}
