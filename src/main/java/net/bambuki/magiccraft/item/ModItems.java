package net.bambuki.magiccraft.item;

import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.item.custom.MagicBallItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MagicCraft.MOD_ID);

    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB)));
    public static final RegistryObject<Item> MAGIC_BALL = ITEMS.register("magic_ball",
            () -> new MagicBallItem(new Item.Properties().tab(ModCreativeModeTab.MAGICCRAFT_TAB).stacksTo(1)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}
