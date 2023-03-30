package net.aradoryin.battlemage.datagen.client;

import net.aradoryin.battlemage.Battlemage;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Battlemage.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        gemItem(ModItems.GEM_WIP);
        geodeItem(ModItems.GEODE_WIP);
    }

    private ItemModelBuilder gemItem(RegistryObject<Item> item) {
        try {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return withExistingParent(ModItems.GEM_WIP.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + ModItems.GEM_WIP.getId().getPath()));
        }
    }
    private ItemModelBuilder geodeItem(RegistryObject<Item> item) {
        try {
            return withExistingParent(item.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return withExistingParent(ModItems.GEODE_WIP.getId().getPath(),
                    new ResourceLocation("item/generated")).texture("layer0",
                    new ResourceLocation(Battlemage.MOD_ID, "item/" + ModItems.GEODE_WIP.getId().getPath()));
        }
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Battlemage.MOD_ID, "item/" + item.getId().getPath()));
    }
}
