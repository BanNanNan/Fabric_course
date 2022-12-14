package net.bannannan.mccourse.item;

import net.bannannan.mccourse.MCCourseMod;
import net.bannannan.mccourse.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COURSE = FabricItemGroupBuilder.build(new Identifier(MCCourseMod.MOD_ID, "course"),
            () -> new ItemStack(ModBlocks.ORICHALCUM_ORE));
}
