
package net.mcreator.ukrainemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.ukrainemod.init.UkrainemodModTabs;
import net.mcreator.ukrainemod.init.UkrainemodModFluids;

public class GassItem extends BucketItem {
	public GassItem() {
		super(() -> UkrainemodModFluids.GASS,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(UkrainemodModTabs.TAB_WAFFEN));
		setRegistryName("gass_bucket");
	}
}
