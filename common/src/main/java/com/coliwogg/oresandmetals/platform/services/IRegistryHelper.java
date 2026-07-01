package com.coliwogg.oresandmetals.platform.services;

import com.coliwogg.oresandmetals.entity.custom.ModArrowEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public interface IRegistryHelper {

    /**
     * Registers an item to the game registry.
     * @param name The name of the item to register.
     * @param item A supplier for the item to register.
     * @return A supplier for the registered item.
     */
    Supplier<Item> registerItem(String name, Supplier<Item> item);

    /**
     * Registers a block to the game registry.
     * @param name The name of the block to register.
     * @param block A supplier for the block to register.
     * @return A supplier for the registered block.
     */
    Supplier<Block> registerBlock(String name, Supplier<Block> block);

    /**
     * Registers a block item to the game registry.
     * @param name The name of the block item to register.
     * @param block A supplier for the block for which to create an item.
     * @return A supplier for the registered block item.
     */
    Supplier<Item> registerBlockItem(String name, Supplier<Block> block);

    /**
     * Registers an entity type to the game registry.
     * @param name The name of the entity type to register.
     * @param entityType A supplier for the entity type to register.
     * @return A supplier for the registered entity type.
     */
    Supplier<EntityType<ModArrowEntity>> registerEntity(String name, Supplier<EntityType<ModArrowEntity>> entityType);

    /**
     * Registers a creative mode tab to the game registry.
     * @param name The name of the creative mode tab to register.
     * @param tab A supplier for the creative mode tab to register.
     * @return A supplier for the registered creative mode tab.
     */
    Supplier<CreativeModeTab> registerCreativeTab(String name, Supplier<CreativeModeTab> tab);

    /**
     * Returns a builder for creating a new creative mode tab.
     */
    CreativeModeTab.Builder tabBuilder();

}
