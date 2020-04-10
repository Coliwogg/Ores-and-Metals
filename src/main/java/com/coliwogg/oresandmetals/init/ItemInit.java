package com.coliwogg.oresandmetals.init;

import java.util.function.Supplier;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;
import com.coliwogg.oresandmetals.init.ItemInit.ModItemTier.ModArmorMaterial;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
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
	
	public static final Item RUNITE_FRAGMENTS = null;
	public static final Item RUNITE_CHUNK = null;
	public static final Item RUNITE_INGOT = null;
	
	// Bronze Tools
	public static final Item BRONZE_AXE = null;
	public static final Item BRONZE_HOE = null;
	public static final Item BRONZE_PICKAXE = null;
	public static final Item BRONZE_SHOVEL = null;
	public static final Item BRONZE_SWORD = null;
	
	// Steel Tools
	public static final Item STEEL_AXE = null;
	public static final Item STEEL_HOE = null;
	public static final Item STEEL_PICKAXE = null;
	public static final Item STEEL_SHOVEL = null;
	public static final Item STEEL_SWORD = null;
	
	// Mithril Tools
	public static final Item MITHRIL_AXE = null;
	public static final Item MITHRIL_HOE = null;
	public static final Item MITHRIL_PICKAXE = null;
	public static final Item MITHRIL_SHOVEL = null;
	public static final Item MITHRIL_SWORD = null;
	
	// Adamantite Tools
	public static final Item ADAMANTITE_AXE = null;
	public static final Item ADAMANTITE_HOE = null;
	public static final Item ADAMANTITE_PICKAXE = null;
	public static final Item ADAMANTITE_SHOVEL = null;
	public static final Item ADAMANTITE_SWORD = null;
	
	// Runite Tools
	public static final Item RUNITE_AXE = null;
	public static final Item RUNITE_HOE = null;
	public static final Item RUNITE_PICKAXE = null;
	public static final Item RUNITE_SHOVEL = null;
	public static final Item RUNITE_SWORD = null;
	
	// Bronze Armor
	public static final Item BRONZE_HELMET = null;
	public static final Item BRONZE_CHESTPLATE = null;
	public static final Item BRONZE_LEGGINGS = null;
	public static final Item BRONZE_BOOTS = null;
	
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
		
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_fragments"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_chunk"));
		event.getRegistry().register(new Item(new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_ingot"));
		
		event.getRegistry().register(new AxeItem(ModItemTier.BRONZE, 6.5F, -3.15F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.BRONZE, -1.5F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.BRONZE, 1, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.BRONZE, 1.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.BRONZE, 3, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_sword"));
		
		event.getRegistry().register(new AxeItem(ModItemTier.STEEL, 6.75F, -3.075F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.STEEL, -0.75F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.STEEL, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.STEEL, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.STEEL, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_sword"));
		
		event.getRegistry().register(new AxeItem(ModItemTier.MITHRIL, 6.5F, -3.050F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.MITHRIL, -0.50F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.MITHRIL, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.MITHRIL, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.MITHRIL, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("mithril_sword"));
		
		event.getRegistry().register(new AxeItem(ModItemTier.ADAMANTITE, 6.25F, -3.025F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.ADAMANTITE, -0.25F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.ADAMANTITE, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.ADAMANTITE, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.ADAMANTITE, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("adamantite_sword"));
		
		event.getRegistry().register(new AxeItem(ModItemTier.RUNITE, 7.0F, -2.9F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.RUNITE, 1.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.RUNITE, 3, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.RUNITE, 3.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.RUNITE, 5, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("runite_sword"));
		
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.HEAD, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_helmet"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.CHEST, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_chestplate"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.LEGS, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_leggings"));
		event.getRegistry().register(new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlotType.FEET, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("bronze_boots"));

	}
	
	public enum ModItemTier implements IItemTier {
		BRONZE(200, 5.0F, 1.5F, 1, 15, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT); }),
		STEEL(375, 6.5F, 1.25F, 2, 14, () -> { return Ingredient.fromItems(ItemInit.STEEL_INGOT); }),
		MITHRIL(525, 7.0F, 1.5F, 2, 12, () -> { return Ingredient.fromItems(ItemInit.MITHRIL_INGOT); }),
		ADAMANTITE(600, 7.5F, 1.75F, 2, 11, () -> { return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT); }),
		RUNITE(1750, 10.0F, 2.0F, 3, 10, () -> { return Ingredient.fromItems(ItemInit.RUNITE_INGOT); });

		private final int maxUses;
		private final float efficiency;
		private final float attackDamage;
		private final int harvestLevel;
		private final int enchantability;
		private final LazyValue<Ingredient> repairMaterial;
		
		private ModItemTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Ingredient> repairMaterial) {
			this.maxUses = maxUses;
			this.efficiency = efficiency;
			this.attackDamage = attackDamage;
			this.harvestLevel = harvestLevel;
			this.enchantability = enchantability;
			this.repairMaterial = new LazyValue<>(repairMaterial);
		}

		@Override
		public int getMaxUses() {
			return this.maxUses;
		}

		@Override
		public float getEfficiency() {
			return this.efficiency;
		}

		@Override
		public float getAttackDamage() {
			return this.attackDamage;
		}

		@Override
		public int getHarvestLevel() {
			return this.harvestLevel;
		}

		@Override
		public int getEnchantability() {
			return this.enchantability;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return this.repairMaterial.getValue();
		}
		
		public enum ModArmorMaterial implements IArmorMaterial {
			BRONZE(10, new int[] { 1, 4, 5, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":bronze", 0.0F, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT); }),
			STEEL(20, new int[] { 2, 6, 7, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":steel", 0.0F, () -> { return Ingredient.fromItems(ItemInit.STEEL_INGOT); }),
			MITHRIL(25, new int[] { 3, 6, 8, 2 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":mithril", 1.0F, () -> { return Ingredient.fromItems(ItemInit.MITHRIL_INGOT); }),
			ADAMANTITE(30, new int[] { 2, 7, 8, 3 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":adamantite", 1.0F, () -> { return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT); }),
			RUNITE(40, new int[] { 4, 7, 9, 4 }, 12, "item.armor.equip_iron", OresandMetals.MODID + ":runite", 3.0F, () -> { return Ingredient.fromItems(ItemInit.RUNITE_INGOT); });

			private static final int[] MAX_DAMAGE_ARRAY = new int[] {16, 16, 16, 16};
			private final int durability;
			private final int[] damageReductionAmount;
			private final int enchantability;
			private final String soundEvent;
			private final LazyValue<Ingredient> repairMaterial;
			private final String name;
			private final float toughness;
			
			private ModArmorMaterial(int durability, int[] damageReductionAmount, int enchantability, String soundEvent, String name, float toughness, Supplier<Ingredient> repairMaterial) {
				this.durability = durability;
				this.damageReductionAmount = damageReductionAmount;
				this.enchantability = enchantability;
				this.soundEvent = soundEvent;
				this.name = name;
				this.toughness = toughness;
				this.repairMaterial = new LazyValue<>(repairMaterial);
			}

			@Override
			public int getDurability(EquipmentSlotType slotIn) {
				return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.durability;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slotIn) {
				return this.damageReductionAmount[slotIn.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return this.enchantability;
			}

			@Override
			public SoundEvent getSoundEvent() {
				return new SoundEvent(new ResourceLocation(this.soundEvent));
			}
			
			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return this.name;
			}

			@Override
			public float getToughness() {
				return this.toughness;
			}

			@Override
			public Ingredient getRepairMaterial() {
				return this.repairMaterial.getValue();
			}
		}
	}
}
