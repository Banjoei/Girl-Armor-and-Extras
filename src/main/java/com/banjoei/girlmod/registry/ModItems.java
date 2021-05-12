package com.banjoei.girlmod.registry;

import com.banjoei.girlmod.GirlMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DIAMOND_SHOES = new Item(new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(GirlMod.MOD_ID, "diamond_shoes"), DIAMOND_SHOES);
    }
}
