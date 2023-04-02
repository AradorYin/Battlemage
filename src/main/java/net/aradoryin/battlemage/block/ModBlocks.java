package net.aradoryin.battlemage.block;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.block.custom.ModFlammableRotatedPillarBlock;
import net.aradoryin.battlemage.item.ModItems;
import net.aradoryin.battlemage.worldgen.tree.DaphneTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Battlemage.MOD_ID);

    public static final RegistryObject<Block> BLOCK_WIP = registerBlock("block_wip",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ORE_WIP = registerBlock("ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> DEEPSLATE_ORE_WIP = registerBlock("deepslate_ore_wip",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f)
                    .requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    public static final RegistryObject<Block> DAPHNE_LOG = registerBlock("daphne_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)
                    .strength(5f)));
    public static final RegistryObject<Block> DAPHNE_WOOD = registerBlock("daphne_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)
                    .strength(5f)));
    public static final RegistryObject<Block> STRIPPED_DAPHNE_LOG = registerBlock("stripped_daphne_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)
                    .strength(5f)));
    public static final RegistryObject<Block> STRIPPED_DAPHNE_WOOD = registerBlock("stripped_daphne_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)
                    .strength(5f)));

    public static final RegistryObject<Block> DAPHNE_PLANKS = registerBlock("daphne_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .strength(5f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 5; }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 20; }
            });
    public static final RegistryObject<Block> DAPHNE_LEAVES = registerBlock("daphne_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)
                    .strength(5f)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return true; }
                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 30; }
                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) { return 60; }
            });

    public static final RegistryObject<Block> DAPHNE_SAPLING = registerBlock("daphne_sapling",
            () -> new SaplingBlock(new DaphneTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)
                    .strength(5f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
