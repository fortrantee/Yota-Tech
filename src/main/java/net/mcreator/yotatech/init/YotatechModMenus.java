
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.yotatech.world.inventory.YotagenericenergyguiMenu;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, YotatechMod.MODID);
	public static final RegistryObject<MenuType<YotagenericenergyguiMenu>> YOTAGENERICENERGYGUI = REGISTRY.register("yotagenericenergygui", () -> IForgeMenuType.create(YotagenericenergyguiMenu::new));
}
