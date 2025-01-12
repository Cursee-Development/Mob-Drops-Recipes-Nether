package com.cursee.mob_drops_recipes_nether;

import com.cursee.monolib.core.sailing.Sailing;
import net.fabricmc.api.ModInitializer;

public class MobDropsRecipesNetherFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {

        MobDropsRecipesNether.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);
    }
}
