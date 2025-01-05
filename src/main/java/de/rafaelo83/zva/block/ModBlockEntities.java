package de.rafaelo83.zva.block;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static BlockEntityType<SkibidiBlockEntity> SKIBIDI_BLOCK_ENTITY;

    public static void registerAllBlockEntities() {

        SKIBIDI_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                new Identifier(ZuVielArbeitsspeicher.MOD_ID, "skibidi_block_entity"),
                FabricBlockEntityTypeBuilder.create(SkibidiBlockEntity::new,
                        ModBlocks.SKIBIDI_BLOCK).build());
        
    }
}
