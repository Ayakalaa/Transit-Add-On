
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ayakalaa.transitaddon.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ayakalaa.transitaddon.block.ExampleOreBlock;


//WMATA Pylons, Single Line Colors
import net.ayakalaa.transitaddon.block.wmata.pylons.one.RedPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.OrangePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.YellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.GreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.BluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.PurplePylon;

//WMATA Pylons, Two Line Colors
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedOrangePylon;


import net.ayakalaa.transitaddon.TransitAddOnMod;

public class TransitAddOnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TransitAddOnMod.MODID);
	public static final RegistryObject<Block> EXAMPLE_ORE = REGISTRY.register("example_ore", () -> new ExampleOreBlock());
	public static final RegistryObject<Block> RED_PYLON = REGISTRY.register("red_pylon", () -> new RedPylon());
	public static final RegistryObject<Block> ORANGE_PYLON = REGISTRY.register("orange_pylon", () -> new OrangePylon());
	public static final RegistryObject<Block> YELLOW_PYLON = REGISTRY.register("yellow_pylon", () -> new YellowPylon());
	public static final RegistryObject<Block> GREEN_PYLON = REGISTRY.register("green_pylon", () -> new GreenPylon());
	public static final RegistryObject<Block> BLUE_PYLON = REGISTRY.register("blue_pylon", () -> new BluePylon());
	public static final RegistryObject<Block> PURPLE_PYLON = REGISTRY.register("purple_pylon", () -> new PurplePylon());
}
