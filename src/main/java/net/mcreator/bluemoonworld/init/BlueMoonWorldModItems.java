
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluemoonworld.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bluemoonworld.item.MoonstounItem;
import net.mcreator.bluemoonworld.item.MoonslitokItem;
import net.mcreator.bluemoonworld.item.MoonSwordItem;
import net.mcreator.bluemoonworld.item.MoonShovelItem;
import net.mcreator.bluemoonworld.item.MoonPickaxeItem;
import net.mcreator.bluemoonworld.item.MoonItem;
import net.mcreator.bluemoonworld.item.MoonHoeItem;
import net.mcreator.bluemoonworld.item.MoonAxeItem;
import net.mcreator.bluemoonworld.item.MoonArmorItem;
import net.mcreator.bluemoonworld.BlueMoonWorldMod;

public class BlueMoonWorldModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BlueMoonWorldMod.MODID);
	public static final RegistryObject<Item> MOONSTOUN = REGISTRY.register("moonstoun", () -> new MoonstounItem());
	public static final RegistryObject<Item> MOONSLITOK = REGISTRY.register("moonslitok", () -> new MoonslitokItem());
	public static final RegistryObject<Item> MOON_PICKAXE = REGISTRY.register("moon_pickaxe", () -> new MoonPickaxeItem());
	public static final RegistryObject<Item> MOON_AXE = REGISTRY.register("moon_axe", () -> new MoonAxeItem());
	public static final RegistryObject<Item> MOON_SWORD = REGISTRY.register("moon_sword", () -> new MoonSwordItem());
	public static final RegistryObject<Item> MOON_SHOVEL = REGISTRY.register("moon_shovel", () -> new MoonShovelItem());
	public static final RegistryObject<Item> MOON_HOE = REGISTRY.register("moon_hoe", () -> new MoonHoeItem());
	public static final RegistryObject<Item> MOON_ARMOR_HELMET = REGISTRY.register("moon_armor_helmet", () -> new MoonArmorItem.Helmet());
	public static final RegistryObject<Item> MOON_ARMOR_CHESTPLATE = REGISTRY.register("moon_armor_chestplate", () -> new MoonArmorItem.Chestplate());
	public static final RegistryObject<Item> MOON_ARMOR_LEGGINGS = REGISTRY.register("moon_armor_leggings", () -> new MoonArmorItem.Leggings());
	public static final RegistryObject<Item> MOON_ARMOR_BOOTS = REGISTRY.register("moon_armor_boots", () -> new MoonArmorItem.Boots());
	public static final RegistryObject<Item> SDDD = block(BlueMoonWorldModBlocks.SDDD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ROAD_BLOCK = block(BlueMoonWorldModBlocks.ROAD_BLOCK, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_WOOD = block(BlueMoonWorldModBlocks.MOON_WOOD, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_LOG = block(BlueMoonWorldModBlocks.MOON_LOG, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_PLANKS = block(BlueMoonWorldModBlocks.MOON_PLANKS, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_LEAVES = block(BlueMoonWorldModBlocks.MOON_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOON_STAIRS = block(BlueMoonWorldModBlocks.MOON_STAIRS, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_SLAB = block(BlueMoonWorldModBlocks.MOON_SLAB, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_FENCE = block(BlueMoonWorldModBlocks.MOON_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOON_FENCE_GATE = block(BlueMoonWorldModBlocks.MOON_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOON_PRESSURE_PLATE = block(BlueMoonWorldModBlocks.MOON_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOON_BUTTON = block(BlueMoonWorldModBlocks.MOON_BUTTON, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON_DEART = block(BlueMoonWorldModBlocks.MOON_DEART, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOONSTOUNBLOK = block(BlueMoonWorldModBlocks.MOONSTOUNBLOK, BlueMoonWorldModTabs.TAB_GVHH);
	public static final RegistryObject<Item> MOON = REGISTRY.register("moon", () -> new MoonItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
