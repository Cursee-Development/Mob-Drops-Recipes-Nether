package com.cursee.mob_drops_recipes_nether.core.registry;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MOB_DROPS_RECIPES_NETHER = RegistryForge.registerTab("mob_drops_recipes_nether", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesNether"))
            .icon(() -> new ItemStack(ModItemsForge.NETHER_ESSENCE_COMMON))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsForge.NETHER_ESSENCE_COMMON);
                output.accept(ModItemsForge.NETHER_ESSENCE_UNCOMMON);
                output.accept(ModItemsForge.NETHER_ESSENCE_RARE);
                output.accept(ModItemsForge.NETHER_ESSENCE_EPIC);
            }))
            .build());
}
