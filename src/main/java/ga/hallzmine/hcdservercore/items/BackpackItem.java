package ga.hallzmine.hcdservercore.items;

import ga.hallzmine.hcdservercore.ServercoreMod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import java.awt.*;
/*
public class BackpackItem extends Item {
    int rows;
    public BackpackItem(int rowsIn, Rarity rarityIn) {
        super(new Properties().group(ServercoreMod.TAB).maxStackSize(1).setNoRepair().rarity(rarityIn));
        this.rows = rowsIn;
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        ItemStack backpackItem = playerIn.getHeldItem(handIn);
        ServerPlayerEntity player =

        NetworkHooks.openGui(player, new SimpleNamedContainerProvider((id, playerInventory, entity) -> { return new BackpackContainer(id, player.inventory, new BackpackInv(rows), rows); }, new TranslationTextComponent("backpack")), buffer -> buffer.writeVarInt(rows));

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
*/