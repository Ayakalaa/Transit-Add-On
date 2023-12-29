package net.ayakalaa.transitaddon.init;

//IMPORTANT IMPORTS
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.ayakalaa.transitaddon.TransitAddOnMod;


import net.ayakalaa.transitaddon.block.ExampleOreBlock;
import net.ayakalaa.transitaddon.block.ExampleBlockBlock;

//WMATA Pylons, Single Line Colors
import net.ayakalaa.transitaddon.block.wmata.pylons.one.RedPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.OrangePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.YellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.GreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.BluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.one.PurplePylon;

//WMATA Pylons, Two Line Colors

//WMATA Pylons, Starting with red
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedOrangePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedYellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.RedPurplePylon;

//WMATA Pylons, Starting with orange
import net.ayakalaa.transitaddon.block.wmata.pylons.two.OrangeYellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.OrangeGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.OrangeBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.OrangePurplePylon;

//WMATA Pylons, Starting with Yellow
import net.ayakalaa.transitaddon.block.wmata.pylons.two.YellowGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.YellowBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.YellowPurplePylon;

//WMATA Pylons, Starting wtih Green
import net.ayakalaa.transitaddon.block.wmata.pylons.two.GreenBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.two.GreenPurplePylon;

//WMATA Pylons, (not) starting with blue
import net.ayakalaa.transitaddon.block.wmata.pylons.two.BluePurplePylon;


//WMATA Pylons, Three Line Colors

//WMATA Pylons, Starting with red
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedOrangeYellowPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedOrangeGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedOrangeBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedOrangePurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedYellowGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedYellowBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedYellowPurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedGreenBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedGreenPurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.RedBluePurplePylon;

//WMATA Pylons, Starting with Orange
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeYellowGreenPylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeYellowBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeYellowPurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeGreenBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeGreenPurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.OrangeBluePurplePylon;

//WMATA Pylons, Starting with Yellow
import net.ayakalaa.transitaddon.block.wmata.pylons.three.YellowGreenBluePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.YellowGreenPurplePylon;
import net.ayakalaa.transitaddon.block.wmata.pylons.three.YellowBluePurplePylon;

//WMATA Pylons, (not) starting with green
import net.ayakalaa.transitaddon.block.wmata.pylons.three.GreenBluePurplePylon;




public class TransitAddOnModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TransitAddOnMod.MODID);
	public static final RegistryObject<Block> EXAMPLE_BLOCK = REGISTRY.register("example_block", () -> new ExampleBlockBlock());
	public static final RegistryObject<Block> EXAMPLE_ORE = REGISTRY.register("example_ore", () -> new ExampleOreBlock());


	public static final RegistryObject<Block> RED_PYLON = REGISTRY.register("red_pylon", () -> new RedPylon());
	public static final RegistryObject<Block> ORANGE_PYLON = REGISTRY.register("orange_pylon", () -> new OrangePylon());
	public static final RegistryObject<Block> YELLOW_PYLON = REGISTRY.register("yellow_pylon", () -> new YellowPylon());
	public static final RegistryObject<Block> GREEN_PYLON = REGISTRY.register("green_pylon", () -> new GreenPylon());
	public static final RegistryObject<Block> BLUE_PYLON = REGISTRY.register("blue_pylon", () -> new BluePylon());
	public static final RegistryObject<Block> PURPLE_PYLON = REGISTRY.register("purple_pylon", () -> new PurplePylon());

	public static final RegistryObject<Block> RED_ORANGE_PYLON = REGISTRY.register("red_orange_pylon", () -> new RedOrangePylon());
	public static final RegistryObject<Block> RED_YELLOW_PYLON = REGISTRY.register("red_yellow_pylon", () -> new RedYellowPylon());
	public static final RegistryObject<Block> RED_GREEN_PYLON = REGISTRY.register("red_green_pylon", () -> new RedGreenPylon());
	public static final RegistryObject<Block> RED_BLUE_PYLON = REGISTRY.register("red_blue_pylon", () -> new RedBluePylon());
	public static final RegistryObject<Block> RED_PURPLE_PYLON = REGISTRY.register("red_purple_pylon", () -> new RedPurplePylon());


}
