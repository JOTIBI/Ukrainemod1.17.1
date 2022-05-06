
package net.mcreator.ukrainemod.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.ukrainemod.procedures.GassWennMobSpielerMitBlockKollidiertProcedure;
import net.mcreator.ukrainemod.init.UkrainemodModFluids;

public class GassBlock extends LiquidBlock {
	public GassBlock() {
		super(UkrainemodModFluids.GASS, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("gass");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		GassWennMobSpielerMitBlockKollidiertProcedure.execute(entity);
	}
}
