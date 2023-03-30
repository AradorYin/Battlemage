package net.aradoryin.battlemage.item;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);

    public static final RegistryObject<Item> GEM_WIP = ITEMS.register("gem_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GEODE_WIP = ITEMS.register("geode_wip", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
