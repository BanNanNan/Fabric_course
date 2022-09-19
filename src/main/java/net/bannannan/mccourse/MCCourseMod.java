package net.bannannan.mccourse;

import net.bannannan.mccourse.block.ModBlocks;
import net.bannannan.mccourse.item.ModItems;
import net.bannannan.mccourse.util.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourseMod implements ModInitializer {
	public static final String MOD_ID = "mccourse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	//Added comment

	@Override
	public void onInitialize() {


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.resisterModStuffs();
	}
}
