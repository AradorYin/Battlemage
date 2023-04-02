package net.aradoryin.battlemage;

import com.mojang.logging.LogUtils;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Battlemage.MOD_ID)
public class Battlemage {
    public static final String MOD_ID = "battlemage";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Battlemage() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the commonSetup
        modEventBus.addListener(this::commonSetup);


        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModeTabs.BATTLEMAGE_TAB) {
            event.accept(ModItems.GEM_WIP);
            event.accept(ModItems.GEODE_WIP);
            event.accept(ModBlocks.BLOCK_WIP);
            event.accept(ModBlocks.ORE_WIP);
            event.accept(ModBlocks.DEEPSLATE_ORE_WIP);
            event.accept(ModBlocks.DAPHNE_LOG);
            event.accept(ModBlocks.DAPHNE_WOOD);
            event.accept(ModBlocks.STRIPPED_DAPHNE_LOG);
            event.accept(ModBlocks.STRIPPED_DAPHNE_WOOD);
            event.accept(ModBlocks.DAPHNE_PLANKS);
            event.accept(ModBlocks.DAPHNE_SAPLING);
            event.accept(ModBlocks.DAPHNE_LEAVES);
        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
