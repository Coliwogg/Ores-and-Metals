package com.coliwogg.oresandmetals;

import com.coliwogg.oresandmetals.world.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

public class OresandMetalsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        ModWorldGeneration.generateModWorldGen();

        OresAndMetals.init();
    }
}
