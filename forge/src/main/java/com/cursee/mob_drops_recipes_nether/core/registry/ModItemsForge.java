package com.cursee.mob_drops_recipes_nether.core.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> NETHER_ESSENCE_COMMON = RegistryForge.registerItem("nether_essence_common", () -> new Item(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON)));
    public static final RegistryObject<Item> NETHER_ESSENCE_UNCOMMON = RegistryForge.registerItem("nether_essence_uncommon", () -> new Item(new Item.Properties().stacksTo(8).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> NETHER_ESSENCE_RARE = RegistryForge.registerItem("nether_essence_rare", () -> new Item(new Item.Properties().stacksTo(4).rarity(Rarity.RARE)));
    public static final RegistryObject<Item> NETHER_ESSENCE_EPIC = RegistryForge.registerItem("nether_essence_epic", () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));
}
