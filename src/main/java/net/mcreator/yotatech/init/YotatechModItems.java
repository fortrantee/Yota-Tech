
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.yotatech.item.YotavoltgunItem;
import net.mcreator.yotatech.item.YotaBulletNormalItem;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YotatechMod.MODID);
	public static final RegistryObject<Item> YOTAVOLTGUN = REGISTRY.register("yotavoltgun", () -> new YotavoltgunItem());
	public static final RegistryObject<Item> YOTA_BULLET_NORMAL = REGISTRY.register("yota_bullet_normal", () -> new YotaBulletNormalItem());
	public static final RegistryObject<Item> YOTASULFURBLOK = block(YotatechModBlocks.YOTASULFURBLOK, YotatechModTabs.TAB_YOTA_CREATIVE_TAB);
	public static final RegistryObject<Item> YOTA_TESTER_STORAGE = block(YotatechModBlocks.YOTA_TESTER_STORAGE, YotatechModTabs.TAB_YOTA_CREATIVE_TAB);
	public static final RegistryObject<Item> YOTA_ENERGY_ARROW = block(YotatechModBlocks.YOTA_ENERGY_ARROW, YotatechModTabs.TAB_YOTA_CREATIVE_TAB);
	public static final RegistryObject<Item> YOTA_GIVE_ARROW = block(YotatechModBlocks.YOTA_GIVE_ARROW, YotatechModTabs.TAB_YOTA_CREATIVE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
