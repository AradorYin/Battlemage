package net.aradoryin.battlemage.datagen;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.datagen.client.ModBlockStateProvider;
import net.aradoryin.battlemage.datagen.client.ModItemModelProvider;
import net.aradoryin.battlemage.datagen.server.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Battlemage.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> holderLookup = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModEnUsProvider(packOutput));
        ModBlockTagsProvider blockTags = new ModBlockTagsProvider(packOutput, holderLookup, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTags);
        generator.addProvider(event.includeServer(), new ModItemTagsProvider(packOutput, holderLookup, blockTags.contentsGetter(), existingFileHelper));
        generator.addProvider(event.includeServer(), new ModBiomeTagsProvider(packOutput, holderLookup, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, holderLookup));
    }

    private DataGenerators () {}
}
