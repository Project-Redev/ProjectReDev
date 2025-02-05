package net.roadkill.redev.world.feature;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.roadkill.redev.ReDevBlocks;
import net.roadkill.redev.block.ShadeSaplingBlock;
import net.roadkill.redev.world.ShadeTree;

public class ShadeTreeFeature extends Feature<NoneFeatureConfiguration>
{
    public ShadeTreeFeature(Codec<NoneFeatureConfiguration> codec)
    {   super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> placement)
    {
        BlockState blockAt = placement.level().getBlockState(placement.origin());
        ShadeTree.Color color;
        if (blockAt.getBlock() instanceof ShadeSaplingBlock sapling)
        {   color = sapling.getColor();
        }
        else
        {   color = ShadeTree.Color.NORMAL;
        }
        BlockState belowState = placement.level().getBlockState(placement.origin().below());
        return ReDevBlocks.SHADE_SAPLING.get().canSurvive(belowState, placement.level(), placement.origin())
        && ShadeTree.place(placement.level(), placement.origin(), color);
    }
}
