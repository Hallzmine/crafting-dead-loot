package ga.hallzmine.hcdservercore.items;

import ga.hallzmine.hcdservercore.ServercoreMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase(Properties properties) {
        super(properties.group(ServercoreMod.TAB));
    }
}
