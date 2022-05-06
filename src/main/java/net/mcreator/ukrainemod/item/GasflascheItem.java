
package net.mcreator.ukrainemod.item;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.core.dispenser.OptionalDispenseItemBehavior;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockSource;

import net.mcreator.ukrainemod.init.UkrainemodModTabs;
import net.mcreator.ukrainemod.init.UkrainemodModItems;

@Mod.EventBusSubscriber
public class GasflascheItem extends Item {
	public GasflascheItem() {
		super(new Item.Properties().tab(UkrainemodModTabs.TAB_WAFFEN).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("gasflasche");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> DispenserBlock.registerBehavior(UkrainemodModItems.GASFLASCHE, new OptionalDispenseItemBehavior() {
			public ItemStack execute(BlockSource blockSource, ItemStack stack) {
				ItemStack itemstack = stack.copy();
				Level world = blockSource.getLevel();
				Direction direction = blockSource.getBlockState().getValue(DispenserBlock.FACING);
				int x = blockSource.getPos().getX();
				int y = blockSource.getPos().getY();
				int z = blockSource.getPos().getZ();
				this.setSuccess(true);
				if (this.isSuccess())
					itemstack.shrink(1);
				return itemstack;
			}
		}));
	}
}
