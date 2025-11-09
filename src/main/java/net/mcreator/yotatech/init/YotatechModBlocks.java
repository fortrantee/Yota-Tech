
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.yotatech.block.YotasulfurblokBlock;
import net.mcreator.yotatech.YotatechMod;

public class YotatechModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, YotatechMod.MODID);
	public static final RegistryObject<Block> YOTASULFURBLOK = REGISTRY.register("yotasulfurblok", () -> new YotasulfurblokBlock());
}
