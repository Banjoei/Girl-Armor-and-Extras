package com.banjoei.girlmod;

import com.banjoei.girlmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class GirlMod implements ModInitializer {

    public static final String MOD_ID = "girlmod_and_extras";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
