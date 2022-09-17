
package net.mcreator.bluemoonworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class MoonstounItem extends Item {
	public MoonstounItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_TRANSPORTATION).stacksTo(64).rarity(Rarity.COMMON));
	}
}
