
package net.mcreator.yotatech.recipes.brewing;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.yotatech.init.YotatechModItems;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class YotahydrogenperoxiderecieptBrewingRecipe implements IBrewingRecipe {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> BrewingRecipeRegistry.addRecipe(new YotahydrogenperoxiderecieptBrewingRecipe()));
	}

	@Override
	public boolean isInput(ItemStack input) {
		return Ingredient.of(new ItemStack(Items.GLASS_BOTTLE)).test(input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return Ingredient.of(ItemTags.create(new ResourceLocation("forge:dyes"))).test(ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if (isInput(input) && isIngredient(ingredient)) {
			return new ItemStack(YotatechModItems.YOTA_HYDROGEN_PEROXIDE.get());
		}
		return ItemStack.EMPTY;
	}
}
