package com.cursee.mob_drops_recipes_nether.core.tab;

import com.cursee.mob_drops_recipes_nether.core.item.ModItemsFabric;
import com.cursee.mob_drops_recipes_nether.core.registry.ModRegistryFabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabsFabric {

    public static void register() {}

    public static final CreativeModeTab MOB_DROPS_RECIPES_NETHER = ModRegistryFabric.registerCreativeModeTab("mob_drops_recipes_nether", FabricItemGroup.builder()
            .title(Component.translatable("itemGroup.mobDropsRecipesNether"))
            .icon(() -> new ItemStack(ModItemsFabric.NETHER_ESSENCE_COMMON))
            .displayItems(((itemDisplayParameters, output) -> {
                output.accept(ModItemsFabric.NETHER_ESSENCE_COMMON);
                output.accept(ModItemsFabric.NETHER_ESSENCE_UNCOMMON);
                output.accept(ModItemsFabric.NETHER_ESSENCE_RARE);
                output.accept(ModItemsFabric.NETHER_ESSENCE_EPIC);
            }))
            .build());
}
