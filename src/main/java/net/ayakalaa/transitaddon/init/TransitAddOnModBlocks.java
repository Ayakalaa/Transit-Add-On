
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ayakalaa.transitaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ayakalaa.transitaddon.block.ExampleOreBlock;
import net.ayakalaa.transitaddon.block.ExampleBlockBlock;

//WMATA Pylons, where is the textures???
import net.ayakalaa.transitaddon.block.wmata.pylons.RedPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.OrangePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.YellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.GreenPylon;

//Ored
import net.ayakalaa.transitaddon.block.ores.SteelOre;
import net.ayakalaa.transitaddon.block.ores.NickelOre;
import net.ayakalaa.transitaddon.block.ores.BauxiteOre;


import net.ayakalaa.transitaddon.TransitAddOnMod;

public class TransitAddOnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TransitAddOnMod.MODID);
	public static final RegistryObject<Block> EXAMPLE_BLOCK = REGISTRY.register("example_block", () -> new ExampleBlockBlock());
	public static final RegistryObject<Block> EXAMPLE_ORE = REGISTRY.register("example_ore", () -> new ExampleOreBlock());
	public static final RegistryObject<Block> RED_PYLON = REGISTRY.register("red_pylon", () -> new RedPylon());
	public static final RegistryObject<Block> ORANGE_PYLON = REGISTRY.register("orange_pylon", () -> new OrangePylon());
	public static final RegistryObject<Block> YELLOW_PYLON = REGISTRY.register("yellow_pylon", () -> new YellowPylon());
	public static final RegistryObject<Block> GREEN_PYLON = REGISTRY.register("green_pylon", () -> new GreenPylon());


	public static final RegistryObject<Block> STEEL_ORE = REGISTRY.register("steel_ore", () -> new SteelOre());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOre());
	public static final RegistryObject<Block> BAUXITE_ORE = REGISTRY.register("bauxite_ore", () -> new BauxiteOre());
}
