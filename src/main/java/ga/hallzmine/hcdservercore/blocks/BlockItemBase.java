package ga.hallzmine.hcdservercore.blocks;

import ga.hallzmine.hcdservercore.ServercoreMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Properties().group(ServercoreMod.TAB));
    }
}
