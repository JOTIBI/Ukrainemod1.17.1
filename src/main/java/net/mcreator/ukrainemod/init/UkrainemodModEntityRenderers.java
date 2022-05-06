
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ukrainemod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UkrainemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(UkrainemodModEntities.AK_74, ThrownItemRenderer::new);
		event.registerEntityRenderer(UkrainemodModEntities.WALTER_P_PK, ThrownItemRenderer::new);
		event.registerEntityRenderer(UkrainemodModEntities.FLAMMENWERFER, ThrownItemRenderer::new);
	}
}
