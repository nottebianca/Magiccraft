package net.bambuki.magiccraft.block;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.MagicCraftClient;
import net.bambuki.magiccraft.block.custom.InvisibilityBlock;
import net.bambuki.magiccraft.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
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
