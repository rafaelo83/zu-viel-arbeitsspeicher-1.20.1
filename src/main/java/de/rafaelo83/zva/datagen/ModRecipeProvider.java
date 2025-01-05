package de.rafaelo83.zva.datagen;

import de.rafaelo83.zva.block.ModBlocks;
import de.rafaelo83.zva.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTrimRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> recipeExporter) {
        offerStonecuttingRecipe(recipeExporter, RecipeCategory.MISC, ModBlocks.SKIBIDI_BLOCK, Blocks.QUARTZ_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModItems.BIG_HAMMER)
                .input('I', Items.IRON_INGOT)
                .input('S', Items.STICK)
                .pattern(" I ")
                .pattern(" SI")
                .pattern("S  ")
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(recipeExporter);
    }
}
