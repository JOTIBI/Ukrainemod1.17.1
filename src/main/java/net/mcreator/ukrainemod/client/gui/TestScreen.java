
package net.mcreator.ukrainemod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.ukrainemod.world.inventory.TestMenu;
import net.mcreator.ukrainemod.network.TestButtonMessage;
import net.mcreator.ukrainemod.UkrainemodMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class TestScreen extends AbstractContainerScreen<TestMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox Rustung;
	Checkbox Waffen;
	Checkbox Essen;
	Checkbox Munition;

	public TestScreen(TestMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("ukrainemod:textures/test.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Krieg", 73, 6, -3407872);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 36, this.topPos + 128, 98, 20, new TextComponent("Starte den Angriff"), e -> {
			if (true) {
				UkrainemodMod.PACKET_HANDLER.sendToServer(new TestButtonMessage(0, x, y, z));
				TestButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		Rustung = new Checkbox(this.leftPos + 17, this.topPos + 24, 150, 20, new TextComponent("Rüstung"), false);
		TestMenu.guistate.put("checkbox:Rustung", Rustung);
		this.addRenderableWidget(Rustung);
		Waffen = new Checkbox(this.leftPos + 17, this.topPos + 48, 150, 20, new TextComponent("Waffen"), false);
		TestMenu.guistate.put("checkbox:Waffen", Waffen);
		this.addRenderableWidget(Waffen);
		Essen = new Checkbox(this.leftPos + 17, this.topPos + 96, 150, 20, new TextComponent("Essen"), false);
		TestMenu.guistate.put("checkbox:Essen", Essen);
		this.addRenderableWidget(Essen);
		Munition = new Checkbox(this.leftPos + 17, this.topPos + 72, 150, 20, new TextComponent("Munition"), false);
		TestMenu.guistate.put("checkbox:Munition", Munition);
		this.addRenderableWidget(Munition);
	}
}
