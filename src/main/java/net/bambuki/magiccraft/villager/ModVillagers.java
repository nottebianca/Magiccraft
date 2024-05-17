package net.bambuki.magiccraft.villager;

import com.google.common.collect.ImmutableSet;
import net.bambuki.magiccraft.MagicCraft;
import net.bambuki.magiccraft.block.ModBlocks;
import net.bambuki.magiccraft.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final PointOfInterestType INVISIBILITY_POI = registerPOI("invisibility_poi", ModBlocks.INVISIBILITY_BLOCK);
    public static final VillagerProfession INVISIBILITY_MASTER = registerProfession("invisibilitymaster",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(MagicCraft.MOD_ID, "invisibility_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(MagicCraft.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(MagicCraft.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(MagicCraft.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        MagicCraft.LOGGER.debug("Registering Villagers for " + MagicCraft.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(INVISIBILITY_MASTER,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(ModItems.MANDRAGORA, 5),
                            6, 2, 0.02f
                    )));
                });
    }
}
