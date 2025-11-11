
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class YotatechModTabs {
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB;

	public static void load() {
		TAB_YOTA_CREATIVE_TAB = new CreativeModeTab("tabyota_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(YotatechModBlocks.YOTA_ENERGY_ARROW.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
