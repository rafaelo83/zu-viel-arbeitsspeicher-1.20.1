package de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.client;

import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class SkibidiBlockRenderer extends GeoBlockRenderer<SkibidiBlockEntity> {
    public SkibidiBlockRenderer(BlockEntityRendererFactory.Context context) {
        super(new SkibidiBlockModel());
    }
}
