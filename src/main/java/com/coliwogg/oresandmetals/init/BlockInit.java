package com.coliwogg.oresandmetals.init;

import com.coliwogg.oresandmetals.OresandMetals;
import com.coliwogg.oresandmetals.objects.blocks.ModOre;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, OresandMetals.MODID);

    /* Ores */
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> MITHRIL_ORE = BLOCKS.register("mithril_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ADAMANTITE_ORE = BLOCKS.register("adamantite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUNITE_ORE = BLOCKS.register("runite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORICHALCITE_ORE = BLOCKS.register("orichalcite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DRAKOLITH_ORE = BLOCKS.register("drakolith_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> NECRITE_ORE = BLOCKS.register("necrite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 5.0F).harvestLevel(4).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> PHASMATITE_ORE = BLOCKS.register("phasmatite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(4).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> BANITE_ORE = BLOCKS.register("banite_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(5).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> LIGHT_ANIMICA_ORE = BLOCKS.register("light_animica_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(6).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
    public static final RegistryObject<Block> DARK_ANIMICA_ORE = BLOCKS.register("dark_animica_ore", () -> new ModOre(Block.Properties.create(Material.ROCK).hardnessAndResistance(5.0F, 3.0F).harvestLevel(6).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));

    /* Blocks */
    public static final RegistryObject<Block> BRONZE_BLOCK = BLOCKS.register("bronze_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(1).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MITHRIL_BLOCK = BLOCKS.register("mithril_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ADAMANTITE_BLOCK = BLOCKS.register("adamantite_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(2).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUNITE_BLOCK = BLOCKS.register("runite_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(3).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ORIKALKUM_BLOCK = BLOCKS.register("orikalkum_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(4).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NECRONIUM_BLOCK = BLOCKS.register("necronium_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(5).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BANITE_BLOCK = BLOCKS.register("banite_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(6).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ELDER_RUNE_BLOCK = BLOCKS.register("elder_rune_block", () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5.0F, 6.0F).harvestLevel(7).harvestTool(ToolType.PICKAXE).sound(SoundType.METAL)));
}
