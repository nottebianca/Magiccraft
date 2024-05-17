package net.bambuki.magiccraft.block;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.MagicCraftClient;
import net.bambuki.magiccraft.block.custom.*;
import net.bambuki.magiccraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BLUE_SAPPHIRES_BLOCK = registerBlock("blue_sapphires_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block BLUE_SAPPHIRES_ORE = registerBlock("blue_sapphires_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block GREEN_EMERALDS_BLOCK = registerBlock("green_emeralds_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block GREEN_EMERALDS_ORE = registerBlock("green_emeralds_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block SCARLET_RUBIES_BLOCK = registerBlock("scarlet_rubies_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block SCARLET_RUBIES_ORE = registerBlock("scarlet_rubies_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block YELLOW_DIAMONDS_BLOCK = registerBlock("yellow_diamonds_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block YELLOW_DIAMONDS_ORE = registerBlock("yellow_diamonds_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3,7)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block INVISIBILITY_BLOCK = registerBlock("invisibility_block",
            new InvisibilityBlock(FabricBlockSettings.of(Material.WOOD).strength(4f).requiresTool()),ModItemGroup.BLUE_SAPPHIRES);
    public static final Block SCARLET_RUBIES_LAMP = registerBlock("scarlet_rubies_lamp",
            new ScarletRubiesLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(ScarletRubiesLampBlock.LIT) ? 15 : 0)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block BLUE_SAPPHIRES_LAMP = registerBlock("blue_sapphires_lamp",
            new BlueSappphiresLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(ScarletRubiesLampBlock.LIT) ? 15 : 0)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block GREEN_EMERALDS_LAMP = registerBlock("green_emeralds_lamp",
            new GreenEmeraldsLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(ScarletRubiesLampBlock.LIT) ? 15 : 0)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block YELLOW_DIAMONDS_LAMP = registerBlock("yellow_diamonds_lamp",
            new YellowDiamondsLampBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()
                    .luminance(state -> state.get(ScarletRubiesLampBlock.LIT) ? 15 : 0)), ModItemGroup.BLUE_SAPPHIRES);
    public static final Block MANDRAGORA_CROP = registerBlockWIthoutItem("mandragora_crop",
            new MandragoraCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));
    private static Block registerBlockWIthoutItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(MagicCraft.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(MagicCraft.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(MagicCraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks(){
        MagicCraft.LOGGER.debug("Registering ModBlocks for " + MagicCraft.MOD_ID);
    }
}
