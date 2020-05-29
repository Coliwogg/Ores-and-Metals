package com.coliwogg.oresandmetals.objects.blocks;

import java.util.Random;
import com.coliwogg.oresandmetals.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class ModOre extends Block {
    public ModOre(Properties properties) {
        super(properties);
    }

    protected int getExperience(Random rand) {
        if (this == BlockInit.COPPER_ORE.get()) {
            return MathHelper.nextInt(rand, 0, 2);
        } else if (this == BlockInit.TIN_ORE.get()) {
            return MathHelper.nextInt(rand, 0, 2);
        } else if (this == BlockInit.MITHRIL_ORE.get()) {
            return MathHelper.nextInt(rand, 2, 5);
        } else if (this == BlockInit.ADAMANTITE_ORE.get()) {
            return MathHelper.nextInt(rand, 2, 5);
        } else if (this == BlockInit.RUNITE_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == BlockInit.DRAKOLITH_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == BlockInit.PHASMATITE_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == BlockInit.LIGHT_ANIMICA_ORE.get()) {
            return MathHelper.nextInt(rand, 3, 7);
        } else {
            return this == BlockInit.DARK_ANIMICA_ORE.get() ? MathHelper.nextInt(rand, 3, 7) : 0;
        }
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}

