package com.cursee.mob_drops_recipes_nether.core.registry;

import com.cursee.mob_drops_recipes_nether.Constants;
import com.cursee.mob_drops_recipes_nether.core.item.ModItemsFabric;
import com.cursee.mob_drops_recipes_nether.core.tab.ModCreativeModeTabsFabric;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class ModRegistryFabric {

    public static void register() {

        ModItemsFabric.register();
        ModCreativeModeTabsFabric.register();
    }

    public static <T extends Item> T registerItem(String name, T item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), item);
    }

    public static <T extends CreativeModeTab> CreativeModeTab registerCreativeModeTab(String name, CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name), tab);
    }
}
