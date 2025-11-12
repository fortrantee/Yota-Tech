
package net.mcreator.yotatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.yotatech.init.YotatechModTabs;

public class YotaHydrogenPeroxideItem extends Item {
	public YotaHydrogenPeroxideItem() {
		super(new Item.Properties().tab(YotatechModTabs.TAB_YOTA_CREATIVE_TAB_INGOTS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
