package com.cursee.mob_drops_recipes_nether.core.tab;

import com.cursee.mob_drops_recipes_nether.core.item.ModItemsNeoForge;
import com.cursee.mob_drops_recipes_nether.core.registry.ModRegistryNeoForge;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModCreativeModeTabsNeoForge {

    public static void register() {}

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOB_DROPS_RECIPES_NETHER = ModRegistryNeoForge.registerCreativeModeTab("mob_drops_recipes_nether", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesNether"))
            .icon(() -> new ItemStack(ModItemsNeoForge.NETHER_ESSENCE_COMMON.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsNeoForge.NETHER_ESSENCE_COMMON.get());
                output.accept(ModItemsNeoForge.NETHER_ESSENCE_UNCOMMON.get());
                output.accept(ModItemsNeoForge.NETHER_ESSENCE_RARE.get());
                output.accept(ModItemsNeoForge.NETHER_ESSENCE_EPIC.get());
            }))
            .build());
}
