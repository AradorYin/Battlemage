package net.aradoryin.battlemage.datagen.server;

import net.aradoryin.battlemage.block.ModBlocks;
import net.aradoryin.battlemage.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.GEODE_WIP.get()), RecipeCategory.MISC, ModItems.GEM_WIP.get(), 0.7f, 200, "gem_wip");
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.GEM_WIP.get(), RecipeCategory.MISC, ModBlocks.BLOCK_WIP.get());
    }
    /*
    ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GEM_WIP.get())
            .requires(ModBlocks.BLOCK_WIP.get())
            .unlockedBy("has_block_wip", inventoryTrigger(ItemPredicate.Builder.item()
                    .of(ModBlocks.BLOCK_WIP.get()).build()))
            .save(consumer);
     ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLOCK_WIP.get())
            .define('B', ModItems.GEM_WIP.get())
            .pattern("BBB")
            .pattern("BBB")
            .pattern("BBB")
            .unlockedBy("has_gem_wip", inventoryTrigger(ItemPredicate.Builder.item()
                    .of(ModItems.GEM_WIP.get()).build()))
            .save(consumer);
     */
}
