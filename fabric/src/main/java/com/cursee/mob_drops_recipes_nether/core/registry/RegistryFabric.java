package com.cursee.mob_drops_recipes_nether.core.registry;

import com.cursee.mob_drops_recipes_nether.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class RegistryFabric {

    public static void register() {
        ModItemsFabric.register();
        ModTabsFabric.register();
    }

    protected static <T extends Item> T registerItem(String objectID, Supplier<T> objectSupplier) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(Constants.MOD_ID, objectID), objectSupplier.get());
    }

    protected static <T extends CreativeModeTab> T registerTab(String objectID, Supplier<T> objectSupplier) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(Constants.MOD_ID, objectID), objectSupplier.get());
    }
}
