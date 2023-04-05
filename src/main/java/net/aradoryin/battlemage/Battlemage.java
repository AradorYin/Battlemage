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
            // WIP ITEMS | BLOCKS
            event.accept(ModItems.GEM_WIP);
            event.accept(ModItems.GEODE_WIP);
            event.accept(ModBlocks.BLOCK_WIP);
            event.accept(ModBlocks.ORE_WIP);
            event.accept(ModBlocks.DEEPSLATE_ORE_WIP);
            // WOOD | LOGS | PLANKS | SAPLINGS
            event.accept(ModBlocks.DAPHNE_LOG);
            event.accept(ModBlocks.DAPHNE_WOOD);
            event.accept(ModBlocks.STRIPPED_DAPHNE_LOG);
            event.accept(ModBlocks.STRIPPED_DAPHNE_WOOD);
            event.accept(ModBlocks.DAPHNE_PLANKS);
            event.accept(ModBlocks.DAPHNE_SAPLING);
            event.accept(ModBlocks.DAPHNE_LEAVES);
            // SHARDS
            event.accept(ModItems.AQUAMARINE_SHARD);
            event.accept(ModItems.CITRINE_SHARD);
            event.accept(ModItems.GARNET_SHARD);
            event.accept(ModItems.OPAL_SHARD);
            event.accept(ModItems.PERIDOT_SHARD);
            event.accept(ModItems.RUBY_SHARD);
            event.accept(ModItems.SAPPHIRE_SHARD);
            event.accept(ModItems.TOPAZ_SHARD);
            // GEODE BLOCKS
            // BUDDING BLOCKS
            event.accept(ModBlocks.BUDDING_AQUAMARINE);
            event.accept(ModBlocks.BUDDING_CITRINE);
            event.accept(ModBlocks.BUDDING_GARNET);
            event.accept(ModBlocks.BUDDING_OPAL);
            event.accept(ModBlocks.BUDDING_PERIDOT);
            event.accept(ModBlocks.BUDDING_RUBY);
            event.accept(ModBlocks.BUDDING_SAPPHIRE);
            event.accept(ModBlocks.BUDDING_TOPAZ);
            // STORAGE BLOCKS
            event.accept(ModBlocks.AQUAMARINE_BLOCK);
            event.accept(ModBlocks.CITRINE_BLOCK);
            event.accept(ModBlocks.GARNET_BLOCK);
            event.accept(ModBlocks.OPAL_BLOCK);
            event.accept(ModBlocks.PERIDOT_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_CLUSTER);
            event.accept(ModBlocks.CITRINE_CLUSTER);
            event.accept(ModBlocks.GARNET_CLUSTER);
            event.accept(ModBlocks.OPAL_CLUSTER);
            event.accept(ModBlocks.PERIDOT_CLUSTER);
            event.accept(ModBlocks.RUBY_CLUSTER);
            event.accept(ModBlocks.SAPPHIRE_CLUSTER);
            event.accept(ModBlocks.TOPAZ_CLUSTER);
            // LARGE BUD BLOCKS
            event.accept(ModBlocks.LARGE_AQUAMARINE_BUD);
            event.accept(ModBlocks.LARGE_CITRINE_BUD);
            event.accept(ModBlocks.LARGE_GARNET_BUD);
            event.accept(ModBlocks.LARGE_OPAL_BUD);
            event.accept(ModBlocks.LARGE_PERIDOT_BUD);
            event.accept(ModBlocks.LARGE_RUBY_BUD);
            event.accept(ModBlocks.LARGE_SAPPHIRE_BUD);
            event.accept(ModBlocks.LARGE_TOPAZ_BUD);
            // MEDIUM BUD BLOCKS
            event.accept(ModBlocks.MEDIUM_AQUAMARINE_BUD);
            event.accept(ModBlocks.MEDIUM_CITRINE_BUD);
            event.accept(ModBlocks.MEDIUM_GARNET_BUD);
            event.accept(ModBlocks.MEDIUM_OPAL_BUD);
            event.accept(ModBlocks.MEDIUM_PERIDOT_BUD);
            event.accept(ModBlocks.MEDIUM_RUBY_BUD);
            event.accept(ModBlocks.MEDIUM_SAPPHIRE_BUD);
            event.accept(ModBlocks.MEDIUM_TOPAZ_BUD);
            // SMALL BUD BLOCKS
            event.accept(ModBlocks.SMALL_AQUAMARINE_BUD);
            event.accept(ModBlocks.SMALL_CITRINE_BUD);
            event.accept(ModBlocks.SMALL_GARNET_BUD);
            event.accept(ModBlocks.SMALL_OPAL_BUD);
            event.accept(ModBlocks.SMALL_PERIDOT_BUD);
            event.accept(ModBlocks.SMALL_RUBY_BUD);
            event.accept(ModBlocks.SMALL_SAPPHIRE_BUD);
            event.accept(ModBlocks.SMALL_TOPAZ_BUD);

        }
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
