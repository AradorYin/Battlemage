package net.aradoryin.battlemage.item;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.item.custom.BracerItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Battlemage.MOD_ID);

    /*
    The below Item(s) are to be used as examples or placeholders in the event of Image Load Failure.
     */
    public static final RegistryObject<Item> WIP_EMERALD = ITEMS.register("gem_emerald_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIP_FACETED = ITEMS.register("gem_faceted_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIP_GEODE = ITEMS.register("geode_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIP_PEAR = ITEMS.register("gem_pear_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIP_SHARD = ITEMS.register("gem_shard_wip", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIP_TRILLION = ITEMS.register("gem_trillion_wip", () -> new Item(new Item.Properties()));

    /*
    TODO: Finish adding in the BracerItems
    The Bracer will be the pivotal item in this mod as all spells will have to be used through it. The Bracer should handle
    the final damage amount based on the passed parameters from the gems inserted into it. The Bracer should have its in-game
    texture update to reflect the gems added to it. Armor trim might be applied for additional effects, but this is uncertain.
    Bracer Tiers: Patchwork Bracer -> Leather Bracer -> Enhanced Bracer -> Masterwork Bracer
     */
    public static final RegistryObject<Item> BRACER_PATCHWORK = ITEMS.register("bracer_patchwork", () -> new BracerItem(new Item.Properties()));

    /*
    TODO: Add custom GemItem class (maybe add in an enum gem class?)
    This class should hold custom methods for holding spells. Each gem would hold a max of 3 spells (Target, AOE, Shield).
    The spell definitions will be handled by its own class, so the gems would just need a pointer to the specified spell and
    its appropriate parameters.
    Gem Tiers: (Mined)Shard -> (Tier 1)Emerald -> (Tier 2)Pear -> (Tier 3)Marquise -> (Tier 4)Round -> (Tier 5)Heart
    Gem Types: Amethyst, Aquamarine, Citrine, Garnet, Opal, Peridot, Ruby, Sapphire, Topaz
     */
    // GEM SHARDS
    public static final RegistryObject<Item> AQUAMARINE_SHARD = ITEMS.register("gem_shard_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_SHARD = ITEMS.register("gem_shard_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_SHARD = ITEMS.register("gem_shard_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_SHARD = ITEMS.register("gem_shard_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_SHARD = ITEMS.register("gem_shard_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("gem_shard_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("gem_shard_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_SHARD = ITEMS.register("gem_shard_topaz", () -> new Item(new Item.Properties()));

    // GEM EMERALDS
    public static final RegistryObject<Item> AMETHYST_EMERALD = ITEMS.register("gem_emerald_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_EMERALD = ITEMS.register("gem_emerald_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_EMERALD = ITEMS.register("gem_emerald_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_EMERALD = ITEMS.register("gem_emerald_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_EMERALD = ITEMS.register("gem_emerald_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_EMERALD = ITEMS.register("gem_emerald_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_EMERALD = ITEMS.register("gem_emerald_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_EMERALD = ITEMS.register("gem_emerald_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_EMERALD = ITEMS.register("gem_emerald_topaz", () -> new Item(new Item.Properties()));

    // GEM FACETED
    public static final RegistryObject<Item> AMETHYST_FACETED = ITEMS.register("gem_faceted_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_FACETED = ITEMS.register("gem_faceted_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_FACETED = ITEMS.register("gem_faceted_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_FACETED = ITEMS.register("gem_faceted_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_FACETED = ITEMS.register("gem_faceted_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_FACETED = ITEMS.register("gem_faceted_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_FACETED = ITEMS.register("gem_faceted_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_FACETED = ITEMS.register("gem_faceted_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_FACETED = ITEMS.register("gem_faceted_topaz", () -> new Item(new Item.Properties()));


    // GEM GEODE
    public static final RegistryObject<Item> AMETHYST_GEODE = ITEMS.register("geode_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_GEODE = ITEMS.register("geode_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_GEODE = ITEMS.register("geode_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_GEODE = ITEMS.register("geode_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_GEODE = ITEMS.register("geode_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_GEODE = ITEMS.register("geode_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_GEODE = ITEMS.register("geode_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_GEODE = ITEMS.register("geode_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_GEODE = ITEMS.register("geode_topaz", () -> new Item(new Item.Properties()));

    // GEM PEAR
    public static final RegistryObject<Item> AMETHYST_PEAR = ITEMS.register("gem_pear_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_PEAR = ITEMS.register("gem_pear_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_PEAR = ITEMS.register("gem_pear_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_PEAR = ITEMS.register("gem_pear_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_PEAR = ITEMS.register("gem_pear_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_PEAR = ITEMS.register("gem_pear_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_PEAR = ITEMS.register("gem_pear_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_PEAR = ITEMS.register("gem_pear_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_PEAR = ITEMS.register("gem_pear_topaz", () -> new Item(new Item.Properties()));

    // GEM TRILLION
    public static final RegistryObject<Item> AMETHYST_TRILLION = ITEMS.register("gem_trillion_amethyst", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AQUAMARINE_TRILLION = ITEMS.register("gem_trillion_aquamarine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE_TRILLION = ITEMS.register("gem_trillion_citrine", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GARNET_TRILLION = ITEMS.register("gem_trillion_garnet", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OPAL_TRILLION = ITEMS.register("gem_trillion_opal", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERIDOT_TRILLION = ITEMS.register("gem_trillion_peridot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_TRILLION = ITEMS.register("gem_trillion_ruby", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_TRILLION = ITEMS.register("gem_trillion_sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_TRILLION = ITEMS.register("gem_trillion_topaz", () -> new Item(new Item.Properties()));

    /*
    TODO: Add Sigils
    Sigil Types: Elemental, Spell
    Elemental Sigils: (Mastery)Corruption, (Mastery)Delirium, (Destruction)Earth, (Destruction)Fire, (Control)Ice,
        (Control)Kinesis, (Mastery)Lightning, (Destruction)Necromancy, (Control)Phase
    Spell Types: (LC)Target, (LC)Ray, (LC)Grenade, (LC+RC)Area of Effect, (LC+RC)Pool, (LC+RC)Trap, (RC)Shield
     */

    private ModItems () {}

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
