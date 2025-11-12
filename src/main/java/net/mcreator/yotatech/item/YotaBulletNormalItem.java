
package net.mcreator.yotatech.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.yotatech.init.YotatechModTabs;

public class YotaBulletNormalItem extends Item {
	public YotaBulletNormalItem() {
		super(new Item.Properties().tab(YotatechModTabs.TAB_YOTA_CREATIVE_TAB_COMBAT).stacksTo(64).rarity(Rarity.COMMON));
	}
}
