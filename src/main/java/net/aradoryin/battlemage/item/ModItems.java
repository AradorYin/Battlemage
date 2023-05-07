package net.aradoryin.battlemage.item;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);

    // SHARDS
    public static final RegistryObject<Item> GEODE_WIP = ITEMS.register("geode_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEM_WIP = ITEMS.register("gem_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_SHARD = ITEMS.register("aquamarine_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_SHARD = ITEMS.register("citrine_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_SHARD = ITEMS.register("garnet_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_SHARD = ITEMS.register("opal_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHARD = ITEMS.register("peridot_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("sapphire_shard", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_SHARD = ITEMS.register("topaz_shard", () -> new Item(new Item.Properties()));

    private ModItems () {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
