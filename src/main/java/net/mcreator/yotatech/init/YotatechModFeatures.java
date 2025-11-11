
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yotatech.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.yotatech.world.features.ores.YotasulfurblokFeature;
import net.mcreator.yotatech.world.features.ores.YotaSpudumeneFeature;
import net.mcreator.yotatech.world.features.ores.YotaRealgarFeature;
import net.mcreator.yotatech.world.features.ores.YotaGalenaFeature;
import net.mcreator.yotatech.YotatechMod;

@Mod.EventBusSubscriber
public class YotatechModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, YotatechMod.MODID);
	public static final RegistryObject<Feature<?>> YOTASULFURBLOK = REGISTRY.register("yotasulfurblok", YotasulfurblokFeature::feature);
	public static final RegistryObject<Feature<?>> YOTA_GALENA = REGISTRY.register("yota_galena", YotaGalenaFeature::feature);
	public static final RegistryObject<Feature<?>> YOTA_SPUDUMENE = REGISTRY.register("yota_spudumene", YotaSpudumeneFeature::feature);
	public static final RegistryObject<Feature<?>> YOTA_REALGAR = REGISTRY.register("yota_realgar", YotaRealgarFeature::feature);
}
