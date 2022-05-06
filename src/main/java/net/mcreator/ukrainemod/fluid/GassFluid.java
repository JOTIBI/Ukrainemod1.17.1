
package net.mcreator.ukrainemod.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ukrainemod.init.UkrainemodModItems;
import net.mcreator.ukrainemod.init.UkrainemodModFluids;
import net.mcreator.ukrainemod.init.UkrainemodModBlocks;

public abstract class GassFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> UkrainemodModFluids.GASS,
			() -> UkrainemodModFluids.FLOWING_GASS,
			FluidAttributes.builder(new ResourceLocation("ukrainemod:blocks/gasgasartig"), new ResourceLocation("ukrainemod:blocks/nichts"))

					.gaseous()

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ukrainemod:gas")))).explosionResistance(100f)

							.bucket(() -> UkrainemodModItems.GASS_BUCKET).block(() -> (LiquidBlock) UkrainemodModBlocks.GASS);

	private GassFluid() {
		super(PROPERTIES);
	}

	public static class Source extends GassFluid {
		public Source() {
			super();
			setRegistryName("gass");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends GassFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_gass");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
