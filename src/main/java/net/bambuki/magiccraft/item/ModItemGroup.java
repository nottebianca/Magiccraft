package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BLUE_SAPPHIRES = FabricItemGroupBuilder.build(
            new Identifier(MagicCraft.MOD_ID, "blue_sapphires"), () -> new ItemStack(ModItems.BLUE_SAPPHIRES));
}
