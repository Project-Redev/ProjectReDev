package net.roadkill.redev.block;

import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockState;

public class HedgeBlock extends LeavesBlock
{
    public HedgeBlock(Properties properties)
    {   super(properties);
    }

    @Override
    protected boolean decaying(BlockState state)
    {   return false;
    }
}
