
package net.mcreator.ukrainemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class Ak47Item extends Item {
	public Ak47Item() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.EPIC));
		setRegistryName("ak_47");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
