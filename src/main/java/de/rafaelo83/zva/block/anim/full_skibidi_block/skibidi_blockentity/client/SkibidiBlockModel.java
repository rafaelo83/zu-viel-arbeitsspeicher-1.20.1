package de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.client;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.DefaultedBlockGeoModel;

public class SkibidiBlockModel extends DefaultedBlockGeoModel<SkibidiBlockEntity> {


    public SkibidiBlockModel() {
        super(Identifier.of(ZuVielArbeitsspeicher.MOD_ID, "skibidi_block"));
    }
}
