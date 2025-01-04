package de.rafaelo83.zva;

import de.rafaelo83.zva.block.ModBlockEntities;
import de.rafaelo83.zva.block.ModBlocks;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.client.SkibidiBlockRenderer;
import de.rafaelo83.zva.item.ModItemGroups;
import de.rafaelo83.zva.item.ModItems;
import de.rafaelo83.zva.util.ModModelPredicates;
import net.fabricmc.api.ModInitializer;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

public class ZuVielArbeitsspeicher implements ModInitializer {
	public static final String MOD_ID = "zva";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerAllBlockEntities();

		ModItemGroups.registerItemGroups();

		BlockEntityRendererFactories.register(ModBlockEntities.SKIBIDI_BLOCK_ENTITY, SkibidiBlockRenderer::new);
		GeckoLib.initialize();

		ModModelPredicates.registerModelPredicates();

		LOGGER.info("Hello Fabric world!");
	}
}