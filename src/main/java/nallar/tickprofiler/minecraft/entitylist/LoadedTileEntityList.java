package nallar.tickprofiler.minecraft.entitylist;

import nallar.tickprofiler.minecraft.profiling.EntityTickProfiler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.lang.reflect.*;

public class LoadedTileEntityList extends EntityList<TileEntity> {
	public LoadedTileEntityList(World world, Field overriddenField) {
		super(world, overriddenField);
	}

	@Override
	public void tick() {
		EntityTickProfiler.ENTITY_TICK_PROFILER.runTileEntities(world, innerList);
	}
}
