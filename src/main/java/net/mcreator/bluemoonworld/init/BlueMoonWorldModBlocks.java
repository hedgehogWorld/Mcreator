
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluemoonworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bluemoonworld.block.SdddBlock;
import net.mcreator.bluemoonworld.block.RoadBlockBlock;
import net.mcreator.bluemoonworld.block.MoonWoodBlock;
import net.mcreator.bluemoonworld.block.MoonStairsBlock;
import net.mcreator.bluemoonworld.block.MoonSlabBlock;
import net.mcreator.bluemoonworld.block.MoonPressurePlateBlock;
import net.mcreator.bluemoonworld.block.MoonPlanksBlock;
import net.mcreator.bluemoonworld.block.MoonLogBlock;
import net.mcreator.bluemoonworld.block.MoonLeavesBlock;
import net.mcreator.bluemoonworld.block.MoonFenceGateBlock;
import net.mcreator.bluemoonworld.block.MoonFenceBlock;
import net.mcreator.bluemoonworld.block.MoonDeartBlock;
import net.mcreator.bluemoonworld.block.MoonButtonBlock;
import net.mcreator.bluemoonworld.BlueMoonWorldMod;

public class BlueMoonWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlueMoonWorldMod.MODID);
	public static final RegistryObject<Block> SDDD = REGISTRY.register("sddd", () -> new SdddBlock());
	public static final RegistryObject<Block> ROAD_BLOCK = REGISTRY.register("road_block", () -> new RoadBlockBlock());
	public static final RegistryObject<Block> MOON_WOOD = REGISTRY.register("moon_wood", () -> new MoonWoodBlock());
	public static final RegistryObject<Block> MOON_LOG = REGISTRY.register("moon_log", () -> new MoonLogBlock());
	public static final RegistryObject<Block> MOON_PLANKS = REGISTRY.register("moon_planks", () -> new MoonPlanksBlock());
	public static final RegistryObject<Block> MOON_LEAVES = REGISTRY.register("moon_leaves", () -> new MoonLeavesBlock());
	public static final RegistryObject<Block> MOON_STAIRS = REGISTRY.register("moon_stairs", () -> new MoonStairsBlock());
	public static final RegistryObject<Block> MOON_SLAB = REGISTRY.register("moon_slab", () -> new MoonSlabBlock());
	public static final RegistryObject<Block> MOON_FENCE = REGISTRY.register("moon_fence", () -> new MoonFenceBlock());
	public static final RegistryObject<Block> MOON_FENCE_GATE = REGISTRY.register("moon_fence_gate", () -> new MoonFenceGateBlock());
	public static final RegistryObject<Block> MOON_PRESSURE_PLATE = REGISTRY.register("moon_pressure_plate", () -> new MoonPressurePlateBlock());
	public static final RegistryObject<Block> MOON_BUTTON = REGISTRY.register("moon_button", () -> new MoonButtonBlock());
	public static final RegistryObject<Block> MOON_DEART = REGISTRY.register("moon_deart", () -> new MoonDeartBlock());
}
