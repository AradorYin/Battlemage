package net.aradoryin.battlemage;

import com.mojang.logging.LogUtils;
import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.aradoryin.battlemage.loot.ModLootModifiers;
import net.aradoryin.battlemage.particles.ModParticles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

/*
TODO Add a Gem Cutter Station or other method to craft the SHARDS
A Gem Cutter Station would be a temporary solution until the main altar is implemented.
TODO Start adding in custom structures (ruins, villager housing, random villages)
This will be an ongoing project as I am not a builder.
TODO Start adding in custom villagers
Easy enough to implement, but will be implemented later after more stuff has been added.
TODO Start adding in custom mobs
Mob Types: Bosses, Mini Bosses, Bandits, Raiders, Demons, Beasts, Angels
TODO Start the spell process
The spells will have many parameters to function properly. Each spell will have a certain amount of Control,
Destruction, and Mastery - which govern certain aspects of the spell.
Control -> Better Spell Effects | Destruction -> Better Damage | Mastery -> Reduced time for crit
 */

@Mod(Battlemage.MOD_ID)
public class Battlemage {
    public static final String MOD_ID = "battlemage";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Battlemage() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModParticles.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        // Register the commonSetup
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // To be filled later
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        /*
        To add to the existing vanilla tags, use:
        event.getTabKey() == CreativeModTabs.X;
         */
        if(event.getTab() == ModCreativeModeTabs.BATTLEMAGE_TAB.get()) {
            /*
            <---------------------------------------------------------------->
                                        Items
            <---------------------------------------------------------------->
             */
            event.accept(ModItems.BRACER_PATCHWORK);

            // GEM EMERALD
            event.accept(ModItems.WIP_EMERALD);
            event.accept(ModItems.AMETHYST_EMERALD);
            event.accept(ModItems.AQUAMARINE_EMERALD);
            event.accept(ModItems.CITRINE_EMERALD);
            event.accept(ModItems.GARNET_EMERALD);
            event.accept(ModItems.OPAL_EMERALD);
            event.accept(ModItems.PERIDOT_EMERALD);
            event.accept(ModItems.RUBY_EMERALD);
            event.accept(ModItems.SAPPHIRE_EMERALD);
            event.accept(ModItems.TOPAZ_EMERALD);

            // GEM FACETED
            event.accept(ModItems.WIP_FACETED);
            event.accept(ModItems.AMETHYST_FACETED);
            event.accept(ModItems.AQUAMARINE_FACETED);
            event.accept(ModItems.CITRINE_FACETED);
            event.accept(ModItems.GARNET_FACETED);
            event.accept(ModItems.OPAL_FACETED);
            event.accept(ModItems.PERIDOT_FACETED);
            event.accept(ModItems.RUBY_FACETED);
            event.accept(ModItems.SAPPHIRE_FACETED);
            event.accept(ModItems.TOPAZ_FACETED);

            // GEM GEODE
            event.accept(ModItems.WIP_GEODE);
            event.accept(ModItems.AMETHYST_GEODE);
            event.accept(ModItems.AQUAMARINE_GEODE);
            event.accept(ModItems.CITRINE_GEODE);
            event.accept(ModItems.GARNET_GEODE);
            event.accept(ModItems.OPAL_GEODE);
            event.accept(ModItems.PERIDOT_GEODE);
            event.accept(ModItems.RUBY_GEODE);
            event.accept(ModItems.SAPPHIRE_GEODE);
            event.accept(ModItems.TOPAZ_GEODE);

            // GEM PEAR
            event.accept(ModItems.WIP_PEAR);
            event.accept(ModItems.AMETHYST_PEAR);
            event.accept(ModItems.AQUAMARINE_PEAR);
            event.accept(ModItems.CITRINE_PEAR);
            event.accept(ModItems.GARNET_PEAR);
            event.accept(ModItems.OPAL_PEAR);
            event.accept(ModItems.PERIDOT_PEAR);
            event.accept(ModItems.RUBY_PEAR);
            event.accept(ModItems.SAPPHIRE_PEAR);
            event.accept(ModItems.TOPAZ_PEAR);

            // GEM SHARD
            event.accept(ModItems.WIP_SHARD);
            event.accept(ModItems.AQUAMARINE_SHARD);
            event.accept(ModItems.CITRINE_SHARD);
            event.accept(ModItems.GARNET_SHARD);
            event.accept(ModItems.OPAL_SHARD);
            event.accept(ModItems.PERIDOT_SHARD);
            event.accept(ModItems.RUBY_SHARD);
            event.accept(ModItems.SAPPHIRE_SHARD);
            event.accept(ModItems.TOPAZ_SHARD);

            // GEM TRILLION
            event.accept(ModItems.WIP_TRILLION);
            event.accept(ModItems.AMETHYST_TRILLION);
            event.accept(ModItems.AQUAMARINE_TRILLION);
            event.accept(ModItems.CITRINE_TRILLION);
            event.accept(ModItems.GARNET_TRILLION);
            event.accept(ModItems.OPAL_TRILLION);
            event.accept(ModItems.PERIDOT_TRILLION);
            event.accept(ModItems.RUBY_TRILLION);
            event.accept(ModItems.SAPPHIRE_TRILLION);
            event.accept(ModItems.TOPAZ_TRILLION);


            /*
            <---------------------------------------------------------------->
                                       Blocks
            <---------------------------------------------------------------->
             */
            event.accept(ModBlocks.JEWEL_CRAFTING_STATION);
            event.accept(ModBlocks.ETHERIC_STONE);
            event.accept(ModBlocks.BLASTED_COBBLESTONE_DF);
            event.accept(ModBlocks.BLASTED_COBBLESTONE_HL);
            event.accept(ModBlocks.BLASTED_COBBLESTONE_OL);
            event.accept(ModBlocks.BLASTED_COBBLESTONE_SL);
            event.accept(ModBlocks.BLASTED_COBBLESTONE_ST);
            event.accept(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_DF);
            event.accept(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_HL);
            event.accept(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_OL);
            event.accept(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_SL);
            event.accept(ModBlocks.BLASTED_CRACKED_STONE_BRICKS_ST);
            event.accept(ModBlocks.BLASTED_STONE_BRICKS_DF);
            event.accept(ModBlocks.BLASTED_STONE_BRICKS_HL);
            event.accept(ModBlocks.BLASTED_STONE_BRICKS_OL);
            event.accept(ModBlocks.BLASTED_STONE_BRICKS_SL);
            event.accept(ModBlocks.BLASTED_STONE_BRICKS_ST);
            event.accept(ModBlocks.BLASTED_STONE_DF);
            event.accept(ModBlocks.BLASTED_STONE_HL);
            event.accept(ModBlocks.BLASTED_STONE_OL);
            event.accept(ModBlocks.BLASTED_STONE_SL);
            event.accept(ModBlocks.BLASTED_STONE_ST);


            // ORES
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

            // STORAGE BLOCKS
            event.accept(ModBlocks.WIP_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_BLOCK);
            event.accept(ModBlocks.CITRINE_BLOCK);
            event.accept(ModBlocks.GARNET_BLOCK);
            event.accept(ModBlocks.OPAL_BLOCK);
            event.accept(ModBlocks.PERIDOT_BLOCK);
            event.accept(ModBlocks.RUBY_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_BLOCK);
            event.accept(ModBlocks.TOPAZ_BLOCK);

            // EMERALD STORAGE BLOCKS
            event.accept(ModBlocks.WIP_EMERALD_BLOCK);
            event.accept(ModBlocks.AMETHYST_EMERALD_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_EMERALD_BLOCK);
            event.accept(ModBlocks.CITRINE_EMERALD_BLOCK);
            event.accept(ModBlocks.GARNET_EMERALD_BLOCK);
            event.accept(ModBlocks.OPAL_EMERALD_BLOCK);
            event.accept(ModBlocks.PERIDOT_EMERALD_BLOCK);
            event.accept(ModBlocks.RUBY_EMERALD_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_EMERALD_BLOCK);
            event.accept(ModBlocks.TOPAZ_EMERALD_BLOCK);

            // FACETED STORAGE BLOCKS
            event.accept(ModBlocks.WIP_FACETED_BLOCK);
            event.accept(ModBlocks.AMETHYST_FACETED_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_FACETED_BLOCK);
            event.accept(ModBlocks.CITRINE_FACETED_BLOCK);
            event.accept(ModBlocks.GARNET_FACETED_BLOCK);
            event.accept(ModBlocks.OPAL_FACETED_BLOCK);
            event.accept(ModBlocks.PERIDOT_FACETED_BLOCK);
            event.accept(ModBlocks.RUBY_FACETED_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_FACETED_BLOCK);
            event.accept(ModBlocks.TOPAZ_FACETED_BLOCK);

            // PEAR STORAGE BLOCKS
            event.accept(ModBlocks.WIP_PEAR_BLOCK);
            event.accept(ModBlocks.AMETHYST_PEAR_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_PEAR_BLOCK);
            event.accept(ModBlocks.CITRINE_PEAR_BLOCK);
            event.accept(ModBlocks.GARNET_PEAR_BLOCK);
            event.accept(ModBlocks.OPAL_PEAR_BLOCK);
            event.accept(ModBlocks.PERIDOT_PEAR_BLOCK);
            event.accept(ModBlocks.RUBY_PEAR_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_PEAR_BLOCK);
            event.accept(ModBlocks.TOPAZ_PEAR_BLOCK);

            // TRILLION STORAGE BLOCKS
            event.accept(ModBlocks.WIP_TRILLION_BLOCK);
            event.accept(ModBlocks.AMETHYST_TRILLION_BLOCK);
            event.accept(ModBlocks.AQUAMARINE_TRILLION_BLOCK);
            event.accept(ModBlocks.CITRINE_TRILLION_BLOCK);
            event.accept(ModBlocks.GARNET_TRILLION_BLOCK);
            event.accept(ModBlocks.OPAL_TRILLION_BLOCK);
            event.accept(ModBlocks.PERIDOT_TRILLION_BLOCK);
            event.accept(ModBlocks.RUBY_TRILLION_BLOCK);
            event.accept(ModBlocks.SAPPHIRE_TRILLION_BLOCK);
            event.accept(ModBlocks.TOPAZ_TRILLION_BLOCK);

            // BUDDING BLOCKS
            event.accept(ModBlocks.BUDDING_WIP);
            event.accept(ModBlocks.BUDDING_AQUAMARINE);
            event.accept(ModBlocks.BUDDING_CITRINE);
            event.accept(ModBlocks.BUDDING_GARNET);
            event.accept(ModBlocks.BUDDING_OPAL);
            event.accept(ModBlocks.BUDDING_PERIDOT);
            event.accept(ModBlocks.BUDDING_RUBY);
            event.accept(ModBlocks.BUDDING_SAPPHIRE);
            event.accept(ModBlocks.BUDDING_TOPAZ);

            // CLUSTER BLOCKS
            event.accept(ModBlocks.WIP_CLUSTER);
            event.accept(ModBlocks.AQUAMARINE_CLUSTER);
            event.accept(ModBlocks.CITRINE_CLUSTER);
            event.accept(ModBlocks.GARNET_CLUSTER);
            event.accept(ModBlocks.OPAL_CLUSTER);
            event.accept(ModBlocks.PERIDOT_CLUSTER);
            event.accept(ModBlocks.RUBY_CLUSTER);
            event.accept(ModBlocks.SAPPHIRE_CLUSTER);
            event.accept(ModBlocks.TOPAZ_CLUSTER);

            // LARGE BUD BLOCKS
            event.accept(ModBlocks.LARGE_WIP_BUD);
            event.accept(ModBlocks.LARGE_AQUAMARINE_BUD);
            event.accept(ModBlocks.LARGE_CITRINE_BUD);
            event.accept(ModBlocks.LARGE_GARNET_BUD);
            event.accept(ModBlocks.LARGE_OPAL_BUD);
            event.accept(ModBlocks.LARGE_PERIDOT_BUD);
            event.accept(ModBlocks.LARGE_RUBY_BUD);
            event.accept(ModBlocks.LARGE_SAPPHIRE_BUD);
            event.accept(ModBlocks.LARGE_TOPAZ_BUD);

            // MEDIUM BUD BLOCKS
            event.accept(ModBlocks.MEDIUM_WIP_BUD);
            event.accept(ModBlocks.MEDIUM_AQUAMARINE_BUD);
            event.accept(ModBlocks.MEDIUM_CITRINE_BUD);
            event.accept(ModBlocks.MEDIUM_GARNET_BUD);
            event.accept(ModBlocks.MEDIUM_OPAL_BUD);
            event.accept(ModBlocks.MEDIUM_PERIDOT_BUD);
            event.accept(ModBlocks.MEDIUM_RUBY_BUD);
            event.accept(ModBlocks.MEDIUM_SAPPHIRE_BUD);
            event.accept(ModBlocks.MEDIUM_TOPAZ_BUD);

            // SMALL BUD BLOCKS
            event.accept(ModBlocks.SMALL_WIP_BUD);
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
            // To be filled later
        }
    }
}
