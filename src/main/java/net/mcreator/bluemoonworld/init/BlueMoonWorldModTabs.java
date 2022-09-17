
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bluemoonworld.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BlueMoonWorldModTabs {
	public static CreativeModeTab TAB_GVHH;

	public static void load() {
		TAB_GVHH = new CreativeModeTab("tabgvhh") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BlueMoonWorldModItems.MOONSLITOK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
