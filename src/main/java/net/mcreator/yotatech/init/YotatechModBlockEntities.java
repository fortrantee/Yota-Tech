
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.yotatech.block.entity.YotaTesterStorageBlockEntity;
import net.mcreator.yotatech.block.entity.YotaEnergyArrowBlockEntity;
import net.mcreator.yotatech.block.entity.YotaCapacitorBlockEntity;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, YotatechMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> YOTA_TESTER_STORAGE = register("yota_tester_storage", YotatechModBlocks.YOTA_TESTER_STORAGE, YotaTesterStorageBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> YOTA_ENERGY_ARROW = register("yota_energy_arrow", YotatechModBlocks.YOTA_ENERGY_ARROW, YotaEnergyArrowBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> YOTA_CAPACITOR = register("yota_capacitor", YotatechModBlocks.YOTA_CAPACITOR, YotaCapacitorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
