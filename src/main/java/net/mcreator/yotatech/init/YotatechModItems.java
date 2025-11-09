
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.yotatech.item.YotavoltgunItem;
import net.mcreator.yotatech.item.YotaBulletNormalItem;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YotatechMod.MODID);
	public static final RegistryObject<Item> YOTAVOLTGUN = REGISTRY.register("yotavoltgun", () -> new YotavoltgunItem());
	public static final RegistryObject<Item> YOTA_BULLET_NORMAL = REGISTRY.register("yota_bullet_normal", () -> new YotaBulletNormalItem());
}
