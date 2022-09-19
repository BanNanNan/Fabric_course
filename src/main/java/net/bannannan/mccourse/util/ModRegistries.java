package net.bannannan.mccourse.util;

import net.bannannan.mccourse.MCCourseMod;
import net.bannannan.mccourse.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void resisterModStuffs(){
        registerFuels();
    }

    private static void registerFuels(){
        System.out.println("Registering Fuels for : " + MCCourseMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COAL_SLIVER, 400);
    }
}
