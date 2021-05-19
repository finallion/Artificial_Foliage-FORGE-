package com.finallion.arfo.common.itemGroup;

import com.finallion.arfo.ArtificialFoliage;
import com.finallion.arfo.init.ModItems;
import net.minecraft.item.ItemStack;

public class ItemGroup {
    
    public static ItemGroup itemGroup = new ItemGroup("artificialfoliage") {
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GRASS_SEED);
        }
    };

    public ItemGroup(String s) {
    }

    public static void init() {
        ArtificialFoliage.LOGGER.debug("ArFo: Item Group Created!");
    }

}
