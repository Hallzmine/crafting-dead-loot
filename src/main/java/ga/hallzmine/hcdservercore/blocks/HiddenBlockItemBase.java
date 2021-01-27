package ga.hallzmine.hcdservercore.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Rarity;

public class HiddenBlockItemBase extends BlockItem {
    public HiddenBlockItemBase(Block block) {
        super(block, new Properties().rarity(Rarity.EPIC));
    }
}
