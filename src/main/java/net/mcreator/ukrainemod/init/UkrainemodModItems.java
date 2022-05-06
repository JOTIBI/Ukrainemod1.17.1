
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ukrainemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.ukrainemod.item.WalterPPkItem;
import net.mcreator.ukrainemod.item.KommanderrItem;
import net.mcreator.ukrainemod.item.HammerItem;
import net.mcreator.ukrainemod.item.GassItem;
import net.mcreator.ukrainemod.item.GasflascheItem;
import net.mcreator.ukrainemod.item.FlammenwerferItem;
import net.mcreator.ukrainemod.item.BulletItem;
import net.mcreator.ukrainemod.item.Ak74Item;
import net.mcreator.ukrainemod.item.Ak47Item;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UkrainemodModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item AK_74 = register(new Ak74Item());
	public static final Item WALTER_P_PK = register(new WalterPPkItem());
	public static final Item FLAMMENWERFER = register(new FlammenwerferItem());
	public static final Item BULLET = register(new BulletItem());
	public static final Item AK_47 = register(new Ak47Item());
	public static final Item GASS_BUCKET = register(new GassItem());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item GASFLASCHE = register(new GasflascheItem());
	public static final Item KOMMANDERR = register(new KommanderrItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
