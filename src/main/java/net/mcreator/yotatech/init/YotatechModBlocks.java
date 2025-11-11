
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
import net.mcreator.yotatech.block.YotaSpudumeneBlock;
import net.mcreator.yotatech.block.YotaRealgarBlock;
import net.mcreator.yotatech.block.YotaGiveArrowBlock;
import net.mcreator.yotatech.block.YotaGalenaBlock;
import net.mcreator.yotatech.block.YotaEnergyArrowBlock;
import net.mcreator.yotatech.block.YotaCapacitorBlock;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YotatechMod.MODID);
	public static final RegistryObject<Block> YOTASULFURBLOK = REGISTRY.register("yotasulfurblok", () -> new YotasulfurblokBlock());
	public static final RegistryObject<Block> YOTA_TESTER_STORAGE = REGISTRY.register("yota_tester_storage", () -> new YotaTesterStorageBlock());
	public static final RegistryObject<Block> YOTA_ENERGY_ARROW = REGISTRY.register("yota_energy_arrow", () -> new YotaEnergyArrowBlock());
	public static final RegistryObject<Block> YOTA_GIVE_ARROW = REGISTRY.register("yota_give_arrow", () -> new YotaGiveArrowBlock());
	public static final RegistryObject<Block> YOTA_CAPACITOR = REGISTRY.register("yota_capacitor", () -> new YotaCapacitorBlock());
	public static final RegistryObject<Block> YOTA_GALENA = REGISTRY.register("yota_galena", () -> new YotaGalenaBlock());
	public static final RegistryObject<Block> YOTA_SPUDUMENE = REGISTRY.register("yota_spudumene", () -> new YotaSpudumeneBlock());
	public static final RegistryObject<Block> YOTA_REALGAR = REGISTRY.register("yota_realgar", () -> new YotaRealgarBlock());
}
