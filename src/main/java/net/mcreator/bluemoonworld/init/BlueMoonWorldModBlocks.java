
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluemoonworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bluemoonworld.block.SdddBlock;
import net.mcreator.bluemoonworld.BlueMoonWorldMod;

public class BlueMoonWorldModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BlueMoonWorldMod.MODID);
	public static final RegistryObject<Block> SDDD = REGISTRY.register("sddd", () -> new SdddBlock());
}
