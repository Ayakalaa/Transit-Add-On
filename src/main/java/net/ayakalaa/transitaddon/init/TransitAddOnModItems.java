
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ayakalaa.transitaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.ayakalaa.transitaddon.item.BauxiteIngot;

import net.ayakalaa.transitaddon.TransitAddOnMod;

public class TransitAddOnModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TransitAddOnMod.MODID);

	public static final RegistryObject<Item> EXAMPLE_ORE = block(TransitAddOnModBlocks.EXAMPLE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Item> BAUXITE_INGOT = REGISTRY.register("bauxite_ingot", () -> new BauxiteIngot());

	
	public static final RegistryObject<Item> RED_PYLON = block(TransitAddOnModBlocks.RED_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ORANGE_PYLON = block(TransitAddOnModBlocks.ORANGE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> YELLOW_PYLON = block(TransitAddOnModBlocks.YELLOW_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GREEN_PYLON = block(TransitAddOnModBlocks.GREEN_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUE_PYLON = block(TransitAddOnModBlocks.BLUE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PURPLE_PYLON = block(TransitAddOnModBlocks.PURPLE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Item> RED_ORANGE_PYLON = block(TransitAddOnModBlocks.RED_ORANGE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_YELLOW_PYLON = block(TransitAddOnModBlocks.RED_YELLOW_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_GREEN_PYLON = block(TransitAddOnModBlocks.RED_GREEN_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_BLUE_PYLON = block(TransitAddOnModBlocks.RED_BLUE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RED_PURPLE_PYLON = block(TransitAddOnModBlocks.RED_PURPLE_PYLON, CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Item> STEEL_ORE = block(TransitAddOnModBlocks.STEEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NICKEL_ORE = block(TransitAddOnModBlocks.NICKEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BAUXITE_ORE = block(TransitAddOnModBlocks.BAUXITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);





	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
