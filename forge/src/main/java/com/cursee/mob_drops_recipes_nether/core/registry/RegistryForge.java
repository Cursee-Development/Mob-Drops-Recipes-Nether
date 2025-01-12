package com.cursee.mob_drops_recipes_nether.core.registry;

import com.cursee.mob_drops_recipes_nether.Constants;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class RegistryForge {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Constants.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Constants.MOD_ID);

    public static void register(IEventBus modEventBus) {

        ModItemsForge.register();
        ModTabsForge.register();

        ITEMS.register(modEventBus);
        TABS.register(modEventBus);
    }

    protected static <T extends Item> RegistryObject<T> registerItem(String objectID, Supplier<T> objectSupplier) {
        return ITEMS.register(objectID, objectSupplier);
    }

    protected static <T extends CreativeModeTab> RegistryObject<T> registerTab(String objectID, Supplier<T> objectSupplier) {
        return TABS.register(objectID, objectSupplier);
    }
}
