package ga.hallzmine.hcdservercore.blocks;

import ga.hallzmine.hcdservercore.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ToolType;

public class FakeOreBlock extends Block {
    public FakeOreBlock() {
        super(Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(20).harvestTool(ToolType.PICKAXE).harvestLevel(1).setRequiresTool());
    }

    @Override
    public void onPlayerDestroy(IWorld worldIn, BlockPos pos, BlockState state) {
        worldIn.setBlockState(pos,RegistryHandler.BROKEN_FAKE_ORE_BLOCK.get().getDefaultState(), 1);
        super.onPlayerDestroy(worldIn, pos, state);
    }


}
