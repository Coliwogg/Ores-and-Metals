package com.coliwogg.oresandmetals.platform;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import com.coliwogg.oresandmetals.platform.services.IRegistryHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public class FabricRegistryHelper implements IRegistryHelper {

    @Override
    public Supplier<Item> registerItem(String name, Supplier<Item> item) {
        Item registeredItem = Registry.register(BuiltInRegistries.ITEM, OresAndMetals.identifier(name), item.get());
        return () -> registeredItem;
    }

    @Override
    public Supplier<Block> registerBlock(String name, Supplier<Block> block) {
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, OresAndMetals.identifier(name), block.get());
        registerBlockItem(name, () -> registeredBlock);
        return () -> registeredBlock;
    }

    @Override
    public Supplier<Item> registerBlockItem(String name, Supplier<Block> block) {
        Item registeredItem = Registry.register(BuiltInRegistries.ITEM, OresAndMetals.identifier(name), new BlockItem(block.get(), new Item.Properties()));
        return () -> registeredItem;
    }

    @Override
    public Supplier<EntityType<ModArrowEntity>> registerEntity(String name, Supplier<EntityType<ModArrowEntity>> entityType) {
        EntityType<ModArrowEntity> registeredEntity = Registry.register(BuiltInRegistries.ENTITY_TYPE, OresAndMetals.identifier(name), entityType.get());
        return () -> registeredEntity;
    }

    @Override
    public Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<CreativeModeTab> tab) {
        CreativeModeTab built = tab.get();

        CreativeModeTab registered = Registry.register(
                BuiltInRegistries.CREATIVE_MODE_TAB,
                OresAndMetals.identifier(name),
                built
        );

        return () -> registered;
    }

    @Override
    public CreativeModeTab.Builder tabBuilder() {
        return FabricItemGroup.builder();
    }
}
