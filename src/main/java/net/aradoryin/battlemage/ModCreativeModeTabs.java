package net.aradoryin.battlemage;

import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Battlemage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab BATTLEMAGE_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        BATTLEMAGE_TAB = event.registerCreativeModeTab(new ResourceLocation(Battlemage.MOD_ID, "battlemage_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.GEM_WIP.get())).title(Component.translatable("creativemodetab.battlemage_tab")));
    }
}
