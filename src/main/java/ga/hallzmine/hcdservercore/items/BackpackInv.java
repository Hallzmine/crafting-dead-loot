package ga.hallzmine.hcdservercore.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraftforge.common.util.Constants;

/*public class BackpackInv extends Inventory {
    public BackpackInv(int rows)
    {
        super(9 * rows);
    }

    @Override
    public boolean isUsableByPlayer(PlayerEntity player)
    {
        return true;
    }



    @Override
    public void openInventory(PlayerEntity player)
    {
        ItemStack backpack = player.getHeldItemMainhand();
        if(!backpack.isEmpty())
        {
            CompoundNBT compound = backpack.getTag();
            if(compound != null)
            {
                if(compound.contains("Inventory", Constants.NBT.TAG_LIST))
                {
                    loadAllItems(compound.getList("Inventory", Constants.NBT.TAG_COMPOUND), this);
                }
            }
        }
    }

    @Override
    public void closeInventory(PlayerEntity player)
    {
        ItemStack backpack = player.getHeldItemMainhand();
        if(!backpack.isEmpty())
        {
            CompoundNBT compound = backpack.getTag();
            if(compound == null)
            {
                compound = new CompoundNBT();
            }
            ListNBT list = new ListNBT();
            saveAllItems(list, this);
            compound.put("Items", list);
            backpack.setTag(compound);
        }
    }

    public static void loadAllItems(ListNBT list, Inventory inventory)
    {
        for(int i = 0; i < list.size(); i++)
        {
            CompoundNBT compound = list.getCompound(i);
            int slot = compound.getByte("Slot") & 255;
            if(slot < inventory.getSizeInventory())
            {
                inventory.setInventorySlotContents(slot, ItemStack.read(compound));
            }
        }
    }

    public static ListNBT saveAllItems(ListNBT list, Inventory inventory)
    {
        for(int i = 0; i < inventory.getSizeInventory(); ++i)
        {
            ItemStack itemstack = inventory.getStackInSlot(i);
            if(!itemstack.isEmpty())
            {
                CompoundNBT compound = new CompoundNBT();
                compound.putByte("Slot", (byte) i);
                itemstack.write(compound);
                list.add(compound);
            }
        }
        return list;
    }
}
*/