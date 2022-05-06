
package net.mcreator.ukrainemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ukrainemod.init.UkrainemodModTabs;

public class BulletItem extends Item {
	public BulletItem() {
		super(new Item.Properties().tab(UkrainemodModTabs.TAB_WAFFEN).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("bullet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
