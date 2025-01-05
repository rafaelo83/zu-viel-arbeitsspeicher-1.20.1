package de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_block;

import de.rafaelo83.zva.block.anim.full_skibidi_block.skibidi_blockentity.SkibidiBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public class SkibidiBlock extends BlockWithEntity {
    public SkibidiBlock(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(Properties.HORIZONTAL_FACING,Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new SkibidiBlockEntity(pos, state);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context){
        return super.getPlacementState(context).with(net.minecraft.state.property.Properties.HORIZONTAL_FACING, context.getHorizontalPlayerFacing().getOpposite());
    }
}
