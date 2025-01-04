package de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_block;

import com.google.common.collect.ImmutableMap;
import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public class SkibidiBlock extends BlockWithEntity {
    public SkibidiBlock(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SkibidiBlockEntity(pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }
}
