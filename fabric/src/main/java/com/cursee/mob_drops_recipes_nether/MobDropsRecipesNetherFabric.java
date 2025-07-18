package com.cursee.mob_drops_recipes_nether;

import com.cursee.mob_drops_recipes_nether.core.registry.ModRegistryFabric;
import net.fabricmc.api.ModInitializer;

public class MobDropsRecipesNetherFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        MobDropsRecipesNether.init();
        ModRegistryFabric.register();
    }
}
