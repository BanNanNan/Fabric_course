package net.bannannan.mccourse.item;

import net.bannannan.mccourse.MCCourseMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerModItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item ORICHALCUM_NUGGET = registerModItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerModItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }

}
