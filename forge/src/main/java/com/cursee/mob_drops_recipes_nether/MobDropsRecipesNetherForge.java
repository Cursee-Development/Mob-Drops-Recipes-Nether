package com.cursee.mob_drops_recipes_nether;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(Constants.MOD_ID)
public class MobDropsRecipesNetherForge {

    public static IEventBus EVENT_BUS;

    public MobDropsRecipesNetherForge(FMLJavaModLoadingContext context) {
        MobDropsRecipesNether.init();
        EVENT_BUS = context.getModEventBus();
        if (FMLEnvironment.dist == Dist.CLIENT) new MobDropsRecipesNetherClientForge(EVENT_BUS);
    }

    @SuppressWarnings("removal")
    public MobDropsRecipesNetherForge() {
        this(FMLJavaModLoadingContext.get());
    }
}