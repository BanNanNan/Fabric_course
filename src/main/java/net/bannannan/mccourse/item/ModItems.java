package net.bannannan.mccourse.item;

import net.bannannan.mccourse.MCCourseMod;
import net.bannannan.mccourse.item.custom.DowsingRodItem;
import net.bannannan.mccourse.item.custom.ModFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item ORICHALCUM_INGOT = registerModItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item ORICHALCUM_NUGGET = registerModItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item RAW_ORICHALCUM = registerModItem("raw_orichalcum",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));

    public static final Item DOWSING_ROD = registerModItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.COURSE).maxDamage(32)));

    public static final Item TURNIP = registerModItem("turnip",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE).food(ModFoodComponents.TURNIP)));

    public static final Item COAL_SLIVER = registerModItem("coal_sliver",
            new Item(new FabricItemSettings().group(ModItemGroups.COURSE)));


    private static Item registerModItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MCCourseMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("Registering Mod Items for " + MCCourseMod.MOD_ID);
    }

}
