package de.rafaelo83.zva.block;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_block.SkibidiBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SKIBIDI_BLOCK = registerBlock("skibidi_block",
            new SkibidiBlock(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE).nonOpaque().hardness(0.8f).requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ZuVielArbeitsspeicher.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ZuVielArbeitsspeicher.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ZuVielArbeitsspeicher.LOGGER.info("Registering Blocks for " + ZuVielArbeitsspeicher.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            //entries.add(ModBlocks.BLUE_PLANKS);

        });
    }
}
