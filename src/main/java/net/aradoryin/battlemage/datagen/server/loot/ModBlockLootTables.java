package net.aradoryin.battlemage.datagen.server.loot;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLOCK_WIP.get());
        add(ModBlocks.ORE_WIP.get(), (block) -> createOreDrop(ModBlocks.ORE_WIP.get(), ModItems.GEODE_WIP.get()));
        add(ModBlocks.DEEPSLATE_ORE_WIP.get(), (block) -> createOreDrop(ModBlocks.DEEPSLATE_ORE_WIP.get(), ModItems.GEODE_WIP.get()));

        dropSelf(ModBlocks.DAPHNE_LOG.get());
        dropSelf(ModBlocks.DAPHNE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_DAPHNE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_DAPHNE_WOOD.get());
        dropSelf(ModBlocks.DAPHNE_PLANKS.get());
        dropSelf(ModBlocks.DAPHNE_SAPLING.get());
        add(ModBlocks.DAPHNE_LEAVES.get(), (block) -> createLeavesDrops(block, ModBlocks.DAPHNE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
