package de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.client;

import de.rafaelo83.zva.ZuVielArbeitsspeicher;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class SkibidiBlockModel extends GeoModel<SkibidiBlockEntity> {

    @Override
    public Identifier getModelResource(SkibidiBlockEntity skibidiBlockEntity) {
        return new Identifier(ZuVielArbeitsspeicher.MOD_ID, "geo/skibidi_block.geo.json");
    }

    @Override
    public Identifier getTextureResource(SkibidiBlockEntity skibidiBlockEntity) {
        return new Identifier(ZuVielArbeitsspeicher.MOD_ID, "textures/block/skibidi_block.png");
    }

    @Override
    public Identifier getAnimationResource(SkibidiBlockEntity skibidiBlockEntity) {
        return new Identifier(ZuVielArbeitsspeicher.MOD_ID, "animations/skibidi_block.animation.json");
    }
}
