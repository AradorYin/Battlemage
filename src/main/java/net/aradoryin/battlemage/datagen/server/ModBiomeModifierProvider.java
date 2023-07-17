package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.Battlemage;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ModBiomeModifierProvider implements DataProvider {
    private final String MOD_ID = Battlemage.MOD_ID;
    private final PackOutput output;

    public ModBiomeModifierProvider(PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
