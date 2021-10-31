package com.coliwogg.oresandmetals.item;

import com.coliwogg.oresandmetals.OresAndMetals;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    BRONZE("bronze", 15, new int[]{1, 4, 5, 2}, 14, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->
            Ingredient.of(ModItems.BRONZE_INGOT.get())),
    STEEL("steel", 16, new int[]{2, 5, 6, 2}, 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, () ->
            Ingredient.of(ModItems.STEEL_INGOT.get())),
    MITHRIL("mithril", 15, new int[]{2, 5, 6, 2}, 12, SoundEvents.ARMOR_EQUIP_GOLD, 0.0F, 0.0F, () ->
            Ingredient.of(ModItems.MITHRIL_INGOT.get())),
    ADAMANT("adamant", 32, new int[]{3, 6, 8, 3}, 11, SoundEvents.ARMOR_EQUIP_GOLD, 1.0F, 0.0F, () ->
            Ingredient.of(ModItems.ADAMANTITE_INGOT.get())),
    RUNE("rune", 36, new int[]{3, 6, 8, 3}, 16, SoundEvents.ARMOR_EQUIP_NETHERITE, 2.5F, 0.1F, () ->
            Ingredient.of(ModItems.RUNITE_INGOT.get()));

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
