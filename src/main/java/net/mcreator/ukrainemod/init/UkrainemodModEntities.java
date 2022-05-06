
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ukrainemod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ukrainemod.entity.WalterPPkEntity;
import net.mcreator.ukrainemod.entity.FlammenwerferEntity;
import net.mcreator.ukrainemod.entity.Ak74Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UkrainemodModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<Ak74Entity> AK_74 = register("entitybulletak_74",
			EntityType.Builder.<Ak74Entity>of(Ak74Entity::new, MobCategory.MISC).setCustomClientFactory(Ak74Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WalterPPkEntity> WALTER_P_PK = register("entitybulletwalter_p_pk",
			EntityType.Builder.<WalterPPkEntity>of(WalterPPkEntity::new, MobCategory.MISC).setCustomClientFactory(WalterPPkEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<FlammenwerferEntity> FLAMMENWERFER = register("entitybulletflammenwerfer",
			EntityType.Builder.<FlammenwerferEntity>of(FlammenwerferEntity::new, MobCategory.MISC).setCustomClientFactory(FlammenwerferEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
