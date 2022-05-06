
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ukrainemod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UkrainemodModTabs {
	public static CreativeModeTab TAB_WAFFEN;

	public static void load() {
		TAB_WAFFEN = new CreativeModeTab("tabwaffen") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UkrainemodModItems.AK_47);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
