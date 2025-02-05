package net.roadkill.redev.block;

import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;

public class LeafyWallBlock extends WallBlock {
    public LeafyWallBlock(Properties properties) {
        super(properties);
    }



    // TODO find alternative override for this method
    public boolean connectsTo(BlockState state, boolean isNeighborSolid, Direction direction)
    {   Block block = state.getBlock();
        boolean flag = block instanceof FenceGateBlock && FenceGateBlock.connectsToDirection(state, direction);

        return state.is(BlockTags.WALLS) || !isExceptionForConnection(state) && isNeighborSolid
            || block instanceof IronBarsBlock || block instanceof LeavesBlock || flag;
    }
}
