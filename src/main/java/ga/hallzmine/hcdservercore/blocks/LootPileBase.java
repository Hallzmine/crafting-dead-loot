package ga.hallzmine.hcdservercore.blocks;

import ga.hallzmine.hcdservercore.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class LootPileBase extends Block {
    String loot_type;

    public LootPileBase(Properties properties, String loot_type_in) {
        super(properties.notSolid());
        this.loot_type = loot_type_in;
    }


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        worldIn.destroyBlock(pos, true);
        switch (this.loot_type) {
            case "military":
                worldIn.setBlockState(pos, RegistryHandler.MILITARY_LOOT_GEN.get().getDefaultState());
                break;
            case "medic":
                worldIn.setBlockState(pos, RegistryHandler.MEDIC_LOOT_GEN.get().getDefaultState());
                break;
            case "civilian":
                worldIn.setBlockState(pos, RegistryHandler.CIVILIAN_LOOT_GEN.get().getDefaultState());
                break;
            case "civilian_rare":
                worldIn.setBlockState(pos, RegistryHandler.CIVILIAN_RARE_LOOT_GEN.get().getDefaultState());
                break;
            case "police":
                worldIn.setBlockState(pos, RegistryHandler.POLICE_LOOT_GEN.get().getDefaultState());
                break;
        }
        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return (VoxelShape) Block.makeCuboidShape(0,0,0,16,3,16);
    }

}
