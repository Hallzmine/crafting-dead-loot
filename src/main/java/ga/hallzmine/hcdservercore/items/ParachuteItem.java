package ga.hallzmine.hcdservercore.items;

import ga.hallzmine.hcdservercore.RegistryHandler;
import ga.hallzmine.hcdservercore.ServercoreMod;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class ParachuteItem extends Item {
    public ParachuteItem() {
        super(new Properties().maxStackSize(1).group(ServercoreMod.TAB));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack itemstack = playerIn.getHeldItem(handIn);
        playerIn.addPotionEffect(new EffectInstance(RegistryHandler.PARACHUTEEFFECT.get(), 1200, 0, false, false));
        if (!playerIn.abilities.isCreativeMode) {
            itemstack.shrink(1);
        }
        return ActionResult.func_233538_a_(itemstack, worldIn.isRemote());
    }
}
