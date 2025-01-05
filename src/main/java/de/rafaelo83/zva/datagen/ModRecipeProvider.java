package de.rafaelo83.zva.datagen;

import de.rafaelo83.zva.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter) {
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.SKIBIDI_BLOCK, Blocks.QUARTZ_BLOCK);


    }
}
