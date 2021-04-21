package ga.hallzmine.hcdservercore.blocks;

import ga.hallzmine.hcdservercore.RegistryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class BrokenFakeOreBlock extends Block {
    public BrokenFakeOreBlock() {
        super(AbstractBlock.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(-1).tickRandomly());
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        worldIn.setBlockState(pos, RegistryHandler.FAKE_ORE_BLOCK.get().getDefaultState());
        super.randomTick(state, worldIn, pos, random);
    }
}
