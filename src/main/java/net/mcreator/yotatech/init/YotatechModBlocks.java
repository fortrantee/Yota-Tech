
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yotatech.block.YotasulfurblokBlock;
import net.mcreator.yotatech.block.YotaTesterStorageBlock;
import net.mcreator.yotatech.block.YotaEnergyArrowBlock;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YotatechMod.MODID);
	public static final RegistryObject<Block> YOTASULFURBLOK = REGISTRY.register("yotasulfurblok", () -> new YotasulfurblokBlock());
	public static final RegistryObject<Block> YOTA_TESTER_STORAGE = REGISTRY.register("yota_tester_storage", () -> new YotaTesterStorageBlock());
	public static final RegistryObject<Block> YOTA_ENERGY_ARROW = REGISTRY.register("yota_energy_arrow", () -> new YotaEnergyArrowBlock());
}
