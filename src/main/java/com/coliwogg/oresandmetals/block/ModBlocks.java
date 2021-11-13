package com.coliwogg.oresandmetals.block;

import com.coliwogg.oresandmetals.OresAndMetals;
import com.coliwogg.oresandmetals.item.ModCreativeModeTab;
import com.coliwogg.oresandmetals.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OresAndMetals.MOD_ID);

    public static final RegistryObject<Block> TIN_BLOCK;
    public static final RegistryObject<Block> BRONZE_BLOCK;
    public static final RegistryObject<Block> STEEL_BLOCK;
    public static final RegistryObject<Block> MITHRIL_BLOCK;
    public static final RegistryObject<Block> ADAMANTITE_BLOCK;
    public static final RegistryObject<Block> RUNITE_BLOCK;
    public static final RegistryObject<Block> ORIKALKUM_BLOCK;
    public static final RegistryObject<Block> NECRONIUM_BLOCK;
    public static final RegistryObject<Block> RAW_TIN_BLOCK;
    public static final RegistryObject<Block> RAW_BRONZE_BLOCK;
    public static final RegistryObject<Block> RAW_STEEL_BLOCK;
    public static final RegistryObject<Block> RAW_MITHRIL_BLOCK;
    public static final RegistryObject<Block> RAW_ADAMANTITE_BLOCK;
    public static final RegistryObject<Block> RAW_RUNITE_BLOCK;
    public static final RegistryObject<Block> RAW_DRAKOLITH_BLOCK;
    public static final RegistryObject<Block> RAW_PHASMATITE_BLOCK;
    public static final RegistryObject<Block> TIN_ORE;
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE;
    public static final RegistryObject<Block> MITHRIL_ORE;
    public static final RegistryObject<Block> DEEPSLATE_MITHRIL_ORE;
    public static final RegistryObject<Block> ADAMANTITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_ADAMANTITE_ORE;
    public static final RegistryObject<Block> RUNITE_ORE;
    public static final RegistryObject<Block> DEEPSLATE_RUNITE_ORE;
    public static final RegistryObject<Block> NETHER_DRAKOLITH_ORE;
    public static final RegistryObject<Block> ORICHALCITE_DEBRIS;
    public static final RegistryObject<Block> END_PHASMATITE_ORE;
    public static final RegistryObject<Block> NECRITE_DEBRIS;

    static {
        TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.SNOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BROWN).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        STEEL_BLOCK = registerBlock("steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        MITHRIL_BLOCK = registerBlock("mithril_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        ADAMANTITE_BLOCK = registerBlock("adamantite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        RUNITE_BLOCK = registerBlock("runite_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        ORIKALKUM_BLOCK = registerBlock("orikalkum_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        NECRONIUM_BLOCK = registerBlock("necronium_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.METAL)));
        RAW_TIN_BLOCK = registerBlock("raw_tin_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SNOW).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_BRONZE_BLOCK = registerBlock("raw_bronze_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BROWN).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_STEEL_BLOCK = registerBlock("raw_steel_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_MITHRIL_BLOCK = registerBlock("raw_mithril_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_ADAMANTITE_BLOCK = registerBlock("raw_adamantite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_GREEN).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_RUNITE_BLOCK = registerBlock("raw_runite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_DRAKOLITH_BLOCK = registerBlock("raw_drakolith_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        RAW_PHASMATITE_BLOCK = registerBlock("raw_phasmatite_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
        TIN_ORE = registerBlock("tin_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_ORE)));
        DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(TIN_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
        MITHRIL_ORE = registerBlock("mithril_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
        DEEPSLATE_MITHRIL_ORE = registerBlock("deepslate_mithril_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(MITHRIL_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
        ADAMANTITE_ORE = registerBlock("adamantite_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
        DEEPSLATE_ADAMANTITE_ORE = registerBlock("deepslate_adamantite_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(ADAMANTITE_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
        RUNITE_ORE = registerBlock("runite_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));
        DEEPSLATE_RUNITE_ORE = registerBlock("deepslate_runite_ore", () -> new OreBlock(BlockBehaviour.Properties.copy(RUNITE_ORE.get()).color(MaterialColor.DEEPSLATE).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE)));
        NETHER_DRAKOLITH_ORE = registerBlock("nether_drakolith_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER).requiresCorrectToolForDrops().strength(3.0F, 3.0F).sound(SoundType.NETHER_ORE)));
        ORICHALCITE_DEBRIS = registerBlock("orichalcite_debris", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_RED).requiresCorrectToolForDrops().strength(30.0F, 12000.0F).sound(SoundType.ANCIENT_DEBRIS)));
        END_PHASMATITE_ORE = registerBlock("end_phasmatite_ore", () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
        NECRITE_DEBRIS = registerBlock("necrite_debris", () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).requiresCorrectToolForDrops().strength(30.0F, 12000.0F).sound(SoundType.ANCIENT_DEBRIS)));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModCreativeModeTab.TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
