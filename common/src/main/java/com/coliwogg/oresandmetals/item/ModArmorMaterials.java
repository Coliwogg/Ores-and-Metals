package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> BRONZE = register("bronze", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 1);
        attribute.put(ArmorItem.Type.LEGGINGS, 4);
        attribute.put(ArmorItem.Type.CHESTPLATE, 5);
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.BODY, 15);
    }), 14, SoundEvents.ARMOR_EQUIP_IRON, 0, 0, ModItems.BRONZE_INGOT);

    public static final Holder<ArmorMaterial> STEEL = register("steel", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.BODY, 16);
    }), 13, SoundEvents.ARMOR_EQUIP_IRON, 0, 0, ModItems.STEEL_INGOT);

    public static final Holder<ArmorMaterial> MITHRIL = register("mithril", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.BODY, 24);
    }), 12, SoundEvents.ARMOR_EQUIP_IRON, 0, 0, ModItems.MITHRIL_INGOT);

    public static final Holder<ArmorMaterial> ADAMANT = register("adamant", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 3);
        attribute.put(ArmorItem.Type.LEGGINGS, 6);
        attribute.put(ArmorItem.Type.CHESTPLATE, 8);
        attribute.put(ArmorItem.Type.HELMET, 3);
        attribute.put(ArmorItem.Type.BODY, 32);
    }), 11, SoundEvents.ARMOR_EQUIP_IRON, 0, 0.1f, ModItems.ADAMANTITE_INGOT);

    public static final Holder<ArmorMaterial> RUNE = register("rune", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 3);
        attribute.put(ArmorItem.Type.LEGGINGS, 6);
        attribute.put(ArmorItem.Type.CHESTPLATE, 8);
        attribute.put(ArmorItem.Type.HELMET, 3);
        attribute.put(ArmorItem.Type.BODY, 36);
    }), 16, SoundEvents.ARMOR_EQUIP_IRON, 2.5f, 0.1f, ModItems.RUNITE_INGOT);

    public static final Holder<ArmorMaterial> ORIKALKUM = register("orikalkum", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 4);
        attribute.put(ArmorItem.Type.LEGGINGS, 7);
        attribute.put(ArmorItem.Type.CHESTPLATE, 9);
        attribute.put(ArmorItem.Type.HELMET, 4);
        attribute.put(ArmorItem.Type.BODY, 38);
    }), 17, SoundEvents.ARMOR_EQUIP_IRON, 3.5f, 0.1f, ModItems.ORIKALKUM_INGOT);

    public static final Holder<ArmorMaterial> NECRONIUM = register("necronium", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.BOOTS, 4);
        attribute.put(ArmorItem.Type.LEGGINGS, 7);
        attribute.put(ArmorItem.Type.CHESTPLATE, 9);
        attribute.put(ArmorItem.Type.HELMET, 4);
        attribute.put(ArmorItem.Type.BODY, 39);
    }), 18, SoundEvents.ARMOR_EQUIP_IRON, 4.0f, 0.1f, ModItems.NECRONIUM_INGOT);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection,
                                                  int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance,
                                                  Supplier<Item> ingredientItem) {
        ResourceLocation location = OresAndMetals.identifier(name);
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location,
                new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

}
