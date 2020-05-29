package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.config.Config;
import com.coliwogg.oresandmetals.init.BlockInit;
import com.coliwogg.oresandmetals.init.EntityInit;
import com.coliwogg.oresandmetals.init.ItemInit;
import com.coliwogg.oresandmetals.objects.items.*;
import com.coliwogg.oresandmetals.world.gen.OreGeneration;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("oresandmetals")
@Mod.EventBusSubscriber(modid = OresandMetals.MODID, bus = Bus.MOD)
public class OresandMetals {

    public static final String MODID = "oresandmetals";
    public static final Logger LOGGER = LogManager.getLogger();

    public static OresandMetals instance;

    public OresandMetals() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(modEventBus);
        BlockInit.BLOCKS.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);

        instance = this;

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.server_config);
        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.client_config);

        Config.loadConfig(Config.client_config, FMLPaths.CONFIGDIR.get().resolve("oresandmetals-client.toml").toString());
        Config.loadConfig(Config.server_config, FMLPaths.CONFIGDIR.get().resolve("oresandmetals-server.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry<Item> registry = event.getRegistry();

        ((BronzeArrow) (ItemInit.BRONZE_ARROW.get())).setItemReference(ItemInit.BRONZE_ARROW);
        ((IronArrow) (ItemInit.IRON_ARROW.get())).setItemReference(ItemInit.IRON_ARROW);
        ((SteelArrow) (ItemInit.STEEL_ARROW.get())).setItemReference(ItemInit.STEEL_ARROW);
        ((MithrilArrow) (ItemInit.MITHRIL_ARROW.get())).setItemReference(ItemInit.MITHRIL_ARROW);
        ((AdamantArrow) (ItemInit.ADAMANT_ARROW.get())).setItemReference(ItemInit.ADAMANT_ARROW);
        ((RuneArrow) (ItemInit.RUNE_ARROW.get())).setItemReference(ItemInit.RUNE_ARROW);

        BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
            final Item.Properties properties = new Item.Properties().group(OresandMetalsItemGroup.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });

        LOGGER.debug("Registered BlockItems.");
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(OresandMetals.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    }

    @SubscribeEvent
    public static void loadComplete(FMLLoadCompleteEvent event) {
        OreGeneration.generateOre();
        OreGeneration.generateNetherOre();
        OreGeneration.generateEndOre();
    }

    public static class OresandMetalsItemGroup extends ItemGroup {
        public static final OresandMetalsItemGroup instance = new OresandMetalsItemGroup(ItemGroup.GROUPS.length, "oresandmetalstab");

        private OresandMetalsItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.BRONZE_INGOT.get());
        }
    }
}
