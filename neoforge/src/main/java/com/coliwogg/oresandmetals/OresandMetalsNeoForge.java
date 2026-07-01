package com.coliwogg.oresandmetals;


import com.coliwogg.oresandmetals.platform.NeoForgeRegistryHelper;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class OresandMetalsNeoForge {

    public static IEventBus EVENT_BUS;

    public OresandMetalsNeoForge(IEventBus modEventBus) {
        EVENT_BUS = modEventBus;

        NeoForgeRegistryHelper.CREATIVE_MODE_TABS.register(EVENT_BUS);
        NeoForgeRegistryHelper.ITEMS.register(EVENT_BUS);
        NeoForgeRegistryHelper.BLOCKS.register(EVENT_BUS);
        NeoForgeRegistryHelper.ENTITY_TYPES.register(EVENT_BUS);

        OresAndMetals.init();
    }
}