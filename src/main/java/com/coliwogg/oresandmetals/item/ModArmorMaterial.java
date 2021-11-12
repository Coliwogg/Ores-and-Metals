package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.config.ArmorMaterialConfig;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    BRONZE("bronze",
            ArmorMaterialConfig.bronze_durability_multiplier.get(),
            new int[]{
                    ArmorMaterialConfig.bronze_boots.get(),
                    ArmorMaterialConfig.bronze_leggings.get(),
                    ArmorMaterialConfig.bronze_chestplate.get(),
                    ArmorMaterialConfig.bronze_helmet.get()},
            ArmorMaterialConfig.bronze_enchantment_value.get(),
            SoundEvents.ARMOR_EQUIP_IRON,
            ArmorMaterialConfig.bronze_toughness.get().floatValue(),
            ArmorMaterialConfig.bronze_knockback_resistance.get().floatValue(),
            () -> Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL("steel",
            ArmorMaterialConfig.steel_durability_multiplier.get(),
            new int[]{
                    ArmorMaterialConfig.steel_boots.get(),
                    ArmorMaterialConfig.steel_leggings.get(),
                    ArmorMaterialConfig.steel_chestplate.get(),
                    ArmorMaterialConfig.steel_helmet.get()},
            ArmorMaterialConfig.steel_enchantment_value.get(),
            SoundEvents.ARMOR_EQUIP_IRON,
            ArmorMaterialConfig.steel_toughness.get().floatValue(),
            ArmorMaterialConfig.steel_knockback_resistance.get().floatValue(),
            () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL("mithril",
            ArmorMaterialConfig.mithril_durability_multiplier.get(),
            new int[]{
                    ArmorMaterialConfig.mithril_boots.get(),
                    ArmorMaterialConfig.mithril_leggings.get(),
                    ArmorMaterialConfig.mithril_chestplate.get(),
                    ArmorMaterialConfig.mithril_helmet.get()},
            ArmorMaterialConfig.mithril_enchantment_value.get(),
            SoundEvents.ARMOR_EQUIP_GOLD,
            ArmorMaterialConfig.mithril_toughness.get().floatValue(),
            ArmorMaterialConfig.mithril_knockback_resistance.get().floatValue(),
            () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT("adamant",
            ArmorMaterialConfig.adamant_durability_multiplier.get(),
            new int[]{
                    ArmorMaterialConfig.adamant_boots.get(),
                    ArmorMaterialConfig.adamant_leggings.get(),
                    ArmorMaterialConfig.adamant_chestplate.get(),
                    ArmorMaterialConfig.adamant_helmet.get()},
            ArmorMaterialConfig.adamant_enchantment_value.get(),
            SoundEvents.ARMOR_EQUIP_GOLD,
            ArmorMaterialConfig.adamant_toughness.get().floatValue(),
            ArmorMaterialConfig.adamant_knockback_resistance.get().floatValue(),
            () -> Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE("rune",
            ArmorMaterialConfig.rune_durability_multiplier.get(),
            new int[]{
                    ArmorMaterialConfig.rune_boots.get(),
                    ArmorMaterialConfig.rune_leggings.get(),
                    ArmorMaterialConfig.rune_chestplate.get(),
                    ArmorMaterialConfig.rune_helmet.get()},
            ArmorMaterialConfig.rune_enchantment_value.get(),
            SoundEvents.ARMOR_EQUIP_GOLD,
            ArmorMaterialConfig.rune_toughness.get().floatValue(),
            ArmorMaterialConfig.rune_knockback_resistance.get().floatValue(),
            () -> Ingredient.of(ModItems.RUNITE_INGOT.get())),
    ORIKALKUM("orikalkum", 38, new int[]{4, 7, 9, 4}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {
        return Ingredient.of(ModItems.ORIKALKUM_INGOT.get());
    })
    ;

    //NETHERITE("netherite", 37, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE, 3.0F, 0.1F, () -> {
    //      return Ingredient.of(Items.NETHERITE_INGOT);
    //   });
    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] slotProtections, int enchantmentValue, SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantmentValue;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }


    @Override
    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.sound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return OresAndMetals.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
