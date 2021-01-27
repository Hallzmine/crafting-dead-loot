package ga.hallzmine.hcdservercore.blocks;

import ga.hallzmine.hcdservercore.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class LootGenBase extends Block {
    String loot_type;

    public LootGenBase(Properties properties, String loot_type_in) {
        super(properties.tickRandomly().notSolid().doesNotBlockMovement());
        this.loot_type = loot_type_in;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (worldIn.isAirBlock(pos.down()) == true) {
            switch (this.loot_type) {
                case "military":
                    worldIn.setBlockState(pos.down(), RegistryHandler.MILITARY_LOOT.get().getDefaultState());
                    break;
                case "medic":
                    worldIn.setBlockState(pos.down(), RegistryHandler.MEDIC_LOOT.get().getDefaultState());
                    break;
                case "civilian":
                    worldIn.setBlockState(pos.down(), RegistryHandler.CIVILIAN_LOOT.get().getDefaultState());
                    break;
                case "civilian_rare":
                    worldIn.setBlockState(pos.down(), RegistryHandler.CIVILIAN_RARE_LOOT.get().getDefaultState());
                    break;
                case "police":
                    worldIn.setBlockState(pos.down(), RegistryHandler.POLICE_LOOT.get().getDefaultState());
                    break;
            }
        }
        super.randomTick(state, worldIn, pos, random);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return (VoxelShape) Block.makeCuboidShape(6,6,6,10,10,10);
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @OnlyIn(Dist.CLIENT)
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 1.0F;
    }
}
