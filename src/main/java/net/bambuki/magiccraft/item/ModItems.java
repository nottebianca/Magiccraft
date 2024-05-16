package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_SCARLET_RUBIES = registerItem("raw_scarlet_rubies",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item RAW_BLUE_SAPPHIRES = registerItem("raw_blue_sapphires",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item RAW_GREEN_EMERALDS = registerItem("raw_green_emeralds",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item RAW_YELLOW_DIAMONDS = registerItem("raw_yellow_diamonds",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item SCARLET_RUBIES = registerItem("scarlet_rubies",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item BLUE_SAPPHIRES = registerItem("blue_sapphires",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item GREEN_EMERALDS = registerItem("green_emeralds",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));
    public static final Item YELLOW_DIAMONDS = registerItem("yellow_diamonds",
            new Item(new FabricItemSettings().group(ModItemGroup.BLUE_SAPPHIRES)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MagicCraft.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MagicCraft.LOGGER.debug("Registering Mod Items for" + MagicCraft.MOD_ID);
    }
}
