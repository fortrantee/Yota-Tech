
package net.mcreator.yotatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.yotatech.init.YotatechModTabs;

public class YotaLeadIngotItem extends Item {
	public YotaLeadIngotItem() {
		super(new Item.Properties().tab(YotatechModTabs.TAB_YOTA_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
