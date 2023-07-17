package net.aradoryin.battlemage;

import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Battlemage.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BATTLEMAGE_TAB = CREATIVE_MODE_TABS.register("battlemage_tab",
            ()-> CreativeModeTab.builder()
                    .icon(()-> new ItemStack(ModItems.RUBY_SHARD.get()))
                    .title(Component.translatable("creativemodetab.battlemage_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        /*
                        This is an optional way of adding items to creative tab.
                        The items added here will be in the same order as they are added.
                         */
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
