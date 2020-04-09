package com.coliwogg.oresandmetals.init;

import java.util.function.Supplier;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.OresandMetals.OresandMetalsItemGroup;

import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
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
		
		event.getRegistry().register(new AxeItem(ModItemTier.STEEL, 7.0F, -3.075F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_axe"));
		event.getRegistry().register(new HoeItem(ModItemTier.STEEL, -0.75F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_hoe"));
		event.getRegistry().register(new PickaxeItem(ModItemTier.STEEL, 2, -2.8F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_pickaxe"));
		event.getRegistry().register(new ShovelItem(ModItemTier.STEEL, 2.5F, -3.0F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_shovel"));
		event.getRegistry().register(new SwordItem(ModItemTier.STEEL, 4, -2.4F, new Item.Properties().group(OresandMetalsItemGroup.instance)).setRegistryName("steel_sword"));

	}
	
	public enum ModItemTier implements IItemTier {
		BRONZE(200, 5.0F, 1.5F, 1, 15, () -> { return Ingredient.fromItems(ItemInit.BRONZE_INGOT); }),
		STEEL(350, 6.5F, 1.25F, 2, 14, () -> { return Ingredient.fromItems(ItemInit.STEEL_INGOT); }),
		MITHRIL(525, 7.0F, 1.5F, 2, 12, () -> { return Ingredient.fromItems(ItemInit.MITHRIL_INGOT); }),
		ADAMANTITE(600, 7.5F, 1.5F, 2, 11, () -> { return Ingredient.fromItems(ItemInit.ADAMANTITE_INGOT); }),
		RUNITE(1750, 10.0F, 1.5F, 3, 10, () -> { return Ingredient.fromItems(ItemInit.RUNITE_INGOT); });

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
	}
}
