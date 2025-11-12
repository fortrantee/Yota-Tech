
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class YotatechModTabs {
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB_COMBAT;
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB;
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB_ORES;
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB_INGOTS;
	public static CreativeModeTab TAB_YOTA_CREATIVE_TAB_ELECTRICITY;

	public static void load() {
		TAB_YOTA_CREATIVE_TAB_COMBAT = new CreativeModeTab("tabyota_creative_tab_combat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(YotatechModItems.YOTAVOLTGUN.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
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
		TAB_YOTA_CREATIVE_TAB_ORES = new CreativeModeTab("tabyota_creative_tab_ores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(YotatechModBlocks.YOTA_SPUDUMENE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_YOTA_CREATIVE_TAB_INGOTS = new CreativeModeTab("tabyota_creative_tab_ingots") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(YotatechModItems.YOTA_LEAD_INGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_YOTA_CREATIVE_TAB_ELECTRICITY = new CreativeModeTab("tabyota_creative_tab_electricity") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(YotatechModBlocks.YOTA_CAPACITOR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
